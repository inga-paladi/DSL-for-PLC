package pbl;

import org.antlr.v4.runtime.misc.NotNull;

import java.util.Optional;
import java.util.TreeSet;

public class BaseListenerEx extends ProgramBaseListener
{
    private enum LogicOperation
    {
        Unknown,
        AND,
        OR,
        XOR,
        NOT
    }

    TreeSet<ProgramVariable> m_variables;
    ProgramVariable.Type m_currentType;

    public BaseListenerEx()
    {
        m_variables = new TreeSet<ProgramVariable>();
        m_currentType = ProgramVariable.Type.Unknown;
    }

    @Override
    public void enterInputDeclarations(ProgramParser.InputDeclarationsContext ctx)
    {
        m_currentType = ProgramVariable.Type.Input;
    }

    @Override
    public void exitInputDeclarations(ProgramParser.InputDeclarationsContext ctx)
    {
        m_currentType = ProgramVariable.Type.Unknown;
    }

    @Override
    public void enterOutputDeclarations(ProgramParser.OutputDeclarationsContext ctx)
    {
        m_currentType = ProgramVariable.Type.Output;
    }

    @Override
    public void exitOutputDeclarations(ProgramParser.OutputDeclarationsContext ctx)
    {
        m_currentType = ProgramVariable.Type.Unknown;
    }

    @Override
    public void enterVar(ProgramParser.VarContext ctx)
    {
        if (m_currentType == ProgramVariable.Type.Unknown)
            return;

        String varName = ctx.getText();
        if (GetVariable(varName).isPresent())
        {
            System.out.println("Variable redeclaration: " + varName);
            System.exit(0);
        }

        m_variables.add(new ProgramVariable(ctx.getText(), m_currentType, false));
    }

    @Override public void enterAssignment(@NotNull ProgramParser.AssignmentContext ctx)
    {
        String lVarName = ctx.var().getText();
        Optional<ProgramVariable> lVar = GetVariable(lVarName);
        if (!lVar.isPresent())
        {
            VarNotDeclared(ctx.getText(), lVarName);
            System.exit(0);
        }

        if (ctx.expression().constant() != null)
        {
            String constant = ctx.expression().constant().getText().substring(1);
            boolean constValue = ctx.expression().constant().getText().substring(1).equals("1");
            lVar.get().SetValue(constValue);
        }
        else if (ctx.expression().var() != null)
        {
            String rVarName = ctx.expression().var().getText();
            Optional<ProgramVariable> rVar = GetVariable(rVarName);
            if (!rVar.isPresent())
            {
                VarNotDeclared(ctx.getText(), rVarName);
                System.exit(0);
            }

            lVar.get().SetValue(rVar.get().GetValue());
        }
    }

    @Override
    public void enterStatement(@NotNull ProgramParser.StatementContext ctx)
    {
        String lVarName = ctx.var(0).getText();
        String rVarName = ctx.var(1).getText();

        Optional<ProgramVariable> lVar = GetVariable(lVarName);
        Optional<ProgramVariable> rVar = GetVariable(rVarName);
        if (!lVar.isPresent())
        {
            VarNotDeclared(ctx.getText(), lVarName);
            System.exit(0);
        }
        else if (!rVar.isPresent())
        {
            VarNotDeclared(ctx.getText(), rVarName);
            System.exit(0);
        }

        ExecuteLogicOperation(lVar.get(), ctx.logicOp().getText(), rVar.get());
    }

    private Optional<ProgramVariable> GetVariable(String name)
    {
        // Find the object based on a specific value
        return m_variables.stream().filter(variable -> variable.GetName().equals(name)).findFirst();
    }

    private void ExecuteLogicOperation(ProgramVariable lVar, String logicOperation, ProgramVariable rVar)
    {
        boolean result = false;
        if (logicOperation.equals("AND"))
            result = lVar.GetValue() && rVar.GetValue();
        else if (logicOperation.equals("OR"))
            result = lVar.GetValue() || rVar.GetValue();
        else if (logicOperation.equals("XOR"))
            result = lVar.GetValue() ^ rVar.GetValue();
        else if (logicOperation.equals("NOT"))
            result = !rVar.GetValue();

        lVar.SetValue(result);
    }

    public void exitProgram(@NotNull ProgramParser.ProgramContext ctx)
    {
        for (ProgramVariable variable : m_variables)
            System.out.println(variable.GetName() + " = " + String.valueOf(variable.GetValue()));
    }

    private void VarNotDeclared(String statement, String varName)
    {
        System.out.println(varName + " not declared in statement: " + statement);
    }

}

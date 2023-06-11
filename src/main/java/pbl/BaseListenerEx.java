package pbl;

import org.antlr.v4.runtime.misc.NotNull;
import java.util.TreeSet;

public class BaseListenerEx extends ProgramBaseListener
{
    TreeSet<String> m_variables;

    public BaseListenerEx()
    {
        m_variables = new TreeSet<String>();
    }

    // Variables redeclaration check -----------------------------------------------------------------------------------
    @Override
    public void enterInputVarDeclaration(@NotNull ProgramParser.InputVarDeclarationContext ctx)
    {
        String inputVarName = ctx.InputVar().getText();
        if (m_variables.contains(inputVarName))
        {
            System.out.println("Input variable redeclaration: " + inputVarName);
            Exit();
        }

        m_variables.add(inputVarName);
    }

    @Override
    public void enterOutputVarDeclaration(@NotNull ProgramParser.OutputVarDeclarationContext ctx)
    {
        String outputVarName = ctx.OutputVar().getText();
        if (m_variables.contains(outputVarName))
        {
            System.out.println("Output variable redeclaration: " + outputVarName);
            Exit();
        }

        m_variables.add(outputVarName);
    }

    @Override
    public void enterMemoryDeclaration(@NotNull ProgramParser.MemoryDeclarationContext ctx)
    {
        String memoryName = ctx.MemVar().getText();
        if (m_variables.contains(memoryName))
        {
            System.out.println("Memory variable redeclaration: " + memoryName);
            Exit();
        }

        m_variables.add(memoryName);
    }

    // Check usage of undeclared variables -----------------------------------------------------------------------------
    @Override
    public void enterAssignment(@NotNull ProgramParser.AssignmentContext ctx)
    {
        // Check left value
        String lValName = ctx.lValue().getText();
        if (!m_variables.contains(lValName))
        {
            VarNotDeclared(ctx.getText(), lValName);
            Exit();
        }

        // Check right value

        // If rValue is input variable
        if (ctx.rValue().InputVar() != null)
        {
            String rValName = ctx.rValue().InputVar().getText();
            if (!m_variables.contains(rValName))
            {
                VarNotDeclared(ctx.getText(), rValName);
                Exit();
            }
        }

        // If rValue is memory variable
        if (ctx.rValue().MemVar() != null)
        {
            String rValName = ctx.rValue().MemVar().getText();
            if (!m_variables.contains(rValName))
            {
                VarNotDeclared(ctx.getText(), rValName);
                Exit();
            }
        }
    }

    @Override
    public void enterOperation(@NotNull ProgramParser.OperationContext ctx)
    {
        // Check operands
        for (ProgramParser.OperandContext operand: ctx.operand()) {
            // If operand is input var
            if (operand.InputVar() != null)
            {
                String rValName = operand.InputVar().getText();
                if (!m_variables.contains(rValName))
                {
                    VarNotDeclared(ctx.getText(), rValName);
                    Exit();
                }
            }

            // If operand is memory var
            if (operand.MemVar() != null)
            {
                String rValName = operand.MemVar().getText();
                if (!m_variables.contains(rValName))
                {
                    VarNotDeclared(ctx.getText(), rValName);
                    Exit();
                }
            }
        }
    }

    private void VarNotDeclared(String statement, String varName)
    {
        System.out.println(varName + " not declared in statement: " + statement);
    }

    private void Exit() { System.exit(0); }
}

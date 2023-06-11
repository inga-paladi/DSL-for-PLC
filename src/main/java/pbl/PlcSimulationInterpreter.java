package pbl;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class PlcSimulationInterpreter {
    private HashMap<String, Integer> m_vars;

    PlcSimulationInterpreter()
    {
        m_vars = new HashMap<>();
    }

    public void run(ParseTree parseTree)
    {
        for (int childIx = 0; childIx < parseTree.getChildCount(); ++childIx)
        {
            ParserRuleContext childCtx = (ParserRuleContext) parseTree.getChild(childIx);
            if (childCtx instanceof ProgramParser.OutputDeclarationsContext)
                InitOutputVariables((ProgramParser.OutputDeclarationsContext)childCtx);
            else if (childCtx instanceof ProgramParser.MemoryDeclarationsContext)
                InitMemoryVariables((ProgramParser.MemoryDeclarationsContext)childCtx);
            else if (childCtx instanceof ProgramParser.ProgramBodyContext)
            {
                InterpretProgramBody((ProgramParser.ProgramBodyContext)childCtx);
                break;
            }
        }
    }

    private void InitOutputVariables(ProgramParser.OutputDeclarationsContext ctx)
    {
        // For each output declaration
        for (int childIx = 0; childIx < ctx.getChildCount(); ++childIx)
        {
            String varName = ctx.getChild(childIx).getChild(1).getText();
            m_vars.put(varName, 0);
        }
    }

    private void InitMemoryVariables(ProgramParser.MemoryDeclarationsContext ctx)
    {
        // For each memory declaration
        for (int childIx = 0; childIx < ctx.getChildCount(); ++childIx)
        {
            String varName = ctx.getChild(childIx).getChild(1).getText();
            m_vars.put(varName, 0);
        }
    }

    private void InterpretProgramBody(ProgramParser.ProgramBodyContext ctx)
    {
        for (int childIx = 0; childIx < ctx.getChildCount(); ++childIx)
        {
            ParseTree child = ctx.getChild(childIx);
            if (child instanceof ProgramParser.StatementsContext)
                InterpretStatements((ProgramParser.StatementsContext)child);
            else if (child instanceof ProgramParser.InfiniteLoopContext)
                InterpretInfiniteLoop((ProgramParser.InfiniteLoopContext)child);
        }
    }

    private void InterpretStatements(ProgramParser.StatementsContext ctx)
    {
        for (int childIx = 0; childIx < ctx.getChildCount(); ++childIx)
        {
            ParseTree child = ctx.getChild(childIx);
            if (child instanceof ProgramParser.ConditionalStatementContext)
                InterpretConditionalStatement((ProgramParser.ConditionalStatementContext)child);
            else if (child instanceof ProgramParser.StatementContext)
                InterpretStatement((ProgramParser.StatementContext)child);
        }
    }

    private void InterpretConditionalStatement(ProgramParser.ConditionalStatementContext ctx)
    {
        if (InterpretCondition((ProgramParser.ConditionContext)ctx.getChild(1)))
            InterpretStatements((ProgramParser.StatementsContext)ctx.getChild(3));
    }

    private boolean InterpretCondition(ProgramParser.ConditionContext ctx)
    {
        String varName = ctx.getChild(0).getText();
        if (varName.charAt(0) == 'I')
            return ConfigReader.GetValue(varName) != 0;
        else if (varName.charAt(0) == 'M')
            return m_vars.get(varName) != 0;
        else
            return false;
    }

    private void InterpretStatement(ProgramParser.StatementContext ctx)
    {
        ParseTree child = ctx.getChild(0);
        if (child instanceof ProgramParser.WaitForContext)
            InterpretWaitStatement((ProgramParser.WaitForContext)child);
        else if (child instanceof ProgramParser.AssignmentContext)
            InterpretAssignmentStatement((ProgramParser.AssignmentContext)child);
    }

    private void InterpretWaitStatement(ProgramParser.WaitForContext ctx)
    {
        Integer timeToWaitMs = Integer.parseInt(ctx.getChild(1).getText());
        try {
            Thread.sleep(timeToWaitMs);
        } catch (InterruptedException e) {}
    }

    private void InterpretAssignmentStatement(ProgramParser.AssignmentContext ctx)
    {
        String lValueName = ctx.getChild(0).getText();
        ProgramParser.RValueContext rValue = (ProgramParser.RValueContext)ctx.getChild(2);

        // Rvalue is a constant number
        if (rValue.NUMBER() != null)
        {
            m_vars.put(lValueName, Integer.parseInt(rValue.getText()));
        }

        // Rvalue is a variable
        else if (rValue.MemVar() != null || rValue.InputVar() != null)
        {
            String rValueName = rValue.getText();
            m_vars.put(lValueName, m_vars.get(rValueName));
        }

        if (lValueName.charAt(0) == 'Q')
            UpdateOutputValues();
    }

    private void UpdateOutputValues()
    {
        try {
            FileWriter writer = new FileWriter("output.data");

            for (Map.Entry<String, Integer> entry : m_vars.entrySet())
            {
                String key = entry.getKey();
                if (key.charAt(0) != 'Q')
                    continue;

                String strValue = entry.getValue() == 1 ? "on" : "off";
                writer.write(key + " " + strValue + "\n");
            }

            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void InterpretInfiniteLoop(ProgramParser.InfiniteLoopContext ctx)
    {
        while (true)
        {
            InterpretStatements((ProgramParser.StatementsContext)ctx.getChild(1));
        }
    }

}

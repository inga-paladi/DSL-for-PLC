package pbl;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.HashMap;

public class PlcSimulationInterpreter {
    private HashMap<String, Integer> m_outputVars;
    private HashMap<String, Integer> m_memoryVars;

    PlcSimulationInterpreter()
    {
        m_outputVars = new HashMap<>();
        m_memoryVars = new HashMap<>();
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
            m_outputVars.put(varName, 0);
        }
    }

    private void InitMemoryVariables(ProgramParser.MemoryDeclarationsContext ctx)
    {
        // For each memory declaration
        for (int childIx = 0; childIx < ctx.getChildCount(); ++childIx)
        {
            String varName = ctx.getChild(childIx).getChild(1).getText();
            m_memoryVars.put(varName, 0);
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
            return m_memoryVars.get(varName) != 0;
        else
            return false;
    }

    private void InterpretStatement(ProgramParser.StatementContext ctx)
    {

    }

    private void InterpretInfiniteLoop(ProgramParser.InfiniteLoopContext ctx)
    {
        while (true)
        {
            InterpretStatements((ProgramParser.StatementsContext)ctx.getChild(1));
        }
    }

}

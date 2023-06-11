package pbl;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;

public class Main {
    public static void main(String [] args) throws Exception
    {
        // Create an instance of the lexer
        ProgramLexer lexer = new ProgramLexer(CharStreams.fromFileName("input.txt"));

        // Create an instance of the parser
        ProgramParser parser = new ProgramParser(new CommonTokenStream(lexer));

        // Call the entry point rule
        ParseTree tree = parser.program();

        // Create an instance of your existing listener
        BaseListenerEx listener = new BaseListenerEx();

        // Traverse the parse tree using the listener in top-down order
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(listener, tree);

        PlcSimulationInterpreter interpreter = new PlcSimulationInterpreter();
        interpreter.run(tree);
    }
}
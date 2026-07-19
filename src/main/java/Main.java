import generation.deutschsprachigeProgrammierspracheLexer;
import generation.deutschsprachigeProgrammierspracheParser;
import interpreter.Interpreter;
import interpreter.ProgramLine;
import interpreter.ProgramVisitor;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        CharStream input = null;
        try {
            input = CharStreams.fromPath(Paths.get("exampleProgram", "testProgramDsl2.txt"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // Splits the DSL input into tokens
        deutschsprachigeProgrammierspracheLexer lexer = new deutschsprachigeProgrammierspracheLexer(input);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // Checks the input against the grammar and creates the parse tree
        deutschsprachigeProgrammierspracheParser parser = new deutschsprachigeProgrammierspracheParser(tokens);

        var tree = parser.program();

        // Convert parse tree to list of program lines
        ProgramVisitor programVisitor = new ProgramVisitor();
        programVisitor.visit(tree);
        List<ProgramLine> programLines = programVisitor.getProgramLines();

        //Execute program via Interpreter
        Interpreter interpreter = new Interpreter(programLines);
        interpreter.execute();
    }
}

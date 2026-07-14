import generation.deutschsprachigeProgrammierspracheLexer;
import generation.deutschsprachigeProgrammierspracheParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) {

        CharStream input = null;
        try {
            input = CharStreams.fromPath(Paths.get("exampleProgram", "testProgramDsl.txt"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // Splits the DSL input into tokens
        deutschsprachigeProgrammierspracheLexer lexer = new deutschsprachigeProgrammierspracheLexer(input);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // Checks the input against the grammar and creates the parse tree
        deutschsprachigeProgrammierspracheParser parser = new deutschsprachigeProgrammierspracheParser(tokens);

        var tree = parser.program();

        System.out.println(tree.toStringTree(parser));


    }
}

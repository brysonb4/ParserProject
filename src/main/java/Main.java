import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;
//import static org.antlr.v4.runtime.CharStreams.fromString;

public class Main {
    public static void main(String[] args) {
        String input = """
            if x == 3:
                x = 30
                if y == 90:
                    y = 6
            z = 0
            """;

        String filepath = "/Users/brysonbourisaw/Documents/Fall 2024/4450 PoPL/Project4450/src/main/java/project_deliverable_3.py";

        try {
            CharStream cs = CharStreams.fromFileName(filepath);
            //CharStream cs = fromString(input);

            ParserLexer lexer = new ParserLexer(cs);

            CommonTokenStream tokenStream = new CommonTokenStream(lexer);

            tokenStream.fill();
            for (Token token : tokenStream.getTokens()) {
                System.out.println("Token Type: " + token.getType() + ", Text: " + token.getText());
            }

            ParserParser parser = new ParserParser(tokenStream);

            ParseTree tree = parser.program();

            System.out.println("Parse Tree: " + tree.toStringTree(parser));
            printParseTree(tree, parser, 0);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void printParseTree(ParseTree tree, ParserParser parser, int level) {

        for (int i = 0; i < level; i++) {
            System.out.print("    ");
        }

        String nodeName = tree.getClass().getSimpleName();
        if (nodeName.equals("TerminalNodeImpl")) {
            System.out.println(tree.getText());
        } else {
            int ruleIndex = ((org.antlr.v4.runtime.RuleContext) tree).getRuleIndex();
            System.out.println(parser.getRuleNames()[ruleIndex]);
        }

        for (int i = 0; i < tree.getChildCount(); i++) {
            printParseTree(tree.getChild(i), parser, level + 1);
        }
    }
}
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class VerythonMain {
    public static void main( String[] args) throws Exception
    {
        try {
            VerythonLexer lexer = new VerythonLexer(new ANTLRFileStream(args[0]));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            VerythonParser parser = new VerythonParser(tokens);
            ParseTree tree = parser.initial();
            EvalVisitor eval = new EvalVisitor();
            eval.visit(tree);
            //System.out.println(tree.toStringTree(parser));
        }
        catch (Exception e) {
            System.err.println("Error (Verython): "+e);
        }
    }
}
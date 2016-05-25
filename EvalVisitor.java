import java.util.HashMap;
import java.util.Map;

public class EvalVisitor extends VerythonBaseVisitor<String> {
    /** "memory" for our calculator; variable/value pairs go here */
    Map<String, String> memory = new HashMap<String, String>();

    @Override
    public String visitIf_stmt(VerythonParser.If_stmtContext ctx) {
        System.out.println("----------");
        return visitChildren(ctx);
    }
}
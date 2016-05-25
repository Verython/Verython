import java.util.HashMap;
import java.util.Map;

public class EvalVisitor extends VerythonBaseVisitor<String> {
    /** "memory" for our calculator; variable/value pairs go here */
    Map<String, String> memory = new HashMap<String, String>();

    /*
    if_stmt: IF test ':' suite ( ELIF test ':' suite )* ( ELSE ':' suite )?;
    */
    @Override
    public String visitInitial(VerythonParser.InitialContext ctx) {
        System.out.println("`timescale 1ns/1ps");
        return visitChildren(ctx);
    }
}
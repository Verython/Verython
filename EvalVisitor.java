import java.util.HashMap;
import java.util.Map;

public class EvalVisitor extends VerythonBaseVisitor<String> {
    /** "memory" for our calculator; variable/value pairs go here */
    Map<String, String> memory = new HashMap<String, String>();

    /*
    initial: NEWLINE* top EOF?;
    */
    @Override
    public String visitInitial(VerythonParser.InitialContext ctx) {
        System.out.println("`timescale 1ns/1ps");
        return visitChildren(ctx);
    }

    /*
    block: BLOCK ':' suite;
    */
    @Override
    public String visitBlock(VerythonParser.BlockContext ctx) {
        System.out.println("begin");
        visit(ctx.suite());
        System.out.println("end");
        return visitChildren(ctx);
    }

    /*
    decorator: INITAL | ALWAYS '(' arglist? ')';
    */
    @Override
    public String visitDecorator(VerythonParser.DecoratorContext ctx) {
        if (ctx.INITAL() == null) {
            System.out.print("always @(");
            System.out.print(ctx.arglist().getText().replaceAll(","," or "));
            System.out.println(")");
        }
        return visitChildren(ctx);
    }

    @Override
    public String visitFuncdef(VerythonParser.FuncdefContext ctx) { return visitChildren(ctx); }

    /*
    switch_stmt
     : SWITCH '(' NAME ')' ':' switch_suite
     ;

   */
    @Override public String visitSwitch_stmt(VerythonParser.Switch_stmtContext ctx) {
        System.out.println("case(" + ctx.NAME() + ")");
        visit(ctx.switch_suite());
        System.out.println("endcase");
        return visitChildren(ctx);
    }
    /*
     switch_suite
     : NEWLINE INDENT case_stmt DEDENT
     ;

    case_stmt
     : CASE number ':' ( RETURN (NAME | number) | expr_stmt ) (NEWLINE CASE number ':' ( RETURN (NAME | number) | expr_stmt ))* NEWLINE DEFAULT  ':' ( RETURN (NAME | number) | expr_stmt ) NEWLINE DEDENT
     ;
    */
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */

}
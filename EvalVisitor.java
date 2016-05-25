import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
        System.out.println("    begin");
        visit(ctx.suite());
        System.out.println("    end");
        return "";
    }

    /*
    decorator: INITAL | ALWAYS '(' arglist? ')';
    */
    @Override
    public String visitDecorator(VerythonParser.DecoratorContext ctx) {
        if (ctx.INITAL() == null) {
            System.out.print("    always @(");
            System.out.print(ctx.arglist().getText().replaceAll(","," or "));
            System.out.println(")");
        }
        return visitChildren(ctx);
    }

    /*
    funcdef: DEF NAME parameters ':' NEWLINE blocks;
    */
    @Override
    public String visitFuncdef(VerythonParser.FuncdefContext ctx) {
        String parameters = ctx.parameters().getText();
        String[] params = parameters.substring(1, parameters.length() - 1).split(";");
        String[] inputs = params[0].split(",");
        String[] outputs = params[1].split(",");
        memory.put("outnum", Integer.toString(outputs.length));
        Pattern square = Pattern.compile("\\[.*?\\]([A-Za-z]+)");

        String arg = new String("");
        String output = new String("");
        Matcher m;
        for (String in : inputs) {
            m = square.matcher(in);
            if (m.find())
                arg += m.group(1) + ", ";
        }
        for (String out : outputs) {
            m = square.matcher(out);
            if (m.find()) {
                arg += m.group(1) + ", ";
                output += m.group(1) + ",";
            }
        }
        if (arg.length() > 2)
            arg = arg.substring(0, arg.length() - 1);
        if (output.length() > 2)
            output = output.substring(0, output.length() - 2);
        memory.put("output", output);

        System.out.println("module " + ctx.NAME() + "(" + arg + ")");
        for (String in : inputs) {
            System.out.println("    input wire " + in + ";");
        }
        for (String out : outputs) {
            System.out.println("    ouput reg " + out + ";");
        }
        visit(ctx.blocks());
        System.out.println("endmodule");
        return "";
    }

    /*
    switch_stmt: SWITCH '(' NAME ')' ':' switch_suite;
    */
    @Override
    public String visitSwitch_stmt(VerythonParser.Switch_stmtContext ctx) {
        System.out.println("case(" + ctx.NAME() + ")");
        visit(ctx.switch_suite());
        System.out.println("endcase");
        return "";
    }

    /*
    switch_suite: NEWLINE INDENT case_stmt DEDENT;
    case_stmt: CASE number ':' ( RETURN (NAME | number) | expr_stmt ) (NEWLINE CASE number ':' ( RETURN (NAME | number) | expr_stmt ))* NEWLINE DEFAULT  ':' ( RETURN (NAME | number) | expr_stmt ) NEWLINE DEDENT;
    */

    /*
    expr_stmt : testlist_star_expr ( augassign testlist | ( '=' testlist_star_expr )*);
    */
    @Override
    public String visitExpr_stmt(VerythonParser.Expr_stmtContext ctx) {
        //System.out.println(ctx.testlist_star_expr().toString() + ctx.augassign().getText() + ctx.testlist().getText());
        return "";
    }
}
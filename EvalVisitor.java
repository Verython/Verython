import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EvalVisitor extends VerythonBaseVisitor<String> {
    /**
     * "memory" for our calculator; variable/value pairs go here
     */
    Map<String, String> memory = new HashMap<String, String>();
    String output = "";

    /*
    initial: NEWLINE* top EOF;
    */
    @Override
    public String visitInitial(VerythonParser.InitialContext ctx) {
        output += "`timescale 1ns/1ps\n";
        visit(ctx.top());
        return output;
    }

    /*
    block: BLOCK ':' suite;
    */
    @Override
    public String visitBlock(VerythonParser.BlockContext ctx) {
        output += "    begin\n";
        visit(ctx.suite());
        output += "    end\n";
        return "";
    }

    /*
    decorator: INITAL | ALWAYS '(' arg_decs? ')';
    */
    @Override
    public String visitDecorator(VerythonParser.DecoratorContext ctx) {
        if (ctx.INITAL() == null) {
            output += "    always @(";
            output += visit(ctx.arg_decs()).replaceAll(",", " or ");
            output += ")\n";
        }
        return visitChildren(ctx);
    }

    /*
    arg_decs: (arg_dec ',')* arg_dec;
    */
    @Override
    public String visitArg_decs(VerythonParser.Arg_decsContext ctx) {
        int i = 1;
        String args = visit(ctx.arg_dec(0));
        while ( i > 0 ){
            try {
                args = args + "," + visit(ctx.arg_dec(i));
            }catch (NullPointerException e) {
                break;
            }
            i++;
        }
        return args;
    }

    /*
    arg_dec: NAME (POSEDGE | NEGEDGE)?;
    */
    @Override
    public String visitArg_dec(VerythonParser.Arg_decContext ctx) {
        if ( (ctx.POSEDGE() == null) && (ctx.NEGEDGE() == null) ){
            return ctx.NAME().getText();
        }else if ( (ctx.POSEDGE() == null) && (ctx.NEGEDGE() != null) ){
            return "negedge " + ctx.NAME().getText();
        }
        else return "posedge " + ctx.NAME().getText();
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
        String outputSignal = new String("");
        Matcher m;
        for (String in : inputs) {
            m = square.matcher(in);
            if (m.find())
                arg += m.group(1) + ", ";
            else
                arg += in + ", ";
        }
        for (String out : outputs) {
            m = square.matcher(out);
            if (m.find()) {
                arg += m.group(1) + ", ";
                outputSignal += m.group(1) + ",";
            }
            else {
                arg += out + ", ";
                outputSignal += out + ",";
            }
        }
        if (arg.length() > 2)
            arg = arg.substring(0, arg.length() - 2);
        if (outputSignal.length() > 2)
            outputSignal = outputSignal.substring(0, outputSignal.length() - 1);
        memory.put("output", outputSignal);

        output += "module " + ctx.NAME() + "(" + arg + ")\n";
        for (String in : inputs) {
            output += "    input wire " + in + ";\n";
        }
        for (String out : outputs) {
            output += "    output reg " + out + ";\n";
        }
        visit(ctx.blocks());
        output += "endmodule\n";
        return "";
    }

    /*
    switch_stmt: SWITCH '(' NAME ')' ':' switch_suite;
    */
    @Override
    public String visitSwitch_stmt(VerythonParser.Switch_stmtContext ctx) {
        output += "        case(" + ctx.NAME() + ")\n";
        visit(ctx.switch_suite());
        output += "        endcase\n";
        return "";
    }

    /*
    case_stmt : CASE number ':' ( (RETURN (NAME | number)) | expr_stmt ) NEWLINE;
    */
    @Override
    public String visitCase_stmt(VerythonParser.Case_stmtContext ctx) {
        if (ctx.RETURN() != null) {
            if (ctx.NAME() != null) {
                output += "            " + visit(ctx.number(0)) + ": " + memory.get("output").charAt(0) + " <= " + ctx.NAME() + ";\n";
            }
            else {
                output += "            " + visit(ctx.number(0)) + ": " + memory.get("output").charAt(0) + " <= " + visit(ctx.number(1)) + ";\n";
            }
        }
        return "";
    }

    /*
    case_default : DEFAULT  ':' ( (RETURN (NAME | number)) | expr_stmt ) NEWLINE;
    */
    @Override
    public String visitCase_default(VerythonParser.Case_defaultContext ctx) {
        if (ctx.RETURN() != null) {
            if (ctx.NAME() != null) {
                output += "            default: " + memory.get("output").charAt(0) + " <= " + ctx.NAME() + ";\n";
            }
            else {
                output += "            default: " + memory.get("output").charAt(0) + " <= " + visit(ctx.number()) + ";\n";
            }
        }
        return "";
    }

    /*
    expr_stmt : testlist_star_expr ( augassign testlist | ( '=' testlist_star_expr )*);
    */
    @Override
    public String visitExpr_stmt(VerythonParser.Expr_stmtContext ctx) {
        //System.out.println(ctx.testlist_star_expr().toString() + ctx.augassign().getText() + ctx.testlist().getText());
        return "";
    }

    /*
    number : DECIMAL_INTEGER | OCT_INTEGER | HEX_INTEGER | BIN_INTEGER;
    */
    @Override
    public String visitNumber(VerythonParser.NumberContext ctx) {
        if (ctx.DECIMAL_INTEGER() == null) {
            if (ctx.OCT_INTEGER() == null) {
                if (ctx.HEX_INTEGER() == null) {
                    String bin = ctx.BIN_INTEGER().getText();
                    return ("'" + bin.substring(1, bin.length()));
                }
                else {
                    String hex = ctx.HEX_INTEGER().getText();
                    return ("'h" + hex.substring(2, hex.length()));
                }
            }
            else {
                String oct = ctx.OCT_INTEGER().getText();
                return ("'o" + oct.substring(2, oct.length()));
            }
        }
        else return ("'d" + ctx.DECIMAL_INTEGER().getText());
    }

    /*
    if_stmt: IF test ':' suite ( ELIF test ':' suite )* ( ELSE ':' suite )?;
    */
    @Override
    public String visitIf_stmt(VerythonParser.If_stmtContext ctx) {
        output += "        if " + ctx.test(0).getText() + " begin\n";
        visit(ctx.suite(0));
        output += "        end\n";
        if (ctx.ELSE() != null) {
            output += "        else begin\n";
            visit(ctx.suite(1));
            output += "        end\n";
        }
        return "";
    }
}
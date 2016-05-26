// Generated from Verython.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class VerythonParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, DEF=2, RETURN=3, IF=4, ELIF=5, ELSE=6, SWITCH=7, CASE=8, DEFAULT=9, 
		WHILE=10, FOR=11, IN=12, OR=13, AND=14, NOT=15, IS=16, NONE=17, TRUE=18, 
		FALSE=19, DEL=20, PASS=21, CONTINUE=22, BREAK=23, BLOCK=24, NEWLINE=25, 
		NAME=26, DECIMAL_INTEGER=27, OCT_INTEGER=28, HEX_INTEGER=29, BIN_INTEGER=30, 
		DOT=31, STAR=32, OPEN_PAREN=33, CLOSE_PAREN=34, COMMA=35, COLON=36, SEMI_COLON=37, 
		ASSIGN=38, OPEN_BRACK=39, CLOSE_BRACK=40, OR_OP=41, XOR=42, AND_OP=43, 
		LEFT_SHIFT=44, RIGHT_SHIFT=45, ADD=46, MINUS=47, DIV=48, MOD=49, NOT_OP=50, 
		OPEN_BRACE=51, CLOSE_BRACE=52, LESS_THAN=53, GREATER_THAN=54, EQUALS=55, 
		GT_EQ=56, LT_EQ=57, NOT_EQ_1=58, NOT_EQ_2=59, ADD_ASSIGN=60, SUB_ASSIGN=61, 
		MULT_ASSIGN=62, DIV_ASSIGN=63, MOD_ASSIGN=64, AND_ASSIGN=65, OR_ASSIGN=66, 
		XOR_ASSIGN=67, LEFT_SHIFT_ASSIGN=68, RIGHT_SHIFT_ASSIGN=69, TOP=70, INITAL=71, 
		ALWAYS=72, POSEDGE=73, NEGEDGE=74, SKIP_=75, UNKNOWN_CHAR=76, INDENT=77, 
		DEDENT=78;
	public static final int
		RULE_initial = 0, RULE_top = 1, RULE_decorator = 2, RULE_arg_decs = 3, 
		RULE_arg_dec = 4, RULE_block = 5, RULE_funcdef = 6, RULE_blocks = 7, RULE_block_element = 8, 
		RULE_parameters = 9, RULE_typedargslist = 10, RULE_tfpdef = 11, RULE_stmt = 12, 
		RULE_simple_stmt = 13, RULE_small_stmt = 14, RULE_expr_stmt = 15, RULE_testlist_star_expr = 16, 
		RULE_augassign = 17, RULE_del_stmt = 18, RULE_pass_stmt = 19, RULE_flow_stmt = 20, 
		RULE_break_stmt = 21, RULE_continue_stmt = 22, RULE_return_stmt = 23, 
		RULE_compound_stmt = 24, RULE_if_stmt = 25, RULE_switch_stmt = 26, RULE_switch_suite = 27, 
		RULE_case_stmt = 28, RULE_case_default = 29, RULE_while_stmt = 30, RULE_for_stmt = 31, 
		RULE_suite = 32, RULE_test = 33, RULE_or_test = 34, RULE_and_test = 35, 
		RULE_not_test = 36, RULE_comparison = 37, RULE_comp_op = 38, RULE_star_expr = 39, 
		RULE_expr = 40, RULE_xor_expr = 41, RULE_and_expr = 42, RULE_shift_expr = 43, 
		RULE_arith_expr = 44, RULE_term = 45, RULE_factor = 46, RULE_power = 47, 
		RULE_atom = 48, RULE_testlist_comp = 49, RULE_trailer = 50, RULE_subscriptlist = 51, 
		RULE_subscript = 52, RULE_sliceop = 53, RULE_exprlist = 54, RULE_testlist = 55, 
		RULE_dictorsetmaker = 56, RULE_arglist = 57, RULE_argument = 58, RULE_comp_iter = 59, 
		RULE_comp_for = 60, RULE_comp_if = 61, RULE_number = 62;
	public static final String[] ruleNames = {
		"initial", "top", "decorator", "arg_decs", "arg_dec", "block", "funcdef", 
		"blocks", "block_element", "parameters", "typedargslist", "tfpdef", "stmt", 
		"simple_stmt", "small_stmt", "expr_stmt", "testlist_star_expr", "augassign", 
		"del_stmt", "pass_stmt", "flow_stmt", "break_stmt", "continue_stmt", "return_stmt", 
		"compound_stmt", "if_stmt", "switch_stmt", "switch_suite", "case_stmt", 
		"case_default", "while_stmt", "for_stmt", "suite", "test", "or_test", 
		"and_test", "not_test", "comparison", "comp_op", "star_expr", "expr", 
		"xor_expr", "and_expr", "shift_expr", "arith_expr", "term", "factor", 
		"power", "atom", "testlist_comp", "trailer", "subscriptlist", "subscript", 
		"sliceop", "exprlist", "testlist", "dictorsetmaker", "arglist", "argument", 
		"comp_iter", "comp_for", "comp_if", "number"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'...'", "'def'", "'return'", "'if'", "'elif'", "'else'", "'switch'", 
		"'case'", "'default'", "'while'", "'for'", "'in'", "'or'", "'and'", "'not'", 
		"'is'", "'None'", "'True'", "'False'", "'del'", "'pass'", "'continue'", 
		"'break'", "'block'", null, null, null, null, null, null, "'.'", "'*'", 
		"'('", "')'", "','", "':'", "';'", "'='", "'['", "']'", "'|'", "'^'", 
		"'&'", "'<<'", "'>>'", "'+'", "'-'", "'/'", "'%'", "'~'", "'{'", "'}'", 
		"'<'", "'>'", "'=='", "'>='", "'<='", "'<>'", "'!='", "'+='", "'-='", 
		"'*='", "'/='", "'%='", "'&='", "'|='", "'^='", "'<<='", "'>>='", "'@top'", 
		"'@initial'", "'@always'", "'.posedge'", "'.negedge'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "DEF", "RETURN", "IF", "ELIF", "ELSE", "SWITCH", "CASE", "DEFAULT", 
		"WHILE", "FOR", "IN", "OR", "AND", "NOT", "IS", "NONE", "TRUE", "FALSE", 
		"DEL", "PASS", "CONTINUE", "BREAK", "BLOCK", "NEWLINE", "NAME", "DECIMAL_INTEGER", 
		"OCT_INTEGER", "HEX_INTEGER", "BIN_INTEGER", "DOT", "STAR", "OPEN_PAREN", 
		"CLOSE_PAREN", "COMMA", "COLON", "SEMI_COLON", "ASSIGN", "OPEN_BRACK", 
		"CLOSE_BRACK", "OR_OP", "XOR", "AND_OP", "LEFT_SHIFT", "RIGHT_SHIFT", 
		"ADD", "MINUS", "DIV", "MOD", "NOT_OP", "OPEN_BRACE", "CLOSE_BRACE", "LESS_THAN", 
		"GREATER_THAN", "EQUALS", "GT_EQ", "LT_EQ", "NOT_EQ_1", "NOT_EQ_2", "ADD_ASSIGN", 
		"SUB_ASSIGN", "MULT_ASSIGN", "DIV_ASSIGN", "MOD_ASSIGN", "AND_ASSIGN", 
		"OR_ASSIGN", "XOR_ASSIGN", "LEFT_SHIFT_ASSIGN", "RIGHT_SHIFT_ASSIGN", 
		"TOP", "INITAL", "ALWAYS", "POSEDGE", "NEGEDGE", "SKIP_", "UNKNOWN_CHAR", 
		"INDENT", "DEDENT"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Verython.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public VerythonParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class InitialContext extends ParserRuleContext {
		public TopContext top() {
			return getRuleContext(TopContext.class,0);
		}
		public TerminalNode EOF() { return getToken(VerythonParser.EOF, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(VerythonParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(VerythonParser.NEWLINE, i);
		}
		public InitialContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initial; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerythonVisitor ) return ((VerythonVisitor<? extends T>)visitor).visitInitial(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitialContext initial() throws RecognitionException {
		InitialContext _localctx = new InitialContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_initial);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(126);
				match(NEWLINE);
				}
				}
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(132);
			top();
			setState(133);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TopContext extends ParserRuleContext {
		public TerminalNode TOP() { return getToken(VerythonParser.TOP, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(VerythonParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(VerythonParser.NEWLINE, i);
		}
		public List<FuncdefContext> funcdef() {
			return getRuleContexts(FuncdefContext.class);
		}
		public FuncdefContext funcdef(int i) {
			return getRuleContext(FuncdefContext.class,i);
		}
		public TopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_top; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerythonVisitor ) return ((VerythonVisitor<? extends T>)visitor).visitTop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TopContext top() throws RecognitionException {
		TopContext _localctx = new TopContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_top);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(TOP);
			setState(136);
			match(NEWLINE);
			setState(137);
			funcdef();
			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DEF || _la==NEWLINE) {
				{
				setState(140);
				switch (_input.LA(1)) {
				case NEWLINE:
					{
					setState(138);
					match(NEWLINE);
					}
					break;
				case DEF:
					{
					setState(139);
					funcdef();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(144);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DecoratorContext extends ParserRuleContext {
		public TerminalNode INITAL() { return getToken(VerythonParser.INITAL, 0); }
		public TerminalNode ALWAYS() { return getToken(VerythonParser.ALWAYS, 0); }
		public Arg_decsContext arg_decs() {
			return getRuleContext(Arg_decsContext.class,0);
		}
		public DecoratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decorator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerythonVisitor ) return ((VerythonVisitor<? extends T>)visitor).visitDecorator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecoratorContext decorator() throws RecognitionException {
		DecoratorContext _localctx = new DecoratorContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_decorator);
		int _la;
		try {
			setState(152);
			switch (_input.LA(1)) {
			case INITAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(145);
				match(INITAL);
				}
				break;
			case ALWAYS:
				enterOuterAlt(_localctx, 2);
				{
				setState(146);
				match(ALWAYS);
				setState(147);
				match(OPEN_PAREN);
				setState(149);
				_la = _input.LA(1);
				if (_la==NAME) {
					{
					setState(148);
					arg_decs();
					}
				}

				setState(151);
				match(CLOSE_PAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Arg_decsContext extends ParserRuleContext {
		public List<Arg_decContext> arg_dec() {
			return getRuleContexts(Arg_decContext.class);
		}
		public Arg_decContext arg_dec(int i) {
			return getRuleContext(Arg_decContext.class,i);
		}
		public Arg_decsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg_decs; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerythonVisitor ) return ((VerythonVisitor<? extends T>)visitor).visitArg_decs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arg_decsContext arg_decs() throws RecognitionException {
		Arg_decsContext _localctx = new Arg_decsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_arg_decs);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(154);
					arg_dec();
					setState(155);
					match(COMMA);
					}
					} 
				}
				setState(161);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(162);
			arg_dec();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Arg_decContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(VerythonParser.NAME, 0); }
		public TerminalNode POSEDGE() { return getToken(VerythonParser.POSEDGE, 0); }
		public TerminalNode NEGEDGE() { return getToken(VerythonParser.NEGEDGE, 0); }
		public Arg_decContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg_dec; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerythonVisitor ) return ((VerythonVisitor<? extends T>)visitor).visitArg_dec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arg_decContext arg_dec() throws RecognitionException {
		Arg_decContext _localctx = new Arg_decContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_arg_dec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(NAME);
			setState(166);
			_la = _input.LA(1);
			if (_la==POSEDGE || _la==NEGEDGE) {
				{
				setState(165);
				_la = _input.LA(1);
				if ( !(_la==POSEDGE || _la==NEGEDGE) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode BLOCK() { return getToken(VerythonParser.BLOCK, 0); }
		public SuiteContext suite() {
			return getRuleContext(SuiteContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerythonVisitor ) return ((VerythonVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(BLOCK);
			setState(169);
			match(COLON);
			setState(170);
			suite();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncdefContext extends ParserRuleContext {
		public TerminalNode DEF() { return getToken(VerythonParser.DEF, 0); }
		public TerminalNode NAME() { return getToken(VerythonParser.NAME, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(VerythonParser.NEWLINE, 0); }
		public BlocksContext blocks() {
			return getRuleContext(BlocksContext.class,0);
		}
		public FuncdefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcdef; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerythonVisitor ) return ((VerythonVisitor<? extends T>)visitor).visitFuncdef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncdefContext funcdef() throws RecognitionException {
		FuncdefContext _localctx = new FuncdefContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_funcdef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(DEF);
			setState(173);
			match(NAME);
			setState(174);
			parameters();
			setState(175);
			match(COLON);
			setState(176);
			match(NEWLINE);
			setState(177);
			blocks();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlocksContext extends ParserRuleContext {
		public TerminalNode INDENT() { return getToken(VerythonParser.INDENT, 0); }
		public TerminalNode DEDENT() { return getToken(VerythonParser.DEDENT, 0); }
		public List<Block_elementContext> block_element() {
			return getRuleContexts(Block_elementContext.class);
		}
		public Block_elementContext block_element(int i) {
			return getRuleContext(Block_elementContext.class,i);
		}
		public BlocksContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blocks; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerythonVisitor ) return ((VerythonVisitor<? extends T>)visitor).visitBlocks(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlocksContext blocks() throws RecognitionException {
		BlocksContext _localctx = new BlocksContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_blocks);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(INDENT);
			setState(181); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(180);
				block_element();
				}
				}
				setState(183); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << NOT) | (1L << NONE) | (1L << TRUE) | (1L << FALSE) | (1L << NAME) | (1L << DECIMAL_INTEGER) | (1L << OCT_INTEGER) | (1L << HEX_INTEGER) | (1L << BIN_INTEGER) | (1L << STAR) | (1L << OPEN_PAREN) | (1L << OPEN_BRACK) | (1L << ADD) | (1L << MINUS) | (1L << NOT_OP) | (1L << OPEN_BRACE))) != 0) || _la==INITAL || _la==ALWAYS );
			setState(185);
			match(DEDENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Block_elementContext extends ParserRuleContext {
		public DecoratorContext decorator() {
			return getRuleContext(DecoratorContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(VerythonParser.NEWLINE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Expr_stmtContext expr_stmt() {
			return getRuleContext(Expr_stmtContext.class,0);
		}
		public Block_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_element; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerythonVisitor ) return ((VerythonVisitor<? extends T>)visitor).visitBlock_element(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Block_elementContext block_element() throws RecognitionException {
		Block_elementContext _localctx = new Block_elementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_block_element);
		try {
			setState(194);
			switch (_input.LA(1)) {
			case INITAL:
			case ALWAYS:
				enterOuterAlt(_localctx, 1);
				{
				setState(187);
				decorator();
				setState(188);
				match(NEWLINE);
				setState(189);
				block();
				}
				break;
			case T__0:
			case NOT:
			case NONE:
			case TRUE:
			case FALSE:
			case NAME:
			case DECIMAL_INTEGER:
			case OCT_INTEGER:
			case HEX_INTEGER:
			case BIN_INTEGER:
			case STAR:
			case OPEN_PAREN:
			case OPEN_BRACK:
			case ADD:
			case MINUS:
			case NOT_OP:
			case OPEN_BRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(191);
				expr_stmt();
				setState(192);
				match(NEWLINE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParametersContext extends ParserRuleContext {
		public List<TypedargslistContext> typedargslist() {
			return getRuleContexts(TypedargslistContext.class);
		}
		public TypedargslistContext typedargslist(int i) {
			return getRuleContext(TypedargslistContext.class,i);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerythonVisitor ) return ((VerythonVisitor<? extends T>)visitor).visitParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_parameters);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(OPEN_PAREN);
			setState(197);
			typedargslist();
			setState(198);
			match(SEMI_COLON);
			setState(199);
			typedargslist();
			setState(200);
			match(CLOSE_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypedargslistContext extends ParserRuleContext {
		public List<TerminalNode> DECIMAL_INTEGER() { return getTokens(VerythonParser.DECIMAL_INTEGER); }
		public TerminalNode DECIMAL_INTEGER(int i) {
			return getToken(VerythonParser.DECIMAL_INTEGER, i);
		}
		public List<TfpdefContext> tfpdef() {
			return getRuleContexts(TfpdefContext.class);
		}
		public TfpdefContext tfpdef(int i) {
			return getRuleContext(TfpdefContext.class,i);
		}
		public TypedargslistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedargslist; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerythonVisitor ) return ((VerythonVisitor<? extends T>)visitor).visitTypedargslist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypedargslistContext typedargslist() throws RecognitionException {
		TypedargslistContext _localctx = new TypedargslistContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_typedargslist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			match(OPEN_BRACK);
			setState(203);
			match(DECIMAL_INTEGER);
			setState(204);
			match(COLON);
			setState(205);
			match(DECIMAL_INTEGER);
			setState(206);
			match(CLOSE_BRACK);
			setState(207);
			tfpdef();
			setState(217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(208);
				match(COMMA);
				setState(209);
				match(OPEN_BRACK);
				setState(210);
				match(DECIMAL_INTEGER);
				setState(211);
				match(COLON);
				setState(212);
				match(DECIMAL_INTEGER);
				setState(213);
				match(CLOSE_BRACK);
				setState(214);
				tfpdef();
				}
				}
				setState(219);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TfpdefContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(VerythonParser.NAME, 0); }
		public TestContext test() {
			return getRuleContext(TestContext.class,0);
		}
		public TfpdefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tfpdef; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerythonVisitor ) return ((VerythonVisitor<? extends T>)visitor).visitTfpdef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TfpdefContext tfpdef() throws RecognitionException {
		TfpdefContext _localctx = new TfpdefContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_tfpdef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			match(NAME);
			setState(223);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(221);
				match(COLON);
				setState(222);
				test();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StmtContext extends ParserRuleContext {
		public Simple_stmtContext simple_stmt() {
			return getRuleContext(Simple_stmtContext.class,0);
		}
		public Compound_stmtContext compound_stmt() {
			return getRuleContext(Compound_stmtContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerythonVisitor ) return ((VerythonVisitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_stmt);
		try {
			setState(227);
			switch (_input.LA(1)) {
			case T__0:
			case RETURN:
			case NOT:
			case NONE:
			case TRUE:
			case FALSE:
			case DEL:
			case PASS:
			case CONTINUE:
			case BREAK:
			case NAME:
			case DECIMAL_INTEGER:
			case OCT_INTEGER:
			case HEX_INTEGER:
			case BIN_INTEGER:
			case STAR:
			case OPEN_PAREN:
			case OPEN_BRACK:
			case ADD:
			case MINUS:
			case NOT_OP:
			case OPEN_BRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(225);
				simple_stmt();
				}
				break;
			case IF:
			case SWITCH:
			case WHILE:
			case FOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(226);
				compound_stmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Simple_stmtContext extends ParserRuleContext {
		public List<Small_stmtContext> small_stmt() {
			return getRuleContexts(Small_stmtContext.class);
		}
		public Small_stmtContext small_stmt(int i) {
			return getRuleContext(Small_stmtContext.class,i);
		}
		public TerminalNode NEWLINE() { return getToken(VerythonParser.NEWLINE, 0); }
		public Simple_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerythonVisitor ) return ((VerythonVisitor<? extends T>)visitor).visitSimple_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_stmtContext simple_stmt() throws RecognitionException {
		Simple_stmtContext _localctx = new Simple_stmtContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_simple_stmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			small_stmt();
			setState(234);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(230);
					match(SEMI_COLON);
					setState(231);
					small_stmt();
					}
					} 
				}
				setState(236);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			setState(238);
			_la = _input.LA(1);
			if (_la==SEMI_COLON) {
				{
				setState(237);
				match(SEMI_COLON);
				}
			}

			setState(240);
			match(NEWLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Small_stmtContext extends ParserRuleContext {
		public Expr_stmtContext expr_stmt() {
			return getRuleContext(Expr_stmtContext.class,0);
		}
		public Del_stmtContext del_stmt() {
			return getRuleContext(Del_stmtContext.class,0);
		}
		public Pass_stmtContext pass_stmt() {
			return getRuleContext(Pass_stmtContext.class,0);
		}
		public Flow_stmtContext flow_stmt() {
			return getRuleContext(Flow_stmtContext.class,0);
		}
		public Small_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_small_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerythonVisitor ) return ((VerythonVisitor<? extends T>)visitor).visitSmall_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Small_stmtContext small_stmt() throws RecognitionException {
		Small_stmtContext _localctx = new Small_stmtContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_small_stmt);
		try {
			setState(246);
			switch (_input.LA(1)) {
			case T__0:
			case NOT:
			case NONE:
			case TRUE:
			case FALSE:
			case NAME:
			case DECIMAL_INTEGER:
			case OCT_INTEGER:
			case HEX_INTEGER:
			case BIN_INTEGER:
			case STAR:
			case OPEN_PAREN:
			case OPEN_BRACK:
			case ADD:
			case MINUS:
			case NOT_OP:
			case OPEN_BRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(242);
				expr_stmt();
				}
				break;
			case DEL:
				enterOuterAlt(_localctx, 2);
				{
				setState(243);
				del_stmt();
				}
				break;
			case PASS:
				enterOuterAlt(_localctx, 3);
				{
				setState(244);
				pass_stmt();
				}
				break;
			case RETURN:
			case CONTINUE:
			case BREAK:
				enterOuterAlt(_localctx, 4);
				{
				setState(245);
				flow_stmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_stmtContext extends ParserRuleContext {
		public List<Testlist_star_exprContext> testlist_star_expr() {
			return getRuleContexts(Testlist_star_exprContext.class);
		}
		public Testlist_star_exprContext testlist_star_expr(int i) {
			return getRuleContext(Testlist_star_exprContext.class,i);
		}
		public AugassignContext augassign() {
			return getRuleContext(AugassignContext.class,0);
		}
		public TestlistContext testlist() {
			return getRuleContext(TestlistContext.class,0);
		}
		public Expr_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerythonVisitor ) return ((VerythonVisitor<? extends T>)visitor).visitExpr_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_stmtContext expr_stmt() throws RecognitionException {
		Expr_stmtContext _localctx = new Expr_stmtContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_expr_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			testlist_star_expr();
			setState(259);
			switch (_input.LA(1)) {
			case ADD_ASSIGN:
			case SUB_ASSIGN:
			case MULT_ASSIGN:
			case DIV_ASSIGN:
			case MOD_ASSIGN:
			case AND_ASSIGN:
			case OR_ASSIGN:
			case XOR_ASSIGN:
			case LEFT_SHIFT_ASSIGN:
			case RIGHT_SHIFT_ASSIGN:
				{
				setState(249);
				augassign();
				setState(250);
				testlist();
				}
				break;
			case NEWLINE:
			case SEMI_COLON:
			case ASSIGN:
				{
				setState(256);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ASSIGN) {
					{
					{
					setState(252);
					match(ASSIGN);
					setState(253);
					testlist_star_expr();
					}
					}
					setState(258);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Testlist_star_exprContext extends ParserRuleContext {
		public List<TestContext> test() {
			return getRuleContexts(TestContext.class);
		}
		public TestContext test(int i) {
			return getRuleContext(TestContext.class,i);
		}
		public List<Star_exprContext> star_expr() {
			return getRuleContexts(Star_exprContext.class);
		}
		public Star_exprContext star_expr(int i) {
			return getRuleContext(Star_exprContext.class,i);
		}
		public Testlist_star_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_testlist_star_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerythonVisitor ) return ((VerythonVisitor<? extends T>)visitor).visitTestlist_star_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Testlist_star_exprContext testlist_star_expr() throws RecognitionException {
		Testlist_star_exprContext _localctx = new Testlist_star_exprContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_testlist_star_expr);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(261);
				test();
				}
				break;
			case 2:
				{
				setState(262);
				star_expr();
				}
				break;
			}
			setState(272);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(265);
					match(COMMA);
					setState(268);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						setState(266);
						test();
						}
						break;
					case 2:
						{
						setState(267);
						star_expr();
						}
						break;
					}
					}
					} 
				}
				setState(274);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			setState(276);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(275);
				match(COMMA);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AugassignContext extends ParserRuleContext {
		public TerminalNode ADD_ASSIGN() { return getToken(VerythonParser.ADD_ASSIGN, 0); }
		public TerminalNode SUB_ASSIGN() { return getToken(VerythonParser.SUB_ASSIGN, 0); }
		public TerminalNode MULT_ASSIGN() { return getToken(VerythonParser.MULT_ASSIGN, 0); }
		public TerminalNode DIV_ASSIGN() { return getToken(VerythonParser.DIV_ASSIGN, 0); }
		public TerminalNode MOD_ASSIGN() { return getToken(VerythonParser.MOD_ASSIGN, 0); }
		public TerminalNode AND_ASSIGN() { return getToken(VerythonParser.AND_ASSIGN, 0); }
		public TerminalNode OR_ASSIGN() { return getToken(VerythonParser.OR_ASSIGN, 0); }
		public TerminalNode XOR_ASSIGN() { return getToken(VerythonParser.XOR_ASSIGN, 0); }
		public TerminalNode LEFT_SHIFT_ASSIGN() { return getToken(VerythonParser.LEFT_SHIFT_ASSIGN, 0); }
		public TerminalNode RIGHT_SHIFT_ASSIGN() { return getToken(VerythonParser.RIGHT_SHIFT_ASSIGN, 0); }
		public AugassignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_augassign; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerythonVisitor ) return ((VerythonVisitor<? extends T>)visitor).visitAugassign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AugassignContext augassign() throws RecognitionException {
		AugassignContext _localctx = new AugassignContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_augassign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			_la = _input.LA(1);
			if ( !(((((_la - 60)) & ~0x3f) == 0 && ((1L << (_la - 60)) & ((1L << (ADD_ASSIGN - 60)) | (1L << (SUB_ASSIGN - 60)) | (1L << (MULT_ASSIGN - 60)) | (1L << (DIV_ASSIGN - 60)) | (1L << (MOD_ASSIGN - 60)) | (1L << (AND_ASSIGN - 60)) | (1L << (OR_ASSIGN - 60)) | (1L << (XOR_ASSIGN - 60)) | (1L << (LEFT_SHIFT_ASSIGN - 60)) | (1L << (RIGHT_SHIFT_ASSIGN - 60)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Del_stmtContext extends ParserRuleContext {
		public TerminalNode DEL() { return getToken(VerythonParser.DEL, 0); }
		public ExprlistContext exprlist() {
			return getRuleContext(ExprlistContext.class,0);
		}
		public Del_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_del_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerythonVisitor ) return ((VerythonVisitor<? extends T>)visitor).visitDel_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Del_stmtContext del_stmt() throws RecognitionException {
		Del_stmtContext _localctx = new Del_stmtContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_del_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			match(DEL);
			setState(281);
			exprlist();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pass_stmtContext extends ParserRuleContext {
		public TerminalNode PASS() { return getToken(VerythonParser.PASS, 0); }
		public Pass_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pass_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerythonVisitor ) return ((VerythonVisitor<? extends T>)visitor).visitPass_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pass_stmtContext pass_stmt() throws RecognitionException {
		Pass_stmtContext _localctx = new Pass_stmtContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_pass_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			match(PASS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Flow_stmtContext extends ParserRuleContext {
		public Break_stmtContext break_stmt() {
			return getRuleContext(Break_stmtContext.class,0);
		}
		public Continue_stmtContext continue_stmt() {
			return getRuleContext(Continue_stmtContext.class,0);
		}
		public Return_stmtContext return_stmt() {
			return getRuleContext(Return_stmtContext.class,0);
		}
		public Flow_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flow_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerythonVisitor ) return ((VerythonVisitor<? extends T>)visitor).visitFlow_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Flow_stmtContext flow_stmt() throws RecognitionException {
		Flow_stmtContext _localctx = new Flow_stmtContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_flow_stmt);
		try {
			setState(288);
			switch (_input.LA(1)) {
			case BREAK:
				enterOuterAlt(_localctx, 1);
				{
				setState(285);
				break_stmt();
				}
				break;
			case CONTINUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(286);
				continue_stmt();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 3);
				{
				setState(287);
				return_stmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Break_stmtContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(VerythonParser.BREAK, 0); }
		public Break_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_break_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerythonVisitor ) return ((VerythonVisitor<? extends T>)visitor).visitBreak_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Break_stmtContext break_stmt() throws RecognitionException {
		Break_stmtContext _localctx = new Break_stmtContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_break_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			match(BREAK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Continue_stmtContext extends ParserRuleContext {
		public TerminalNode CONTINUE() { return getToken(VerythonParser.CONTINUE, 0); }
		public Continue_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continue_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerythonVisitor ) return ((VerythonVisitor<? extends T>)visitor).visitContinue_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Continue_stmtContext continue_stmt() throws RecognitionException {
		Continue_stmtContext _localctx = new Continue_stmtContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_continue_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			match(CONTINUE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Return_stmtContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(VerythonParser.RETURN, 0); }
		public TestlistContext testlist() {
			return getRuleContext(TestlistContext.class,0);
		}
		public Return_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerythonVisitor ) return ((VerythonVisitor<? extends T>)visitor).visitReturn_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_stmtContext return_stmt() throws RecognitionException {
		Return_stmtContext _localctx = new Return_stmtContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_return_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			match(RETURN);
			setState(296);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << NOT) | (1L << NONE) | (1L << TRUE) | (1L << FALSE) | (1L << NAME) | (1L << DECIMAL_INTEGER) | (1L << OCT_INTEGER) | (1L << HEX_INTEGER) | (1L << BIN_INTEGER) | (1L << STAR) | (1L << OPEN_PAREN) | (1L << OPEN_BRACK) | (1L << ADD) | (1L << MINUS) | (1L << NOT_OP) | (1L << OPEN_BRACE))) != 0)) {
				{
				setState(295);
				testlist();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Compound_stmtContext extends ParserRuleContext {
		public If_stmtContext if_stmt() {
			return getRuleContext(If_stmtContext.class,0);
		}
		public Switch_stmtContext switch_stmt() {
			return getRuleContext(Switch_stmtContext.class,0);
		}
		public While_stmtContext while_stmt() {
			return getRuleContext(While_stmtContext.class,0);
		}
		public For_stmtContext for_stmt() {
			return getRuleContext(For_stmtContext.class,0);
		}
		public Compound_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compound_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerythonVisitor ) return ((VerythonVisitor<? extends T>)visitor).visitCompound_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Compound_stmtContext compound_stmt() throws RecognitionException {
		Compound_stmtContext _localctx = new Compound_stmtContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_compound_stmt);
		try {
			setState(302);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(298);
				if_stmt();
				}
				break;
			case SWITCH:
				enterOuterAlt(_localctx, 2);
				{
				setState(299);
				switch_stmt();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(300);
				while_stmt();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 4);
				{
				setState(301);
				for_stmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_stmtContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(VerythonParser.IF, 0); }
		public List<TestContext> test() {
			return getRuleContexts(TestContext.class);
		}
		public TestContext test(int i) {
			return getRuleContext(TestContext.class,i);
		}
		public List<SuiteContext> suite() {
			return getRuleContexts(SuiteContext.class);
		}
		public SuiteContext suite(int i) {
			return getRuleContext(SuiteContext.class,i);
		}
		public List<TerminalNode> ELIF() { return getTokens(VerythonParser.ELIF); }
		public TerminalNode ELIF(int i) {
			return getToken(VerythonParser.ELIF, i);
		}
		public TerminalNode ELSE() { return getToken(VerythonParser.ELSE, 0); }
		public If_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerythonVisitor ) return ((VerythonVisitor<? extends T>)visitor).visitIf_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_stmtContext if_stmt() throws RecognitionException {
		If_stmtContext _localctx = new If_stmtContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_if_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			match(IF);
			setState(305);
			test();
			setState(306);
			match(COLON);
			setState(307);
			suite();
			setState(315);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELIF) {
				{
				{
				setState(308);
				match(ELIF);
				setState(309);
				test();
				setState(310);
				match(COLON);
				setState(311);
				suite();
				}
				}
				setState(317);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(321);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(318);
				match(ELSE);
				setState(319);
				match(COLON);
				setState(320);
				suite();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Switch_stmtContext extends ParserRuleContext {
		public TerminalNode SWITCH() { return getToken(VerythonParser.SWITCH, 0); }
		public TerminalNode NAME() { return getToken(VerythonParser.NAME, 0); }
		public Switch_suiteContext switch_suite() {
			return getRuleContext(Switch_suiteContext.class,0);
		}
		public Switch_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerythonVisitor ) return ((VerythonVisitor<? extends T>)visitor).visitSwitch_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Switch_stmtContext switch_stmt() throws RecognitionException {
		Switch_stmtContext _localctx = new Switch_stmtContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_switch_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			match(SWITCH);
			setState(324);
			match(OPEN_PAREN);
			setState(325);
			match(NAME);
			setState(326);
			match(CLOSE_PAREN);
			setState(327);
			match(COLON);
			setState(328);
			switch_suite();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Switch_suiteContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(VerythonParser.NEWLINE, 0); }
		public TerminalNode INDENT() { return getToken(VerythonParser.INDENT, 0); }
		public Case_defaultContext case_default() {
			return getRuleContext(Case_defaultContext.class,0);
		}
		public TerminalNode DEDENT() { return getToken(VerythonParser.DEDENT, 0); }
		public List<Case_stmtContext> case_stmt() {
			return getRuleContexts(Case_stmtContext.class);
		}
		public Case_stmtContext case_stmt(int i) {
			return getRuleContext(Case_stmtContext.class,i);
		}
		public Switch_suiteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_suite; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerythonVisitor ) return ((VerythonVisitor<? extends T>)visitor).visitSwitch_suite(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Switch_suiteContext switch_suite() throws RecognitionException {
		Switch_suiteContext _localctx = new Switch_suiteContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_switch_suite);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			match(NEWLINE);
			setState(331);
			match(INDENT);
			setState(335);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE) {
				{
				{
				setState(332);
				case_stmt();
				}
				}
				setState(337);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(338);
			case_default();
			setState(339);
			match(DEDENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Case_stmtContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(VerythonParser.CASE, 0); }
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public TerminalNode NEWLINE() { return getToken(VerythonParser.NEWLINE, 0); }
		public Expr_stmtContext expr_stmt() {
			return getRuleContext(Expr_stmtContext.class,0);
		}
		public TerminalNode RETURN() { return getToken(VerythonParser.RETURN, 0); }
		public TerminalNode NAME() { return getToken(VerythonParser.NAME, 0); }
		public Case_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerythonVisitor ) return ((VerythonVisitor<? extends T>)visitor).visitCase_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Case_stmtContext case_stmt() throws RecognitionException {
		Case_stmtContext _localctx = new Case_stmtContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_case_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			match(CASE);
			setState(342);
			number();
			setState(343);
			match(COLON);
			setState(350);
			switch (_input.LA(1)) {
			case RETURN:
				{
				{
				setState(344);
				match(RETURN);
				setState(347);
				switch (_input.LA(1)) {
				case NAME:
					{
					setState(345);
					match(NAME);
					}
					break;
				case DECIMAL_INTEGER:
				case OCT_INTEGER:
				case HEX_INTEGER:
				case BIN_INTEGER:
					{
					setState(346);
					number();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				break;
			case T__0:
			case NOT:
			case NONE:
			case TRUE:
			case FALSE:
			case NAME:
			case DECIMAL_INTEGER:
			case OCT_INTEGER:
			case HEX_INTEGER:
			case BIN_INTEGER:
			case STAR:
			case OPEN_PAREN:
			case OPEN_BRACK:
			case ADD:
			case MINUS:
			case NOT_OP:
			case OPEN_BRACE:
				{
				setState(349);
				expr_stmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(352);
			match(NEWLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Case_defaultContext extends ParserRuleContext {
		public TerminalNode DEFAULT() { return getToken(VerythonParser.DEFAULT, 0); }
		public TerminalNode NEWLINE() { return getToken(VerythonParser.NEWLINE, 0); }
		public Expr_stmtContext expr_stmt() {
			return getRuleContext(Expr_stmtContext.class,0);
		}
		public TerminalNode RETURN() { return getToken(VerythonParser.RETURN, 0); }
		public TerminalNode NAME() { return getToken(VerythonParser.NAME, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public Case_defaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_default; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerythonVisitor ) return ((VerythonVisitor<? extends T>)visitor).visitCase_default(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Case_defaultContext case_default() throws RecognitionException {
		Case_defaultContext _localctx = new Case_defaultContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_case_default);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			match(DEFAULT);
			setState(355);
			match(COLON);
			setState(362);
			switch (_input.LA(1)) {
			case RETURN:
				{
				{
				setState(356);
				match(RETURN);
				setState(359);
				switch (_input.LA(1)) {
				case NAME:
					{
					setState(357);
					match(NAME);
					}
					break;
				case DECIMAL_INTEGER:
				case OCT_INTEGER:
				case HEX_INTEGER:
				case BIN_INTEGER:
					{
					setState(358);
					number();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				break;
			case T__0:
			case NOT:
			case NONE:
			case TRUE:
			case FALSE:
			case NAME:
			case DECIMAL_INTEGER:
			case OCT_INTEGER:
			case HEX_INTEGER:
			case BIN_INTEGER:
			case STAR:
			case OPEN_PAREN:
			case OPEN_BRACK:
			case ADD:
			case MINUS:
			case NOT_OP:
			case OPEN_BRACE:
				{
				setState(361);
				expr_stmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(364);
			match(NEWLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class While_stmtContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(VerythonParser.WHILE, 0); }
		public TestContext test() {
			return getRuleContext(TestContext.class,0);
		}
		public List<SuiteContext> suite() {
			return getRuleContexts(SuiteContext.class);
		}
		public SuiteContext suite(int i) {
			return getRuleContext(SuiteContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(VerythonParser.ELSE, 0); }
		public While_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerythonVisitor ) return ((VerythonVisitor<? extends T>)visitor).visitWhile_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_stmtContext while_stmt() throws RecognitionException {
		While_stmtContext _localctx = new While_stmtContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_while_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			match(WHILE);
			setState(367);
			test();
			setState(368);
			match(COLON);
			setState(369);
			suite();
			setState(373);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(370);
				match(ELSE);
				setState(371);
				match(COLON);
				setState(372);
				suite();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_stmtContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(VerythonParser.FOR, 0); }
		public ExprlistContext exprlist() {
			return getRuleContext(ExprlistContext.class,0);
		}
		public TerminalNode IN() { return getToken(VerythonParser.IN, 0); }
		public TestlistContext testlist() {
			return getRuleContext(TestlistContext.class,0);
		}
		public List<SuiteContext> suite() {
			return getRuleContexts(SuiteContext.class);
		}
		public SuiteContext suite(int i) {
			return getRuleContext(SuiteContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(VerythonParser.ELSE, 0); }
		public For_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerythonVisitor ) return ((VerythonVisitor<? extends T>)visitor).visitFor_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_stmtContext for_stmt() throws RecognitionException {
		For_stmtContext _localctx = new For_stmtContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_for_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			match(FOR);
			setState(376);
			exprlist();
			setState(377);
			match(IN);
			setState(378);
			testlist();
			setState(379);
			match(COLON);
			setState(380);
			suite();
			setState(384);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(381);
				match(ELSE);
				setState(382);
				match(COLON);
				setState(383);
				suite();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SuiteContext extends ParserRuleContext {
		public Simple_stmtContext simple_stmt() {
			return getRuleContext(Simple_stmtContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(VerythonParser.NEWLINE, 0); }
		public TerminalNode INDENT() { return getToken(VerythonParser.INDENT, 0); }
		public TerminalNode DEDENT() { return getToken(VerythonParser.DEDENT, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public SuiteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_suite; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerythonVisitor ) return ((VerythonVisitor<? extends T>)visitor).visitSuite(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SuiteContext suite() throws RecognitionException {
		SuiteContext _localctx = new SuiteContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_suite);
		int _la;
		try {
			setState(396);
			switch (_input.LA(1)) {
			case T__0:
			case RETURN:
			case NOT:
			case NONE:
			case TRUE:
			case FALSE:
			case DEL:
			case PASS:
			case CONTINUE:
			case BREAK:
			case NAME:
			case DECIMAL_INTEGER:
			case OCT_INTEGER:
			case HEX_INTEGER:
			case BIN_INTEGER:
			case STAR:
			case OPEN_PAREN:
			case OPEN_BRACK:
			case ADD:
			case MINUS:
			case NOT_OP:
			case OPEN_BRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(386);
				simple_stmt();
				}
				break;
			case NEWLINE:
				enterOuterAlt(_localctx, 2);
				{
				setState(387);
				match(NEWLINE);
				setState(388);
				match(INDENT);
				setState(390); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(389);
					stmt();
					}
					}
					setState(392); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << RETURN) | (1L << IF) | (1L << SWITCH) | (1L << WHILE) | (1L << FOR) | (1L << NOT) | (1L << NONE) | (1L << TRUE) | (1L << FALSE) | (1L << DEL) | (1L << PASS) | (1L << CONTINUE) | (1L << BREAK) | (1L << NAME) | (1L << DECIMAL_INTEGER) | (1L << OCT_INTEGER) | (1L << HEX_INTEGER) | (1L << BIN_INTEGER) | (1L << STAR) | (1L << OPEN_PAREN) | (1L << OPEN_BRACK) | (1L << ADD) | (1L << MINUS) | (1L << NOT_OP) | (1L << OPEN_BRACE))) != 0) );
				setState(394);
				match(DEDENT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TestContext extends ParserRuleContext {
		public List<Or_testContext> or_test() {
			return getRuleContexts(Or_testContext.class);
		}
		public Or_testContext or_test(int i) {
			return getRuleContext(Or_testContext.class,i);
		}
		public TerminalNode IF() { return getToken(VerythonParser.IF, 0); }
		public TerminalNode ELSE() { return getToken(VerythonParser.ELSE, 0); }
		public TestContext test() {
			return getRuleContext(TestContext.class,0);
		}
		public TestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_test; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerythonVisitor ) return ((VerythonVisitor<? extends T>)visitor).visitTest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TestContext test() throws RecognitionException {
		TestContext _localctx = new TestContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_test);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(398);
			or_test();
			setState(404);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(399);
				match(IF);
				setState(400);
				or_test();
				setState(401);
				match(ELSE);
				setState(402);
				test();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Or_testContext extends ParserRuleContext {
		public List<And_testContext> and_test() {
			return getRuleContexts(And_testContext.class);
		}
		public And_testContext and_test(int i) {
			return getRuleContext(And_testContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(VerythonParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(VerythonParser.OR, i);
		}
		public Or_testContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_or_test; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerythonVisitor ) return ((VerythonVisitor<? extends T>)visitor).visitOr_test(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Or_testContext or_test() throws RecognitionException {
		Or_testContext _localctx = new Or_testContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_or_test);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(406);
			and_test();
			setState(411);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(407);
				match(OR);
				setState(408);
				and_test();
				}
				}
				setState(413);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class And_testContext extends ParserRuleContext {
		public List<Not_testContext> not_test() {
			return getRuleContexts(Not_testContext.class);
		}
		public Not_testContext not_test(int i) {
			return getRuleContext(Not_testContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(VerythonParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(VerythonParser.AND, i);
		}
		public And_testContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and_test; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerythonVisitor ) return ((VerythonVisitor<? extends T>)visitor).visitAnd_test(this);
			else return visitor.visitChildren(this);
		}
	}

	public final And_testContext and_test() throws RecognitionException {
		And_testContext _localctx = new And_testContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_and_test);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(414);
			not_test();
			setState(419);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(415);
				match(AND);
				setState(416);
				not_test();
				}
				}
				setState(421);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Not_testContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(VerythonParser.NOT, 0); }
		public Not_testContext not_test() {
			return getRuleContext(Not_testContext.class,0);
		}
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public Not_testContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_not_test; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerythonVisitor ) return ((VerythonVisitor<? extends T>)visitor).visitNot_test(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Not_testContext not_test() throws RecognitionException {
		Not_testContext _localctx = new Not_testContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_not_test);
		try {
			setState(425);
			switch (_input.LA(1)) {
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(422);
				match(NOT);
				setState(423);
				not_test();
				}
				break;
			case T__0:
			case NONE:
			case TRUE:
			case FALSE:
			case NAME:
			case DECIMAL_INTEGER:
			case OCT_INTEGER:
			case HEX_INTEGER:
			case BIN_INTEGER:
			case STAR:
			case OPEN_PAREN:
			case OPEN_BRACK:
			case ADD:
			case MINUS:
			case NOT_OP:
			case OPEN_BRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(424);
				comparison();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComparisonContext extends ParserRuleContext {
		public List<Star_exprContext> star_expr() {
			return getRuleContexts(Star_exprContext.class);
		}
		public Star_exprContext star_expr(int i) {
			return getRuleContext(Star_exprContext.class,i);
		}
		public List<Comp_opContext> comp_op() {
			return getRuleContexts(Comp_opContext.class);
		}
		public Comp_opContext comp_op(int i) {
			return getRuleContext(Comp_opContext.class,i);
		}
		public ComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerythonVisitor ) return ((VerythonVisitor<? extends T>)visitor).visitComparison(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonContext comparison() throws RecognitionException {
		ComparisonContext _localctx = new ComparisonContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_comparison);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(427);
			star_expr();
			setState(433);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IN) | (1L << NOT) | (1L << IS) | (1L << LESS_THAN) | (1L << GREATER_THAN) | (1L << EQUALS) | (1L << GT_EQ) | (1L << LT_EQ) | (1L << NOT_EQ_1) | (1L << NOT_EQ_2))) != 0)) {
				{
				{
				setState(428);
				comp_op();
				setState(429);
				star_expr();
				}
				}
				setState(435);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Comp_opContext extends ParserRuleContext {
		public TerminalNode LESS_THAN() { return getToken(VerythonParser.LESS_THAN, 0); }
		public TerminalNode GREATER_THAN() { return getToken(VerythonParser.GREATER_THAN, 0); }
		public TerminalNode EQUALS() { return getToken(VerythonParser.EQUALS, 0); }
		public TerminalNode GT_EQ() { return getToken(VerythonParser.GT_EQ, 0); }
		public TerminalNode LT_EQ() { return getToken(VerythonParser.LT_EQ, 0); }
		public TerminalNode NOT_EQ_1() { return getToken(VerythonParser.NOT_EQ_1, 0); }
		public TerminalNode NOT_EQ_2() { return getToken(VerythonParser.NOT_EQ_2, 0); }
		public TerminalNode IN() { return getToken(VerythonParser.IN, 0); }
		public TerminalNode NOT() { return getToken(VerythonParser.NOT, 0); }
		public TerminalNode IS() { return getToken(VerythonParser.IS, 0); }
		public Comp_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp_op; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerythonVisitor ) return ((VerythonVisitor<? extends T>)visitor).visitComp_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comp_opContext comp_op() throws RecognitionException {
		Comp_opContext _localctx = new Comp_opContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_comp_op);
		try {
			setState(449);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(436);
				match(LESS_THAN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(437);
				match(GREATER_THAN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(438);
				match(EQUALS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(439);
				match(GT_EQ);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(440);
				match(LT_EQ);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(441);
				match(NOT_EQ_1);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(442);
				match(NOT_EQ_2);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(443);
				match(IN);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(444);
				match(NOT);
				setState(445);
				match(IN);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(446);
				match(IS);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(447);
				match(IS);
				setState(448);
				match(NOT);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Star_exprContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Star_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_star_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerythonVisitor ) return ((VerythonVisitor<? extends T>)visitor).visitStar_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Star_exprContext star_expr() throws RecognitionException {
		Star_exprContext _localctx = new Star_exprContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_star_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(452);
			_la = _input.LA(1);
			if (_la==STAR) {
				{
				setState(451);
				match(STAR);
				}
			}

			setState(454);
			expr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public List<Xor_exprContext> xor_expr() {
			return getRuleContexts(Xor_exprContext.class);
		}
		public Xor_exprContext xor_expr(int i) {
			return getRuleContext(Xor_exprContext.class,i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerythonVisitor ) return ((VerythonVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(456);
			xor_expr();
			setState(461);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR_OP) {
				{
				{
				setState(457);
				match(OR_OP);
				setState(458);
				xor_expr();
				}
				}
				setState(463);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Xor_exprContext extends ParserRuleContext {
		public List<And_exprContext> and_expr() {
			return getRuleContexts(And_exprContext.class);
		}
		public And_exprContext and_expr(int i) {
			return getRuleContext(And_exprContext.class,i);
		}
		public Xor_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xor_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerythonVisitor ) return ((VerythonVisitor<? extends T>)visitor).visitXor_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Xor_exprContext xor_expr() throws RecognitionException {
		Xor_exprContext _localctx = new Xor_exprContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_xor_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(464);
			and_expr();
			setState(469);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==XOR) {
				{
				{
				setState(465);
				match(XOR);
				setState(466);
				and_expr();
				}
				}
				setState(471);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class And_exprContext extends ParserRuleContext {
		public List<Shift_exprContext> shift_expr() {
			return getRuleContexts(Shift_exprContext.class);
		}
		public Shift_exprContext shift_expr(int i) {
			return getRuleContext(Shift_exprContext.class,i);
		}
		public And_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerythonVisitor ) return ((VerythonVisitor<? extends T>)visitor).visitAnd_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final And_exprContext and_expr() throws RecognitionException {
		And_exprContext _localctx = new And_exprContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_and_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(472);
			shift_expr();
			setState(477);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND_OP) {
				{
				{
				setState(473);
				match(AND_OP);
				setState(474);
				shift_expr();
				}
				}
				setState(479);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Shift_exprContext extends ParserRuleContext {
		public List<Arith_exprContext> arith_expr() {
			return getRuleContexts(Arith_exprContext.class);
		}
		public Arith_exprContext arith_expr(int i) {
			return getRuleContext(Arith_exprContext.class,i);
		}
		public Shift_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shift_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerythonVisitor ) return ((VerythonVisitor<? extends T>)visitor).visitShift_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Shift_exprContext shift_expr() throws RecognitionException {
		Shift_exprContext _localctx = new Shift_exprContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_shift_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(480);
			arith_expr();
			setState(487);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LEFT_SHIFT || _la==RIGHT_SHIFT) {
				{
				setState(485);
				switch (_input.LA(1)) {
				case LEFT_SHIFT:
					{
					setState(481);
					match(LEFT_SHIFT);
					setState(482);
					arith_expr();
					}
					break;
				case RIGHT_SHIFT:
					{
					setState(483);
					match(RIGHT_SHIFT);
					setState(484);
					arith_expr();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(489);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Arith_exprContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public Arith_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arith_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerythonVisitor ) return ((VerythonVisitor<? extends T>)visitor).visitArith_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arith_exprContext arith_expr() throws RecognitionException {
		Arith_exprContext _localctx = new Arith_exprContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_arith_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(490);
			term();
			setState(497);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ADD || _la==MINUS) {
				{
				setState(495);
				switch (_input.LA(1)) {
				case ADD:
					{
					setState(491);
					match(ADD);
					setState(492);
					term();
					}
					break;
				case MINUS:
					{
					setState(493);
					match(MINUS);
					setState(494);
					term();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(499);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TermContext extends ParserRuleContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerythonVisitor ) return ((VerythonVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(500);
			factor();
			setState(509);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR) | (1L << DIV) | (1L << MOD))) != 0)) {
				{
				setState(507);
				switch (_input.LA(1)) {
				case STAR:
					{
					setState(501);
					match(STAR);
					setState(502);
					factor();
					}
					break;
				case DIV:
					{
					setState(503);
					match(DIV);
					setState(504);
					factor();
					}
					break;
				case MOD:
					{
					setState(505);
					match(MOD);
					setState(506);
					factor();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(511);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FactorContext extends ParserRuleContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public PowerContext power() {
			return getRuleContext(PowerContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerythonVisitor ) return ((VerythonVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_factor);
		try {
			setState(519);
			switch (_input.LA(1)) {
			case ADD:
				enterOuterAlt(_localctx, 1);
				{
				setState(512);
				match(ADD);
				setState(513);
				factor();
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(514);
				match(MINUS);
				setState(515);
				factor();
				}
				break;
			case NOT_OP:
				enterOuterAlt(_localctx, 3);
				{
				setState(516);
				match(NOT_OP);
				setState(517);
				factor();
				}
				break;
			case T__0:
			case NONE:
			case TRUE:
			case FALSE:
			case NAME:
			case DECIMAL_INTEGER:
			case OCT_INTEGER:
			case HEX_INTEGER:
			case BIN_INTEGER:
			case OPEN_PAREN:
			case OPEN_BRACK:
			case OPEN_BRACE:
				enterOuterAlt(_localctx, 4);
				{
				setState(518);
				power();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PowerContext extends ParserRuleContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public List<TrailerContext> trailer() {
			return getRuleContexts(TrailerContext.class);
		}
		public TrailerContext trailer(int i) {
			return getRuleContext(TrailerContext.class,i);
		}
		public PowerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_power; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerythonVisitor ) return ((VerythonVisitor<? extends T>)visitor).visitPower(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PowerContext power() throws RecognitionException {
		PowerContext _localctx = new PowerContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_power);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(521);
			atom();
			setState(525);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DOT) | (1L << OPEN_PAREN) | (1L << OPEN_BRACK))) != 0)) {
				{
				{
				setState(522);
				trailer();
				}
				}
				setState(527);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AtomContext extends ParserRuleContext {
		public Testlist_compContext testlist_comp() {
			return getRuleContext(Testlist_compContext.class,0);
		}
		public DictorsetmakerContext dictorsetmaker() {
			return getRuleContext(DictorsetmakerContext.class,0);
		}
		public TerminalNode NAME() { return getToken(VerythonParser.NAME, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode NONE() { return getToken(VerythonParser.NONE, 0); }
		public TerminalNode TRUE() { return getToken(VerythonParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(VerythonParser.FALSE, 0); }
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerythonVisitor ) return ((VerythonVisitor<? extends T>)visitor).visitAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_atom);
		int _la;
		try {
			setState(549);
			switch (_input.LA(1)) {
			case OPEN_PAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(528);
				match(OPEN_PAREN);
				setState(530);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << NOT) | (1L << NONE) | (1L << TRUE) | (1L << FALSE) | (1L << NAME) | (1L << DECIMAL_INTEGER) | (1L << OCT_INTEGER) | (1L << HEX_INTEGER) | (1L << BIN_INTEGER) | (1L << STAR) | (1L << OPEN_PAREN) | (1L << OPEN_BRACK) | (1L << ADD) | (1L << MINUS) | (1L << NOT_OP) | (1L << OPEN_BRACE))) != 0)) {
					{
					setState(529);
					testlist_comp();
					}
				}

				setState(532);
				match(CLOSE_PAREN);
				}
				break;
			case OPEN_BRACK:
				enterOuterAlt(_localctx, 2);
				{
				setState(533);
				match(OPEN_BRACK);
				setState(535);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << NOT) | (1L << NONE) | (1L << TRUE) | (1L << FALSE) | (1L << NAME) | (1L << DECIMAL_INTEGER) | (1L << OCT_INTEGER) | (1L << HEX_INTEGER) | (1L << BIN_INTEGER) | (1L << STAR) | (1L << OPEN_PAREN) | (1L << OPEN_BRACK) | (1L << ADD) | (1L << MINUS) | (1L << NOT_OP) | (1L << OPEN_BRACE))) != 0)) {
					{
					setState(534);
					testlist_comp();
					}
				}

				setState(537);
				match(CLOSE_BRACK);
				}
				break;
			case OPEN_BRACE:
				enterOuterAlt(_localctx, 3);
				{
				setState(538);
				match(OPEN_BRACE);
				setState(540);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << NOT) | (1L << NONE) | (1L << TRUE) | (1L << FALSE) | (1L << NAME) | (1L << DECIMAL_INTEGER) | (1L << OCT_INTEGER) | (1L << HEX_INTEGER) | (1L << BIN_INTEGER) | (1L << STAR) | (1L << OPEN_PAREN) | (1L << OPEN_BRACK) | (1L << ADD) | (1L << MINUS) | (1L << NOT_OP) | (1L << OPEN_BRACE))) != 0)) {
					{
					setState(539);
					dictorsetmaker();
					}
				}

				setState(542);
				match(CLOSE_BRACE);
				}
				break;
			case NAME:
				enterOuterAlt(_localctx, 4);
				{
				setState(543);
				match(NAME);
				}
				break;
			case DECIMAL_INTEGER:
			case OCT_INTEGER:
			case HEX_INTEGER:
			case BIN_INTEGER:
				enterOuterAlt(_localctx, 5);
				{
				setState(544);
				number();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 6);
				{
				setState(545);
				match(T__0);
				}
				break;
			case NONE:
				enterOuterAlt(_localctx, 7);
				{
				setState(546);
				match(NONE);
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 8);
				{
				setState(547);
				match(TRUE);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 9);
				{
				setState(548);
				match(FALSE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Testlist_compContext extends ParserRuleContext {
		public List<TestContext> test() {
			return getRuleContexts(TestContext.class);
		}
		public TestContext test(int i) {
			return getRuleContext(TestContext.class,i);
		}
		public Comp_forContext comp_for() {
			return getRuleContext(Comp_forContext.class,0);
		}
		public Testlist_compContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_testlist_comp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerythonVisitor ) return ((VerythonVisitor<? extends T>)visitor).visitTestlist_comp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Testlist_compContext testlist_comp() throws RecognitionException {
		Testlist_compContext _localctx = new Testlist_compContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_testlist_comp);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(551);
			test();
			setState(563);
			switch (_input.LA(1)) {
			case FOR:
				{
				setState(552);
				comp_for();
				}
				break;
			case CLOSE_PAREN:
			case COMMA:
			case CLOSE_BRACK:
				{
				setState(557);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(553);
						match(COMMA);
						setState(554);
						test();
						}
						} 
					}
					setState(559);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
				}
				setState(561);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(560);
					match(COMMA);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TrailerContext extends ParserRuleContext {
		public ArglistContext arglist() {
			return getRuleContext(ArglistContext.class,0);
		}
		public SubscriptlistContext subscriptlist() {
			return getRuleContext(SubscriptlistContext.class,0);
		}
		public TerminalNode NAME() { return getToken(VerythonParser.NAME, 0); }
		public TrailerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trailer; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerythonVisitor ) return ((VerythonVisitor<? extends T>)visitor).visitTrailer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TrailerContext trailer() throws RecognitionException {
		TrailerContext _localctx = new TrailerContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_trailer);
		int _la;
		try {
			setState(576);
			switch (_input.LA(1)) {
			case OPEN_PAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(565);
				match(OPEN_PAREN);
				setState(567);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << NOT) | (1L << NONE) | (1L << TRUE) | (1L << FALSE) | (1L << NAME) | (1L << DECIMAL_INTEGER) | (1L << OCT_INTEGER) | (1L << HEX_INTEGER) | (1L << BIN_INTEGER) | (1L << STAR) | (1L << OPEN_PAREN) | (1L << OPEN_BRACK) | (1L << ADD) | (1L << MINUS) | (1L << NOT_OP) | (1L << OPEN_BRACE))) != 0)) {
					{
					setState(566);
					arglist();
					}
				}

				setState(569);
				match(CLOSE_PAREN);
				}
				break;
			case OPEN_BRACK:
				enterOuterAlt(_localctx, 2);
				{
				setState(570);
				match(OPEN_BRACK);
				setState(571);
				subscriptlist();
				setState(572);
				match(CLOSE_BRACK);
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 3);
				{
				setState(574);
				match(DOT);
				setState(575);
				match(NAME);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubscriptlistContext extends ParserRuleContext {
		public List<SubscriptContext> subscript() {
			return getRuleContexts(SubscriptContext.class);
		}
		public SubscriptContext subscript(int i) {
			return getRuleContext(SubscriptContext.class,i);
		}
		public SubscriptlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subscriptlist; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerythonVisitor ) return ((VerythonVisitor<? extends T>)visitor).visitSubscriptlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubscriptlistContext subscriptlist() throws RecognitionException {
		SubscriptlistContext _localctx = new SubscriptlistContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_subscriptlist);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(578);
			subscript();
			setState(583);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(579);
					match(COMMA);
					setState(580);
					subscript();
					}
					} 
				}
				setState(585);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
			}
			setState(587);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(586);
				match(COMMA);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubscriptContext extends ParserRuleContext {
		public List<TestContext> test() {
			return getRuleContexts(TestContext.class);
		}
		public TestContext test(int i) {
			return getRuleContext(TestContext.class,i);
		}
		public SliceopContext sliceop() {
			return getRuleContext(SliceopContext.class,0);
		}
		public SubscriptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subscript; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerythonVisitor ) return ((VerythonVisitor<? extends T>)visitor).visitSubscript(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubscriptContext subscript() throws RecognitionException {
		SubscriptContext _localctx = new SubscriptContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_subscript);
		int _la;
		try {
			setState(600);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(589);
				test();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(591);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << NOT) | (1L << NONE) | (1L << TRUE) | (1L << FALSE) | (1L << NAME) | (1L << DECIMAL_INTEGER) | (1L << OCT_INTEGER) | (1L << HEX_INTEGER) | (1L << BIN_INTEGER) | (1L << STAR) | (1L << OPEN_PAREN) | (1L << OPEN_BRACK) | (1L << ADD) | (1L << MINUS) | (1L << NOT_OP) | (1L << OPEN_BRACE))) != 0)) {
					{
					setState(590);
					test();
					}
				}

				setState(593);
				match(COLON);
				setState(595);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << NOT) | (1L << NONE) | (1L << TRUE) | (1L << FALSE) | (1L << NAME) | (1L << DECIMAL_INTEGER) | (1L << OCT_INTEGER) | (1L << HEX_INTEGER) | (1L << BIN_INTEGER) | (1L << STAR) | (1L << OPEN_PAREN) | (1L << OPEN_BRACK) | (1L << ADD) | (1L << MINUS) | (1L << NOT_OP) | (1L << OPEN_BRACE))) != 0)) {
					{
					setState(594);
					test();
					}
				}

				setState(598);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(597);
					sliceop();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SliceopContext extends ParserRuleContext {
		public TestContext test() {
			return getRuleContext(TestContext.class,0);
		}
		public SliceopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sliceop; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerythonVisitor ) return ((VerythonVisitor<? extends T>)visitor).visitSliceop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SliceopContext sliceop() throws RecognitionException {
		SliceopContext _localctx = new SliceopContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_sliceop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(602);
			match(COLON);
			setState(604);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << NOT) | (1L << NONE) | (1L << TRUE) | (1L << FALSE) | (1L << NAME) | (1L << DECIMAL_INTEGER) | (1L << OCT_INTEGER) | (1L << HEX_INTEGER) | (1L << BIN_INTEGER) | (1L << STAR) | (1L << OPEN_PAREN) | (1L << OPEN_BRACK) | (1L << ADD) | (1L << MINUS) | (1L << NOT_OP) | (1L << OPEN_BRACE))) != 0)) {
				{
				setState(603);
				test();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprlistContext extends ParserRuleContext {
		public List<Star_exprContext> star_expr() {
			return getRuleContexts(Star_exprContext.class);
		}
		public Star_exprContext star_expr(int i) {
			return getRuleContext(Star_exprContext.class,i);
		}
		public ExprlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprlist; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerythonVisitor ) return ((VerythonVisitor<? extends T>)visitor).visitExprlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprlistContext exprlist() throws RecognitionException {
		ExprlistContext _localctx = new ExprlistContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_exprlist);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(606);
			star_expr();
			setState(611);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(607);
					match(COMMA);
					setState(608);
					star_expr();
					}
					} 
				}
				setState(613);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			}
			setState(615);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(614);
				match(COMMA);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TestlistContext extends ParserRuleContext {
		public List<TestContext> test() {
			return getRuleContexts(TestContext.class);
		}
		public TestContext test(int i) {
			return getRuleContext(TestContext.class,i);
		}
		public TestlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_testlist; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerythonVisitor ) return ((VerythonVisitor<? extends T>)visitor).visitTestlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TestlistContext testlist() throws RecognitionException {
		TestlistContext _localctx = new TestlistContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_testlist);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(617);
			test();
			setState(622);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(618);
					match(COMMA);
					setState(619);
					test();
					}
					} 
				}
				setState(624);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
			}
			setState(626);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(625);
				match(COMMA);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DictorsetmakerContext extends ParserRuleContext {
		public List<TestContext> test() {
			return getRuleContexts(TestContext.class);
		}
		public TestContext test(int i) {
			return getRuleContext(TestContext.class,i);
		}
		public Comp_forContext comp_for() {
			return getRuleContext(Comp_forContext.class,0);
		}
		public DictorsetmakerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictorsetmaker; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerythonVisitor ) return ((VerythonVisitor<? extends T>)visitor).visitDictorsetmaker(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DictorsetmakerContext dictorsetmaker() throws RecognitionException {
		DictorsetmakerContext _localctx = new DictorsetmakerContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_dictorsetmaker);
		int _la;
		try {
			int _alt;
			setState(661);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(628);
				test();
				setState(629);
				match(COLON);
				setState(630);
				test();
				setState(645);
				switch (_input.LA(1)) {
				case FOR:
					{
					setState(631);
					comp_for();
					}
					break;
				case COMMA:
				case CLOSE_BRACE:
					{
					setState(639);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(632);
							match(COMMA);
							setState(633);
							test();
							setState(634);
							match(COLON);
							setState(635);
							test();
							}
							} 
						}
						setState(641);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
					}
					setState(643);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(642);
						match(COMMA);
						}
					}

					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(647);
				test();
				setState(659);
				switch (_input.LA(1)) {
				case FOR:
					{
					setState(648);
					comp_for();
					}
					break;
				case COMMA:
				case CLOSE_BRACE:
					{
					setState(653);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(649);
							match(COMMA);
							setState(650);
							test();
							}
							} 
						}
						setState(655);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
					}
					setState(657);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(656);
						match(COMMA);
						}
					}

					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArglistContext extends ParserRuleContext {
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public ArglistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arglist; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerythonVisitor ) return ((VerythonVisitor<? extends T>)visitor).visitArglist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArglistContext arglist() throws RecognitionException {
		ArglistContext _localctx = new ArglistContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_arglist);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(668);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(663);
					argument();
					setState(664);
					match(COMMA);
					}
					} 
				}
				setState(670);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
			}
			setState(671);
			argument();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentContext extends ParserRuleContext {
		public List<TestContext> test() {
			return getRuleContexts(TestContext.class);
		}
		public TestContext test(int i) {
			return getRuleContext(TestContext.class,i);
		}
		public Comp_forContext comp_for() {
			return getRuleContext(Comp_forContext.class,0);
		}
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerythonVisitor ) return ((VerythonVisitor<? extends T>)visitor).visitArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_argument);
		int _la;
		try {
			setState(681);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(673);
				test();
				setState(675);
				_la = _input.LA(1);
				if (_la==FOR) {
					{
					setState(674);
					comp_for();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(677);
				test();
				setState(678);
				match(ASSIGN);
				setState(679);
				test();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Comp_iterContext extends ParserRuleContext {
		public Comp_forContext comp_for() {
			return getRuleContext(Comp_forContext.class,0);
		}
		public Comp_ifContext comp_if() {
			return getRuleContext(Comp_ifContext.class,0);
		}
		public Comp_iterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp_iter; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerythonVisitor ) return ((VerythonVisitor<? extends T>)visitor).visitComp_iter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comp_iterContext comp_iter() throws RecognitionException {
		Comp_iterContext _localctx = new Comp_iterContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_comp_iter);
		try {
			setState(685);
			switch (_input.LA(1)) {
			case FOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(683);
				comp_for();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(684);
				comp_if();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Comp_forContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(VerythonParser.FOR, 0); }
		public ExprlistContext exprlist() {
			return getRuleContext(ExprlistContext.class,0);
		}
		public TerminalNode IN() { return getToken(VerythonParser.IN, 0); }
		public Or_testContext or_test() {
			return getRuleContext(Or_testContext.class,0);
		}
		public Comp_iterContext comp_iter() {
			return getRuleContext(Comp_iterContext.class,0);
		}
		public Comp_forContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp_for; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerythonVisitor ) return ((VerythonVisitor<? extends T>)visitor).visitComp_for(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comp_forContext comp_for() throws RecognitionException {
		Comp_forContext _localctx = new Comp_forContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_comp_for);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(687);
			match(FOR);
			setState(688);
			exprlist();
			setState(689);
			match(IN);
			setState(690);
			or_test();
			setState(692);
			_la = _input.LA(1);
			if (_la==IF || _la==FOR) {
				{
				setState(691);
				comp_iter();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Comp_ifContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(VerythonParser.IF, 0); }
		public Or_testContext or_test() {
			return getRuleContext(Or_testContext.class,0);
		}
		public Comp_iterContext comp_iter() {
			return getRuleContext(Comp_iterContext.class,0);
		}
		public Comp_ifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp_if; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerythonVisitor ) return ((VerythonVisitor<? extends T>)visitor).visitComp_if(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comp_ifContext comp_if() throws RecognitionException {
		Comp_ifContext _localctx = new Comp_ifContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_comp_if);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(694);
			match(IF);
			setState(695);
			or_test();
			setState(697);
			_la = _input.LA(1);
			if (_la==IF || _la==FOR) {
				{
				setState(696);
				comp_iter();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumberContext extends ParserRuleContext {
		public TerminalNode DECIMAL_INTEGER() { return getToken(VerythonParser.DECIMAL_INTEGER, 0); }
		public TerminalNode OCT_INTEGER() { return getToken(VerythonParser.OCT_INTEGER, 0); }
		public TerminalNode HEX_INTEGER() { return getToken(VerythonParser.HEX_INTEGER, 0); }
		public TerminalNode BIN_INTEGER() { return getToken(VerythonParser.BIN_INTEGER, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerythonVisitor ) return ((VerythonVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(699);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DECIMAL_INTEGER) | (1L << OCT_INTEGER) | (1L << HEX_INTEGER) | (1L << BIN_INTEGER))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3P\u02c0\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\3\2\7\2\u0082\n\2\f\2\16\2\u0085\13\2\3\2\3\2\3\2\3"+
		"\3\3\3\3\3\3\3\3\3\7\3\u008f\n\3\f\3\16\3\u0092\13\3\3\4\3\4\3\4\3\4\5"+
		"\4\u0098\n\4\3\4\5\4\u009b\n\4\3\5\3\5\3\5\7\5\u00a0\n\5\f\5\16\5\u00a3"+
		"\13\5\3\5\3\5\3\6\3\6\5\6\u00a9\n\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\t\3\t\6\t\u00b8\n\t\r\t\16\t\u00b9\3\t\3\t\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\5\n\u00c5\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00da\n\f\f\f\16\f\u00dd"+
		"\13\f\3\r\3\r\3\r\5\r\u00e2\n\r\3\16\3\16\5\16\u00e6\n\16\3\17\3\17\3"+
		"\17\7\17\u00eb\n\17\f\17\16\17\u00ee\13\17\3\17\5\17\u00f1\n\17\3\17\3"+
		"\17\3\20\3\20\3\20\3\20\5\20\u00f9\n\20\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\7\21\u0101\n\21\f\21\16\21\u0104\13\21\5\21\u0106\n\21\3\22\3\22\5\22"+
		"\u010a\n\22\3\22\3\22\3\22\5\22\u010f\n\22\7\22\u0111\n\22\f\22\16\22"+
		"\u0114\13\22\3\22\5\22\u0117\n\22\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3"+
		"\26\3\26\3\26\5\26\u0123\n\26\3\27\3\27\3\30\3\30\3\31\3\31\5\31\u012b"+
		"\n\31\3\32\3\32\3\32\3\32\5\32\u0131\n\32\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\7\33\u013c\n\33\f\33\16\33\u013f\13\33\3\33\3\33\3\33"+
		"\5\33\u0144\n\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\7\35"+
		"\u0150\n\35\f\35\16\35\u0153\13\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\5\36\u015e\n\36\3\36\5\36\u0161\n\36\3\36\3\36\3\37\3\37\3"+
		"\37\3\37\3\37\5\37\u016a\n\37\3\37\5\37\u016d\n\37\3\37\3\37\3 \3 \3 "+
		"\3 \3 \3 \3 \5 \u0178\n \3!\3!\3!\3!\3!\3!\3!\3!\3!\5!\u0183\n!\3\"\3"+
		"\"\3\"\3\"\6\"\u0189\n\"\r\"\16\"\u018a\3\"\3\"\5\"\u018f\n\"\3#\3#\3"+
		"#\3#\3#\3#\5#\u0197\n#\3$\3$\3$\7$\u019c\n$\f$\16$\u019f\13$\3%\3%\3%"+
		"\7%\u01a4\n%\f%\16%\u01a7\13%\3&\3&\3&\5&\u01ac\n&\3\'\3\'\3\'\3\'\7\'"+
		"\u01b2\n\'\f\'\16\'\u01b5\13\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3("+
		"\5(\u01c4\n(\3)\5)\u01c7\n)\3)\3)\3*\3*\3*\7*\u01ce\n*\f*\16*\u01d1\13"+
		"*\3+\3+\3+\7+\u01d6\n+\f+\16+\u01d9\13+\3,\3,\3,\7,\u01de\n,\f,\16,\u01e1"+
		"\13,\3-\3-\3-\3-\3-\7-\u01e8\n-\f-\16-\u01eb\13-\3.\3.\3.\3.\3.\7.\u01f2"+
		"\n.\f.\16.\u01f5\13.\3/\3/\3/\3/\3/\3/\3/\7/\u01fe\n/\f/\16/\u0201\13"+
		"/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\5\60\u020a\n\60\3\61\3\61\7\61\u020e"+
		"\n\61\f\61\16\61\u0211\13\61\3\62\3\62\5\62\u0215\n\62\3\62\3\62\3\62"+
		"\5\62\u021a\n\62\3\62\3\62\3\62\5\62\u021f\n\62\3\62\3\62\3\62\3\62\3"+
		"\62\3\62\3\62\5\62\u0228\n\62\3\63\3\63\3\63\3\63\7\63\u022e\n\63\f\63"+
		"\16\63\u0231\13\63\3\63\5\63\u0234\n\63\5\63\u0236\n\63\3\64\3\64\5\64"+
		"\u023a\n\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\5\64\u0243\n\64\3\65\3"+
		"\65\3\65\7\65\u0248\n\65\f\65\16\65\u024b\13\65\3\65\5\65\u024e\n\65\3"+
		"\66\3\66\5\66\u0252\n\66\3\66\3\66\5\66\u0256\n\66\3\66\5\66\u0259\n\66"+
		"\5\66\u025b\n\66\3\67\3\67\5\67\u025f\n\67\38\38\38\78\u0264\n8\f8\16"+
		"8\u0267\138\38\58\u026a\n8\39\39\39\79\u026f\n9\f9\169\u0272\139\39\5"+
		"9\u0275\n9\3:\3:\3:\3:\3:\3:\3:\3:\3:\7:\u0280\n:\f:\16:\u0283\13:\3:"+
		"\5:\u0286\n:\5:\u0288\n:\3:\3:\3:\3:\7:\u028e\n:\f:\16:\u0291\13:\3:\5"+
		":\u0294\n:\5:\u0296\n:\5:\u0298\n:\3;\3;\3;\7;\u029d\n;\f;\16;\u02a0\13"+
		";\3;\3;\3<\3<\5<\u02a6\n<\3<\3<\3<\3<\5<\u02ac\n<\3=\3=\5=\u02b0\n=\3"+
		">\3>\3>\3>\3>\5>\u02b7\n>\3?\3?\3?\5?\u02bc\n?\3@\3@\3@\2\2A\2\4\6\b\n"+
		"\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\"+
		"^`bdfhjlnprtvxz|~\2\5\3\2KL\3\2>G\3\2\35 \u02ef\2\u0083\3\2\2\2\4\u0089"+
		"\3\2\2\2\6\u009a\3\2\2\2\b\u00a1\3\2\2\2\n\u00a6\3\2\2\2\f\u00aa\3\2\2"+
		"\2\16\u00ae\3\2\2\2\20\u00b5\3\2\2\2\22\u00c4\3\2\2\2\24\u00c6\3\2\2\2"+
		"\26\u00cc\3\2\2\2\30\u00de\3\2\2\2\32\u00e5\3\2\2\2\34\u00e7\3\2\2\2\36"+
		"\u00f8\3\2\2\2 \u00fa\3\2\2\2\"\u0109\3\2\2\2$\u0118\3\2\2\2&\u011a\3"+
		"\2\2\2(\u011d\3\2\2\2*\u0122\3\2\2\2,\u0124\3\2\2\2.\u0126\3\2\2\2\60"+
		"\u0128\3\2\2\2\62\u0130\3\2\2\2\64\u0132\3\2\2\2\66\u0145\3\2\2\28\u014c"+
		"\3\2\2\2:\u0157\3\2\2\2<\u0164\3\2\2\2>\u0170\3\2\2\2@\u0179\3\2\2\2B"+
		"\u018e\3\2\2\2D\u0190\3\2\2\2F\u0198\3\2\2\2H\u01a0\3\2\2\2J\u01ab\3\2"+
		"\2\2L\u01ad\3\2\2\2N\u01c3\3\2\2\2P\u01c6\3\2\2\2R\u01ca\3\2\2\2T\u01d2"+
		"\3\2\2\2V\u01da\3\2\2\2X\u01e2\3\2\2\2Z\u01ec\3\2\2\2\\\u01f6\3\2\2\2"+
		"^\u0209\3\2\2\2`\u020b\3\2\2\2b\u0227\3\2\2\2d\u0229\3\2\2\2f\u0242\3"+
		"\2\2\2h\u0244\3\2\2\2j\u025a\3\2\2\2l\u025c\3\2\2\2n\u0260\3\2\2\2p\u026b"+
		"\3\2\2\2r\u0297\3\2\2\2t\u029e\3\2\2\2v\u02ab\3\2\2\2x\u02af\3\2\2\2z"+
		"\u02b1\3\2\2\2|\u02b8\3\2\2\2~\u02bd\3\2\2\2\u0080\u0082\7\33\2\2\u0081"+
		"\u0080\3\2\2\2\u0082\u0085\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2"+
		"\2\2\u0084\u0086\3\2\2\2\u0085\u0083\3\2\2\2\u0086\u0087\5\4\3\2\u0087"+
		"\u0088\7\2\2\3\u0088\3\3\2\2\2\u0089\u008a\7H\2\2\u008a\u008b\7\33\2\2"+
		"\u008b\u0090\5\16\b\2\u008c\u008f\7\33\2\2\u008d\u008f\5\16\b\2\u008e"+
		"\u008c\3\2\2\2\u008e\u008d\3\2\2\2\u008f\u0092\3\2\2\2\u0090\u008e\3\2"+
		"\2\2\u0090\u0091\3\2\2\2\u0091\5\3\2\2\2\u0092\u0090\3\2\2\2\u0093\u009b"+
		"\7I\2\2\u0094\u0095\7J\2\2\u0095\u0097\7#\2\2\u0096\u0098\5\b\5\2\u0097"+
		"\u0096\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009b\7$"+
		"\2\2\u009a\u0093\3\2\2\2\u009a\u0094\3\2\2\2\u009b\7\3\2\2\2\u009c\u009d"+
		"\5\n\6\2\u009d\u009e\7%\2\2\u009e\u00a0\3\2\2\2\u009f\u009c\3\2\2\2\u00a0"+
		"\u00a3\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a4\3\2"+
		"\2\2\u00a3\u00a1\3\2\2\2\u00a4\u00a5\5\n\6\2\u00a5\t\3\2\2\2\u00a6\u00a8"+
		"\7\34\2\2\u00a7\u00a9\t\2\2\2\u00a8\u00a7\3\2\2\2\u00a8\u00a9\3\2\2\2"+
		"\u00a9\13\3\2\2\2\u00aa\u00ab\7\32\2\2\u00ab\u00ac\7&\2\2\u00ac\u00ad"+
		"\5B\"\2\u00ad\r\3\2\2\2\u00ae\u00af\7\4\2\2\u00af\u00b0\7\34\2\2\u00b0"+
		"\u00b1\5\24\13\2\u00b1\u00b2\7&\2\2\u00b2\u00b3\7\33\2\2\u00b3\u00b4\5"+
		"\20\t\2\u00b4\17\3\2\2\2\u00b5\u00b7\7O\2\2\u00b6\u00b8\5\22\n\2\u00b7"+
		"\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3\2"+
		"\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bc\7P\2\2\u00bc\21\3\2\2\2\u00bd\u00be"+
		"\5\6\4\2\u00be\u00bf\7\33\2\2\u00bf\u00c0\5\f\7\2\u00c0\u00c5\3\2\2\2"+
		"\u00c1\u00c2\5 \21\2\u00c2\u00c3\7\33\2\2\u00c3\u00c5\3\2\2\2\u00c4\u00bd"+
		"\3\2\2\2\u00c4\u00c1\3\2\2\2\u00c5\23\3\2\2\2\u00c6\u00c7\7#\2\2\u00c7"+
		"\u00c8\5\26\f\2\u00c8\u00c9\7\'\2\2\u00c9\u00ca\5\26\f\2\u00ca\u00cb\7"+
		"$\2\2\u00cb\25\3\2\2\2\u00cc\u00cd\7)\2\2\u00cd\u00ce\7\35\2\2\u00ce\u00cf"+
		"\7&\2\2\u00cf\u00d0\7\35\2\2\u00d0\u00d1\7*\2\2\u00d1\u00db\5\30\r\2\u00d2"+
		"\u00d3\7%\2\2\u00d3\u00d4\7)\2\2\u00d4\u00d5\7\35\2\2\u00d5\u00d6\7&\2"+
		"\2\u00d6\u00d7\7\35\2\2\u00d7\u00d8\7*\2\2\u00d8\u00da\5\30\r\2\u00d9"+
		"\u00d2\3\2\2\2\u00da\u00dd\3\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00dc\3\2"+
		"\2\2\u00dc\27\3\2\2\2\u00dd\u00db\3\2\2\2\u00de\u00e1\7\34\2\2\u00df\u00e0"+
		"\7&\2\2\u00e0\u00e2\5D#\2\u00e1\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2"+
		"\31\3\2\2\2\u00e3\u00e6\5\34\17\2\u00e4\u00e6\5\62\32\2\u00e5\u00e3\3"+
		"\2\2\2\u00e5\u00e4\3\2\2\2\u00e6\33\3\2\2\2\u00e7\u00ec\5\36\20\2\u00e8"+
		"\u00e9\7\'\2\2\u00e9\u00eb\5\36\20\2\u00ea\u00e8\3\2\2\2\u00eb\u00ee\3"+
		"\2\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00f0\3\2\2\2\u00ee"+
		"\u00ec\3\2\2\2\u00ef\u00f1\7\'\2\2\u00f0\u00ef\3\2\2\2\u00f0\u00f1\3\2"+
		"\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f3\7\33\2\2\u00f3\35\3\2\2\2\u00f4\u00f9"+
		"\5 \21\2\u00f5\u00f9\5&\24\2\u00f6\u00f9\5(\25\2\u00f7\u00f9\5*\26\2\u00f8"+
		"\u00f4\3\2\2\2\u00f8\u00f5\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f7\3\2"+
		"\2\2\u00f9\37\3\2\2\2\u00fa\u0105\5\"\22\2\u00fb\u00fc\5$\23\2\u00fc\u00fd"+
		"\5p9\2\u00fd\u0106\3\2\2\2\u00fe\u00ff\7(\2\2\u00ff\u0101\5\"\22\2\u0100"+
		"\u00fe\3\2\2\2\u0101\u0104\3\2\2\2\u0102\u0100\3\2\2\2\u0102\u0103\3\2"+
		"\2\2\u0103\u0106\3\2\2\2\u0104\u0102\3\2\2\2\u0105\u00fb\3\2\2\2\u0105"+
		"\u0102\3\2\2\2\u0106!\3\2\2\2\u0107\u010a\5D#\2\u0108\u010a\5P)\2\u0109"+
		"\u0107\3\2\2\2\u0109\u0108\3\2\2\2\u010a\u0112\3\2\2\2\u010b\u010e\7%"+
		"\2\2\u010c\u010f\5D#\2\u010d\u010f\5P)\2\u010e\u010c\3\2\2\2\u010e\u010d"+
		"\3\2\2\2\u010f\u0111\3\2\2\2\u0110\u010b\3\2\2\2\u0111\u0114\3\2\2\2\u0112"+
		"\u0110\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0116\3\2\2\2\u0114\u0112\3\2"+
		"\2\2\u0115\u0117\7%\2\2\u0116\u0115\3\2\2\2\u0116\u0117\3\2\2\2\u0117"+
		"#\3\2\2\2\u0118\u0119\t\3\2\2\u0119%\3\2\2\2\u011a\u011b\7\26\2\2\u011b"+
		"\u011c\5n8\2\u011c\'\3\2\2\2\u011d\u011e\7\27\2\2\u011e)\3\2\2\2\u011f"+
		"\u0123\5,\27\2\u0120\u0123\5.\30\2\u0121\u0123\5\60\31\2\u0122\u011f\3"+
		"\2\2\2\u0122\u0120\3\2\2\2\u0122\u0121\3\2\2\2\u0123+\3\2\2\2\u0124\u0125"+
		"\7\31\2\2\u0125-\3\2\2\2\u0126\u0127\7\30\2\2\u0127/\3\2\2\2\u0128\u012a"+
		"\7\5\2\2\u0129\u012b\5p9\2\u012a\u0129\3\2\2\2\u012a\u012b\3\2\2\2\u012b"+
		"\61\3\2\2\2\u012c\u0131\5\64\33\2\u012d\u0131\5\66\34\2\u012e\u0131\5"+
		"> \2\u012f\u0131\5@!\2\u0130\u012c\3\2\2\2\u0130\u012d\3\2\2\2\u0130\u012e"+
		"\3\2\2\2\u0130\u012f\3\2\2\2\u0131\63\3\2\2\2\u0132\u0133\7\6\2\2\u0133"+
		"\u0134\5D#\2\u0134\u0135\7&\2\2\u0135\u013d\5B\"\2\u0136\u0137\7\7\2\2"+
		"\u0137\u0138\5D#\2\u0138\u0139\7&\2\2\u0139\u013a\5B\"\2\u013a\u013c\3"+
		"\2\2\2\u013b\u0136\3\2\2\2\u013c\u013f\3\2\2\2\u013d\u013b\3\2\2\2\u013d"+
		"\u013e\3\2\2\2\u013e\u0143\3\2\2\2\u013f\u013d\3\2\2\2\u0140\u0141\7\b"+
		"\2\2\u0141\u0142\7&\2\2\u0142\u0144\5B\"\2\u0143\u0140\3\2\2\2\u0143\u0144"+
		"\3\2\2\2\u0144\65\3\2\2\2\u0145\u0146\7\t\2\2\u0146\u0147\7#\2\2\u0147"+
		"\u0148\7\34\2\2\u0148\u0149\7$\2\2\u0149\u014a\7&\2\2\u014a\u014b\58\35"+
		"\2\u014b\67\3\2\2\2\u014c\u014d\7\33\2\2\u014d\u0151\7O\2\2\u014e\u0150"+
		"\5:\36\2\u014f\u014e\3\2\2\2\u0150\u0153\3\2\2\2\u0151\u014f\3\2\2\2\u0151"+
		"\u0152\3\2\2\2\u0152\u0154\3\2\2\2\u0153\u0151\3\2\2\2\u0154\u0155\5<"+
		"\37\2\u0155\u0156\7P\2\2\u01569\3\2\2\2\u0157\u0158\7\n\2\2\u0158\u0159"+
		"\5~@\2\u0159\u0160\7&\2\2\u015a\u015d\7\5\2\2\u015b\u015e\7\34\2\2\u015c"+
		"\u015e\5~@\2\u015d\u015b\3\2\2\2\u015d\u015c\3\2\2\2\u015e\u0161\3\2\2"+
		"\2\u015f\u0161\5 \21\2\u0160\u015a\3\2\2\2\u0160\u015f\3\2\2\2\u0161\u0162"+
		"\3\2\2\2\u0162\u0163\7\33\2\2\u0163;\3\2\2\2\u0164\u0165\7\13\2\2\u0165"+
		"\u016c\7&\2\2\u0166\u0169\7\5\2\2\u0167\u016a\7\34\2\2\u0168\u016a\5~"+
		"@\2\u0169\u0167\3\2\2\2\u0169\u0168\3\2\2\2\u016a\u016d\3\2\2\2\u016b"+
		"\u016d\5 \21\2\u016c\u0166\3\2\2\2\u016c\u016b\3\2\2\2\u016d\u016e\3\2"+
		"\2\2\u016e\u016f\7\33\2\2\u016f=\3\2\2\2\u0170\u0171\7\f\2\2\u0171\u0172"+
		"\5D#\2\u0172\u0173\7&\2\2\u0173\u0177\5B\"\2\u0174\u0175\7\b\2\2\u0175"+
		"\u0176\7&\2\2\u0176\u0178\5B\"\2\u0177\u0174\3\2\2\2\u0177\u0178\3\2\2"+
		"\2\u0178?\3\2\2\2\u0179\u017a\7\r\2\2\u017a\u017b\5n8\2\u017b\u017c\7"+
		"\16\2\2\u017c\u017d\5p9\2\u017d\u017e\7&\2\2\u017e\u0182\5B\"\2\u017f"+
		"\u0180\7\b\2\2\u0180\u0181\7&\2\2\u0181\u0183\5B\"\2\u0182\u017f\3\2\2"+
		"\2\u0182\u0183\3\2\2\2\u0183A\3\2\2\2\u0184\u018f\5\34\17\2\u0185\u0186"+
		"\7\33\2\2\u0186\u0188\7O\2\2\u0187\u0189\5\32\16\2\u0188\u0187\3\2\2\2"+
		"\u0189\u018a\3\2\2\2\u018a\u0188\3\2\2\2\u018a\u018b\3\2\2\2\u018b\u018c"+
		"\3\2\2\2\u018c\u018d\7P\2\2\u018d\u018f\3\2\2\2\u018e\u0184\3\2\2\2\u018e"+
		"\u0185\3\2\2\2\u018fC\3\2\2\2\u0190\u0196\5F$\2\u0191\u0192\7\6\2\2\u0192"+
		"\u0193\5F$\2\u0193\u0194\7\b\2\2\u0194\u0195\5D#\2\u0195\u0197\3\2\2\2"+
		"\u0196\u0191\3\2\2\2\u0196\u0197\3\2\2\2\u0197E\3\2\2\2\u0198\u019d\5"+
		"H%\2\u0199\u019a\7\17\2\2\u019a\u019c\5H%\2\u019b\u0199\3\2\2\2\u019c"+
		"\u019f\3\2\2\2\u019d\u019b\3\2\2\2\u019d\u019e\3\2\2\2\u019eG\3\2\2\2"+
		"\u019f\u019d\3\2\2\2\u01a0\u01a5\5J&\2\u01a1\u01a2\7\20\2\2\u01a2\u01a4"+
		"\5J&\2\u01a3\u01a1\3\2\2\2\u01a4\u01a7\3\2\2\2\u01a5\u01a3\3\2\2\2\u01a5"+
		"\u01a6\3\2\2\2\u01a6I\3\2\2\2\u01a7\u01a5\3\2\2\2\u01a8\u01a9\7\21\2\2"+
		"\u01a9\u01ac\5J&\2\u01aa\u01ac\5L\'\2\u01ab\u01a8\3\2\2\2\u01ab\u01aa"+
		"\3\2\2\2\u01acK\3\2\2\2\u01ad\u01b3\5P)\2\u01ae\u01af\5N(\2\u01af\u01b0"+
		"\5P)\2\u01b0\u01b2\3\2\2\2\u01b1\u01ae\3\2\2\2\u01b2\u01b5\3\2\2\2\u01b3"+
		"\u01b1\3\2\2\2\u01b3\u01b4\3\2\2\2\u01b4M\3\2\2\2\u01b5\u01b3\3\2\2\2"+
		"\u01b6\u01c4\7\67\2\2\u01b7\u01c4\78\2\2\u01b8\u01c4\79\2\2\u01b9\u01c4"+
		"\7:\2\2\u01ba\u01c4\7;\2\2\u01bb\u01c4\7<\2\2\u01bc\u01c4\7=\2\2\u01bd"+
		"\u01c4\7\16\2\2\u01be\u01bf\7\21\2\2\u01bf\u01c4\7\16\2\2\u01c0\u01c4"+
		"\7\22\2\2\u01c1\u01c2\7\22\2\2\u01c2\u01c4\7\21\2\2\u01c3\u01b6\3\2\2"+
		"\2\u01c3\u01b7\3\2\2\2\u01c3\u01b8\3\2\2\2\u01c3\u01b9\3\2\2\2\u01c3\u01ba"+
		"\3\2\2\2\u01c3\u01bb\3\2\2\2\u01c3\u01bc\3\2\2\2\u01c3\u01bd\3\2\2\2\u01c3"+
		"\u01be\3\2\2\2\u01c3\u01c0\3\2\2\2\u01c3\u01c1\3\2\2\2\u01c4O\3\2\2\2"+
		"\u01c5\u01c7\7\"\2\2\u01c6\u01c5\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7\u01c8"+
		"\3\2\2\2\u01c8\u01c9\5R*\2\u01c9Q\3\2\2\2\u01ca\u01cf\5T+\2\u01cb\u01cc"+
		"\7+\2\2\u01cc\u01ce\5T+\2\u01cd\u01cb\3\2\2\2\u01ce\u01d1\3\2\2\2\u01cf"+
		"\u01cd\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0S\3\2\2\2\u01d1\u01cf\3\2\2\2"+
		"\u01d2\u01d7\5V,\2\u01d3\u01d4\7,\2\2\u01d4\u01d6\5V,\2\u01d5\u01d3\3"+
		"\2\2\2\u01d6\u01d9\3\2\2\2\u01d7\u01d5\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d8"+
		"U\3\2\2\2\u01d9\u01d7\3\2\2\2\u01da\u01df\5X-\2\u01db\u01dc\7-\2\2\u01dc"+
		"\u01de\5X-\2\u01dd\u01db\3\2\2\2\u01de\u01e1\3\2\2\2\u01df\u01dd\3\2\2"+
		"\2\u01df\u01e0\3\2\2\2\u01e0W\3\2\2\2\u01e1\u01df\3\2\2\2\u01e2\u01e9"+
		"\5Z.\2\u01e3\u01e4\7.\2\2\u01e4\u01e8\5Z.\2\u01e5\u01e6\7/\2\2\u01e6\u01e8"+
		"\5Z.\2\u01e7\u01e3\3\2\2\2\u01e7\u01e5\3\2\2\2\u01e8\u01eb\3\2\2\2\u01e9"+
		"\u01e7\3\2\2\2\u01e9\u01ea\3\2\2\2\u01eaY\3\2\2\2\u01eb\u01e9\3\2\2\2"+
		"\u01ec\u01f3\5\\/\2\u01ed\u01ee\7\60\2\2\u01ee\u01f2\5\\/\2\u01ef\u01f0"+
		"\7\61\2\2\u01f0\u01f2\5\\/\2\u01f1\u01ed\3\2\2\2\u01f1\u01ef\3\2\2\2\u01f2"+
		"\u01f5\3\2\2\2\u01f3\u01f1\3\2\2\2\u01f3\u01f4\3\2\2\2\u01f4[\3\2\2\2"+
		"\u01f5\u01f3\3\2\2\2\u01f6\u01ff\5^\60\2\u01f7\u01f8\7\"\2\2\u01f8\u01fe"+
		"\5^\60\2\u01f9\u01fa\7\62\2\2\u01fa\u01fe\5^\60\2\u01fb\u01fc\7\63\2\2"+
		"\u01fc\u01fe\5^\60\2\u01fd\u01f7\3\2\2\2\u01fd\u01f9\3\2\2\2\u01fd\u01fb"+
		"\3\2\2\2\u01fe\u0201\3\2\2\2\u01ff\u01fd\3\2\2\2\u01ff\u0200\3\2\2\2\u0200"+
		"]\3\2\2\2\u0201\u01ff\3\2\2\2\u0202\u0203\7\60\2\2\u0203\u020a\5^\60\2"+
		"\u0204\u0205\7\61\2\2\u0205\u020a\5^\60\2\u0206\u0207\7\64\2\2\u0207\u020a"+
		"\5^\60\2\u0208\u020a\5`\61\2\u0209\u0202\3\2\2\2\u0209\u0204\3\2\2\2\u0209"+
		"\u0206\3\2\2\2\u0209\u0208\3\2\2\2\u020a_\3\2\2\2\u020b\u020f\5b\62\2"+
		"\u020c\u020e\5f\64\2\u020d\u020c\3\2\2\2\u020e\u0211\3\2\2\2\u020f\u020d"+
		"\3\2\2\2\u020f\u0210\3\2\2\2\u0210a\3\2\2\2\u0211\u020f\3\2\2\2\u0212"+
		"\u0214\7#\2\2\u0213\u0215\5d\63\2\u0214\u0213\3\2\2\2\u0214\u0215\3\2"+
		"\2\2\u0215\u0216\3\2\2\2\u0216\u0228\7$\2\2\u0217\u0219\7)\2\2\u0218\u021a"+
		"\5d\63\2\u0219\u0218\3\2\2\2\u0219\u021a\3\2\2\2\u021a\u021b\3\2\2\2\u021b"+
		"\u0228\7*\2\2\u021c\u021e\7\65\2\2\u021d\u021f\5r:\2\u021e\u021d\3\2\2"+
		"\2\u021e\u021f\3\2\2\2\u021f\u0220\3\2\2\2\u0220\u0228\7\66\2\2\u0221"+
		"\u0228\7\34\2\2\u0222\u0228\5~@\2\u0223\u0228\7\3\2\2\u0224\u0228\7\23"+
		"\2\2\u0225\u0228\7\24\2\2\u0226\u0228\7\25\2\2\u0227\u0212\3\2\2\2\u0227"+
		"\u0217\3\2\2\2\u0227\u021c\3\2\2\2\u0227\u0221\3\2\2\2\u0227\u0222\3\2"+
		"\2\2\u0227\u0223\3\2\2\2\u0227\u0224\3\2\2\2\u0227\u0225\3\2\2\2\u0227"+
		"\u0226\3\2\2\2\u0228c\3\2\2\2\u0229\u0235\5D#\2\u022a\u0236\5z>\2\u022b"+
		"\u022c\7%\2\2\u022c\u022e\5D#\2\u022d\u022b\3\2\2\2\u022e\u0231\3\2\2"+
		"\2\u022f\u022d\3\2\2\2\u022f\u0230\3\2\2\2\u0230\u0233\3\2\2\2\u0231\u022f"+
		"\3\2\2\2\u0232\u0234\7%\2\2\u0233\u0232\3\2\2\2\u0233\u0234\3\2\2\2\u0234"+
		"\u0236\3\2\2\2\u0235\u022a\3\2\2\2\u0235\u022f\3\2\2\2\u0236e\3\2\2\2"+
		"\u0237\u0239\7#\2\2\u0238\u023a\5t;\2\u0239\u0238\3\2\2\2\u0239\u023a"+
		"\3\2\2\2\u023a\u023b\3\2\2\2\u023b\u0243\7$\2\2\u023c\u023d\7)\2\2\u023d"+
		"\u023e\5h\65\2\u023e\u023f\7*\2\2\u023f\u0243\3\2\2\2\u0240\u0241\7!\2"+
		"\2\u0241\u0243\7\34\2\2\u0242\u0237\3\2\2\2\u0242\u023c\3\2\2\2\u0242"+
		"\u0240\3\2\2\2\u0243g\3\2\2\2\u0244\u0249\5j\66\2\u0245\u0246\7%\2\2\u0246"+
		"\u0248\5j\66\2\u0247\u0245\3\2\2\2\u0248\u024b\3\2\2\2\u0249\u0247\3\2"+
		"\2\2\u0249\u024a\3\2\2\2\u024a\u024d\3\2\2\2\u024b\u0249\3\2\2\2\u024c"+
		"\u024e\7%\2\2\u024d\u024c\3\2\2\2\u024d\u024e\3\2\2\2\u024ei\3\2\2\2\u024f"+
		"\u025b\5D#\2\u0250\u0252\5D#\2\u0251\u0250\3\2\2\2\u0251\u0252\3\2\2\2"+
		"\u0252\u0253\3\2\2\2\u0253\u0255\7&\2\2\u0254\u0256\5D#\2\u0255\u0254"+
		"\3\2\2\2\u0255\u0256\3\2\2\2\u0256\u0258\3\2\2\2\u0257\u0259\5l\67\2\u0258"+
		"\u0257\3\2\2\2\u0258\u0259\3\2\2\2\u0259\u025b\3\2\2\2\u025a\u024f\3\2"+
		"\2\2\u025a\u0251\3\2\2\2\u025bk\3\2\2\2\u025c\u025e\7&\2\2\u025d\u025f"+
		"\5D#\2\u025e\u025d\3\2\2\2\u025e\u025f\3\2\2\2\u025fm\3\2\2\2\u0260\u0265"+
		"\5P)\2\u0261\u0262\7%\2\2\u0262\u0264\5P)\2\u0263\u0261\3\2\2\2\u0264"+
		"\u0267\3\2\2\2\u0265\u0263\3\2\2\2\u0265\u0266\3\2\2\2\u0266\u0269\3\2"+
		"\2\2\u0267\u0265\3\2\2\2\u0268\u026a\7%\2\2\u0269\u0268\3\2\2\2\u0269"+
		"\u026a\3\2\2\2\u026ao\3\2\2\2\u026b\u0270\5D#\2\u026c\u026d\7%\2\2\u026d"+
		"\u026f\5D#\2\u026e\u026c\3\2\2\2\u026f\u0272\3\2\2\2\u0270\u026e\3\2\2"+
		"\2\u0270\u0271\3\2\2\2\u0271\u0274\3\2\2\2\u0272\u0270\3\2\2\2\u0273\u0275"+
		"\7%\2\2\u0274\u0273\3\2\2\2\u0274\u0275\3\2\2\2\u0275q\3\2\2\2\u0276\u0277"+
		"\5D#\2\u0277\u0278\7&\2\2\u0278\u0287\5D#\2\u0279\u0288\5z>\2\u027a\u027b"+
		"\7%\2\2\u027b\u027c\5D#\2\u027c\u027d\7&\2\2\u027d\u027e\5D#\2\u027e\u0280"+
		"\3\2\2\2\u027f\u027a\3\2\2\2\u0280\u0283\3\2\2\2\u0281\u027f\3\2\2\2\u0281"+
		"\u0282\3\2\2\2\u0282\u0285\3\2\2\2\u0283\u0281\3\2\2\2\u0284\u0286\7%"+
		"\2\2\u0285\u0284\3\2\2\2\u0285\u0286\3\2\2\2\u0286\u0288\3\2\2\2\u0287"+
		"\u0279\3\2\2\2\u0287\u0281\3\2\2\2\u0288\u0298\3\2\2\2\u0289\u0295\5D"+
		"#\2\u028a\u0296\5z>\2\u028b\u028c\7%\2\2\u028c\u028e\5D#\2\u028d\u028b"+
		"\3\2\2\2\u028e\u0291\3\2\2\2\u028f\u028d\3\2\2\2\u028f\u0290\3\2\2\2\u0290"+
		"\u0293\3\2\2\2\u0291\u028f\3\2\2\2\u0292\u0294\7%\2\2\u0293\u0292\3\2"+
		"\2\2\u0293\u0294\3\2\2\2\u0294\u0296\3\2\2\2\u0295\u028a\3\2\2\2\u0295"+
		"\u028f\3\2\2\2\u0296\u0298\3\2\2\2\u0297\u0276\3\2\2\2\u0297\u0289\3\2"+
		"\2\2\u0298s\3\2\2\2\u0299\u029a\5v<\2\u029a\u029b\7%\2\2\u029b\u029d\3"+
		"\2\2\2\u029c\u0299\3\2\2\2\u029d\u02a0\3\2\2\2\u029e\u029c\3\2\2\2\u029e"+
		"\u029f\3\2\2\2\u029f\u02a1\3\2\2\2\u02a0\u029e\3\2\2\2\u02a1\u02a2\5v"+
		"<\2\u02a2u\3\2\2\2\u02a3\u02a5\5D#\2\u02a4\u02a6\5z>\2\u02a5\u02a4\3\2"+
		"\2\2\u02a5\u02a6\3\2\2\2\u02a6\u02ac\3\2\2\2\u02a7\u02a8\5D#\2\u02a8\u02a9"+
		"\7(\2\2\u02a9\u02aa\5D#\2\u02aa\u02ac\3\2\2\2\u02ab\u02a3\3\2\2\2\u02ab"+
		"\u02a7\3\2\2\2\u02acw\3\2\2\2\u02ad\u02b0\5z>\2\u02ae\u02b0\5|?\2\u02af"+
		"\u02ad\3\2\2\2\u02af\u02ae\3\2\2\2\u02b0y\3\2\2\2\u02b1\u02b2\7\r\2\2"+
		"\u02b2\u02b3\5n8\2\u02b3\u02b4\7\16\2\2\u02b4\u02b6\5F$\2\u02b5\u02b7"+
		"\5x=\2\u02b6\u02b5\3\2\2\2\u02b6\u02b7\3\2\2\2\u02b7{\3\2\2\2\u02b8\u02b9"+
		"\7\6\2\2\u02b9\u02bb\5F$\2\u02ba\u02bc\5x=\2\u02bb\u02ba\3\2\2\2\u02bb"+
		"\u02bc\3\2\2\2\u02bc}\3\2\2\2\u02bd\u02be\t\4\2\2\u02be\177\3\2\2\2X\u0083"+
		"\u008e\u0090\u0097\u009a\u00a1\u00a8\u00b9\u00c4\u00db\u00e1\u00e5\u00ec"+
		"\u00f0\u00f8\u0102\u0105\u0109\u010e\u0112\u0116\u0122\u012a\u0130\u013d"+
		"\u0143\u0151\u015d\u0160\u0169\u016c\u0177\u0182\u018a\u018e\u0196\u019d"+
		"\u01a5\u01ab\u01b3\u01c3\u01c6\u01cf\u01d7\u01df\u01e7\u01e9\u01f1\u01f3"+
		"\u01fd\u01ff\u0209\u020f\u0214\u0219\u021e\u0227\u022f\u0233\u0235\u0239"+
		"\u0242\u0249\u024d\u0251\u0255\u0258\u025a\u025e\u0265\u0269\u0270\u0274"+
		"\u0281\u0285\u0287\u028f\u0293\u0295\u0297\u029e\u02a5\u02ab\u02af\u02b6"+
		"\u02bb";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
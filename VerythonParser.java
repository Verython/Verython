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
		FALSE=19, DEL=20, PASS=21, CONTINUE=22, BREAK=23, NEWLINE=24, NAME=25, 
		DECIMAL_INTEGER=26, OCT_INTEGER=27, HEX_INTEGER=28, BIN_INTEGER=29, DOT=30, 
		STAR=31, OPEN_PAREN=32, CLOSE_PAREN=33, COMMA=34, COLON=35, SEMI_COLON=36, 
		ASSIGN=37, OPEN_BRACK=38, CLOSE_BRACK=39, OR_OP=40, XOR=41, AND_OP=42, 
		LEFT_SHIFT=43, RIGHT_SHIFT=44, ADD=45, MINUS=46, DIV=47, MOD=48, NOT_OP=49, 
		OPEN_BRACE=50, CLOSE_BRACE=51, LESS_THAN=52, GREATER_THAN=53, EQUALS=54, 
		GT_EQ=55, LT_EQ=56, NOT_EQ_1=57, NOT_EQ_2=58, ADD_ASSIGN=59, SUB_ASSIGN=60, 
		MULT_ASSIGN=61, DIV_ASSIGN=62, MOD_ASSIGN=63, AND_ASSIGN=64, OR_ASSIGN=65, 
		XOR_ASSIGN=66, LEFT_SHIFT_ASSIGN=67, RIGHT_SHIFT_ASSIGN=68, TOP=69, INITAL=70, 
		ALWAYS=71, SKIP_=72, UNKNOWN_CHAR=73, INDENT=74, DEDENT=75;
	public static final int
		RULE_initial = 0, RULE_decorated = 1, RULE_decorator = 2, RULE_funcdef = 3, 
		RULE_parameters = 4, RULE_typedargslist = 5, RULE_tfpdef = 6, RULE_stmt = 7, 
		RULE_simple_stmt = 8, RULE_small_stmt = 9, RULE_expr_stmt = 10, RULE_testlist_star_expr = 11, 
		RULE_augassign = 12, RULE_del_stmt = 13, RULE_pass_stmt = 14, RULE_flow_stmt = 15, 
		RULE_break_stmt = 16, RULE_continue_stmt = 17, RULE_return_stmt = 18, 
		RULE_compound_stmt = 19, RULE_if_stmt = 20, RULE_switch_stmt = 21, RULE_switch_suite = 22, 
		RULE_case_stmt = 23, RULE_while_stmt = 24, RULE_for_stmt = 25, RULE_suite = 26, 
		RULE_test = 27, RULE_or_test = 28, RULE_and_test = 29, RULE_not_test = 30, 
		RULE_comparison = 31, RULE_comp_op = 32, RULE_star_expr = 33, RULE_expr = 34, 
		RULE_xor_expr = 35, RULE_and_expr = 36, RULE_shift_expr = 37, RULE_arith_expr = 38, 
		RULE_term = 39, RULE_factor = 40, RULE_power = 41, RULE_atom = 42, RULE_testlist_comp = 43, 
		RULE_trailer = 44, RULE_subscriptlist = 45, RULE_subscript = 46, RULE_sliceop = 47, 
		RULE_exprlist = 48, RULE_testlist = 49, RULE_dictorsetmaker = 50, RULE_arglist = 51, 
		RULE_argument = 52, RULE_comp_iter = 53, RULE_comp_for = 54, RULE_comp_if = 55, 
		RULE_number = 56;
	public static final String[] ruleNames = {
		"initial", "decorated", "decorator", "funcdef", "parameters", "typedargslist", 
		"tfpdef", "stmt", "simple_stmt", "small_stmt", "expr_stmt", "testlist_star_expr", 
		"augassign", "del_stmt", "pass_stmt", "flow_stmt", "break_stmt", "continue_stmt", 
		"return_stmt", "compound_stmt", "if_stmt", "switch_stmt", "switch_suite", 
		"case_stmt", "while_stmt", "for_stmt", "suite", "test", "or_test", "and_test", 
		"not_test", "comparison", "comp_op", "star_expr", "expr", "xor_expr", 
		"and_expr", "shift_expr", "arith_expr", "term", "factor", "power", "atom", 
		"testlist_comp", "trailer", "subscriptlist", "subscript", "sliceop", "exprlist", 
		"testlist", "dictorsetmaker", "arglist", "argument", "comp_iter", "comp_for", 
		"comp_if", "number"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'...'", "'def'", "'return'", "'if'", "'elif'", "'else'", "'switch'", 
		"'case'", "'default'", "'while'", "'for'", "'in'", "'or'", "'and'", "'not'", 
		"'is'", "'None'", "'True'", "'False'", "'del'", "'pass'", "'continue'", 
		"'break'", null, null, null, null, null, null, "'.'", "'*'", "'('", "')'", 
		"','", "':'", "';'", "'='", "'['", "']'", "'|'", "'^'", "'&'", "'<<'", 
		"'>>'", "'+'", "'-'", "'/'", "'%'", "'~'", "'{'", "'}'", "'<'", "'>'", 
		"'=='", "'>='", "'<='", "'<>'", "'!='", "'+='", "'-='", "'*='", "'/='", 
		"'%='", "'&='", "'|='", "'^='", "'<<='", "'>>='", "'@top'", "'@initial'", 
		"'@always'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "DEF", "RETURN", "IF", "ELIF", "ELSE", "SWITCH", "CASE", "DEFAULT", 
		"WHILE", "FOR", "IN", "OR", "AND", "NOT", "IS", "NONE", "TRUE", "FALSE", 
		"DEL", "PASS", "CONTINUE", "BREAK", "NEWLINE", "NAME", "DECIMAL_INTEGER", 
		"OCT_INTEGER", "HEX_INTEGER", "BIN_INTEGER", "DOT", "STAR", "OPEN_PAREN", 
		"CLOSE_PAREN", "COMMA", "COLON", "SEMI_COLON", "ASSIGN", "OPEN_BRACK", 
		"CLOSE_BRACK", "OR_OP", "XOR", "AND_OP", "LEFT_SHIFT", "RIGHT_SHIFT", 
		"ADD", "MINUS", "DIV", "MOD", "NOT_OP", "OPEN_BRACE", "CLOSE_BRACE", "LESS_THAN", 
		"GREATER_THAN", "EQUALS", "GT_EQ", "LT_EQ", "NOT_EQ_1", "NOT_EQ_2", "ADD_ASSIGN", 
		"SUB_ASSIGN", "MULT_ASSIGN", "DIV_ASSIGN", "MOD_ASSIGN", "AND_ASSIGN", 
		"OR_ASSIGN", "XOR_ASSIGN", "LEFT_SHIFT_ASSIGN", "RIGHT_SHIFT_ASSIGN", 
		"TOP", "INITAL", "ALWAYS", "SKIP_", "UNKNOWN_CHAR", "INDENT", "DEDENT"
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
		public TerminalNode EOF() { return getToken(VerythonParser.EOF, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(VerythonParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(VerythonParser.NEWLINE, i);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public InitialContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initial; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerythonListener ) ((VerythonListener)listener).enterInitial(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerythonListener ) ((VerythonListener)listener).exitInitial(this);
		}
	}

	public final InitialContext initial() throws RecognitionException {
		InitialContext _localctx = new InitialContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_initial);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << DEF) | (1L << RETURN) | (1L << IF) | (1L << SWITCH) | (1L << WHILE) | (1L << FOR) | (1L << NOT) | (1L << NONE) | (1L << TRUE) | (1L << FALSE) | (1L << DEL) | (1L << PASS) | (1L << CONTINUE) | (1L << BREAK) | (1L << NEWLINE) | (1L << NAME) | (1L << DECIMAL_INTEGER) | (1L << OCT_INTEGER) | (1L << HEX_INTEGER) | (1L << BIN_INTEGER) | (1L << STAR) | (1L << OPEN_PAREN) | (1L << OPEN_BRACK) | (1L << ADD) | (1L << MINUS) | (1L << NOT_OP) | (1L << OPEN_BRACE))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (TOP - 69)) | (1L << (INITAL - 69)) | (1L << (ALWAYS - 69)))) != 0)) {
				{
				setState(116);
				switch (_input.LA(1)) {
				case NEWLINE:
					{
					setState(114);
					match(NEWLINE);
					}
					break;
				case T__0:
				case DEF:
				case RETURN:
				case IF:
				case SWITCH:
				case WHILE:
				case FOR:
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
				case TOP:
				case INITAL:
				case ALWAYS:
					{
					setState(115);
					stmt();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(121);
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

	public static class DecoratedContext extends ParserRuleContext {
		public DecoratorContext decorator() {
			return getRuleContext(DecoratorContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(VerythonParser.NEWLINE, 0); }
		public FuncdefContext funcdef() {
			return getRuleContext(FuncdefContext.class,0);
		}
		public DecoratedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decorated; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerythonListener ) ((VerythonListener)listener).enterDecorated(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerythonListener ) ((VerythonListener)listener).exitDecorated(this);
		}
	}

	public final DecoratedContext decorated() throws RecognitionException {
		DecoratedContext _localctx = new DecoratedContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_decorated);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			decorator();
			setState(124);
			match(NEWLINE);
			setState(125);
			funcdef();
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
		public TerminalNode TOP() { return getToken(VerythonParser.TOP, 0); }
		public TerminalNode INITAL() { return getToken(VerythonParser.INITAL, 0); }
		public TerminalNode ALWAYS() { return getToken(VerythonParser.ALWAYS, 0); }
		public ArglistContext arglist() {
			return getRuleContext(ArglistContext.class,0);
		}
		public DecoratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decorator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerythonListener ) ((VerythonListener)listener).enterDecorator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerythonListener ) ((VerythonListener)listener).exitDecorator(this);
		}
	}

	public final DecoratorContext decorator() throws RecognitionException {
		DecoratorContext _localctx = new DecoratorContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_decorator);
		int _la;
		try {
			setState(135);
			switch (_input.LA(1)) {
			case TOP:
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				match(TOP);
				}
				break;
			case INITAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(128);
				match(INITAL);
				}
				break;
			case ALWAYS:
				enterOuterAlt(_localctx, 3);
				{
				setState(129);
				match(ALWAYS);
				setState(130);
				match(OPEN_PAREN);
				setState(132);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << NOT) | (1L << NONE) | (1L << TRUE) | (1L << FALSE) | (1L << NAME) | (1L << DECIMAL_INTEGER) | (1L << OCT_INTEGER) | (1L << HEX_INTEGER) | (1L << BIN_INTEGER) | (1L << STAR) | (1L << OPEN_PAREN) | (1L << OPEN_BRACK) | (1L << ADD) | (1L << MINUS) | (1L << NOT_OP) | (1L << OPEN_BRACE))) != 0)) {
					{
					setState(131);
					arglist();
					}
				}

				setState(134);
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

	public static class FuncdefContext extends ParserRuleContext {
		public TerminalNode DEF() { return getToken(VerythonParser.DEF, 0); }
		public TerminalNode NAME() { return getToken(VerythonParser.NAME, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public SuiteContext suite() {
			return getRuleContext(SuiteContext.class,0);
		}
		public FuncdefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcdef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerythonListener ) ((VerythonListener)listener).enterFuncdef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerythonListener ) ((VerythonListener)listener).exitFuncdef(this);
		}
	}

	public final FuncdefContext funcdef() throws RecognitionException {
		FuncdefContext _localctx = new FuncdefContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_funcdef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(DEF);
			setState(138);
			match(NAME);
			setState(139);
			parameters();
			setState(140);
			match(COLON);
			setState(141);
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

	public static class ParametersContext extends ParserRuleContext {
		public TypedargslistContext typedargslist() {
			return getRuleContext(TypedargslistContext.class,0);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerythonListener ) ((VerythonListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerythonListener ) ((VerythonListener)listener).exitParameters(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(OPEN_PAREN);
			setState(145);
			_la = _input.LA(1);
			if (_la==OPEN_BRACK) {
				{
				setState(144);
				typedargslist();
				}
			}

			setState(147);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerythonListener ) ((VerythonListener)listener).enterTypedargslist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerythonListener ) ((VerythonListener)listener).exitTypedargslist(this);
		}
	}

	public final TypedargslistContext typedargslist() throws RecognitionException {
		TypedargslistContext _localctx = new TypedargslistContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_typedargslist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(OPEN_BRACK);
			setState(150);
			match(DECIMAL_INTEGER);
			setState(151);
			match(COLON);
			setState(152);
			match(DECIMAL_INTEGER);
			setState(153);
			match(CLOSE_BRACK);
			setState(154);
			tfpdef();
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(155);
				match(COMMA);
				setState(156);
				match(OPEN_BRACK);
				setState(157);
				match(DECIMAL_INTEGER);
				setState(158);
				match(COLON);
				setState(159);
				match(DECIMAL_INTEGER);
				setState(160);
				match(CLOSE_BRACK);
				setState(161);
				tfpdef();
				}
				}
				setState(166);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerythonListener ) ((VerythonListener)listener).enterTfpdef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerythonListener ) ((VerythonListener)listener).exitTfpdef(this);
		}
	}

	public final TfpdefContext tfpdef() throws RecognitionException {
		TfpdefContext _localctx = new TfpdefContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_tfpdef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(NAME);
			setState(170);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(168);
				match(COLON);
				setState(169);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerythonListener ) ((VerythonListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerythonListener ) ((VerythonListener)listener).exitStmt(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_stmt);
		try {
			setState(174);
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
				setState(172);
				simple_stmt();
				}
				break;
			case DEF:
			case IF:
			case SWITCH:
			case WHILE:
			case FOR:
			case TOP:
			case INITAL:
			case ALWAYS:
				enterOuterAlt(_localctx, 2);
				{
				setState(173);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerythonListener ) ((VerythonListener)listener).enterSimple_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerythonListener ) ((VerythonListener)listener).exitSimple_stmt(this);
		}
	}

	public final Simple_stmtContext simple_stmt() throws RecognitionException {
		Simple_stmtContext _localctx = new Simple_stmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_simple_stmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			small_stmt();
			setState(181);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(177);
					match(SEMI_COLON);
					setState(178);
					small_stmt();
					}
					} 
				}
				setState(183);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			setState(185);
			_la = _input.LA(1);
			if (_la==SEMI_COLON) {
				{
				setState(184);
				match(SEMI_COLON);
				}
			}

			setState(187);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerythonListener ) ((VerythonListener)listener).enterSmall_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerythonListener ) ((VerythonListener)listener).exitSmall_stmt(this);
		}
	}

	public final Small_stmtContext small_stmt() throws RecognitionException {
		Small_stmtContext _localctx = new Small_stmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_small_stmt);
		try {
			setState(193);
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
				setState(189);
				expr_stmt();
				}
				break;
			case DEL:
				enterOuterAlt(_localctx, 2);
				{
				setState(190);
				del_stmt();
				}
				break;
			case PASS:
				enterOuterAlt(_localctx, 3);
				{
				setState(191);
				pass_stmt();
				}
				break;
			case RETURN:
			case CONTINUE:
			case BREAK:
				enterOuterAlt(_localctx, 4);
				{
				setState(192);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerythonListener ) ((VerythonListener)listener).enterExpr_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerythonListener ) ((VerythonListener)listener).exitExpr_stmt(this);
		}
	}

	public final Expr_stmtContext expr_stmt() throws RecognitionException {
		Expr_stmtContext _localctx = new Expr_stmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_expr_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			testlist_star_expr();
			setState(206);
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
				setState(196);
				augassign();
				setState(197);
				testlist();
				}
				break;
			case NEWLINE:
			case SEMI_COLON:
			case ASSIGN:
				{
				setState(203);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ASSIGN) {
					{
					{
					setState(199);
					match(ASSIGN);
					setState(200);
					testlist_star_expr();
					}
					}
					setState(205);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerythonListener ) ((VerythonListener)listener).enterTestlist_star_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerythonListener ) ((VerythonListener)listener).exitTestlist_star_expr(this);
		}
	}

	public final Testlist_star_exprContext testlist_star_expr() throws RecognitionException {
		Testlist_star_exprContext _localctx = new Testlist_star_exprContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_testlist_star_expr);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(208);
				test();
				}
				break;
			case 2:
				{
				setState(209);
				star_expr();
				}
				break;
			}
			setState(219);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(212);
					match(COMMA);
					setState(215);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						setState(213);
						test();
						}
						break;
					case 2:
						{
						setState(214);
						star_expr();
						}
						break;
					}
					}
					} 
				}
				setState(221);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			setState(223);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(222);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerythonListener ) ((VerythonListener)listener).enterAugassign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerythonListener ) ((VerythonListener)listener).exitAugassign(this);
		}
	}

	public final AugassignContext augassign() throws RecognitionException {
		AugassignContext _localctx = new AugassignContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_augassign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			_la = _input.LA(1);
			if ( !(((((_la - 59)) & ~0x3f) == 0 && ((1L << (_la - 59)) & ((1L << (ADD_ASSIGN - 59)) | (1L << (SUB_ASSIGN - 59)) | (1L << (MULT_ASSIGN - 59)) | (1L << (DIV_ASSIGN - 59)) | (1L << (MOD_ASSIGN - 59)) | (1L << (AND_ASSIGN - 59)) | (1L << (OR_ASSIGN - 59)) | (1L << (XOR_ASSIGN - 59)) | (1L << (LEFT_SHIFT_ASSIGN - 59)) | (1L << (RIGHT_SHIFT_ASSIGN - 59)))) != 0)) ) {
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerythonListener ) ((VerythonListener)listener).enterDel_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerythonListener ) ((VerythonListener)listener).exitDel_stmt(this);
		}
	}

	public final Del_stmtContext del_stmt() throws RecognitionException {
		Del_stmtContext _localctx = new Del_stmtContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_del_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			match(DEL);
			setState(228);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerythonListener ) ((VerythonListener)listener).enterPass_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerythonListener ) ((VerythonListener)listener).exitPass_stmt(this);
		}
	}

	public final Pass_stmtContext pass_stmt() throws RecognitionException {
		Pass_stmtContext _localctx = new Pass_stmtContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_pass_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerythonListener ) ((VerythonListener)listener).enterFlow_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerythonListener ) ((VerythonListener)listener).exitFlow_stmt(this);
		}
	}

	public final Flow_stmtContext flow_stmt() throws RecognitionException {
		Flow_stmtContext _localctx = new Flow_stmtContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_flow_stmt);
		try {
			setState(235);
			switch (_input.LA(1)) {
			case BREAK:
				enterOuterAlt(_localctx, 1);
				{
				setState(232);
				break_stmt();
				}
				break;
			case CONTINUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(233);
				continue_stmt();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 3);
				{
				setState(234);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerythonListener ) ((VerythonListener)listener).enterBreak_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerythonListener ) ((VerythonListener)listener).exitBreak_stmt(this);
		}
	}

	public final Break_stmtContext break_stmt() throws RecognitionException {
		Break_stmtContext _localctx = new Break_stmtContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_break_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerythonListener ) ((VerythonListener)listener).enterContinue_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerythonListener ) ((VerythonListener)listener).exitContinue_stmt(this);
		}
	}

	public final Continue_stmtContext continue_stmt() throws RecognitionException {
		Continue_stmtContext _localctx = new Continue_stmtContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_continue_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerythonListener ) ((VerythonListener)listener).enterReturn_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerythonListener ) ((VerythonListener)listener).exitReturn_stmt(this);
		}
	}

	public final Return_stmtContext return_stmt() throws RecognitionException {
		Return_stmtContext _localctx = new Return_stmtContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_return_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			match(RETURN);
			setState(243);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << NOT) | (1L << NONE) | (1L << TRUE) | (1L << FALSE) | (1L << NAME) | (1L << DECIMAL_INTEGER) | (1L << OCT_INTEGER) | (1L << HEX_INTEGER) | (1L << BIN_INTEGER) | (1L << STAR) | (1L << OPEN_PAREN) | (1L << OPEN_BRACK) | (1L << ADD) | (1L << MINUS) | (1L << NOT_OP) | (1L << OPEN_BRACE))) != 0)) {
				{
				setState(242);
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
		public FuncdefContext funcdef() {
			return getRuleContext(FuncdefContext.class,0);
		}
		public DecoratedContext decorated() {
			return getRuleContext(DecoratedContext.class,0);
		}
		public Compound_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compound_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerythonListener ) ((VerythonListener)listener).enterCompound_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerythonListener ) ((VerythonListener)listener).exitCompound_stmt(this);
		}
	}

	public final Compound_stmtContext compound_stmt() throws RecognitionException {
		Compound_stmtContext _localctx = new Compound_stmtContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_compound_stmt);
		try {
			setState(251);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(245);
				if_stmt();
				}
				break;
			case SWITCH:
				enterOuterAlt(_localctx, 2);
				{
				setState(246);
				switch_stmt();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(247);
				while_stmt();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 4);
				{
				setState(248);
				for_stmt();
				}
				break;
			case DEF:
				enterOuterAlt(_localctx, 5);
				{
				setState(249);
				funcdef();
				}
				break;
			case TOP:
			case INITAL:
			case ALWAYS:
				enterOuterAlt(_localctx, 6);
				{
				setState(250);
				decorated();
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerythonListener ) ((VerythonListener)listener).enterIf_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerythonListener ) ((VerythonListener)listener).exitIf_stmt(this);
		}
	}

	public final If_stmtContext if_stmt() throws RecognitionException {
		If_stmtContext _localctx = new If_stmtContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_if_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			match(IF);
			setState(254);
			test();
			setState(255);
			match(COLON);
			setState(256);
			suite();
			setState(264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELIF) {
				{
				{
				setState(257);
				match(ELIF);
				setState(258);
				test();
				setState(259);
				match(COLON);
				setState(260);
				suite();
				}
				}
				setState(266);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(270);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(267);
				match(ELSE);
				setState(268);
				match(COLON);
				setState(269);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerythonListener ) ((VerythonListener)listener).enterSwitch_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerythonListener ) ((VerythonListener)listener).exitSwitch_stmt(this);
		}
	}

	public final Switch_stmtContext switch_stmt() throws RecognitionException {
		Switch_stmtContext _localctx = new Switch_stmtContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_switch_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			match(SWITCH);
			setState(273);
			match(OPEN_PAREN);
			setState(274);
			match(NAME);
			setState(275);
			match(CLOSE_PAREN);
			setState(276);
			match(COLON);
			setState(277);
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
		public Case_stmtContext case_stmt() {
			return getRuleContext(Case_stmtContext.class,0);
		}
		public TerminalNode DEDENT() { return getToken(VerythonParser.DEDENT, 0); }
		public Switch_suiteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_suite; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerythonListener ) ((VerythonListener)listener).enterSwitch_suite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerythonListener ) ((VerythonListener)listener).exitSwitch_suite(this);
		}
	}

	public final Switch_suiteContext switch_suite() throws RecognitionException {
		Switch_suiteContext _localctx = new Switch_suiteContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_switch_suite);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			match(NEWLINE);
			setState(280);
			match(INDENT);
			setState(281);
			case_stmt();
			setState(282);
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
		public List<TerminalNode> CASE() { return getTokens(VerythonParser.CASE); }
		public TerminalNode CASE(int i) {
			return getToken(VerythonParser.CASE, i);
		}
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(VerythonParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(VerythonParser.NEWLINE, i);
		}
		public TerminalNode DEFAULT() { return getToken(VerythonParser.DEFAULT, 0); }
		public List<TerminalNode> RETURN() { return getTokens(VerythonParser.RETURN); }
		public TerminalNode RETURN(int i) {
			return getToken(VerythonParser.RETURN, i);
		}
		public List<Expr_stmtContext> expr_stmt() {
			return getRuleContexts(Expr_stmtContext.class);
		}
		public Expr_stmtContext expr_stmt(int i) {
			return getRuleContext(Expr_stmtContext.class,i);
		}
		public List<TerminalNode> NAME() { return getTokens(VerythonParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(VerythonParser.NAME, i);
		}
		public Case_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerythonListener ) ((VerythonListener)listener).enterCase_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerythonListener ) ((VerythonListener)listener).exitCase_stmt(this);
		}
	}

	public final Case_stmtContext case_stmt() throws RecognitionException {
		Case_stmtContext _localctx = new Case_stmtContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_case_stmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			match(CASE);
			setState(285);
			number();
			setState(286);
			match(COLON);
			setState(293);
			switch (_input.LA(1)) {
			case RETURN:
				{
				setState(287);
				match(RETURN);
				setState(290);
				switch (_input.LA(1)) {
				case NAME:
					{
					setState(288);
					match(NAME);
					}
					break;
				case DECIMAL_INTEGER:
				case OCT_INTEGER:
				case HEX_INTEGER:
				case BIN_INTEGER:
					{
					setState(289);
					number();
					}
					break;
				default:
					throw new NoViableAltException(this);
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
				setState(292);
				expr_stmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(309);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(295);
					match(NEWLINE);
					setState(296);
					match(CASE);
					setState(297);
					number();
					setState(298);
					match(COLON);
					setState(305);
					switch (_input.LA(1)) {
					case RETURN:
						{
						setState(299);
						match(RETURN);
						setState(302);
						switch (_input.LA(1)) {
						case NAME:
							{
							setState(300);
							match(NAME);
							}
							break;
						case DECIMAL_INTEGER:
						case OCT_INTEGER:
						case HEX_INTEGER:
						case BIN_INTEGER:
							{
							setState(301);
							number();
							}
							break;
						default:
							throw new NoViableAltException(this);
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
						setState(304);
						expr_stmt();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					} 
				}
				setState(311);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			}
			setState(312);
			match(NEWLINE);
			setState(313);
			match(DEFAULT);
			setState(314);
			match(COLON);
			setState(321);
			switch (_input.LA(1)) {
			case RETURN:
				{
				setState(315);
				match(RETURN);
				setState(318);
				switch (_input.LA(1)) {
				case NAME:
					{
					setState(316);
					match(NAME);
					}
					break;
				case DECIMAL_INTEGER:
				case OCT_INTEGER:
				case HEX_INTEGER:
				case BIN_INTEGER:
					{
					setState(317);
					number();
					}
					break;
				default:
					throw new NoViableAltException(this);
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
				setState(320);
				expr_stmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(323);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerythonListener ) ((VerythonListener)listener).enterWhile_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerythonListener ) ((VerythonListener)listener).exitWhile_stmt(this);
		}
	}

	public final While_stmtContext while_stmt() throws RecognitionException {
		While_stmtContext _localctx = new While_stmtContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_while_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			match(WHILE);
			setState(326);
			test();
			setState(327);
			match(COLON);
			setState(328);
			suite();
			setState(332);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(329);
				match(ELSE);
				setState(330);
				match(COLON);
				setState(331);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerythonListener ) ((VerythonListener)listener).enterFor_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerythonListener ) ((VerythonListener)listener).exitFor_stmt(this);
		}
	}

	public final For_stmtContext for_stmt() throws RecognitionException {
		For_stmtContext _localctx = new For_stmtContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_for_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			match(FOR);
			setState(335);
			exprlist();
			setState(336);
			match(IN);
			setState(337);
			testlist();
			setState(338);
			match(COLON);
			setState(339);
			suite();
			setState(343);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(340);
				match(ELSE);
				setState(341);
				match(COLON);
				setState(342);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerythonListener ) ((VerythonListener)listener).enterSuite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerythonListener ) ((VerythonListener)listener).exitSuite(this);
		}
	}

	public final SuiteContext suite() throws RecognitionException {
		SuiteContext _localctx = new SuiteContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_suite);
		int _la;
		try {
			setState(355);
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
				setState(345);
				simple_stmt();
				}
				break;
			case NEWLINE:
				enterOuterAlt(_localctx, 2);
				{
				setState(346);
				match(NEWLINE);
				setState(347);
				match(INDENT);
				setState(349); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(348);
					stmt();
					}
					}
					setState(351); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << DEF) | (1L << RETURN) | (1L << IF) | (1L << SWITCH) | (1L << WHILE) | (1L << FOR) | (1L << NOT) | (1L << NONE) | (1L << TRUE) | (1L << FALSE) | (1L << DEL) | (1L << PASS) | (1L << CONTINUE) | (1L << BREAK) | (1L << NAME) | (1L << DECIMAL_INTEGER) | (1L << OCT_INTEGER) | (1L << HEX_INTEGER) | (1L << BIN_INTEGER) | (1L << STAR) | (1L << OPEN_PAREN) | (1L << OPEN_BRACK) | (1L << ADD) | (1L << MINUS) | (1L << NOT_OP) | (1L << OPEN_BRACE))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (TOP - 69)) | (1L << (INITAL - 69)) | (1L << (ALWAYS - 69)))) != 0) );
				setState(353);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerythonListener ) ((VerythonListener)listener).enterTest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerythonListener ) ((VerythonListener)listener).exitTest(this);
		}
	}

	public final TestContext test() throws RecognitionException {
		TestContext _localctx = new TestContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_test);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			or_test();
			setState(363);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(358);
				match(IF);
				setState(359);
				or_test();
				setState(360);
				match(ELSE);
				setState(361);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerythonListener ) ((VerythonListener)listener).enterOr_test(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerythonListener ) ((VerythonListener)listener).exitOr_test(this);
		}
	}

	public final Or_testContext or_test() throws RecognitionException {
		Or_testContext _localctx = new Or_testContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_or_test);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
			and_test();
			setState(370);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(366);
				match(OR);
				setState(367);
				and_test();
				}
				}
				setState(372);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerythonListener ) ((VerythonListener)listener).enterAnd_test(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerythonListener ) ((VerythonListener)listener).exitAnd_test(this);
		}
	}

	public final And_testContext and_test() throws RecognitionException {
		And_testContext _localctx = new And_testContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_and_test);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
			not_test();
			setState(378);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(374);
				match(AND);
				setState(375);
				not_test();
				}
				}
				setState(380);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerythonListener ) ((VerythonListener)listener).enterNot_test(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerythonListener ) ((VerythonListener)listener).exitNot_test(this);
		}
	}

	public final Not_testContext not_test() throws RecognitionException {
		Not_testContext _localctx = new Not_testContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_not_test);
		try {
			setState(384);
			switch (_input.LA(1)) {
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(381);
				match(NOT);
				setState(382);
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
				setState(383);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerythonListener ) ((VerythonListener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerythonListener ) ((VerythonListener)listener).exitComparison(this);
		}
	}

	public final ComparisonContext comparison() throws RecognitionException {
		ComparisonContext _localctx = new ComparisonContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_comparison);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
			star_expr();
			setState(392);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IN) | (1L << NOT) | (1L << IS) | (1L << LESS_THAN) | (1L << GREATER_THAN) | (1L << EQUALS) | (1L << GT_EQ) | (1L << LT_EQ) | (1L << NOT_EQ_1) | (1L << NOT_EQ_2))) != 0)) {
				{
				{
				setState(387);
				comp_op();
				setState(388);
				star_expr();
				}
				}
				setState(394);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerythonListener ) ((VerythonListener)listener).enterComp_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerythonListener ) ((VerythonListener)listener).exitComp_op(this);
		}
	}

	public final Comp_opContext comp_op() throws RecognitionException {
		Comp_opContext _localctx = new Comp_opContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_comp_op);
		try {
			setState(408);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(395);
				match(LESS_THAN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(396);
				match(GREATER_THAN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(397);
				match(EQUALS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(398);
				match(GT_EQ);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(399);
				match(LT_EQ);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(400);
				match(NOT_EQ_1);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(401);
				match(NOT_EQ_2);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(402);
				match(IN);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(403);
				match(NOT);
				setState(404);
				match(IN);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(405);
				match(IS);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(406);
				match(IS);
				setState(407);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerythonListener ) ((VerythonListener)listener).enterStar_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerythonListener ) ((VerythonListener)listener).exitStar_expr(this);
		}
	}

	public final Star_exprContext star_expr() throws RecognitionException {
		Star_exprContext _localctx = new Star_exprContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_star_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(411);
			_la = _input.LA(1);
			if (_la==STAR) {
				{
				setState(410);
				match(STAR);
				}
			}

			setState(413);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerythonListener ) ((VerythonListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerythonListener ) ((VerythonListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(415);
			xor_expr();
			setState(420);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR_OP) {
				{
				{
				setState(416);
				match(OR_OP);
				setState(417);
				xor_expr();
				}
				}
				setState(422);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerythonListener ) ((VerythonListener)listener).enterXor_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerythonListener ) ((VerythonListener)listener).exitXor_expr(this);
		}
	}

	public final Xor_exprContext xor_expr() throws RecognitionException {
		Xor_exprContext _localctx = new Xor_exprContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_xor_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(423);
			and_expr();
			setState(428);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==XOR) {
				{
				{
				setState(424);
				match(XOR);
				setState(425);
				and_expr();
				}
				}
				setState(430);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerythonListener ) ((VerythonListener)listener).enterAnd_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerythonListener ) ((VerythonListener)listener).exitAnd_expr(this);
		}
	}

	public final And_exprContext and_expr() throws RecognitionException {
		And_exprContext _localctx = new And_exprContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_and_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(431);
			shift_expr();
			setState(436);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND_OP) {
				{
				{
				setState(432);
				match(AND_OP);
				setState(433);
				shift_expr();
				}
				}
				setState(438);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerythonListener ) ((VerythonListener)listener).enterShift_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerythonListener ) ((VerythonListener)listener).exitShift_expr(this);
		}
	}

	public final Shift_exprContext shift_expr() throws RecognitionException {
		Shift_exprContext _localctx = new Shift_exprContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_shift_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(439);
			arith_expr();
			setState(446);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LEFT_SHIFT || _la==RIGHT_SHIFT) {
				{
				setState(444);
				switch (_input.LA(1)) {
				case LEFT_SHIFT:
					{
					setState(440);
					match(LEFT_SHIFT);
					setState(441);
					arith_expr();
					}
					break;
				case RIGHT_SHIFT:
					{
					setState(442);
					match(RIGHT_SHIFT);
					setState(443);
					arith_expr();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(448);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerythonListener ) ((VerythonListener)listener).enterArith_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerythonListener ) ((VerythonListener)listener).exitArith_expr(this);
		}
	}

	public final Arith_exprContext arith_expr() throws RecognitionException {
		Arith_exprContext _localctx = new Arith_exprContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_arith_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(449);
			term();
			setState(456);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ADD || _la==MINUS) {
				{
				setState(454);
				switch (_input.LA(1)) {
				case ADD:
					{
					setState(450);
					match(ADD);
					setState(451);
					term();
					}
					break;
				case MINUS:
					{
					setState(452);
					match(MINUS);
					setState(453);
					term();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(458);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerythonListener ) ((VerythonListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerythonListener ) ((VerythonListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(459);
			factor();
			setState(468);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR) | (1L << DIV) | (1L << MOD))) != 0)) {
				{
				setState(466);
				switch (_input.LA(1)) {
				case STAR:
					{
					setState(460);
					match(STAR);
					setState(461);
					factor();
					}
					break;
				case DIV:
					{
					setState(462);
					match(DIV);
					setState(463);
					factor();
					}
					break;
				case MOD:
					{
					setState(464);
					match(MOD);
					setState(465);
					factor();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(470);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerythonListener ) ((VerythonListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerythonListener ) ((VerythonListener)listener).exitFactor(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_factor);
		try {
			setState(478);
			switch (_input.LA(1)) {
			case ADD:
				enterOuterAlt(_localctx, 1);
				{
				setState(471);
				match(ADD);
				setState(472);
				factor();
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(473);
				match(MINUS);
				setState(474);
				factor();
				}
				break;
			case NOT_OP:
				enterOuterAlt(_localctx, 3);
				{
				setState(475);
				match(NOT_OP);
				setState(476);
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
				setState(477);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerythonListener ) ((VerythonListener)listener).enterPower(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerythonListener ) ((VerythonListener)listener).exitPower(this);
		}
	}

	public final PowerContext power() throws RecognitionException {
		PowerContext _localctx = new PowerContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_power);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(480);
			atom();
			setState(484);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DOT) | (1L << OPEN_PAREN) | (1L << OPEN_BRACK))) != 0)) {
				{
				{
				setState(481);
				trailer();
				}
				}
				setState(486);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerythonListener ) ((VerythonListener)listener).enterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerythonListener ) ((VerythonListener)listener).exitAtom(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_atom);
		int _la;
		try {
			setState(508);
			switch (_input.LA(1)) {
			case OPEN_PAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(487);
				match(OPEN_PAREN);
				setState(489);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << NOT) | (1L << NONE) | (1L << TRUE) | (1L << FALSE) | (1L << NAME) | (1L << DECIMAL_INTEGER) | (1L << OCT_INTEGER) | (1L << HEX_INTEGER) | (1L << BIN_INTEGER) | (1L << STAR) | (1L << OPEN_PAREN) | (1L << OPEN_BRACK) | (1L << ADD) | (1L << MINUS) | (1L << NOT_OP) | (1L << OPEN_BRACE))) != 0)) {
					{
					setState(488);
					testlist_comp();
					}
				}

				setState(491);
				match(CLOSE_PAREN);
				}
				break;
			case OPEN_BRACK:
				enterOuterAlt(_localctx, 2);
				{
				setState(492);
				match(OPEN_BRACK);
				setState(494);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << NOT) | (1L << NONE) | (1L << TRUE) | (1L << FALSE) | (1L << NAME) | (1L << DECIMAL_INTEGER) | (1L << OCT_INTEGER) | (1L << HEX_INTEGER) | (1L << BIN_INTEGER) | (1L << STAR) | (1L << OPEN_PAREN) | (1L << OPEN_BRACK) | (1L << ADD) | (1L << MINUS) | (1L << NOT_OP) | (1L << OPEN_BRACE))) != 0)) {
					{
					setState(493);
					testlist_comp();
					}
				}

				setState(496);
				match(CLOSE_BRACK);
				}
				break;
			case OPEN_BRACE:
				enterOuterAlt(_localctx, 3);
				{
				setState(497);
				match(OPEN_BRACE);
				setState(499);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << NOT) | (1L << NONE) | (1L << TRUE) | (1L << FALSE) | (1L << NAME) | (1L << DECIMAL_INTEGER) | (1L << OCT_INTEGER) | (1L << HEX_INTEGER) | (1L << BIN_INTEGER) | (1L << STAR) | (1L << OPEN_PAREN) | (1L << OPEN_BRACK) | (1L << ADD) | (1L << MINUS) | (1L << NOT_OP) | (1L << OPEN_BRACE))) != 0)) {
					{
					setState(498);
					dictorsetmaker();
					}
				}

				setState(501);
				match(CLOSE_BRACE);
				}
				break;
			case NAME:
				enterOuterAlt(_localctx, 4);
				{
				setState(502);
				match(NAME);
				}
				break;
			case DECIMAL_INTEGER:
			case OCT_INTEGER:
			case HEX_INTEGER:
			case BIN_INTEGER:
				enterOuterAlt(_localctx, 5);
				{
				setState(503);
				number();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 6);
				{
				setState(504);
				match(T__0);
				}
				break;
			case NONE:
				enterOuterAlt(_localctx, 7);
				{
				setState(505);
				match(NONE);
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 8);
				{
				setState(506);
				match(TRUE);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 9);
				{
				setState(507);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerythonListener ) ((VerythonListener)listener).enterTestlist_comp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerythonListener ) ((VerythonListener)listener).exitTestlist_comp(this);
		}
	}

	public final Testlist_compContext testlist_comp() throws RecognitionException {
		Testlist_compContext _localctx = new Testlist_compContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_testlist_comp);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(510);
			test();
			setState(522);
			switch (_input.LA(1)) {
			case FOR:
				{
				setState(511);
				comp_for();
				}
				break;
			case CLOSE_PAREN:
			case COMMA:
			case CLOSE_BRACK:
				{
				setState(516);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(512);
						match(COMMA);
						setState(513);
						test();
						}
						} 
					}
					setState(518);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
				}
				setState(520);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(519);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerythonListener ) ((VerythonListener)listener).enterTrailer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerythonListener ) ((VerythonListener)listener).exitTrailer(this);
		}
	}

	public final TrailerContext trailer() throws RecognitionException {
		TrailerContext _localctx = new TrailerContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_trailer);
		int _la;
		try {
			setState(535);
			switch (_input.LA(1)) {
			case OPEN_PAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(524);
				match(OPEN_PAREN);
				setState(526);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << NOT) | (1L << NONE) | (1L << TRUE) | (1L << FALSE) | (1L << NAME) | (1L << DECIMAL_INTEGER) | (1L << OCT_INTEGER) | (1L << HEX_INTEGER) | (1L << BIN_INTEGER) | (1L << STAR) | (1L << OPEN_PAREN) | (1L << OPEN_BRACK) | (1L << ADD) | (1L << MINUS) | (1L << NOT_OP) | (1L << OPEN_BRACE))) != 0)) {
					{
					setState(525);
					arglist();
					}
				}

				setState(528);
				match(CLOSE_PAREN);
				}
				break;
			case OPEN_BRACK:
				enterOuterAlt(_localctx, 2);
				{
				setState(529);
				match(OPEN_BRACK);
				setState(530);
				subscriptlist();
				setState(531);
				match(CLOSE_BRACK);
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 3);
				{
				setState(533);
				match(DOT);
				setState(534);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerythonListener ) ((VerythonListener)listener).enterSubscriptlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerythonListener ) ((VerythonListener)listener).exitSubscriptlist(this);
		}
	}

	public final SubscriptlistContext subscriptlist() throws RecognitionException {
		SubscriptlistContext _localctx = new SubscriptlistContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_subscriptlist);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(537);
			subscript();
			setState(542);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(538);
					match(COMMA);
					setState(539);
					subscript();
					}
					} 
				}
				setState(544);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
			}
			setState(546);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(545);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerythonListener ) ((VerythonListener)listener).enterSubscript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerythonListener ) ((VerythonListener)listener).exitSubscript(this);
		}
	}

	public final SubscriptContext subscript() throws RecognitionException {
		SubscriptContext _localctx = new SubscriptContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_subscript);
		int _la;
		try {
			setState(559);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(548);
				test();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(550);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << NOT) | (1L << NONE) | (1L << TRUE) | (1L << FALSE) | (1L << NAME) | (1L << DECIMAL_INTEGER) | (1L << OCT_INTEGER) | (1L << HEX_INTEGER) | (1L << BIN_INTEGER) | (1L << STAR) | (1L << OPEN_PAREN) | (1L << OPEN_BRACK) | (1L << ADD) | (1L << MINUS) | (1L << NOT_OP) | (1L << OPEN_BRACE))) != 0)) {
					{
					setState(549);
					test();
					}
				}

				setState(552);
				match(COLON);
				setState(554);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << NOT) | (1L << NONE) | (1L << TRUE) | (1L << FALSE) | (1L << NAME) | (1L << DECIMAL_INTEGER) | (1L << OCT_INTEGER) | (1L << HEX_INTEGER) | (1L << BIN_INTEGER) | (1L << STAR) | (1L << OPEN_PAREN) | (1L << OPEN_BRACK) | (1L << ADD) | (1L << MINUS) | (1L << NOT_OP) | (1L << OPEN_BRACE))) != 0)) {
					{
					setState(553);
					test();
					}
				}

				setState(557);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(556);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerythonListener ) ((VerythonListener)listener).enterSliceop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerythonListener ) ((VerythonListener)listener).exitSliceop(this);
		}
	}

	public final SliceopContext sliceop() throws RecognitionException {
		SliceopContext _localctx = new SliceopContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_sliceop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(561);
			match(COLON);
			setState(563);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << NOT) | (1L << NONE) | (1L << TRUE) | (1L << FALSE) | (1L << NAME) | (1L << DECIMAL_INTEGER) | (1L << OCT_INTEGER) | (1L << HEX_INTEGER) | (1L << BIN_INTEGER) | (1L << STAR) | (1L << OPEN_PAREN) | (1L << OPEN_BRACK) | (1L << ADD) | (1L << MINUS) | (1L << NOT_OP) | (1L << OPEN_BRACE))) != 0)) {
				{
				setState(562);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerythonListener ) ((VerythonListener)listener).enterExprlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerythonListener ) ((VerythonListener)listener).exitExprlist(this);
		}
	}

	public final ExprlistContext exprlist() throws RecognitionException {
		ExprlistContext _localctx = new ExprlistContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_exprlist);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(565);
			star_expr();
			setState(570);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(566);
					match(COMMA);
					setState(567);
					star_expr();
					}
					} 
				}
				setState(572);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
			}
			setState(574);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(573);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerythonListener ) ((VerythonListener)listener).enterTestlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerythonListener ) ((VerythonListener)listener).exitTestlist(this);
		}
	}

	public final TestlistContext testlist() throws RecognitionException {
		TestlistContext _localctx = new TestlistContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_testlist);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(576);
			test();
			setState(581);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(577);
					match(COMMA);
					setState(578);
					test();
					}
					} 
				}
				setState(583);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			}
			setState(585);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(584);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerythonListener ) ((VerythonListener)listener).enterDictorsetmaker(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerythonListener ) ((VerythonListener)listener).exitDictorsetmaker(this);
		}
	}

	public final DictorsetmakerContext dictorsetmaker() throws RecognitionException {
		DictorsetmakerContext _localctx = new DictorsetmakerContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_dictorsetmaker);
		int _la;
		try {
			int _alt;
			setState(620);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(587);
				test();
				setState(588);
				match(COLON);
				setState(589);
				test();
				setState(604);
				switch (_input.LA(1)) {
				case FOR:
					{
					setState(590);
					comp_for();
					}
					break;
				case COMMA:
				case CLOSE_BRACE:
					{
					setState(598);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(591);
							match(COMMA);
							setState(592);
							test();
							setState(593);
							match(COLON);
							setState(594);
							test();
							}
							} 
						}
						setState(600);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
					}
					setState(602);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(601);
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
				setState(606);
				test();
				setState(618);
				switch (_input.LA(1)) {
				case FOR:
					{
					setState(607);
					comp_for();
					}
					break;
				case COMMA:
				case CLOSE_BRACE:
					{
					setState(612);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(608);
							match(COMMA);
							setState(609);
							test();
							}
							} 
						}
						setState(614);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
					}
					setState(616);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(615);
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
		public TestContext test() {
			return getRuleContext(TestContext.class,0);
		}
		public ArglistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arglist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerythonListener ) ((VerythonListener)listener).enterArglist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerythonListener ) ((VerythonListener)listener).exitArglist(this);
		}
	}

	public final ArglistContext arglist() throws RecognitionException {
		ArglistContext _localctx = new ArglistContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_arglist);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(627);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(622);
					argument();
					setState(623);
					match(COMMA);
					}
					} 
				}
				setState(629);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
			}
			setState(643);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				{
				setState(630);
				argument();
				setState(632);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(631);
					match(COMMA);
					}
				}

				}
				break;
			case 2:
				{
				setState(634);
				match(STAR);
				setState(635);
				test();
				setState(640);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(636);
					match(COMMA);
					setState(637);
					argument();
					}
					}
					setState(642);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerythonListener ) ((VerythonListener)listener).enterArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerythonListener ) ((VerythonListener)listener).exitArgument(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_argument);
		int _la;
		try {
			setState(653);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(645);
				test();
				setState(647);
				_la = _input.LA(1);
				if (_la==FOR) {
					{
					setState(646);
					comp_for();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(649);
				test();
				setState(650);
				match(ASSIGN);
				setState(651);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerythonListener ) ((VerythonListener)listener).enterComp_iter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerythonListener ) ((VerythonListener)listener).exitComp_iter(this);
		}
	}

	public final Comp_iterContext comp_iter() throws RecognitionException {
		Comp_iterContext _localctx = new Comp_iterContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_comp_iter);
		try {
			setState(657);
			switch (_input.LA(1)) {
			case FOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(655);
				comp_for();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(656);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerythonListener ) ((VerythonListener)listener).enterComp_for(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerythonListener ) ((VerythonListener)listener).exitComp_for(this);
		}
	}

	public final Comp_forContext comp_for() throws RecognitionException {
		Comp_forContext _localctx = new Comp_forContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_comp_for);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(659);
			match(FOR);
			setState(660);
			exprlist();
			setState(661);
			match(IN);
			setState(662);
			or_test();
			setState(664);
			_la = _input.LA(1);
			if (_la==IF || _la==FOR) {
				{
				setState(663);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerythonListener ) ((VerythonListener)listener).enterComp_if(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerythonListener ) ((VerythonListener)listener).exitComp_if(this);
		}
	}

	public final Comp_ifContext comp_if() throws RecognitionException {
		Comp_ifContext _localctx = new Comp_ifContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_comp_if);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(666);
			match(IF);
			setState(667);
			or_test();
			setState(669);
			_la = _input.LA(1);
			if (_la==IF || _la==FOR) {
				{
				setState(668);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerythonListener ) ((VerythonListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerythonListener ) ((VerythonListener)listener).exitNumber(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(671);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3M\u02a4\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\3\2\3\2\7\2w\n\2\f"+
		"\2\16\2z\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\5\4\u0087\n"+
		"\4\3\4\5\4\u008a\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\5\6\u0094\n\6\3\6"+
		"\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u00a5\n\7"+
		"\f\7\16\7\u00a8\13\7\3\b\3\b\3\b\5\b\u00ad\n\b\3\t\3\t\5\t\u00b1\n\t\3"+
		"\n\3\n\3\n\7\n\u00b6\n\n\f\n\16\n\u00b9\13\n\3\n\5\n\u00bc\n\n\3\n\3\n"+
		"\3\13\3\13\3\13\3\13\5\13\u00c4\n\13\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00cc"+
		"\n\f\f\f\16\f\u00cf\13\f\5\f\u00d1\n\f\3\r\3\r\5\r\u00d5\n\r\3\r\3\r\3"+
		"\r\5\r\u00da\n\r\7\r\u00dc\n\r\f\r\16\r\u00df\13\r\3\r\5\r\u00e2\n\r\3"+
		"\16\3\16\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\21\5\21\u00ee\n\21\3\22"+
		"\3\22\3\23\3\23\3\24\3\24\5\24\u00f6\n\24\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\5\25\u00fe\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u0109"+
		"\n\26\f\26\16\26\u010c\13\26\3\26\3\26\3\26\5\26\u0111\n\26\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\5\31\u0125\n\31\3\31\5\31\u0128\n\31\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\5\31\u0131\n\31\3\31\5\31\u0134\n\31\7\31\u0136\n\31\f\31"+
		"\16\31\u0139\13\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0141\n\31\3\31"+
		"\5\31\u0144\n\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u014f"+
		"\n\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u015a\n\33\3\34"+
		"\3\34\3\34\3\34\6\34\u0160\n\34\r\34\16\34\u0161\3\34\3\34\5\34\u0166"+
		"\n\34\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u016e\n\35\3\36\3\36\3\36\7\36"+
		"\u0173\n\36\f\36\16\36\u0176\13\36\3\37\3\37\3\37\7\37\u017b\n\37\f\37"+
		"\16\37\u017e\13\37\3 \3 \3 \5 \u0183\n \3!\3!\3!\3!\7!\u0189\n!\f!\16"+
		"!\u018c\13!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u019b"+
		"\n\"\3#\5#\u019e\n#\3#\3#\3$\3$\3$\7$\u01a5\n$\f$\16$\u01a8\13$\3%\3%"+
		"\3%\7%\u01ad\n%\f%\16%\u01b0\13%\3&\3&\3&\7&\u01b5\n&\f&\16&\u01b8\13"+
		"&\3\'\3\'\3\'\3\'\3\'\7\'\u01bf\n\'\f\'\16\'\u01c2\13\'\3(\3(\3(\3(\3"+
		"(\7(\u01c9\n(\f(\16(\u01cc\13(\3)\3)\3)\3)\3)\3)\3)\7)\u01d5\n)\f)\16"+
		")\u01d8\13)\3*\3*\3*\3*\3*\3*\3*\5*\u01e1\n*\3+\3+\7+\u01e5\n+\f+\16+"+
		"\u01e8\13+\3,\3,\5,\u01ec\n,\3,\3,\3,\5,\u01f1\n,\3,\3,\3,\5,\u01f6\n"+
		",\3,\3,\3,\3,\3,\3,\3,\5,\u01ff\n,\3-\3-\3-\3-\7-\u0205\n-\f-\16-\u0208"+
		"\13-\3-\5-\u020b\n-\5-\u020d\n-\3.\3.\5.\u0211\n.\3.\3.\3.\3.\3.\3.\3"+
		".\5.\u021a\n.\3/\3/\3/\7/\u021f\n/\f/\16/\u0222\13/\3/\5/\u0225\n/\3\60"+
		"\3\60\5\60\u0229\n\60\3\60\3\60\5\60\u022d\n\60\3\60\5\60\u0230\n\60\5"+
		"\60\u0232\n\60\3\61\3\61\5\61\u0236\n\61\3\62\3\62\3\62\7\62\u023b\n\62"+
		"\f\62\16\62\u023e\13\62\3\62\5\62\u0241\n\62\3\63\3\63\3\63\7\63\u0246"+
		"\n\63\f\63\16\63\u0249\13\63\3\63\5\63\u024c\n\63\3\64\3\64\3\64\3\64"+
		"\3\64\3\64\3\64\3\64\3\64\7\64\u0257\n\64\f\64\16\64\u025a\13\64\3\64"+
		"\5\64\u025d\n\64\5\64\u025f\n\64\3\64\3\64\3\64\3\64\7\64\u0265\n\64\f"+
		"\64\16\64\u0268\13\64\3\64\5\64\u026b\n\64\5\64\u026d\n\64\5\64\u026f"+
		"\n\64\3\65\3\65\3\65\7\65\u0274\n\65\f\65\16\65\u0277\13\65\3\65\3\65"+
		"\5\65\u027b\n\65\3\65\3\65\3\65\3\65\7\65\u0281\n\65\f\65\16\65\u0284"+
		"\13\65\5\65\u0286\n\65\3\66\3\66\5\66\u028a\n\66\3\66\3\66\3\66\3\66\5"+
		"\66\u0290\n\66\3\67\3\67\5\67\u0294\n\67\38\38\38\38\38\58\u029b\n8\3"+
		"9\39\39\59\u02a0\n9\3:\3:\3:\2\2;\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnpr\2\4\3\2=F\3\2"+
		"\34\37\u02dd\2x\3\2\2\2\4}\3\2\2\2\6\u0089\3\2\2\2\b\u008b\3\2\2\2\n\u0091"+
		"\3\2\2\2\f\u0097\3\2\2\2\16\u00a9\3\2\2\2\20\u00b0\3\2\2\2\22\u00b2\3"+
		"\2\2\2\24\u00c3\3\2\2\2\26\u00c5\3\2\2\2\30\u00d4\3\2\2\2\32\u00e3\3\2"+
		"\2\2\34\u00e5\3\2\2\2\36\u00e8\3\2\2\2 \u00ed\3\2\2\2\"\u00ef\3\2\2\2"+
		"$\u00f1\3\2\2\2&\u00f3\3\2\2\2(\u00fd\3\2\2\2*\u00ff\3\2\2\2,\u0112\3"+
		"\2\2\2.\u0119\3\2\2\2\60\u011e\3\2\2\2\62\u0147\3\2\2\2\64\u0150\3\2\2"+
		"\2\66\u0165\3\2\2\28\u0167\3\2\2\2:\u016f\3\2\2\2<\u0177\3\2\2\2>\u0182"+
		"\3\2\2\2@\u0184\3\2\2\2B\u019a\3\2\2\2D\u019d\3\2\2\2F\u01a1\3\2\2\2H"+
		"\u01a9\3\2\2\2J\u01b1\3\2\2\2L\u01b9\3\2\2\2N\u01c3\3\2\2\2P\u01cd\3\2"+
		"\2\2R\u01e0\3\2\2\2T\u01e2\3\2\2\2V\u01fe\3\2\2\2X\u0200\3\2\2\2Z\u0219"+
		"\3\2\2\2\\\u021b\3\2\2\2^\u0231\3\2\2\2`\u0233\3\2\2\2b\u0237\3\2\2\2"+
		"d\u0242\3\2\2\2f\u026e\3\2\2\2h\u0275\3\2\2\2j\u028f\3\2\2\2l\u0293\3"+
		"\2\2\2n\u0295\3\2\2\2p\u029c\3\2\2\2r\u02a1\3\2\2\2tw\7\32\2\2uw\5\20"+
		"\t\2vt\3\2\2\2vu\3\2\2\2wz\3\2\2\2xv\3\2\2\2xy\3\2\2\2y{\3\2\2\2zx\3\2"+
		"\2\2{|\7\2\2\3|\3\3\2\2\2}~\5\6\4\2~\177\7\32\2\2\177\u0080\5\b\5\2\u0080"+
		"\5\3\2\2\2\u0081\u008a\7G\2\2\u0082\u008a\7H\2\2\u0083\u0084\7I\2\2\u0084"+
		"\u0086\7\"\2\2\u0085\u0087\5h\65\2\u0086\u0085\3\2\2\2\u0086\u0087\3\2"+
		"\2\2\u0087\u0088\3\2\2\2\u0088\u008a\7#\2\2\u0089\u0081\3\2\2\2\u0089"+
		"\u0082\3\2\2\2\u0089\u0083\3\2\2\2\u008a\7\3\2\2\2\u008b\u008c\7\4\2\2"+
		"\u008c\u008d\7\33\2\2\u008d\u008e\5\n\6\2\u008e\u008f\7%\2\2\u008f\u0090"+
		"\5\66\34\2\u0090\t\3\2\2\2\u0091\u0093\7\"\2\2\u0092\u0094\5\f\7\2\u0093"+
		"\u0092\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0096\7#"+
		"\2\2\u0096\13\3\2\2\2\u0097\u0098\7(\2\2\u0098\u0099\7\34\2\2\u0099\u009a"+
		"\7%\2\2\u009a\u009b\7\34\2\2\u009b\u009c\7)\2\2\u009c\u00a6\5\16\b\2\u009d"+
		"\u009e\7$\2\2\u009e\u009f\7(\2\2\u009f\u00a0\7\34\2\2\u00a0\u00a1\7%\2"+
		"\2\u00a1\u00a2\7\34\2\2\u00a2\u00a3\7)\2\2\u00a3\u00a5\5\16\b\2\u00a4"+
		"\u009d\3\2\2\2\u00a5\u00a8\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2"+
		"\2\2\u00a7\r\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a9\u00ac\7\33\2\2\u00aa\u00ab"+
		"\7%\2\2\u00ab\u00ad\58\35\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad"+
		"\17\3\2\2\2\u00ae\u00b1\5\22\n\2\u00af\u00b1\5(\25\2\u00b0\u00ae\3\2\2"+
		"\2\u00b0\u00af\3\2\2\2\u00b1\21\3\2\2\2\u00b2\u00b7\5\24\13\2\u00b3\u00b4"+
		"\7&\2\2\u00b4\u00b6\5\24\13\2\u00b5\u00b3\3\2\2\2\u00b6\u00b9\3\2\2\2"+
		"\u00b7\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00bb\3\2\2\2\u00b9\u00b7"+
		"\3\2\2\2\u00ba\u00bc\7&\2\2\u00bb\u00ba\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc"+
		"\u00bd\3\2\2\2\u00bd\u00be\7\32\2\2\u00be\23\3\2\2\2\u00bf\u00c4\5\26"+
		"\f\2\u00c0\u00c4\5\34\17\2\u00c1\u00c4\5\36\20\2\u00c2\u00c4\5 \21\2\u00c3"+
		"\u00bf\3\2\2\2\u00c3\u00c0\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c2\3\2"+
		"\2\2\u00c4\25\3\2\2\2\u00c5\u00d0\5\30\r\2\u00c6\u00c7\5\32\16\2\u00c7"+
		"\u00c8\5d\63\2\u00c8\u00d1\3\2\2\2\u00c9\u00ca\7\'\2\2\u00ca\u00cc\5\30"+
		"\r\2\u00cb\u00c9\3\2\2\2\u00cc\u00cf\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd"+
		"\u00ce\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf\u00cd\3\2\2\2\u00d0\u00c6\3\2"+
		"\2\2\u00d0\u00cd\3\2\2\2\u00d1\27\3\2\2\2\u00d2\u00d5\58\35\2\u00d3\u00d5"+
		"\5D#\2\u00d4\u00d2\3\2\2\2\u00d4\u00d3\3\2\2\2\u00d5\u00dd\3\2\2\2\u00d6"+
		"\u00d9\7$\2\2\u00d7\u00da\58\35\2\u00d8\u00da\5D#\2\u00d9\u00d7\3\2\2"+
		"\2\u00d9\u00d8\3\2\2\2\u00da\u00dc\3\2\2\2\u00db\u00d6\3\2\2\2\u00dc\u00df"+
		"\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00e1\3\2\2\2\u00df"+
		"\u00dd\3\2\2\2\u00e0\u00e2\7$\2\2\u00e1\u00e0\3\2\2\2\u00e1\u00e2\3\2"+
		"\2\2\u00e2\31\3\2\2\2\u00e3\u00e4\t\2\2\2\u00e4\33\3\2\2\2\u00e5\u00e6"+
		"\7\26\2\2\u00e6\u00e7\5b\62\2\u00e7\35\3\2\2\2\u00e8\u00e9\7\27\2\2\u00e9"+
		"\37\3\2\2\2\u00ea\u00ee\5\"\22\2\u00eb\u00ee\5$\23\2\u00ec\u00ee\5&\24"+
		"\2\u00ed\u00ea\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ec\3\2\2\2\u00ee!"+
		"\3\2\2\2\u00ef\u00f0\7\31\2\2\u00f0#\3\2\2\2\u00f1\u00f2\7\30\2\2\u00f2"+
		"%\3\2\2\2\u00f3\u00f5\7\5\2\2\u00f4\u00f6\5d\63\2\u00f5\u00f4\3\2\2\2"+
		"\u00f5\u00f6\3\2\2\2\u00f6\'\3\2\2\2\u00f7\u00fe\5*\26\2\u00f8\u00fe\5"+
		",\27\2\u00f9\u00fe\5\62\32\2\u00fa\u00fe\5\64\33\2\u00fb\u00fe\5\b\5\2"+
		"\u00fc\u00fe\5\4\3\2\u00fd\u00f7\3\2\2\2\u00fd\u00f8\3\2\2\2\u00fd\u00f9"+
		"\3\2\2\2\u00fd\u00fa\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd\u00fc\3\2\2\2\u00fe"+
		")\3\2\2\2\u00ff\u0100\7\6\2\2\u0100\u0101\58\35\2\u0101\u0102\7%\2\2\u0102"+
		"\u010a\5\66\34\2\u0103\u0104\7\7\2\2\u0104\u0105\58\35\2\u0105\u0106\7"+
		"%\2\2\u0106\u0107\5\66\34\2\u0107\u0109\3\2\2\2\u0108\u0103\3\2\2\2\u0109"+
		"\u010c\3\2\2\2\u010a\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u0110\3\2"+
		"\2\2\u010c\u010a\3\2\2\2\u010d\u010e\7\b\2\2\u010e\u010f\7%\2\2\u010f"+
		"\u0111\5\66\34\2\u0110\u010d\3\2\2\2\u0110\u0111\3\2\2\2\u0111+\3\2\2"+
		"\2\u0112\u0113\7\t\2\2\u0113\u0114\7\"\2\2\u0114\u0115\7\33\2\2\u0115"+
		"\u0116\7#\2\2\u0116\u0117\7%\2\2\u0117\u0118\5.\30\2\u0118-\3\2\2\2\u0119"+
		"\u011a\7\32\2\2\u011a\u011b\7L\2\2\u011b\u011c\5\60\31\2\u011c\u011d\7"+
		"M\2\2\u011d/\3\2\2\2\u011e\u011f\7\n\2\2\u011f\u0120\5r:\2\u0120\u0127"+
		"\7%\2\2\u0121\u0124\7\5\2\2\u0122\u0125\7\33\2\2\u0123\u0125\5r:\2\u0124"+
		"\u0122\3\2\2\2\u0124\u0123\3\2\2\2\u0125\u0128\3\2\2\2\u0126\u0128\5\26"+
		"\f\2\u0127\u0121\3\2\2\2\u0127\u0126\3\2\2\2\u0128\u0137\3\2\2\2\u0129"+
		"\u012a\7\32\2\2\u012a\u012b\7\n\2\2\u012b\u012c\5r:\2\u012c\u0133\7%\2"+
		"\2\u012d\u0130\7\5\2\2\u012e\u0131\7\33\2\2\u012f\u0131\5r:\2\u0130\u012e"+
		"\3\2\2\2\u0130\u012f\3\2\2\2\u0131\u0134\3\2\2\2\u0132\u0134\5\26\f\2"+
		"\u0133\u012d\3\2\2\2\u0133\u0132\3\2\2\2\u0134\u0136\3\2\2\2\u0135\u0129"+
		"\3\2\2\2\u0136\u0139\3\2\2\2\u0137\u0135\3\2\2\2\u0137\u0138\3\2\2\2\u0138"+
		"\u013a\3\2\2\2\u0139\u0137\3\2\2\2\u013a\u013b\7\32\2\2\u013b\u013c\7"+
		"\13\2\2\u013c\u0143\7%\2\2\u013d\u0140\7\5\2\2\u013e\u0141\7\33\2\2\u013f"+
		"\u0141\5r:\2\u0140\u013e\3\2\2\2\u0140\u013f\3\2\2\2\u0141\u0144\3\2\2"+
		"\2\u0142\u0144\5\26\f\2\u0143\u013d\3\2\2\2\u0143\u0142\3\2\2\2\u0144"+
		"\u0145\3\2\2\2\u0145\u0146\7\32\2\2\u0146\61\3\2\2\2\u0147\u0148\7\f\2"+
		"\2\u0148\u0149\58\35\2\u0149\u014a\7%\2\2\u014a\u014e\5\66\34\2\u014b"+
		"\u014c\7\b\2\2\u014c\u014d\7%\2\2\u014d\u014f\5\66\34\2\u014e\u014b\3"+
		"\2\2\2\u014e\u014f\3\2\2\2\u014f\63\3\2\2\2\u0150\u0151\7\r\2\2\u0151"+
		"\u0152\5b\62\2\u0152\u0153\7\16\2\2\u0153\u0154\5d\63\2\u0154\u0155\7"+
		"%\2\2\u0155\u0159\5\66\34\2\u0156\u0157\7\b\2\2\u0157\u0158\7%\2\2\u0158"+
		"\u015a\5\66\34\2\u0159\u0156\3\2\2\2\u0159\u015a\3\2\2\2\u015a\65\3\2"+
		"\2\2\u015b\u0166\5\22\n\2\u015c\u015d\7\32\2\2\u015d\u015f\7L\2\2\u015e"+
		"\u0160\5\20\t\2\u015f\u015e\3\2\2\2\u0160\u0161\3\2\2\2\u0161\u015f\3"+
		"\2\2\2\u0161\u0162\3\2\2\2\u0162\u0163\3\2\2\2\u0163\u0164\7M\2\2\u0164"+
		"\u0166\3\2\2\2\u0165\u015b\3\2\2\2\u0165\u015c\3\2\2\2\u0166\67\3\2\2"+
		"\2\u0167\u016d\5:\36\2\u0168\u0169\7\6\2\2\u0169\u016a\5:\36\2\u016a\u016b"+
		"\7\b\2\2\u016b\u016c\58\35\2\u016c\u016e\3\2\2\2\u016d\u0168\3\2\2\2\u016d"+
		"\u016e\3\2\2\2\u016e9\3\2\2\2\u016f\u0174\5<\37\2\u0170\u0171\7\17\2\2"+
		"\u0171\u0173\5<\37\2\u0172\u0170\3\2\2\2\u0173\u0176\3\2\2\2\u0174\u0172"+
		"\3\2\2\2\u0174\u0175\3\2\2\2\u0175;\3\2\2\2\u0176\u0174\3\2\2\2\u0177"+
		"\u017c\5> \2\u0178\u0179\7\20\2\2\u0179\u017b\5> \2\u017a\u0178\3\2\2"+
		"\2\u017b\u017e\3\2\2\2\u017c\u017a\3\2\2\2\u017c\u017d\3\2\2\2\u017d="+
		"\3\2\2\2\u017e\u017c\3\2\2\2\u017f\u0180\7\21\2\2\u0180\u0183\5> \2\u0181"+
		"\u0183\5@!\2\u0182\u017f\3\2\2\2\u0182\u0181\3\2\2\2\u0183?\3\2\2\2\u0184"+
		"\u018a\5D#\2\u0185\u0186\5B\"\2\u0186\u0187\5D#\2\u0187\u0189\3\2\2\2"+
		"\u0188\u0185\3\2\2\2\u0189\u018c\3\2\2\2\u018a\u0188\3\2\2\2\u018a\u018b"+
		"\3\2\2\2\u018bA\3\2\2\2\u018c\u018a\3\2\2\2\u018d\u019b\7\66\2\2\u018e"+
		"\u019b\7\67\2\2\u018f\u019b\78\2\2\u0190\u019b\79\2\2\u0191\u019b\7:\2"+
		"\2\u0192\u019b\7;\2\2\u0193\u019b\7<\2\2\u0194\u019b\7\16\2\2\u0195\u0196"+
		"\7\21\2\2\u0196\u019b\7\16\2\2\u0197\u019b\7\22\2\2\u0198\u0199\7\22\2"+
		"\2\u0199\u019b\7\21\2\2\u019a\u018d\3\2\2\2\u019a\u018e\3\2\2\2\u019a"+
		"\u018f\3\2\2\2\u019a\u0190\3\2\2\2\u019a\u0191\3\2\2\2\u019a\u0192\3\2"+
		"\2\2\u019a\u0193\3\2\2\2\u019a\u0194\3\2\2\2\u019a\u0195\3\2\2\2\u019a"+
		"\u0197\3\2\2\2\u019a\u0198\3\2\2\2\u019bC\3\2\2\2\u019c\u019e\7!\2\2\u019d"+
		"\u019c\3\2\2\2\u019d\u019e\3\2\2\2\u019e\u019f\3\2\2\2\u019f\u01a0\5F"+
		"$\2\u01a0E\3\2\2\2\u01a1\u01a6\5H%\2\u01a2\u01a3\7*\2\2\u01a3\u01a5\5"+
		"H%\2\u01a4\u01a2\3\2\2\2\u01a5\u01a8\3\2\2\2\u01a6\u01a4\3\2\2\2\u01a6"+
		"\u01a7\3\2\2\2\u01a7G\3\2\2\2\u01a8\u01a6\3\2\2\2\u01a9\u01ae\5J&\2\u01aa"+
		"\u01ab\7+\2\2\u01ab\u01ad\5J&\2\u01ac\u01aa\3\2\2\2\u01ad\u01b0\3\2\2"+
		"\2\u01ae\u01ac\3\2\2\2\u01ae\u01af\3\2\2\2\u01afI\3\2\2\2\u01b0\u01ae"+
		"\3\2\2\2\u01b1\u01b6\5L\'\2\u01b2\u01b3\7,\2\2\u01b3\u01b5\5L\'\2\u01b4"+
		"\u01b2\3\2\2\2\u01b5\u01b8\3\2\2\2\u01b6\u01b4\3\2\2\2\u01b6\u01b7\3\2"+
		"\2\2\u01b7K\3\2\2\2\u01b8\u01b6\3\2\2\2\u01b9\u01c0\5N(\2\u01ba\u01bb"+
		"\7-\2\2\u01bb\u01bf\5N(\2\u01bc\u01bd\7.\2\2\u01bd\u01bf\5N(\2\u01be\u01ba"+
		"\3\2\2\2\u01be\u01bc\3\2\2\2\u01bf\u01c2\3\2\2\2\u01c0\u01be\3\2\2\2\u01c0"+
		"\u01c1\3\2\2\2\u01c1M\3\2\2\2\u01c2\u01c0\3\2\2\2\u01c3\u01ca\5P)\2\u01c4"+
		"\u01c5\7/\2\2\u01c5\u01c9\5P)\2\u01c6\u01c7\7\60\2\2\u01c7\u01c9\5P)\2"+
		"\u01c8\u01c4\3\2\2\2\u01c8\u01c6\3\2\2\2\u01c9\u01cc\3\2\2\2\u01ca\u01c8"+
		"\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cbO\3\2\2\2\u01cc\u01ca\3\2\2\2\u01cd"+
		"\u01d6\5R*\2\u01ce\u01cf\7!\2\2\u01cf\u01d5\5R*\2\u01d0\u01d1\7\61\2\2"+
		"\u01d1\u01d5\5R*\2\u01d2\u01d3\7\62\2\2\u01d3\u01d5\5R*\2\u01d4\u01ce"+
		"\3\2\2\2\u01d4\u01d0\3\2\2\2\u01d4\u01d2\3\2\2\2\u01d5\u01d8\3\2\2\2\u01d6"+
		"\u01d4\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7Q\3\2\2\2\u01d8\u01d6\3\2\2\2"+
		"\u01d9\u01da\7/\2\2\u01da\u01e1\5R*\2\u01db\u01dc\7\60\2\2\u01dc\u01e1"+
		"\5R*\2\u01dd\u01de\7\63\2\2\u01de\u01e1\5R*\2\u01df\u01e1\5T+\2\u01e0"+
		"\u01d9\3\2\2\2\u01e0\u01db\3\2\2\2\u01e0\u01dd\3\2\2\2\u01e0\u01df\3\2"+
		"\2\2\u01e1S\3\2\2\2\u01e2\u01e6\5V,\2\u01e3\u01e5\5Z.\2\u01e4\u01e3\3"+
		"\2\2\2\u01e5\u01e8\3\2\2\2\u01e6\u01e4\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7"+
		"U\3\2\2\2\u01e8\u01e6\3\2\2\2\u01e9\u01eb\7\"\2\2\u01ea\u01ec\5X-\2\u01eb"+
		"\u01ea\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed\u01ff\7#"+
		"\2\2\u01ee\u01f0\7(\2\2\u01ef\u01f1\5X-\2\u01f0\u01ef\3\2\2\2\u01f0\u01f1"+
		"\3\2\2\2\u01f1\u01f2\3\2\2\2\u01f2\u01ff\7)\2\2\u01f3\u01f5\7\64\2\2\u01f4"+
		"\u01f6\5f\64\2\u01f5\u01f4\3\2\2\2\u01f5\u01f6\3\2\2\2\u01f6\u01f7\3\2"+
		"\2\2\u01f7\u01ff\7\65\2\2\u01f8\u01ff\7\33\2\2\u01f9\u01ff\5r:\2\u01fa"+
		"\u01ff\7\3\2\2\u01fb\u01ff\7\23\2\2\u01fc\u01ff\7\24\2\2\u01fd\u01ff\7"+
		"\25\2\2\u01fe\u01e9\3\2\2\2\u01fe\u01ee\3\2\2\2\u01fe\u01f3\3\2\2\2\u01fe"+
		"\u01f8\3\2\2\2\u01fe\u01f9\3\2\2\2\u01fe\u01fa\3\2\2\2\u01fe\u01fb\3\2"+
		"\2\2\u01fe\u01fc\3\2\2\2\u01fe\u01fd\3\2\2\2\u01ffW\3\2\2\2\u0200\u020c"+
		"\58\35\2\u0201\u020d\5n8\2\u0202\u0203\7$\2\2\u0203\u0205\58\35\2\u0204"+
		"\u0202\3\2\2\2\u0205\u0208\3\2\2\2\u0206\u0204\3\2\2\2\u0206\u0207\3\2"+
		"\2\2\u0207\u020a\3\2\2\2\u0208\u0206\3\2\2\2\u0209\u020b\7$\2\2\u020a"+
		"\u0209\3\2\2\2\u020a\u020b\3\2\2\2\u020b\u020d\3\2\2\2\u020c\u0201\3\2"+
		"\2\2\u020c\u0206\3\2\2\2\u020dY\3\2\2\2\u020e\u0210\7\"\2\2\u020f\u0211"+
		"\5h\65\2\u0210\u020f\3\2\2\2\u0210\u0211\3\2\2\2\u0211\u0212\3\2\2\2\u0212"+
		"\u021a\7#\2\2\u0213\u0214\7(\2\2\u0214\u0215\5\\/\2\u0215\u0216\7)\2\2"+
		"\u0216\u021a\3\2\2\2\u0217\u0218\7 \2\2\u0218\u021a\7\33\2\2\u0219\u020e"+
		"\3\2\2\2\u0219\u0213\3\2\2\2\u0219\u0217\3\2\2\2\u021a[\3\2\2\2\u021b"+
		"\u0220\5^\60\2\u021c\u021d\7$\2\2\u021d\u021f\5^\60\2\u021e\u021c\3\2"+
		"\2\2\u021f\u0222\3\2\2\2\u0220\u021e\3\2\2\2\u0220\u0221\3\2\2\2\u0221"+
		"\u0224\3\2\2\2\u0222\u0220\3\2\2\2\u0223\u0225\7$\2\2\u0224\u0223\3\2"+
		"\2\2\u0224\u0225\3\2\2\2\u0225]\3\2\2\2\u0226\u0232\58\35\2\u0227\u0229"+
		"\58\35\2\u0228\u0227\3\2\2\2\u0228\u0229\3\2\2\2\u0229\u022a\3\2\2\2\u022a"+
		"\u022c\7%\2\2\u022b\u022d\58\35\2\u022c\u022b\3\2\2\2\u022c\u022d\3\2"+
		"\2\2\u022d\u022f\3\2\2\2\u022e\u0230\5`\61\2\u022f\u022e\3\2\2\2\u022f"+
		"\u0230\3\2\2\2\u0230\u0232\3\2\2\2\u0231\u0226\3\2\2\2\u0231\u0228\3\2"+
		"\2\2\u0232_\3\2\2\2\u0233\u0235\7%\2\2\u0234\u0236\58\35\2\u0235\u0234"+
		"\3\2\2\2\u0235\u0236\3\2\2\2\u0236a\3\2\2\2\u0237\u023c\5D#\2\u0238\u0239"+
		"\7$\2\2\u0239\u023b\5D#\2\u023a\u0238\3\2\2\2\u023b\u023e\3\2\2\2\u023c"+
		"\u023a\3\2\2\2\u023c\u023d\3\2\2\2\u023d\u0240\3\2\2\2\u023e\u023c\3\2"+
		"\2\2\u023f\u0241\7$\2\2\u0240\u023f\3\2\2\2\u0240\u0241\3\2\2\2\u0241"+
		"c\3\2\2\2\u0242\u0247\58\35\2\u0243\u0244\7$\2\2\u0244\u0246\58\35\2\u0245"+
		"\u0243\3\2\2\2\u0246\u0249\3\2\2\2\u0247\u0245\3\2\2\2\u0247\u0248\3\2"+
		"\2\2\u0248\u024b\3\2\2\2\u0249\u0247\3\2\2\2\u024a\u024c\7$\2\2\u024b"+
		"\u024a\3\2\2\2\u024b\u024c\3\2\2\2\u024ce\3\2\2\2\u024d\u024e\58\35\2"+
		"\u024e\u024f\7%\2\2\u024f\u025e\58\35\2\u0250\u025f\5n8\2\u0251\u0252"+
		"\7$\2\2\u0252\u0253\58\35\2\u0253\u0254\7%\2\2\u0254\u0255\58\35\2\u0255"+
		"\u0257\3\2\2\2\u0256\u0251\3\2\2\2\u0257\u025a\3\2\2\2\u0258\u0256\3\2"+
		"\2\2\u0258\u0259\3\2\2\2\u0259\u025c\3\2\2\2\u025a\u0258\3\2\2\2\u025b"+
		"\u025d\7$\2\2\u025c\u025b\3\2\2\2\u025c\u025d\3\2\2\2\u025d\u025f\3\2"+
		"\2\2\u025e\u0250\3\2\2\2\u025e\u0258\3\2\2\2\u025f\u026f\3\2\2\2\u0260"+
		"\u026c\58\35\2\u0261\u026d\5n8\2\u0262\u0263\7$\2\2\u0263\u0265\58\35"+
		"\2\u0264\u0262\3\2\2\2\u0265\u0268\3\2\2\2\u0266\u0264\3\2\2\2\u0266\u0267"+
		"\3\2\2\2\u0267\u026a\3\2\2\2\u0268\u0266\3\2\2\2\u0269\u026b\7$\2\2\u026a"+
		"\u0269\3\2\2\2\u026a\u026b\3\2\2\2\u026b\u026d\3\2\2\2\u026c\u0261\3\2"+
		"\2\2\u026c\u0266\3\2\2\2\u026d\u026f\3\2\2\2\u026e\u024d\3\2\2\2\u026e"+
		"\u0260\3\2\2\2\u026fg\3\2\2\2\u0270\u0271\5j\66\2\u0271\u0272\7$\2\2\u0272"+
		"\u0274\3\2\2\2\u0273\u0270\3\2\2\2\u0274\u0277\3\2\2\2\u0275\u0273\3\2"+
		"\2\2\u0275\u0276\3\2\2\2\u0276\u0285\3\2\2\2\u0277\u0275\3\2\2\2\u0278"+
		"\u027a\5j\66\2\u0279\u027b\7$\2\2\u027a\u0279\3\2\2\2\u027a\u027b\3\2"+
		"\2\2\u027b\u0286\3\2\2\2\u027c\u027d\7!\2\2\u027d\u0282\58\35\2\u027e"+
		"\u027f\7$\2\2\u027f\u0281\5j\66\2\u0280\u027e\3\2\2\2\u0281\u0284\3\2"+
		"\2\2\u0282\u0280\3\2\2\2\u0282\u0283\3\2\2\2\u0283\u0286\3\2\2\2\u0284"+
		"\u0282\3\2\2\2\u0285\u0278\3\2\2\2\u0285\u027c\3\2\2\2\u0286i\3\2\2\2"+
		"\u0287\u0289\58\35\2\u0288\u028a\5n8\2\u0289\u0288\3\2\2\2\u0289\u028a"+
		"\3\2\2\2\u028a\u0290\3\2\2\2\u028b\u028c\58\35\2\u028c\u028d\7\'\2\2\u028d"+
		"\u028e\58\35\2\u028e\u0290\3\2\2\2\u028f\u0287\3\2\2\2\u028f\u028b\3\2"+
		"\2\2\u0290k\3\2\2\2\u0291\u0294\5n8\2\u0292\u0294\5p9\2\u0293\u0291\3"+
		"\2\2\2\u0293\u0292\3\2\2\2\u0294m\3\2\2\2\u0295\u0296\7\r\2\2\u0296\u0297"+
		"\5b\62\2\u0297\u0298\7\16\2\2\u0298\u029a\5:\36\2\u0299\u029b\5l\67\2"+
		"\u029a\u0299\3\2\2\2\u029a\u029b\3\2\2\2\u029bo\3\2\2\2\u029c\u029d\7"+
		"\6\2\2\u029d\u029f\5:\36\2\u029e\u02a0\5l\67\2\u029f\u029e\3\2\2\2\u029f"+
		"\u02a0\3\2\2\2\u02a0q\3\2\2\2\u02a1\u02a2\t\3\2\2\u02a2s\3\2\2\2Yvx\u0086"+
		"\u0089\u0093\u00a6\u00ac\u00b0\u00b7\u00bb\u00c3\u00cd\u00d0\u00d4\u00d9"+
		"\u00dd\u00e1\u00ed\u00f5\u00fd\u010a\u0110\u0124\u0127\u0130\u0133\u0137"+
		"\u0140\u0143\u014e\u0159\u0161\u0165\u016d\u0174\u017c\u0182\u018a\u019a"+
		"\u019d\u01a6\u01ae\u01b6\u01be\u01c0\u01c8\u01ca\u01d4\u01d6\u01e0\u01e6"+
		"\u01eb\u01f0\u01f5\u01fe\u0206\u020a\u020c\u0210\u0219\u0220\u0224\u0228"+
		"\u022c\u022f\u0231\u0235\u023c\u0240\u0247\u024b\u0258\u025c\u025e\u0266"+
		"\u026a\u026c\u026e\u0275\u027a\u0282\u0285\u0289\u028f\u0293\u029a\u029f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
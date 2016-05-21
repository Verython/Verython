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
		DEF=1, RETURN=2, IF=3, ELIF=4, ELSE=5, WHILE=6, FOR=7, IN=8, OR=9, AND=10, 
		NOT=11, IS=12, NONE=13, TRUE=14, FALSE=15, DEL=16, PASS=17, CONTINUE=18, 
		BREAK=19, NEWLINE=20, NAME=21, DECIMAL_INTEGER=22, OCT_INTEGER=23, HEX_INTEGER=24, 
		BIN_INTEGER=25, FLOAT_NUMBER=26, IMAG_NUMBER=27, DOT=28, ELLIPSIS=29, 
		STAR=30, OPEN_PAREN=31, CLOSE_PAREN=32, COMMA=33, COLON=34, SEMI_COLON=35, 
		POWER=36, ASSIGN=37, OPEN_BRACK=38, CLOSE_BRACK=39, OR_OP=40, XOR=41, 
		AND_OP=42, LEFT_SHIFT=43, RIGHT_SHIFT=44, ADD=45, MINUS=46, DIV=47, MOD=48, 
		IDIV=49, NOT_OP=50, OPEN_BRACE=51, CLOSE_BRACE=52, LESS_THAN=53, GREATER_THAN=54, 
		EQUALS=55, GT_EQ=56, LT_EQ=57, NOT_EQ_1=58, NOT_EQ_2=59, AT=60, ARROW=61, 
		ADD_ASSIGN=62, SUB_ASSIGN=63, MULT_ASSIGN=64, AT_ASSIGN=65, DIV_ASSIGN=66, 
		MOD_ASSIGN=67, AND_ASSIGN=68, OR_ASSIGN=69, XOR_ASSIGN=70, LEFT_SHIFT_ASSIGN=71, 
		RIGHT_SHIFT_ASSIGN=72, POWER_ASSIGN=73, IDIV_ASSIGN=74, SKIP_=75, UNKNOWN_CHAR=76, 
		INDENT=77, DEDENT=78;
	public static final int
		RULE_initial = 0, RULE_decorator = 1, RULE_decorated = 2, RULE_funcdef = 3, 
		RULE_parameters = 4, RULE_typedargslist = 5, RULE_tfpdef = 6, RULE_stmt = 7, 
		RULE_simple_stmt = 8, RULE_small_stmt = 9, RULE_expr_stmt = 10, RULE_testlist_star_expr = 11, 
		RULE_augassign = 12, RULE_del_stmt = 13, RULE_pass_stmt = 14, RULE_flow_stmt = 15, 
		RULE_break_stmt = 16, RULE_continue_stmt = 17, RULE_return_stmt = 18, 
		RULE_dotted_name = 19, RULE_compound_stmt = 20, RULE_if_stmt = 21, RULE_while_stmt = 22, 
		RULE_for_stmt = 23, RULE_suite = 24, RULE_test = 25, RULE_test_nocond = 26, 
		RULE_or_test = 27, RULE_and_test = 28, RULE_not_test = 29, RULE_comparison = 30, 
		RULE_comp_op = 31, RULE_star_expr = 32, RULE_expr = 33, RULE_xor_expr = 34, 
		RULE_and_expr = 35, RULE_shift_expr = 36, RULE_arith_expr = 37, RULE_term = 38, 
		RULE_factor = 39, RULE_power = 40, RULE_atom = 41, RULE_testlist_comp = 42, 
		RULE_trailer = 43, RULE_subscriptlist = 44, RULE_subscript = 45, RULE_sliceop = 46, 
		RULE_exprlist = 47, RULE_testlist = 48, RULE_dictorsetmaker = 49, RULE_arglist = 50, 
		RULE_argument = 51, RULE_comp_iter = 52, RULE_comp_for = 53, RULE_comp_if = 54, 
		RULE_number = 55, RULE_integer = 56;
	public static final String[] ruleNames = {
		"initial", "decorator", "decorated", "funcdef", "parameters", "typedargslist", 
		"tfpdef", "stmt", "simple_stmt", "small_stmt", "expr_stmt", "testlist_star_expr", 
		"augassign", "del_stmt", "pass_stmt", "flow_stmt", "break_stmt", "continue_stmt", 
		"return_stmt", "dotted_name", "compound_stmt", "if_stmt", "while_stmt", 
		"for_stmt", "suite", "test", "test_nocond", "or_test", "and_test", "not_test", 
		"comparison", "comp_op", "star_expr", "expr", "xor_expr", "and_expr", 
		"shift_expr", "arith_expr", "term", "factor", "power", "atom", "testlist_comp", 
		"trailer", "subscriptlist", "subscript", "sliceop", "exprlist", "testlist", 
		"dictorsetmaker", "arglist", "argument", "comp_iter", "comp_for", "comp_if", 
		"number", "integer"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'def'", "'return'", "'if'", "'elif'", "'else'", "'while'", "'for'", 
		"'in'", "'or'", "'and'", "'not'", "'is'", "'None'", "'True'", "'False'", 
		"'del'", "'pass'", "'continue'", "'break'", null, null, null, null, null, 
		null, null, null, "'.'", "'...'", "'*'", "'('", "')'", "','", "':'", "';'", 
		"'**'", "'='", "'['", "']'", "'|'", "'^'", "'&'", "'<<'", "'>>'", "'+'", 
		"'-'", "'/'", "'%'", "'//'", "'~'", "'{'", "'}'", "'<'", "'>'", "'=='", 
		"'>='", "'<='", "'<>'", "'!='", "'@'", "'->'", "'+='", "'-='", "'*='", 
		"'@='", "'/='", "'%='", "'&='", "'|='", "'^='", "'<<='", "'>>='", "'**='", 
		"'//='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "DEF", "RETURN", "IF", "ELIF", "ELSE", "WHILE", "FOR", "IN", "OR", 
		"AND", "NOT", "IS", "NONE", "TRUE", "FALSE", "DEL", "PASS", "CONTINUE", 
		"BREAK", "NEWLINE", "NAME", "DECIMAL_INTEGER", "OCT_INTEGER", "HEX_INTEGER", 
		"BIN_INTEGER", "FLOAT_NUMBER", "IMAG_NUMBER", "DOT", "ELLIPSIS", "STAR", 
		"OPEN_PAREN", "CLOSE_PAREN", "COMMA", "COLON", "SEMI_COLON", "POWER", 
		"ASSIGN", "OPEN_BRACK", "CLOSE_BRACK", "OR_OP", "XOR", "AND_OP", "LEFT_SHIFT", 
		"RIGHT_SHIFT", "ADD", "MINUS", "DIV", "MOD", "IDIV", "NOT_OP", "OPEN_BRACE", 
		"CLOSE_BRACE", "LESS_THAN", "GREATER_THAN", "EQUALS", "GT_EQ", "LT_EQ", 
		"NOT_EQ_1", "NOT_EQ_2", "AT", "ARROW", "ADD_ASSIGN", "SUB_ASSIGN", "MULT_ASSIGN", 
		"AT_ASSIGN", "DIV_ASSIGN", "MOD_ASSIGN", "AND_ASSIGN", "OR_ASSIGN", "XOR_ASSIGN", 
		"LEFT_SHIFT_ASSIGN", "RIGHT_SHIFT_ASSIGN", "POWER_ASSIGN", "IDIV_ASSIGN", 
		"SKIP_", "UNKNOWN_CHAR", "INDENT", "DEDENT"
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
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DEF) | (1L << RETURN) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << NOT) | (1L << NONE) | (1L << TRUE) | (1L << FALSE) | (1L << DEL) | (1L << PASS) | (1L << CONTINUE) | (1L << BREAK) | (1L << NEWLINE) | (1L << NAME) | (1L << DECIMAL_INTEGER) | (1L << OCT_INTEGER) | (1L << HEX_INTEGER) | (1L << BIN_INTEGER) | (1L << FLOAT_NUMBER) | (1L << IMAG_NUMBER) | (1L << ELLIPSIS) | (1L << STAR) | (1L << OPEN_PAREN) | (1L << OPEN_BRACK) | (1L << ADD) | (1L << MINUS) | (1L << NOT_OP) | (1L << OPEN_BRACE) | (1L << AT))) != 0)) {
				{
				setState(116);
				switch (_input.LA(1)) {
				case NEWLINE:
					{
					setState(114);
					match(NEWLINE);
					}
					break;
				case DEF:
				case RETURN:
				case IF:
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
				case FLOAT_NUMBER:
				case IMAG_NUMBER:
				case ELLIPSIS:
				case STAR:
				case OPEN_PAREN:
				case OPEN_BRACK:
				case ADD:
				case MINUS:
				case NOT_OP:
				case OPEN_BRACE:
				case AT:
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

	public static class DecoratorContext extends ParserRuleContext {
		public Dotted_nameContext dotted_name() {
			return getRuleContext(Dotted_nameContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(VerythonParser.NEWLINE, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerythonVisitor ) return ((VerythonVisitor<? extends T>)visitor).visitDecorator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecoratorContext decorator() throws RecognitionException {
		DecoratorContext _localctx = new DecoratorContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_decorator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(AT);
			setState(124);
			dotted_name();
			setState(130);
			_la = _input.LA(1);
			if (_la==OPEN_PAREN) {
				{
				setState(125);
				match(OPEN_PAREN);
				setState(127);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT) | (1L << NONE) | (1L << TRUE) | (1L << FALSE) | (1L << NAME) | (1L << DECIMAL_INTEGER) | (1L << OCT_INTEGER) | (1L << HEX_INTEGER) | (1L << BIN_INTEGER) | (1L << FLOAT_NUMBER) | (1L << IMAG_NUMBER) | (1L << ELLIPSIS) | (1L << STAR) | (1L << OPEN_PAREN) | (1L << POWER) | (1L << OPEN_BRACK) | (1L << ADD) | (1L << MINUS) | (1L << NOT_OP) | (1L << OPEN_BRACE))) != 0)) {
					{
					setState(126);
					arglist();
					}
				}

				setState(129);
				match(CLOSE_PAREN);
				}
			}

			setState(132);
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

	public static class DecoratedContext extends ParserRuleContext {
		public DecoratorContext decorator() {
			return getRuleContext(DecoratorContext.class,0);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerythonVisitor ) return ((VerythonVisitor<? extends T>)visitor).visitDecorated(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecoratedContext decorated() throws RecognitionException {
		DecoratedContext _localctx = new DecoratedContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_decorated);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			decorator();
			setState(135);
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

	public static class FuncdefContext extends ParserRuleContext {
		public TerminalNode DEF() { return getToken(VerythonParser.DEF, 0); }
		public TerminalNode NAME() { return getToken(VerythonParser.NAME, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public SuiteContext suite() {
			return getRuleContext(SuiteContext.class,0);
		}
		public TestContext test() {
			return getRuleContext(TestContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerythonVisitor ) return ((VerythonVisitor<? extends T>)visitor).visitFuncdef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncdefContext funcdef() throws RecognitionException {
		FuncdefContext _localctx = new FuncdefContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_funcdef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(DEF);
			setState(138);
			match(NAME);
			setState(139);
			parameters();
			setState(142);
			_la = _input.LA(1);
			if (_la==ARROW) {
				{
				setState(140);
				match(ARROW);
				setState(141);
				test();
				}
			}

			setState(144);
			match(COLON);
			setState(145);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerythonVisitor ) return ((VerythonVisitor<? extends T>)visitor).visitParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(OPEN_PAREN);
			setState(149);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NAME) | (1L << STAR) | (1L << POWER))) != 0)) {
				{
				setState(148);
				typedargslist();
				}
			}

			setState(151);
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
		public List<TfpdefContext> tfpdef() {
			return getRuleContexts(TfpdefContext.class);
		}
		public TfpdefContext tfpdef(int i) {
			return getRuleContext(TfpdefContext.class,i);
		}
		public List<TestContext> test() {
			return getRuleContexts(TestContext.class);
		}
		public TestContext test(int i) {
			return getRuleContext(TestContext.class,i);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerythonVisitor ) return ((VerythonVisitor<? extends T>)visitor).visitTypedargslist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypedargslistContext typedargslist() throws RecognitionException {
		TypedargslistContext _localctx = new TypedargslistContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_typedargslist);
		int _la;
		try {
			int _alt;
			setState(218);
			switch (_input.LA(1)) {
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(153);
				tfpdef();
				setState(156);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(154);
					match(ASSIGN);
					setState(155);
					test();
					}
				}

				setState(166);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(158);
						match(COMMA);
						setState(159);
						tfpdef();
						setState(162);
						_la = _input.LA(1);
						if (_la==ASSIGN) {
							{
							setState(160);
							match(ASSIGN);
							setState(161);
							test();
							}
						}

						}
						} 
					}
					setState(168);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				}
				setState(194);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(169);
					match(COMMA);
					setState(192);
					switch (_input.LA(1)) {
					case STAR:
						{
						setState(170);
						match(STAR);
						setState(172);
						_la = _input.LA(1);
						if (_la==NAME) {
							{
							setState(171);
							tfpdef();
							}
						}

						setState(182);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(174);
								match(COMMA);
								setState(175);
								tfpdef();
								setState(178);
								_la = _input.LA(1);
								if (_la==ASSIGN) {
									{
									setState(176);
									match(ASSIGN);
									setState(177);
									test();
									}
								}

								}
								} 
							}
							setState(184);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
						}
						setState(188);
						_la = _input.LA(1);
						if (_la==COMMA) {
							{
							setState(185);
							match(COMMA);
							setState(186);
							match(POWER);
							setState(187);
							tfpdef();
							}
						}

						}
						break;
					case POWER:
						{
						setState(190);
						match(POWER);
						setState(191);
						tfpdef();
						}
						break;
					case CLOSE_PAREN:
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
				}

				}
				break;
			case STAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(196);
				match(STAR);
				setState(198);
				_la = _input.LA(1);
				if (_la==NAME) {
					{
					setState(197);
					tfpdef();
					}
				}

				setState(208);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(200);
						match(COMMA);
						setState(201);
						tfpdef();
						setState(204);
						_la = _input.LA(1);
						if (_la==ASSIGN) {
							{
							setState(202);
							match(ASSIGN);
							setState(203);
							test();
							}
						}

						}
						} 
					}
					setState(210);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				}
				setState(214);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(211);
					match(COMMA);
					setState(212);
					match(POWER);
					setState(213);
					tfpdef();
					}
				}

				}
				break;
			case POWER:
				enterOuterAlt(_localctx, 3);
				{
				setState(216);
				match(POWER);
				setState(217);
				tfpdef();
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerythonVisitor ) return ((VerythonVisitor<? extends T>)visitor).visitTfpdef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TfpdefContext tfpdef() throws RecognitionException {
		TfpdefContext _localctx = new TfpdefContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_tfpdef);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerythonListener ) ((VerythonListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerythonListener ) ((VerythonListener)listener).exitStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerythonVisitor ) return ((VerythonVisitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_stmt);
		try {
			setState(227);
			switch (_input.LA(1)) {
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
			case FLOAT_NUMBER:
			case IMAG_NUMBER:
			case ELLIPSIS:
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
			case DEF:
			case IF:
			case WHILE:
			case FOR:
			case AT:
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerythonListener ) ((VerythonListener)listener).enterSimple_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerythonListener ) ((VerythonListener)listener).exitSimple_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerythonVisitor ) return ((VerythonVisitor<? extends T>)visitor).visitSimple_stmt(this);
			else return visitor.visitChildren(this);
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
			setState(229);
			small_stmt();
			setState(234);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerythonListener ) ((VerythonListener)listener).enterSmall_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerythonListener ) ((VerythonListener)listener).exitSmall_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerythonVisitor ) return ((VerythonVisitor<? extends T>)visitor).visitSmall_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Small_stmtContext small_stmt() throws RecognitionException {
		Small_stmtContext _localctx = new Small_stmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_small_stmt);
		try {
			setState(246);
			switch (_input.LA(1)) {
			case NOT:
			case NONE:
			case TRUE:
			case FALSE:
			case NAME:
			case DECIMAL_INTEGER:
			case OCT_INTEGER:
			case HEX_INTEGER:
			case BIN_INTEGER:
			case FLOAT_NUMBER:
			case IMAG_NUMBER:
			case ELLIPSIS:
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerythonListener ) ((VerythonListener)listener).enterExpr_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerythonListener ) ((VerythonListener)listener).exitExpr_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerythonVisitor ) return ((VerythonVisitor<? extends T>)visitor).visitExpr_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_stmtContext expr_stmt() throws RecognitionException {
		Expr_stmtContext _localctx = new Expr_stmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_expr_stmt);
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
			case AT_ASSIGN:
			case DIV_ASSIGN:
			case MOD_ASSIGN:
			case AND_ASSIGN:
			case OR_ASSIGN:
			case XOR_ASSIGN:
			case LEFT_SHIFT_ASSIGN:
			case RIGHT_SHIFT_ASSIGN:
			case POWER_ASSIGN:
			case IDIV_ASSIGN:
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerythonListener ) ((VerythonListener)listener).enterTestlist_star_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerythonListener ) ((VerythonListener)listener).exitTestlist_star_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerythonVisitor ) return ((VerythonVisitor<? extends T>)visitor).visitTestlist_star_expr(this);
			else return visitor.visitChildren(this);
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
			setState(263);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
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
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(265);
					match(COMMA);
					setState(268);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
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
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerythonVisitor ) return ((VerythonVisitor<? extends T>)visitor).visitAugassign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AugassignContext augassign() throws RecognitionException {
		AugassignContext _localctx = new AugassignContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_augassign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			_la = _input.LA(1);
			if ( !(((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (ADD_ASSIGN - 62)) | (1L << (SUB_ASSIGN - 62)) | (1L << (MULT_ASSIGN - 62)) | (1L << (AT_ASSIGN - 62)) | (1L << (DIV_ASSIGN - 62)) | (1L << (MOD_ASSIGN - 62)) | (1L << (AND_ASSIGN - 62)) | (1L << (OR_ASSIGN - 62)) | (1L << (XOR_ASSIGN - 62)) | (1L << (LEFT_SHIFT_ASSIGN - 62)) | (1L << (RIGHT_SHIFT_ASSIGN - 62)) | (1L << (POWER_ASSIGN - 62)) | (1L << (IDIV_ASSIGN - 62)))) != 0)) ) {
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerythonVisitor ) return ((VerythonVisitor<? extends T>)visitor).visitDel_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Del_stmtContext del_stmt() throws RecognitionException {
		Del_stmtContext _localctx = new Del_stmtContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_del_stmt);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerythonListener ) ((VerythonListener)listener).enterPass_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerythonListener ) ((VerythonListener)listener).exitPass_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerythonVisitor ) return ((VerythonVisitor<? extends T>)visitor).visitPass_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pass_stmtContext pass_stmt() throws RecognitionException {
		Pass_stmtContext _localctx = new Pass_stmtContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_pass_stmt);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerythonListener ) ((VerythonListener)listener).enterFlow_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerythonListener ) ((VerythonListener)listener).exitFlow_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerythonVisitor ) return ((VerythonVisitor<? extends T>)visitor).visitFlow_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Flow_stmtContext flow_stmt() throws RecognitionException {
		Flow_stmtContext _localctx = new Flow_stmtContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_flow_stmt);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerythonListener ) ((VerythonListener)listener).enterBreak_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerythonListener ) ((VerythonListener)listener).exitBreak_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerythonVisitor ) return ((VerythonVisitor<? extends T>)visitor).visitBreak_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Break_stmtContext break_stmt() throws RecognitionException {
		Break_stmtContext _localctx = new Break_stmtContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_break_stmt);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerythonListener ) ((VerythonListener)listener).enterContinue_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerythonListener ) ((VerythonListener)listener).exitContinue_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerythonVisitor ) return ((VerythonVisitor<? extends T>)visitor).visitContinue_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Continue_stmtContext continue_stmt() throws RecognitionException {
		Continue_stmtContext _localctx = new Continue_stmtContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_continue_stmt);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerythonListener ) ((VerythonListener)listener).enterReturn_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerythonListener ) ((VerythonListener)listener).exitReturn_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerythonVisitor ) return ((VerythonVisitor<? extends T>)visitor).visitReturn_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_stmtContext return_stmt() throws RecognitionException {
		Return_stmtContext _localctx = new Return_stmtContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_return_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			match(RETURN);
			setState(296);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT) | (1L << NONE) | (1L << TRUE) | (1L << FALSE) | (1L << NAME) | (1L << DECIMAL_INTEGER) | (1L << OCT_INTEGER) | (1L << HEX_INTEGER) | (1L << BIN_INTEGER) | (1L << FLOAT_NUMBER) | (1L << IMAG_NUMBER) | (1L << ELLIPSIS) | (1L << STAR) | (1L << OPEN_PAREN) | (1L << OPEN_BRACK) | (1L << ADD) | (1L << MINUS) | (1L << NOT_OP) | (1L << OPEN_BRACE))) != 0)) {
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

	public static class Dotted_nameContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(VerythonParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(VerythonParser.NAME, i);
		}
		public Dotted_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dotted_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerythonListener ) ((VerythonListener)listener).enterDotted_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerythonListener ) ((VerythonListener)listener).exitDotted_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerythonVisitor ) return ((VerythonVisitor<? extends T>)visitor).visitDotted_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dotted_nameContext dotted_name() throws RecognitionException {
		Dotted_nameContext _localctx = new Dotted_nameContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_dotted_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			match(NAME);
			setState(303);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(299);
				match(DOT);
				setState(300);
				match(NAME);
				}
				}
				setState(305);
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

	public static class Compound_stmtContext extends ParserRuleContext {
		public If_stmtContext if_stmt() {
			return getRuleContext(If_stmtContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerythonVisitor ) return ((VerythonVisitor<? extends T>)visitor).visitCompound_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Compound_stmtContext compound_stmt() throws RecognitionException {
		Compound_stmtContext _localctx = new Compound_stmtContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_compound_stmt);
		try {
			setState(311);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(306);
				if_stmt();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(307);
				while_stmt();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(308);
				for_stmt();
				}
				break;
			case DEF:
				enterOuterAlt(_localctx, 4);
				{
				setState(309);
				funcdef();
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 5);
				{
				setState(310);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerythonVisitor ) return ((VerythonVisitor<? extends T>)visitor).visitIf_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_stmtContext if_stmt() throws RecognitionException {
		If_stmtContext _localctx = new If_stmtContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_if_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			match(IF);
			setState(314);
			test();
			setState(315);
			match(COLON);
			setState(316);
			suite();
			setState(324);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELIF) {
				{
				{
				setState(317);
				match(ELIF);
				setState(318);
				test();
				setState(319);
				match(COLON);
				setState(320);
				suite();
				}
				}
				setState(326);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(330);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(327);
				match(ELSE);
				setState(328);
				match(COLON);
				setState(329);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerythonVisitor ) return ((VerythonVisitor<? extends T>)visitor).visitWhile_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_stmtContext while_stmt() throws RecognitionException {
		While_stmtContext _localctx = new While_stmtContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_while_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			match(WHILE);
			setState(333);
			test();
			setState(334);
			match(COLON);
			setState(335);
			suite();
			setState(339);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(336);
				match(ELSE);
				setState(337);
				match(COLON);
				setState(338);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerythonVisitor ) return ((VerythonVisitor<? extends T>)visitor).visitFor_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_stmtContext for_stmt() throws RecognitionException {
		For_stmtContext _localctx = new For_stmtContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_for_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			match(FOR);
			setState(342);
			exprlist();
			setState(343);
			match(IN);
			setState(344);
			testlist();
			setState(345);
			match(COLON);
			setState(346);
			suite();
			setState(350);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(347);
				match(ELSE);
				setState(348);
				match(COLON);
				setState(349);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerythonVisitor ) return ((VerythonVisitor<? extends T>)visitor).visitSuite(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SuiteContext suite() throws RecognitionException {
		SuiteContext _localctx = new SuiteContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_suite);
		int _la;
		try {
			setState(362);
			switch (_input.LA(1)) {
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
			case FLOAT_NUMBER:
			case IMAG_NUMBER:
			case ELLIPSIS:
			case STAR:
			case OPEN_PAREN:
			case OPEN_BRACK:
			case ADD:
			case MINUS:
			case NOT_OP:
			case OPEN_BRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(352);
				simple_stmt();
				}
				break;
			case NEWLINE:
				enterOuterAlt(_localctx, 2);
				{
				setState(353);
				match(NEWLINE);
				setState(354);
				match(INDENT);
				setState(356); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(355);
					stmt();
					}
					}
					setState(358); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DEF) | (1L << RETURN) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << NOT) | (1L << NONE) | (1L << TRUE) | (1L << FALSE) | (1L << DEL) | (1L << PASS) | (1L << CONTINUE) | (1L << BREAK) | (1L << NAME) | (1L << DECIMAL_INTEGER) | (1L << OCT_INTEGER) | (1L << HEX_INTEGER) | (1L << BIN_INTEGER) | (1L << FLOAT_NUMBER) | (1L << IMAG_NUMBER) | (1L << ELLIPSIS) | (1L << STAR) | (1L << OPEN_PAREN) | (1L << OPEN_BRACK) | (1L << ADD) | (1L << MINUS) | (1L << NOT_OP) | (1L << OPEN_BRACE) | (1L << AT))) != 0) );
				setState(360);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerythonVisitor ) return ((VerythonVisitor<? extends T>)visitor).visitTest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TestContext test() throws RecognitionException {
		TestContext _localctx = new TestContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_test);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			or_test();
			setState(370);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(365);
				match(IF);
				setState(366);
				or_test();
				setState(367);
				match(ELSE);
				setState(368);
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

	public static class Test_nocondContext extends ParserRuleContext {
		public Or_testContext or_test() {
			return getRuleContext(Or_testContext.class,0);
		}
		public Test_nocondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_test_nocond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerythonListener ) ((VerythonListener)listener).enterTest_nocond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerythonListener ) ((VerythonListener)listener).exitTest_nocond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerythonVisitor ) return ((VerythonVisitor<? extends T>)visitor).visitTest_nocond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Test_nocondContext test_nocond() throws RecognitionException {
		Test_nocondContext _localctx = new Test_nocondContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_test_nocond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			or_test();
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerythonVisitor ) return ((VerythonVisitor<? extends T>)visitor).visitOr_test(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Or_testContext or_test() throws RecognitionException {
		Or_testContext _localctx = new Or_testContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_or_test);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			and_test();
			setState(379);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(375);
				match(OR);
				setState(376);
				and_test();
				}
				}
				setState(381);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerythonVisitor ) return ((VerythonVisitor<? extends T>)visitor).visitAnd_test(this);
			else return visitor.visitChildren(this);
		}
	}

	public final And_testContext and_test() throws RecognitionException {
		And_testContext _localctx = new And_testContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_and_test);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			not_test();
			setState(387);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(383);
				match(AND);
				setState(384);
				not_test();
				}
				}
				setState(389);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerythonVisitor ) return ((VerythonVisitor<? extends T>)visitor).visitNot_test(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Not_testContext not_test() throws RecognitionException {
		Not_testContext _localctx = new Not_testContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_not_test);
		try {
			setState(393);
			switch (_input.LA(1)) {
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(390);
				match(NOT);
				setState(391);
				not_test();
				}
				break;
			case NONE:
			case TRUE:
			case FALSE:
			case NAME:
			case DECIMAL_INTEGER:
			case OCT_INTEGER:
			case HEX_INTEGER:
			case BIN_INTEGER:
			case FLOAT_NUMBER:
			case IMAG_NUMBER:
			case ELLIPSIS:
			case STAR:
			case OPEN_PAREN:
			case OPEN_BRACK:
			case ADD:
			case MINUS:
			case NOT_OP:
			case OPEN_BRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(392);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerythonVisitor ) return ((VerythonVisitor<? extends T>)visitor).visitComparison(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonContext comparison() throws RecognitionException {
		ComparisonContext _localctx = new ComparisonContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_comparison);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(395);
			star_expr();
			setState(401);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IN) | (1L << NOT) | (1L << IS) | (1L << LESS_THAN) | (1L << GREATER_THAN) | (1L << EQUALS) | (1L << GT_EQ) | (1L << LT_EQ) | (1L << NOT_EQ_1) | (1L << NOT_EQ_2))) != 0)) {
				{
				{
				setState(396);
				comp_op();
				setState(397);
				star_expr();
				}
				}
				setState(403);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerythonVisitor ) return ((VerythonVisitor<? extends T>)visitor).visitComp_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comp_opContext comp_op() throws RecognitionException {
		Comp_opContext _localctx = new Comp_opContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_comp_op);
		try {
			setState(417);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(404);
				match(LESS_THAN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(405);
				match(GREATER_THAN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(406);
				match(EQUALS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(407);
				match(GT_EQ);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(408);
				match(LT_EQ);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(409);
				match(NOT_EQ_1);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(410);
				match(NOT_EQ_2);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(411);
				match(IN);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(412);
				match(NOT);
				setState(413);
				match(IN);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(414);
				match(IS);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(415);
				match(IS);
				setState(416);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerythonVisitor ) return ((VerythonVisitor<? extends T>)visitor).visitStar_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Star_exprContext star_expr() throws RecognitionException {
		Star_exprContext _localctx = new Star_exprContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_star_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(420);
			_la = _input.LA(1);
			if (_la==STAR) {
				{
				setState(419);
				match(STAR);
				}
			}

			setState(422);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerythonVisitor ) return ((VerythonVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(424);
			xor_expr();
			setState(429);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR_OP) {
				{
				{
				setState(425);
				match(OR_OP);
				setState(426);
				xor_expr();
				}
				}
				setState(431);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerythonVisitor ) return ((VerythonVisitor<? extends T>)visitor).visitXor_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Xor_exprContext xor_expr() throws RecognitionException {
		Xor_exprContext _localctx = new Xor_exprContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_xor_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(432);
			and_expr();
			setState(437);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==XOR) {
				{
				{
				setState(433);
				match(XOR);
				setState(434);
				and_expr();
				}
				}
				setState(439);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerythonVisitor ) return ((VerythonVisitor<? extends T>)visitor).visitAnd_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final And_exprContext and_expr() throws RecognitionException {
		And_exprContext _localctx = new And_exprContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_and_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(440);
			shift_expr();
			setState(445);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND_OP) {
				{
				{
				setState(441);
				match(AND_OP);
				setState(442);
				shift_expr();
				}
				}
				setState(447);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerythonVisitor ) return ((VerythonVisitor<? extends T>)visitor).visitShift_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Shift_exprContext shift_expr() throws RecognitionException {
		Shift_exprContext _localctx = new Shift_exprContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_shift_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(448);
			arith_expr();
			setState(455);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LEFT_SHIFT || _la==RIGHT_SHIFT) {
				{
				setState(453);
				switch (_input.LA(1)) {
				case LEFT_SHIFT:
					{
					setState(449);
					match(LEFT_SHIFT);
					setState(450);
					arith_expr();
					}
					break;
				case RIGHT_SHIFT:
					{
					setState(451);
					match(RIGHT_SHIFT);
					setState(452);
					arith_expr();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(457);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerythonVisitor ) return ((VerythonVisitor<? extends T>)visitor).visitArith_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arith_exprContext arith_expr() throws RecognitionException {
		Arith_exprContext _localctx = new Arith_exprContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_arith_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(458);
			term();
			setState(465);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ADD || _la==MINUS) {
				{
				setState(463);
				switch (_input.LA(1)) {
				case ADD:
					{
					setState(459);
					match(ADD);
					setState(460);
					term();
					}
					break;
				case MINUS:
					{
					setState(461);
					match(MINUS);
					setState(462);
					term();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(467);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerythonVisitor ) return ((VerythonVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(468);
			factor();
			setState(481);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR) | (1L << DIV) | (1L << MOD) | (1L << IDIV) | (1L << AT))) != 0)) {
				{
				setState(479);
				switch (_input.LA(1)) {
				case STAR:
					{
					setState(469);
					match(STAR);
					setState(470);
					factor();
					}
					break;
				case DIV:
					{
					setState(471);
					match(DIV);
					setState(472);
					factor();
					}
					break;
				case MOD:
					{
					setState(473);
					match(MOD);
					setState(474);
					factor();
					}
					break;
				case IDIV:
					{
					setState(475);
					match(IDIV);
					setState(476);
					factor();
					}
					break;
				case AT:
					{
					setState(477);
					match(AT);
					setState(478);
					factor();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(483);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerythonVisitor ) return ((VerythonVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_factor);
		try {
			setState(491);
			switch (_input.LA(1)) {
			case ADD:
				enterOuterAlt(_localctx, 1);
				{
				setState(484);
				match(ADD);
				setState(485);
				factor();
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(486);
				match(MINUS);
				setState(487);
				factor();
				}
				break;
			case NOT_OP:
				enterOuterAlt(_localctx, 3);
				{
				setState(488);
				match(NOT_OP);
				setState(489);
				factor();
				}
				break;
			case NONE:
			case TRUE:
			case FALSE:
			case NAME:
			case DECIMAL_INTEGER:
			case OCT_INTEGER:
			case HEX_INTEGER:
			case BIN_INTEGER:
			case FLOAT_NUMBER:
			case IMAG_NUMBER:
			case ELLIPSIS:
			case OPEN_PAREN:
			case OPEN_BRACK:
			case OPEN_BRACE:
				enterOuterAlt(_localctx, 4);
				{
				setState(490);
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
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerythonVisitor ) return ((VerythonVisitor<? extends T>)visitor).visitPower(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PowerContext power() throws RecognitionException {
		PowerContext _localctx = new PowerContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_power);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(493);
			atom();
			setState(497);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DOT) | (1L << OPEN_PAREN) | (1L << OPEN_BRACK))) != 0)) {
				{
				{
				setState(494);
				trailer();
				}
				}
				setState(499);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(502);
			_la = _input.LA(1);
			if (_la==POWER) {
				{
				setState(500);
				match(POWER);
				setState(501);
				factor();
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerythonVisitor ) return ((VerythonVisitor<? extends T>)visitor).visitAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_atom);
		int _la;
		try {
			setState(525);
			switch (_input.LA(1)) {
			case OPEN_PAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(504);
				match(OPEN_PAREN);
				setState(506);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT) | (1L << NONE) | (1L << TRUE) | (1L << FALSE) | (1L << NAME) | (1L << DECIMAL_INTEGER) | (1L << OCT_INTEGER) | (1L << HEX_INTEGER) | (1L << BIN_INTEGER) | (1L << FLOAT_NUMBER) | (1L << IMAG_NUMBER) | (1L << ELLIPSIS) | (1L << STAR) | (1L << OPEN_PAREN) | (1L << OPEN_BRACK) | (1L << ADD) | (1L << MINUS) | (1L << NOT_OP) | (1L << OPEN_BRACE))) != 0)) {
					{
					setState(505);
					testlist_comp();
					}
				}

				setState(508);
				match(CLOSE_PAREN);
				}
				break;
			case OPEN_BRACK:
				enterOuterAlt(_localctx, 2);
				{
				setState(509);
				match(OPEN_BRACK);
				setState(511);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT) | (1L << NONE) | (1L << TRUE) | (1L << FALSE) | (1L << NAME) | (1L << DECIMAL_INTEGER) | (1L << OCT_INTEGER) | (1L << HEX_INTEGER) | (1L << BIN_INTEGER) | (1L << FLOAT_NUMBER) | (1L << IMAG_NUMBER) | (1L << ELLIPSIS) | (1L << STAR) | (1L << OPEN_PAREN) | (1L << OPEN_BRACK) | (1L << ADD) | (1L << MINUS) | (1L << NOT_OP) | (1L << OPEN_BRACE))) != 0)) {
					{
					setState(510);
					testlist_comp();
					}
				}

				setState(513);
				match(CLOSE_BRACK);
				}
				break;
			case OPEN_BRACE:
				enterOuterAlt(_localctx, 3);
				{
				setState(514);
				match(OPEN_BRACE);
				setState(516);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT) | (1L << NONE) | (1L << TRUE) | (1L << FALSE) | (1L << NAME) | (1L << DECIMAL_INTEGER) | (1L << OCT_INTEGER) | (1L << HEX_INTEGER) | (1L << BIN_INTEGER) | (1L << FLOAT_NUMBER) | (1L << IMAG_NUMBER) | (1L << ELLIPSIS) | (1L << STAR) | (1L << OPEN_PAREN) | (1L << OPEN_BRACK) | (1L << ADD) | (1L << MINUS) | (1L << NOT_OP) | (1L << OPEN_BRACE))) != 0)) {
					{
					setState(515);
					dictorsetmaker();
					}
				}

				setState(518);
				match(CLOSE_BRACE);
				}
				break;
			case NAME:
				enterOuterAlt(_localctx, 4);
				{
				setState(519);
				match(NAME);
				}
				break;
			case DECIMAL_INTEGER:
			case OCT_INTEGER:
			case HEX_INTEGER:
			case BIN_INTEGER:
			case FLOAT_NUMBER:
			case IMAG_NUMBER:
				enterOuterAlt(_localctx, 5);
				{
				setState(520);
				number();
				}
				break;
			case ELLIPSIS:
				enterOuterAlt(_localctx, 6);
				{
				setState(521);
				match(ELLIPSIS);
				}
				break;
			case NONE:
				enterOuterAlt(_localctx, 7);
				{
				setState(522);
				match(NONE);
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 8);
				{
				setState(523);
				match(TRUE);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 9);
				{
				setState(524);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerythonVisitor ) return ((VerythonVisitor<? extends T>)visitor).visitTestlist_comp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Testlist_compContext testlist_comp() throws RecognitionException {
		Testlist_compContext _localctx = new Testlist_compContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_testlist_comp);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(527);
			test();
			setState(539);
			switch (_input.LA(1)) {
			case FOR:
				{
				setState(528);
				comp_for();
				}
				break;
			case CLOSE_PAREN:
			case COMMA:
			case CLOSE_BRACK:
				{
				setState(533);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(529);
						match(COMMA);
						setState(530);
						test();
						}
						} 
					}
					setState(535);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
				}
				setState(537);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(536);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerythonVisitor ) return ((VerythonVisitor<? extends T>)visitor).visitTrailer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TrailerContext trailer() throws RecognitionException {
		TrailerContext _localctx = new TrailerContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_trailer);
		int _la;
		try {
			setState(552);
			switch (_input.LA(1)) {
			case OPEN_PAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(541);
				match(OPEN_PAREN);
				setState(543);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT) | (1L << NONE) | (1L << TRUE) | (1L << FALSE) | (1L << NAME) | (1L << DECIMAL_INTEGER) | (1L << OCT_INTEGER) | (1L << HEX_INTEGER) | (1L << BIN_INTEGER) | (1L << FLOAT_NUMBER) | (1L << IMAG_NUMBER) | (1L << ELLIPSIS) | (1L << STAR) | (1L << OPEN_PAREN) | (1L << POWER) | (1L << OPEN_BRACK) | (1L << ADD) | (1L << MINUS) | (1L << NOT_OP) | (1L << OPEN_BRACE))) != 0)) {
					{
					setState(542);
					arglist();
					}
				}

				setState(545);
				match(CLOSE_PAREN);
				}
				break;
			case OPEN_BRACK:
				enterOuterAlt(_localctx, 2);
				{
				setState(546);
				match(OPEN_BRACK);
				setState(547);
				subscriptlist();
				setState(548);
				match(CLOSE_BRACK);
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 3);
				{
				setState(550);
				match(DOT);
				setState(551);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerythonVisitor ) return ((VerythonVisitor<? extends T>)visitor).visitSubscriptlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubscriptlistContext subscriptlist() throws RecognitionException {
		SubscriptlistContext _localctx = new SubscriptlistContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_subscriptlist);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(554);
			subscript();
			setState(559);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(555);
					match(COMMA);
					setState(556);
					subscript();
					}
					} 
				}
				setState(561);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			}
			setState(563);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(562);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerythonVisitor ) return ((VerythonVisitor<? extends T>)visitor).visitSubscript(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubscriptContext subscript() throws RecognitionException {
		SubscriptContext _localctx = new SubscriptContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_subscript);
		int _la;
		try {
			setState(576);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(565);
				test();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(567);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT) | (1L << NONE) | (1L << TRUE) | (1L << FALSE) | (1L << NAME) | (1L << DECIMAL_INTEGER) | (1L << OCT_INTEGER) | (1L << HEX_INTEGER) | (1L << BIN_INTEGER) | (1L << FLOAT_NUMBER) | (1L << IMAG_NUMBER) | (1L << ELLIPSIS) | (1L << STAR) | (1L << OPEN_PAREN) | (1L << OPEN_BRACK) | (1L << ADD) | (1L << MINUS) | (1L << NOT_OP) | (1L << OPEN_BRACE))) != 0)) {
					{
					setState(566);
					test();
					}
				}

				setState(569);
				match(COLON);
				setState(571);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT) | (1L << NONE) | (1L << TRUE) | (1L << FALSE) | (1L << NAME) | (1L << DECIMAL_INTEGER) | (1L << OCT_INTEGER) | (1L << HEX_INTEGER) | (1L << BIN_INTEGER) | (1L << FLOAT_NUMBER) | (1L << IMAG_NUMBER) | (1L << ELLIPSIS) | (1L << STAR) | (1L << OPEN_PAREN) | (1L << OPEN_BRACK) | (1L << ADD) | (1L << MINUS) | (1L << NOT_OP) | (1L << OPEN_BRACE))) != 0)) {
					{
					setState(570);
					test();
					}
				}

				setState(574);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(573);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerythonVisitor ) return ((VerythonVisitor<? extends T>)visitor).visitSliceop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SliceopContext sliceop() throws RecognitionException {
		SliceopContext _localctx = new SliceopContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_sliceop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(578);
			match(COLON);
			setState(580);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT) | (1L << NONE) | (1L << TRUE) | (1L << FALSE) | (1L << NAME) | (1L << DECIMAL_INTEGER) | (1L << OCT_INTEGER) | (1L << HEX_INTEGER) | (1L << BIN_INTEGER) | (1L << FLOAT_NUMBER) | (1L << IMAG_NUMBER) | (1L << ELLIPSIS) | (1L << STAR) | (1L << OPEN_PAREN) | (1L << OPEN_BRACK) | (1L << ADD) | (1L << MINUS) | (1L << NOT_OP) | (1L << OPEN_BRACE))) != 0)) {
				{
				setState(579);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerythonVisitor ) return ((VerythonVisitor<? extends T>)visitor).visitExprlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprlistContext exprlist() throws RecognitionException {
		ExprlistContext _localctx = new ExprlistContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_exprlist);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(582);
			star_expr();
			setState(587);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(583);
					match(COMMA);
					setState(584);
					star_expr();
					}
					} 
				}
				setState(589);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
			}
			setState(591);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(590);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerythonVisitor ) return ((VerythonVisitor<? extends T>)visitor).visitTestlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TestlistContext testlist() throws RecognitionException {
		TestlistContext _localctx = new TestlistContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_testlist);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(593);
			test();
			setState(598);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(594);
					match(COMMA);
					setState(595);
					test();
					}
					} 
				}
				setState(600);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerythonVisitor ) return ((VerythonVisitor<? extends T>)visitor).visitDictorsetmaker(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DictorsetmakerContext dictorsetmaker() throws RecognitionException {
		DictorsetmakerContext _localctx = new DictorsetmakerContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_dictorsetmaker);
		int _la;
		try {
			int _alt;
			setState(637);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(604);
				test();
				setState(605);
				match(COLON);
				setState(606);
				test();
				setState(621);
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
					setState(615);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(608);
							match(COMMA);
							setState(609);
							test();
							setState(610);
							match(COLON);
							setState(611);
							test();
							}
							} 
						}
						setState(617);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
					}
					setState(619);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(618);
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
				setState(623);
				test();
				setState(635);
				switch (_input.LA(1)) {
				case FOR:
					{
					setState(624);
					comp_for();
					}
					break;
				case COMMA:
				case CLOSE_BRACE:
					{
					setState(629);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(625);
							match(COMMA);
							setState(626);
							test();
							}
							} 
						}
						setState(631);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
					}
					setState(633);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(632);
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
		public List<TestContext> test() {
			return getRuleContexts(TestContext.class);
		}
		public TestContext test(int i) {
			return getRuleContext(TestContext.class,i);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerythonVisitor ) return ((VerythonVisitor<? extends T>)visitor).visitArglist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArglistContext arglist() throws RecognitionException {
		ArglistContext _localctx = new ArglistContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_arglist);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(644);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(639);
					argument();
					setState(640);
					match(COMMA);
					}
					} 
				}
				setState(646);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
			}
			setState(667);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				{
				setState(647);
				argument();
				setState(649);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(648);
					match(COMMA);
					}
				}

				}
				break;
			case 2:
				{
				setState(651);
				match(STAR);
				setState(652);
				test();
				setState(657);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(653);
						match(COMMA);
						setState(654);
						argument();
						}
						} 
					}
					setState(659);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
				}
				setState(663);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(660);
					match(COMMA);
					setState(661);
					match(POWER);
					setState(662);
					test();
					}
				}

				}
				break;
			case 3:
				{
				setState(665);
				match(POWER);
				setState(666);
				test();
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerythonVisitor ) return ((VerythonVisitor<? extends T>)visitor).visitArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_argument);
		int _la;
		try {
			setState(677);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(669);
				test();
				setState(671);
				_la = _input.LA(1);
				if (_la==FOR) {
					{
					setState(670);
					comp_for();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(673);
				test();
				setState(674);
				match(ASSIGN);
				setState(675);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerythonVisitor ) return ((VerythonVisitor<? extends T>)visitor).visitComp_iter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comp_iterContext comp_iter() throws RecognitionException {
		Comp_iterContext _localctx = new Comp_iterContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_comp_iter);
		try {
			setState(681);
			switch (_input.LA(1)) {
			case FOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(679);
				comp_for();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(680);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerythonVisitor ) return ((VerythonVisitor<? extends T>)visitor).visitComp_for(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comp_forContext comp_for() throws RecognitionException {
		Comp_forContext _localctx = new Comp_forContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_comp_for);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(683);
			match(FOR);
			setState(684);
			exprlist();
			setState(685);
			match(IN);
			setState(686);
			or_test();
			setState(688);
			_la = _input.LA(1);
			if (_la==IF || _la==FOR) {
				{
				setState(687);
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
		public Test_nocondContext test_nocond() {
			return getRuleContext(Test_nocondContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerythonVisitor ) return ((VerythonVisitor<? extends T>)visitor).visitComp_if(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comp_ifContext comp_if() throws RecognitionException {
		Comp_ifContext _localctx = new Comp_ifContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_comp_if);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(690);
			match(IF);
			setState(691);
			test_nocond();
			setState(693);
			_la = _input.LA(1);
			if (_la==IF || _la==FOR) {
				{
				setState(692);
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
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public TerminalNode FLOAT_NUMBER() { return getToken(VerythonParser.FLOAT_NUMBER, 0); }
		public TerminalNode IMAG_NUMBER() { return getToken(VerythonParser.IMAG_NUMBER, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerythonVisitor ) return ((VerythonVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_number);
		try {
			setState(698);
			switch (_input.LA(1)) {
			case DECIMAL_INTEGER:
			case OCT_INTEGER:
			case HEX_INTEGER:
			case BIN_INTEGER:
				enterOuterAlt(_localctx, 1);
				{
				setState(695);
				integer();
				}
				break;
			case FLOAT_NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(696);
				match(FLOAT_NUMBER);
				}
				break;
			case IMAG_NUMBER:
				enterOuterAlt(_localctx, 3);
				{
				setState(697);
				match(IMAG_NUMBER);
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

	public static class IntegerContext extends ParserRuleContext {
		public TerminalNode DECIMAL_INTEGER() { return getToken(VerythonParser.DECIMAL_INTEGER, 0); }
		public TerminalNode OCT_INTEGER() { return getToken(VerythonParser.OCT_INTEGER, 0); }
		public TerminalNode HEX_INTEGER() { return getToken(VerythonParser.HEX_INTEGER, 0); }
		public TerminalNode BIN_INTEGER() { return getToken(VerythonParser.BIN_INTEGER, 0); }
		public IntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerythonListener ) ((VerythonListener)listener).enterInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerythonListener ) ((VerythonListener)listener).exitInteger(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerythonVisitor ) return ((VerythonVisitor<? extends T>)visitor).visitInteger(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerContext integer() throws RecognitionException {
		IntegerContext _localctx = new IntegerContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_integer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(700);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3P\u02c1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\3\2\3\2\7\2w\n\2\f"+
		"\2\16\2z\13\2\3\2\3\2\3\3\3\3\3\3\3\3\5\3\u0082\n\3\3\3\5\3\u0085\n\3"+
		"\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\5\5\u0091\n\5\3\5\3\5\3\5\3\6"+
		"\3\6\5\6\u0098\n\6\3\6\3\6\3\7\3\7\3\7\5\7\u009f\n\7\3\7\3\7\3\7\3\7\5"+
		"\7\u00a5\n\7\7\7\u00a7\n\7\f\7\16\7\u00aa\13\7\3\7\3\7\3\7\5\7\u00af\n"+
		"\7\3\7\3\7\3\7\3\7\5\7\u00b5\n\7\7\7\u00b7\n\7\f\7\16\7\u00ba\13\7\3\7"+
		"\3\7\3\7\5\7\u00bf\n\7\3\7\3\7\5\7\u00c3\n\7\5\7\u00c5\n\7\3\7\3\7\5\7"+
		"\u00c9\n\7\3\7\3\7\3\7\3\7\5\7\u00cf\n\7\7\7\u00d1\n\7\f\7\16\7\u00d4"+
		"\13\7\3\7\3\7\3\7\5\7\u00d9\n\7\3\7\3\7\5\7\u00dd\n\7\3\b\3\b\3\b\5\b"+
		"\u00e2\n\b\3\t\3\t\5\t\u00e6\n\t\3\n\3\n\3\n\7\n\u00eb\n\n\f\n\16\n\u00ee"+
		"\13\n\3\n\5\n\u00f1\n\n\3\n\3\n\3\13\3\13\3\13\3\13\5\13\u00f9\n\13\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\7\f\u0101\n\f\f\f\16\f\u0104\13\f\5\f\u0106\n\f"+
		"\3\r\3\r\5\r\u010a\n\r\3\r\3\r\3\r\5\r\u010f\n\r\7\r\u0111\n\r\f\r\16"+
		"\r\u0114\13\r\3\r\5\r\u0117\n\r\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\21"+
		"\3\21\3\21\5\21\u0123\n\21\3\22\3\22\3\23\3\23\3\24\3\24\5\24\u012b\n"+
		"\24\3\25\3\25\3\25\7\25\u0130\n\25\f\25\16\25\u0133\13\25\3\26\3\26\3"+
		"\26\3\26\3\26\5\26\u013a\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\7\27\u0145\n\27\f\27\16\27\u0148\13\27\3\27\3\27\3\27\5\27\u014d"+
		"\n\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u0156\n\30\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0161\n\31\3\32\3\32\3\32\3\32\6\32"+
		"\u0167\n\32\r\32\16\32\u0168\3\32\3\32\5\32\u016d\n\32\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\5\33\u0175\n\33\3\34\3\34\3\35\3\35\3\35\7\35\u017c\n"+
		"\35\f\35\16\35\u017f\13\35\3\36\3\36\3\36\7\36\u0184\n\36\f\36\16\36\u0187"+
		"\13\36\3\37\3\37\3\37\5\37\u018c\n\37\3 \3 \3 \3 \7 \u0192\n \f \16 \u0195"+
		"\13 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\5!\u01a4\n!\3\"\5\"\u01a7"+
		"\n\"\3\"\3\"\3#\3#\3#\7#\u01ae\n#\f#\16#\u01b1\13#\3$\3$\3$\7$\u01b6\n"+
		"$\f$\16$\u01b9\13$\3%\3%\3%\7%\u01be\n%\f%\16%\u01c1\13%\3&\3&\3&\3&\3"+
		"&\7&\u01c8\n&\f&\16&\u01cb\13&\3\'\3\'\3\'\3\'\3\'\7\'\u01d2\n\'\f\'\16"+
		"\'\u01d5\13\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\7(\u01e2\n(\f(\16(\u01e5"+
		"\13(\3)\3)\3)\3)\3)\3)\3)\5)\u01ee\n)\3*\3*\7*\u01f2\n*\f*\16*\u01f5\13"+
		"*\3*\3*\5*\u01f9\n*\3+\3+\5+\u01fd\n+\3+\3+\3+\5+\u0202\n+\3+\3+\3+\5"+
		"+\u0207\n+\3+\3+\3+\3+\3+\3+\3+\5+\u0210\n+\3,\3,\3,\3,\7,\u0216\n,\f"+
		",\16,\u0219\13,\3,\5,\u021c\n,\5,\u021e\n,\3-\3-\5-\u0222\n-\3-\3-\3-"+
		"\3-\3-\3-\3-\5-\u022b\n-\3.\3.\3.\7.\u0230\n.\f.\16.\u0233\13.\3.\5.\u0236"+
		"\n.\3/\3/\5/\u023a\n/\3/\3/\5/\u023e\n/\3/\5/\u0241\n/\5/\u0243\n/\3\60"+
		"\3\60\5\60\u0247\n\60\3\61\3\61\3\61\7\61\u024c\n\61\f\61\16\61\u024f"+
		"\13\61\3\61\5\61\u0252\n\61\3\62\3\62\3\62\7\62\u0257\n\62\f\62\16\62"+
		"\u025a\13\62\3\62\5\62\u025d\n\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3"+
		"\63\3\63\7\63\u0268\n\63\f\63\16\63\u026b\13\63\3\63\5\63\u026e\n\63\5"+
		"\63\u0270\n\63\3\63\3\63\3\63\3\63\7\63\u0276\n\63\f\63\16\63\u0279\13"+
		"\63\3\63\5\63\u027c\n\63\5\63\u027e\n\63\5\63\u0280\n\63\3\64\3\64\3\64"+
		"\7\64\u0285\n\64\f\64\16\64\u0288\13\64\3\64\3\64\5\64\u028c\n\64\3\64"+
		"\3\64\3\64\3\64\7\64\u0292\n\64\f\64\16\64\u0295\13\64\3\64\3\64\3\64"+
		"\5\64\u029a\n\64\3\64\3\64\5\64\u029e\n\64\3\65\3\65\5\65\u02a2\n\65\3"+
		"\65\3\65\3\65\3\65\5\65\u02a8\n\65\3\66\3\66\5\66\u02ac\n\66\3\67\3\67"+
		"\3\67\3\67\3\67\5\67\u02b3\n\67\38\38\38\58\u02b8\n8\39\39\39\59\u02bd"+
		"\n9\3:\3:\3:\2\2;\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62"+
		"\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnpr\2\4\3\2@L\3\2\30\33\u0309\2x\3\2"+
		"\2\2\4}\3\2\2\2\6\u0088\3\2\2\2\b\u008b\3\2\2\2\n\u0095\3\2\2\2\f\u00dc"+
		"\3\2\2\2\16\u00de\3\2\2\2\20\u00e5\3\2\2\2\22\u00e7\3\2\2\2\24\u00f8\3"+
		"\2\2\2\26\u00fa\3\2\2\2\30\u0109\3\2\2\2\32\u0118\3\2\2\2\34\u011a\3\2"+
		"\2\2\36\u011d\3\2\2\2 \u0122\3\2\2\2\"\u0124\3\2\2\2$\u0126\3\2\2\2&\u0128"+
		"\3\2\2\2(\u012c\3\2\2\2*\u0139\3\2\2\2,\u013b\3\2\2\2.\u014e\3\2\2\2\60"+
		"\u0157\3\2\2\2\62\u016c\3\2\2\2\64\u016e\3\2\2\2\66\u0176\3\2\2\28\u0178"+
		"\3\2\2\2:\u0180\3\2\2\2<\u018b\3\2\2\2>\u018d\3\2\2\2@\u01a3\3\2\2\2B"+
		"\u01a6\3\2\2\2D\u01aa\3\2\2\2F\u01b2\3\2\2\2H\u01ba\3\2\2\2J\u01c2\3\2"+
		"\2\2L\u01cc\3\2\2\2N\u01d6\3\2\2\2P\u01ed\3\2\2\2R\u01ef\3\2\2\2T\u020f"+
		"\3\2\2\2V\u0211\3\2\2\2X\u022a\3\2\2\2Z\u022c\3\2\2\2\\\u0242\3\2\2\2"+
		"^\u0244\3\2\2\2`\u0248\3\2\2\2b\u0253\3\2\2\2d\u027f\3\2\2\2f\u0286\3"+
		"\2\2\2h\u02a7\3\2\2\2j\u02ab\3\2\2\2l\u02ad\3\2\2\2n\u02b4\3\2\2\2p\u02bc"+
		"\3\2\2\2r\u02be\3\2\2\2tw\7\26\2\2uw\5\20\t\2vt\3\2\2\2vu\3\2\2\2wz\3"+
		"\2\2\2xv\3\2\2\2xy\3\2\2\2y{\3\2\2\2zx\3\2\2\2{|\7\2\2\3|\3\3\2\2\2}~"+
		"\7>\2\2~\u0084\5(\25\2\177\u0081\7!\2\2\u0080\u0082\5f\64\2\u0081\u0080"+
		"\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0085\7\"\2\2\u0084"+
		"\177\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0087\7\26"+
		"\2\2\u0087\5\3\2\2\2\u0088\u0089\5\4\3\2\u0089\u008a\5\b\5\2\u008a\7\3"+
		"\2\2\2\u008b\u008c\7\3\2\2\u008c\u008d\7\27\2\2\u008d\u0090\5\n\6\2\u008e"+
		"\u008f\7?\2\2\u008f\u0091\5\64\33\2\u0090\u008e\3\2\2\2\u0090\u0091\3"+
		"\2\2\2\u0091\u0092\3\2\2\2\u0092\u0093\7$\2\2\u0093\u0094\5\62\32\2\u0094"+
		"\t\3\2\2\2\u0095\u0097\7!\2\2\u0096\u0098\5\f\7\2\u0097\u0096\3\2\2\2"+
		"\u0097\u0098\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a\7\"\2\2\u009a\13"+
		"\3\2\2\2\u009b\u009e\5\16\b\2\u009c\u009d\7\'\2\2\u009d\u009f\5\64\33"+
		"\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a8\3\2\2\2\u00a0\u00a1"+
		"\7#\2\2\u00a1\u00a4\5\16\b\2\u00a2\u00a3\7\'\2\2\u00a3\u00a5\5\64\33\2"+
		"\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a7\3\2\2\2\u00a6\u00a0"+
		"\3\2\2\2\u00a7\u00aa\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9"+
		"\u00c4\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab\u00c2\7#\2\2\u00ac\u00ae\7 \2"+
		"\2\u00ad\u00af\5\16\b\2\u00ae\u00ad\3\2\2\2\u00ae\u00af\3\2\2\2\u00af"+
		"\u00b8\3\2\2\2\u00b0\u00b1\7#\2\2\u00b1\u00b4\5\16\b\2\u00b2\u00b3\7\'"+
		"\2\2\u00b3\u00b5\5\64\33\2\u00b4\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5"+
		"\u00b7\3\2\2\2\u00b6\u00b0\3\2\2\2\u00b7\u00ba\3\2\2\2\u00b8\u00b6\3\2"+
		"\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00be\3\2\2\2\u00ba\u00b8\3\2\2\2\u00bb"+
		"\u00bc\7#\2\2\u00bc\u00bd\7&\2\2\u00bd\u00bf\5\16\b\2\u00be\u00bb\3\2"+
		"\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c3\3\2\2\2\u00c0\u00c1\7&\2\2\u00c1"+
		"\u00c3\5\16\b\2\u00c2\u00ac\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3"+
		"\2\2\2\u00c3\u00c5\3\2\2\2\u00c4\u00ab\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5"+
		"\u00dd\3\2\2\2\u00c6\u00c8\7 \2\2\u00c7\u00c9\5\16\b\2\u00c8\u00c7\3\2"+
		"\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00d2\3\2\2\2\u00ca\u00cb\7#\2\2\u00cb"+
		"\u00ce\5\16\b\2\u00cc\u00cd\7\'\2\2\u00cd\u00cf\5\64\33\2\u00ce\u00cc"+
		"\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d1\3\2\2\2\u00d0\u00ca\3\2\2\2\u00d1"+
		"\u00d4\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d8\3\2"+
		"\2\2\u00d4\u00d2\3\2\2\2\u00d5\u00d6\7#\2\2\u00d6\u00d7\7&\2\2\u00d7\u00d9"+
		"\5\16\b\2\u00d8\u00d5\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00dd\3\2\2\2"+
		"\u00da\u00db\7&\2\2\u00db\u00dd\5\16\b\2\u00dc\u009b\3\2\2\2\u00dc\u00c6"+
		"\3\2\2\2\u00dc\u00da\3\2\2\2\u00dd\r\3\2\2\2\u00de\u00e1\7\27\2\2\u00df"+
		"\u00e0\7$\2\2\u00e0\u00e2\5\64\33\2\u00e1\u00df\3\2\2\2\u00e1\u00e2\3"+
		"\2\2\2\u00e2\17\3\2\2\2\u00e3\u00e6\5\22\n\2\u00e4\u00e6\5*\26\2\u00e5"+
		"\u00e3\3\2\2\2\u00e5\u00e4\3\2\2\2\u00e6\21\3\2\2\2\u00e7\u00ec\5\24\13"+
		"\2\u00e8\u00e9\7%\2\2\u00e9\u00eb\5\24\13\2\u00ea\u00e8\3\2\2\2\u00eb"+
		"\u00ee\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00f0\3\2"+
		"\2\2\u00ee\u00ec\3\2\2\2\u00ef\u00f1\7%\2\2\u00f0\u00ef\3\2\2\2\u00f0"+
		"\u00f1\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f3\7\26\2\2\u00f3\23\3\2\2"+
		"\2\u00f4\u00f9\5\26\f\2\u00f5\u00f9\5\34\17\2\u00f6\u00f9\5\36\20\2\u00f7"+
		"\u00f9\5 \21\2\u00f8\u00f4\3\2\2\2\u00f8\u00f5\3\2\2\2\u00f8\u00f6\3\2"+
		"\2\2\u00f8\u00f7\3\2\2\2\u00f9\25\3\2\2\2\u00fa\u0105\5\30\r\2\u00fb\u00fc"+
		"\5\32\16\2\u00fc\u00fd\5b\62\2\u00fd\u0106\3\2\2\2\u00fe\u00ff\7\'\2\2"+
		"\u00ff\u0101\5\30\r\2\u0100\u00fe\3\2\2\2\u0101\u0104\3\2\2\2\u0102\u0100"+
		"\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0106\3\2\2\2\u0104\u0102\3\2\2\2\u0105"+
		"\u00fb\3\2\2\2\u0105\u0102\3\2\2\2\u0106\27\3\2\2\2\u0107\u010a\5\64\33"+
		"\2\u0108\u010a\5B\"\2\u0109\u0107\3\2\2\2\u0109\u0108\3\2\2\2\u010a\u0112"+
		"\3\2\2\2\u010b\u010e\7#\2\2\u010c\u010f\5\64\33\2\u010d\u010f\5B\"\2\u010e"+
		"\u010c\3\2\2\2\u010e\u010d\3\2\2\2\u010f\u0111\3\2\2\2\u0110\u010b\3\2"+
		"\2\2\u0111\u0114\3\2\2\2\u0112\u0110\3\2\2\2\u0112\u0113\3\2\2\2\u0113"+
		"\u0116\3\2\2\2\u0114\u0112\3\2\2\2\u0115\u0117\7#\2\2\u0116\u0115\3\2"+
		"\2\2\u0116\u0117\3\2\2\2\u0117\31\3\2\2\2\u0118\u0119\t\2\2\2\u0119\33"+
		"\3\2\2\2\u011a\u011b\7\22\2\2\u011b\u011c\5`\61\2\u011c\35\3\2\2\2\u011d"+
		"\u011e\7\23\2\2\u011e\37\3\2\2\2\u011f\u0123\5\"\22\2\u0120\u0123\5$\23"+
		"\2\u0121\u0123\5&\24\2\u0122\u011f\3\2\2\2\u0122\u0120\3\2\2\2\u0122\u0121"+
		"\3\2\2\2\u0123!\3\2\2\2\u0124\u0125\7\25\2\2\u0125#\3\2\2\2\u0126\u0127"+
		"\7\24\2\2\u0127%\3\2\2\2\u0128\u012a\7\4\2\2\u0129\u012b\5b\62\2\u012a"+
		"\u0129\3\2\2\2\u012a\u012b\3\2\2\2\u012b\'\3\2\2\2\u012c\u0131\7\27\2"+
		"\2\u012d\u012e\7\36\2\2\u012e\u0130\7\27\2\2\u012f\u012d\3\2\2\2\u0130"+
		"\u0133\3\2\2\2\u0131\u012f\3\2\2\2\u0131\u0132\3\2\2\2\u0132)\3\2\2\2"+
		"\u0133\u0131\3\2\2\2\u0134\u013a\5,\27\2\u0135\u013a\5.\30\2\u0136\u013a"+
		"\5\60\31\2\u0137\u013a\5\b\5\2\u0138\u013a\5\6\4\2\u0139\u0134\3\2\2\2"+
		"\u0139\u0135\3\2\2\2\u0139\u0136\3\2\2\2\u0139\u0137\3\2\2\2\u0139\u0138"+
		"\3\2\2\2\u013a+\3\2\2\2\u013b\u013c\7\5\2\2\u013c\u013d\5\64\33\2\u013d"+
		"\u013e\7$\2\2\u013e\u0146\5\62\32\2\u013f\u0140\7\6\2\2\u0140\u0141\5"+
		"\64\33\2\u0141\u0142\7$\2\2\u0142\u0143\5\62\32\2\u0143\u0145\3\2\2\2"+
		"\u0144\u013f\3\2\2\2\u0145\u0148\3\2\2\2\u0146\u0144\3\2\2\2\u0146\u0147"+
		"\3\2\2\2\u0147\u014c\3\2\2\2\u0148\u0146\3\2\2\2\u0149\u014a\7\7\2\2\u014a"+
		"\u014b\7$\2\2\u014b\u014d\5\62\32\2\u014c\u0149\3\2\2\2\u014c\u014d\3"+
		"\2\2\2\u014d-\3\2\2\2\u014e\u014f\7\b\2\2\u014f\u0150\5\64\33\2\u0150"+
		"\u0151\7$\2\2\u0151\u0155\5\62\32\2\u0152\u0153\7\7\2\2\u0153\u0154\7"+
		"$\2\2\u0154\u0156\5\62\32\2\u0155\u0152\3\2\2\2\u0155\u0156\3\2\2\2\u0156"+
		"/\3\2\2\2\u0157\u0158\7\t\2\2\u0158\u0159\5`\61\2\u0159\u015a\7\n\2\2"+
		"\u015a\u015b\5b\62\2\u015b\u015c\7$\2\2\u015c\u0160\5\62\32\2\u015d\u015e"+
		"\7\7\2\2\u015e\u015f\7$\2\2\u015f\u0161\5\62\32\2\u0160\u015d\3\2\2\2"+
		"\u0160\u0161\3\2\2\2\u0161\61\3\2\2\2\u0162\u016d\5\22\n\2\u0163\u0164"+
		"\7\26\2\2\u0164\u0166\7O\2\2\u0165\u0167\5\20\t\2\u0166\u0165\3\2\2\2"+
		"\u0167\u0168\3\2\2\2\u0168\u0166\3\2\2\2\u0168\u0169\3\2\2\2\u0169\u016a"+
		"\3\2\2\2\u016a\u016b\7P\2\2\u016b\u016d\3\2\2\2\u016c\u0162\3\2\2\2\u016c"+
		"\u0163\3\2\2\2\u016d\63\3\2\2\2\u016e\u0174\58\35\2\u016f\u0170\7\5\2"+
		"\2\u0170\u0171\58\35\2\u0171\u0172\7\7\2\2\u0172\u0173\5\64\33\2\u0173"+
		"\u0175\3\2\2\2\u0174\u016f\3\2\2\2\u0174\u0175\3\2\2\2\u0175\65\3\2\2"+
		"\2\u0176\u0177\58\35\2\u0177\67\3\2\2\2\u0178\u017d\5:\36\2\u0179\u017a"+
		"\7\13\2\2\u017a\u017c\5:\36\2\u017b\u0179\3\2\2\2\u017c\u017f\3\2\2\2"+
		"\u017d\u017b\3\2\2\2\u017d\u017e\3\2\2\2\u017e9\3\2\2\2\u017f\u017d\3"+
		"\2\2\2\u0180\u0185\5<\37\2\u0181\u0182\7\f\2\2\u0182\u0184\5<\37\2\u0183"+
		"\u0181\3\2\2\2\u0184\u0187\3\2\2\2\u0185\u0183\3\2\2\2\u0185\u0186\3\2"+
		"\2\2\u0186;\3\2\2\2\u0187\u0185\3\2\2\2\u0188\u0189\7\r\2\2\u0189\u018c"+
		"\5<\37\2\u018a\u018c\5> \2\u018b\u0188\3\2\2\2\u018b\u018a\3\2\2\2\u018c"+
		"=\3\2\2\2\u018d\u0193\5B\"\2\u018e\u018f\5@!\2\u018f\u0190\5B\"\2\u0190"+
		"\u0192\3\2\2\2\u0191\u018e\3\2\2\2\u0192\u0195\3\2\2\2\u0193\u0191\3\2"+
		"\2\2\u0193\u0194\3\2\2\2\u0194?\3\2\2\2\u0195\u0193\3\2\2\2\u0196\u01a4"+
		"\7\67\2\2\u0197\u01a4\78\2\2\u0198\u01a4\79\2\2\u0199\u01a4\7:\2\2\u019a"+
		"\u01a4\7;\2\2\u019b\u01a4\7<\2\2\u019c\u01a4\7=\2\2\u019d\u01a4\7\n\2"+
		"\2\u019e\u019f\7\r\2\2\u019f\u01a4\7\n\2\2\u01a0\u01a4\7\16\2\2\u01a1"+
		"\u01a2\7\16\2\2\u01a2\u01a4\7\r\2\2\u01a3\u0196\3\2\2\2\u01a3\u0197\3"+
		"\2\2\2\u01a3\u0198\3\2\2\2\u01a3\u0199\3\2\2\2\u01a3\u019a\3\2\2\2\u01a3"+
		"\u019b\3\2\2\2\u01a3\u019c\3\2\2\2\u01a3\u019d\3\2\2\2\u01a3\u019e\3\2"+
		"\2\2\u01a3\u01a0\3\2\2\2\u01a3\u01a1\3\2\2\2\u01a4A\3\2\2\2\u01a5\u01a7"+
		"\7 \2\2\u01a6\u01a5\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8"+
		"\u01a9\5D#\2\u01a9C\3\2\2\2\u01aa\u01af\5F$\2\u01ab\u01ac\7*\2\2\u01ac"+
		"\u01ae\5F$\2\u01ad\u01ab\3\2\2\2\u01ae\u01b1\3\2\2\2\u01af\u01ad\3\2\2"+
		"\2\u01af\u01b0\3\2\2\2\u01b0E\3\2\2\2\u01b1\u01af\3\2\2\2\u01b2\u01b7"+
		"\5H%\2\u01b3\u01b4\7+\2\2\u01b4\u01b6\5H%\2\u01b5\u01b3\3\2\2\2\u01b6"+
		"\u01b9\3\2\2\2\u01b7\u01b5\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8G\3\2\2\2"+
		"\u01b9\u01b7\3\2\2\2\u01ba\u01bf\5J&\2\u01bb\u01bc\7,\2\2\u01bc\u01be"+
		"\5J&\2\u01bd\u01bb\3\2\2\2\u01be\u01c1\3\2\2\2\u01bf\u01bd\3\2\2\2\u01bf"+
		"\u01c0\3\2\2\2\u01c0I\3\2\2\2\u01c1\u01bf\3\2\2\2\u01c2\u01c9\5L\'\2\u01c3"+
		"\u01c4\7-\2\2\u01c4\u01c8\5L\'\2\u01c5\u01c6\7.\2\2\u01c6\u01c8\5L\'\2"+
		"\u01c7\u01c3\3\2\2\2\u01c7\u01c5\3\2\2\2\u01c8\u01cb\3\2\2\2\u01c9\u01c7"+
		"\3\2\2\2\u01c9\u01ca\3\2\2\2\u01caK\3\2\2\2\u01cb\u01c9\3\2\2\2\u01cc"+
		"\u01d3\5N(\2\u01cd\u01ce\7/\2\2\u01ce\u01d2\5N(\2\u01cf\u01d0\7\60\2\2"+
		"\u01d0\u01d2\5N(\2\u01d1\u01cd\3\2\2\2\u01d1\u01cf\3\2\2\2\u01d2\u01d5"+
		"\3\2\2\2\u01d3\u01d1\3\2\2\2\u01d3\u01d4\3\2\2\2\u01d4M\3\2\2\2\u01d5"+
		"\u01d3\3\2\2\2\u01d6\u01e3\5P)\2\u01d7\u01d8\7 \2\2\u01d8\u01e2\5P)\2"+
		"\u01d9\u01da\7\61\2\2\u01da\u01e2\5P)\2\u01db\u01dc\7\62\2\2\u01dc\u01e2"+
		"\5P)\2\u01dd\u01de\7\63\2\2\u01de\u01e2\5P)\2\u01df\u01e0\7>\2\2\u01e0"+
		"\u01e2\5P)\2\u01e1\u01d7\3\2\2\2\u01e1\u01d9\3\2\2\2\u01e1\u01db\3\2\2"+
		"\2\u01e1\u01dd\3\2\2\2\u01e1\u01df\3\2\2\2\u01e2\u01e5\3\2\2\2\u01e3\u01e1"+
		"\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4O\3\2\2\2\u01e5\u01e3\3\2\2\2\u01e6"+
		"\u01e7\7/\2\2\u01e7\u01ee\5P)\2\u01e8\u01e9\7\60\2\2\u01e9\u01ee\5P)\2"+
		"\u01ea\u01eb\7\64\2\2\u01eb\u01ee\5P)\2\u01ec\u01ee\5R*\2\u01ed\u01e6"+
		"\3\2\2\2\u01ed\u01e8\3\2\2\2\u01ed\u01ea\3\2\2\2\u01ed\u01ec\3\2\2\2\u01ee"+
		"Q\3\2\2\2\u01ef\u01f3\5T+\2\u01f0\u01f2\5X-\2\u01f1\u01f0\3\2\2\2\u01f2"+
		"\u01f5\3\2\2\2\u01f3\u01f1\3\2\2\2\u01f3\u01f4\3\2\2\2\u01f4\u01f8\3\2"+
		"\2\2\u01f5\u01f3\3\2\2\2\u01f6\u01f7\7&\2\2\u01f7\u01f9\5P)\2\u01f8\u01f6"+
		"\3\2\2\2\u01f8\u01f9\3\2\2\2\u01f9S\3\2\2\2\u01fa\u01fc\7!\2\2\u01fb\u01fd"+
		"\5V,\2\u01fc\u01fb\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fd\u01fe\3\2\2\2\u01fe"+
		"\u0210\7\"\2\2\u01ff\u0201\7(\2\2\u0200\u0202\5V,\2\u0201\u0200\3\2\2"+
		"\2\u0201\u0202\3\2\2\2\u0202\u0203\3\2\2\2\u0203\u0210\7)\2\2\u0204\u0206"+
		"\7\65\2\2\u0205\u0207\5d\63\2\u0206\u0205\3\2\2\2\u0206\u0207\3\2\2\2"+
		"\u0207\u0208\3\2\2\2\u0208\u0210\7\66\2\2\u0209\u0210\7\27\2\2\u020a\u0210"+
		"\5p9\2\u020b\u0210\7\37\2\2\u020c\u0210\7\17\2\2\u020d\u0210\7\20\2\2"+
		"\u020e\u0210\7\21\2\2\u020f\u01fa\3\2\2\2\u020f\u01ff\3\2\2\2\u020f\u0204"+
		"\3\2\2\2\u020f\u0209\3\2\2\2\u020f\u020a\3\2\2\2\u020f\u020b\3\2\2\2\u020f"+
		"\u020c\3\2\2\2\u020f\u020d\3\2\2\2\u020f\u020e\3\2\2\2\u0210U\3\2\2\2"+
		"\u0211\u021d\5\64\33\2\u0212\u021e\5l\67\2\u0213\u0214\7#\2\2\u0214\u0216"+
		"\5\64\33\2\u0215\u0213\3\2\2\2\u0216\u0219\3\2\2\2\u0217\u0215\3\2\2\2"+
		"\u0217\u0218\3\2\2\2\u0218\u021b\3\2\2\2\u0219\u0217\3\2\2\2\u021a\u021c"+
		"\7#\2\2\u021b\u021a\3\2\2\2\u021b\u021c\3\2\2\2\u021c\u021e\3\2\2\2\u021d"+
		"\u0212\3\2\2\2\u021d\u0217\3\2\2\2\u021eW\3\2\2\2\u021f\u0221\7!\2\2\u0220"+
		"\u0222\5f\64\2\u0221\u0220\3\2\2\2\u0221\u0222\3\2\2\2\u0222\u0223\3\2"+
		"\2\2\u0223\u022b\7\"\2\2\u0224\u0225\7(\2\2\u0225\u0226\5Z.\2\u0226\u0227"+
		"\7)\2\2\u0227\u022b\3\2\2\2\u0228\u0229\7\36\2\2\u0229\u022b\7\27\2\2"+
		"\u022a\u021f\3\2\2\2\u022a\u0224\3\2\2\2\u022a\u0228\3\2\2\2\u022bY\3"+
		"\2\2\2\u022c\u0231\5\\/\2\u022d\u022e\7#\2\2\u022e\u0230\5\\/\2\u022f"+
		"\u022d\3\2\2\2\u0230\u0233\3\2\2\2\u0231\u022f\3\2\2\2\u0231\u0232\3\2"+
		"\2\2\u0232\u0235\3\2\2\2\u0233\u0231\3\2\2\2\u0234\u0236\7#\2\2\u0235"+
		"\u0234\3\2\2\2\u0235\u0236\3\2\2\2\u0236[\3\2\2\2\u0237\u0243\5\64\33"+
		"\2\u0238\u023a\5\64\33\2\u0239\u0238\3\2\2\2\u0239\u023a\3\2\2\2\u023a"+
		"\u023b\3\2\2\2\u023b\u023d\7$\2\2\u023c\u023e\5\64\33\2\u023d\u023c\3"+
		"\2\2\2\u023d\u023e\3\2\2\2\u023e\u0240\3\2\2\2\u023f\u0241\5^\60\2\u0240"+
		"\u023f\3\2\2\2\u0240\u0241\3\2\2\2\u0241\u0243\3\2\2\2\u0242\u0237\3\2"+
		"\2\2\u0242\u0239\3\2\2\2\u0243]\3\2\2\2\u0244\u0246\7$\2\2\u0245\u0247"+
		"\5\64\33\2\u0246\u0245\3\2\2\2\u0246\u0247\3\2\2\2\u0247_\3\2\2\2\u0248"+
		"\u024d\5B\"\2\u0249\u024a\7#\2\2\u024a\u024c\5B\"\2\u024b\u0249\3\2\2"+
		"\2\u024c\u024f\3\2\2\2\u024d\u024b\3\2\2\2\u024d\u024e\3\2\2\2\u024e\u0251"+
		"\3\2\2\2\u024f\u024d\3\2\2\2\u0250\u0252\7#\2\2\u0251\u0250\3\2\2\2\u0251"+
		"\u0252\3\2\2\2\u0252a\3\2\2\2\u0253\u0258\5\64\33\2\u0254\u0255\7#\2\2"+
		"\u0255\u0257\5\64\33\2\u0256\u0254\3\2\2\2\u0257\u025a\3\2\2\2\u0258\u0256"+
		"\3\2\2\2\u0258\u0259\3\2\2\2\u0259\u025c\3\2\2\2\u025a\u0258\3\2\2\2\u025b"+
		"\u025d\7#\2\2\u025c\u025b\3\2\2\2\u025c\u025d\3\2\2\2\u025dc\3\2\2\2\u025e"+
		"\u025f\5\64\33\2\u025f\u0260\7$\2\2\u0260\u026f\5\64\33\2\u0261\u0270"+
		"\5l\67\2\u0262\u0263\7#\2\2\u0263\u0264\5\64\33\2\u0264\u0265\7$\2\2\u0265"+
		"\u0266\5\64\33\2\u0266\u0268\3\2\2\2\u0267\u0262\3\2\2\2\u0268\u026b\3"+
		"\2\2\2\u0269\u0267\3\2\2\2\u0269\u026a\3\2\2\2\u026a\u026d\3\2\2\2\u026b"+
		"\u0269\3\2\2\2\u026c\u026e\7#\2\2\u026d\u026c\3\2\2\2\u026d\u026e\3\2"+
		"\2\2\u026e\u0270\3\2\2\2\u026f\u0261\3\2\2\2\u026f\u0269\3\2\2\2\u0270"+
		"\u0280\3\2\2\2\u0271\u027d\5\64\33\2\u0272\u027e\5l\67\2\u0273\u0274\7"+
		"#\2\2\u0274\u0276\5\64\33\2\u0275\u0273\3\2\2\2\u0276\u0279\3\2\2\2\u0277"+
		"\u0275\3\2\2\2\u0277\u0278\3\2\2\2\u0278\u027b\3\2\2\2\u0279\u0277\3\2"+
		"\2\2\u027a\u027c\7#\2\2\u027b\u027a\3\2\2\2\u027b\u027c\3\2\2\2\u027c"+
		"\u027e\3\2\2\2\u027d\u0272\3\2\2\2\u027d\u0277\3\2\2\2\u027e\u0280\3\2"+
		"\2\2\u027f\u025e\3\2\2\2\u027f\u0271\3\2\2\2\u0280e\3\2\2\2\u0281\u0282"+
		"\5h\65\2\u0282\u0283\7#\2\2\u0283\u0285\3\2\2\2\u0284\u0281\3\2\2\2\u0285"+
		"\u0288\3\2\2\2\u0286\u0284\3\2\2\2\u0286\u0287\3\2\2\2\u0287\u029d\3\2"+
		"\2\2\u0288\u0286\3\2\2\2\u0289\u028b\5h\65\2\u028a\u028c\7#\2\2\u028b"+
		"\u028a\3\2\2\2\u028b\u028c\3\2\2\2\u028c\u029e\3\2\2\2\u028d\u028e\7 "+
		"\2\2\u028e\u0293\5\64\33\2\u028f\u0290\7#\2\2\u0290\u0292\5h\65\2\u0291"+
		"\u028f\3\2\2\2\u0292\u0295\3\2\2\2\u0293\u0291\3\2\2\2\u0293\u0294\3\2"+
		"\2\2\u0294\u0299\3\2\2\2\u0295\u0293\3\2\2\2\u0296\u0297\7#\2\2\u0297"+
		"\u0298\7&\2\2\u0298\u029a\5\64\33\2\u0299\u0296\3\2\2\2\u0299\u029a\3"+
		"\2\2\2\u029a\u029e\3\2\2\2\u029b\u029c\7&\2\2\u029c\u029e\5\64\33\2\u029d"+
		"\u0289\3\2\2\2\u029d\u028d\3\2\2\2\u029d\u029b\3\2\2\2\u029eg\3\2\2\2"+
		"\u029f\u02a1\5\64\33\2\u02a0\u02a2\5l\67\2\u02a1\u02a0\3\2\2\2\u02a1\u02a2"+
		"\3\2\2\2\u02a2\u02a8\3\2\2\2\u02a3\u02a4\5\64\33\2\u02a4\u02a5\7\'\2\2"+
		"\u02a5\u02a6\5\64\33\2\u02a6\u02a8\3\2\2\2\u02a7\u029f\3\2\2\2\u02a7\u02a3"+
		"\3\2\2\2\u02a8i\3\2\2\2\u02a9\u02ac\5l\67\2\u02aa\u02ac\5n8\2\u02ab\u02a9"+
		"\3\2\2\2\u02ab\u02aa\3\2\2\2\u02ack\3\2\2\2\u02ad\u02ae\7\t\2\2\u02ae"+
		"\u02af\5`\61\2\u02af\u02b0\7\n\2\2\u02b0\u02b2\58\35\2\u02b1\u02b3\5j"+
		"\66\2\u02b2\u02b1\3\2\2\2\u02b2\u02b3\3\2\2\2\u02b3m\3\2\2\2\u02b4\u02b5"+
		"\7\5\2\2\u02b5\u02b7\5\66\34\2\u02b6\u02b8\5j\66\2\u02b7\u02b6\3\2\2\2"+
		"\u02b7\u02b8\3\2\2\2\u02b8o\3\2\2\2\u02b9\u02bd\5r:\2\u02ba\u02bd\7\34"+
		"\2\2\u02bb\u02bd\7\35\2\2\u02bc\u02b9\3\2\2\2\u02bc\u02ba\3\2\2\2\u02bc"+
		"\u02bb\3\2\2\2\u02bdq\3\2\2\2\u02be\u02bf\t\3\2\2\u02bfs\3\2\2\2dvx\u0081"+
		"\u0084\u0090\u0097\u009e\u00a4\u00a8\u00ae\u00b4\u00b8\u00be\u00c2\u00c4"+
		"\u00c8\u00ce\u00d2\u00d8\u00dc\u00e1\u00e5\u00ec\u00f0\u00f8\u0102\u0105"+
		"\u0109\u010e\u0112\u0116\u0122\u012a\u0131\u0139\u0146\u014c\u0155\u0160"+
		"\u0168\u016c\u0174\u017d\u0185\u018b\u0193\u01a3\u01a6\u01af\u01b7\u01bf"+
		"\u01c7\u01c9\u01d1\u01d3\u01e1\u01e3\u01ed\u01f3\u01f8\u01fc\u0201\u0206"+
		"\u020f\u0217\u021b\u021d\u0221\u022a\u0231\u0235\u0239\u023d\u0240\u0242"+
		"\u0246\u024d\u0251\u0258\u025c\u0269\u026d\u026f\u0277\u027b\u027d\u027f"+
		"\u0286\u028b\u0293\u0299\u029d\u02a1\u02a7\u02ab\u02b2\u02b7\u02bc";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
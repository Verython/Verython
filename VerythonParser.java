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
		ALWAYS=72, SKIP_=73, UNKNOWN_CHAR=74, INDENT=75, DEDENT=76;
	public static final int
		RULE_initial = 0, RULE_top = 1, RULE_decorator = 2, RULE_block = 3, RULE_funcdef = 4, 
		RULE_blocks = 5, RULE_parameters = 6, RULE_typedargslist = 7, RULE_tfpdef = 8, 
		RULE_stmt = 9, RULE_simple_stmt = 10, RULE_small_stmt = 11, RULE_expr_stmt = 12, 
		RULE_testlist_star_expr = 13, RULE_augassign = 14, RULE_del_stmt = 15, 
		RULE_pass_stmt = 16, RULE_flow_stmt = 17, RULE_break_stmt = 18, RULE_continue_stmt = 19, 
		RULE_return_stmt = 20, RULE_compound_stmt = 21, RULE_if_stmt = 22, RULE_switch_stmt = 23, 
		RULE_switch_suite = 24, RULE_case_stmt = 25, RULE_while_stmt = 26, RULE_for_stmt = 27, 
		RULE_suite = 28, RULE_test = 29, RULE_or_test = 30, RULE_and_test = 31, 
		RULE_not_test = 32, RULE_comparison = 33, RULE_comp_op = 34, RULE_star_expr = 35, 
		RULE_expr = 36, RULE_xor_expr = 37, RULE_and_expr = 38, RULE_shift_expr = 39, 
		RULE_arith_expr = 40, RULE_term = 41, RULE_factor = 42, RULE_power = 43, 
		RULE_atom = 44, RULE_testlist_comp = 45, RULE_trailer = 46, RULE_subscriptlist = 47, 
		RULE_subscript = 48, RULE_sliceop = 49, RULE_exprlist = 50, RULE_testlist = 51, 
		RULE_dictorsetmaker = 52, RULE_arglist = 53, RULE_argument = 54, RULE_comp_iter = 55, 
		RULE_comp_for = 56, RULE_comp_if = 57, RULE_number = 58;
	public static final String[] ruleNames = {
		"initial", "top", "decorator", "block", "funcdef", "blocks", "parameters", 
		"typedargslist", "tfpdef", "stmt", "simple_stmt", "small_stmt", "expr_stmt", 
		"testlist_star_expr", "augassign", "del_stmt", "pass_stmt", "flow_stmt", 
		"break_stmt", "continue_stmt", "return_stmt", "compound_stmt", "if_stmt", 
		"switch_stmt", "switch_suite", "case_stmt", "while_stmt", "for_stmt", 
		"suite", "test", "or_test", "and_test", "not_test", "comparison", "comp_op", 
		"star_expr", "expr", "xor_expr", "and_expr", "shift_expr", "arith_expr", 
		"term", "factor", "power", "atom", "testlist_comp", "trailer", "subscriptlist", 
		"subscript", "sliceop", "exprlist", "testlist", "dictorsetmaker", "arglist", 
		"argument", "comp_iter", "comp_for", "comp_if", "number"
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
		"'@initial'", "'@always'"
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
		public TopContext top() {
			return getRuleContext(TopContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(VerythonParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(VerythonParser.NEWLINE, i);
		}
		public TerminalNode EOF() { return getToken(VerythonParser.EOF, 0); }
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
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(118);
				match(NEWLINE);
				}
				}
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(124);
			top();
			setState(126);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(125);
				match(EOF);
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
			setState(128);
			match(TOP);
			setState(129);
			match(NEWLINE);
			setState(130);
			funcdef();
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DEF || _la==NEWLINE) {
				{
				setState(133);
				switch (_input.LA(1)) {
				case NEWLINE:
					{
					setState(131);
					match(NEWLINE);
					}
					break;
				case DEF:
					{
					setState(132);
					funcdef();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(137);
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
		public ArglistContext arglist() {
			return getRuleContext(ArglistContext.class,0);
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
			setState(145);
			switch (_input.LA(1)) {
			case INITAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(138);
				match(INITAL);
				}
				break;
			case ALWAYS:
				enterOuterAlt(_localctx, 2);
				{
				setState(139);
				match(ALWAYS);
				setState(140);
				match(OPEN_PAREN);
				setState(142);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << NOT) | (1L << NONE) | (1L << TRUE) | (1L << FALSE) | (1L << NAME) | (1L << DECIMAL_INTEGER) | (1L << OCT_INTEGER) | (1L << HEX_INTEGER) | (1L << BIN_INTEGER) | (1L << STAR) | (1L << OPEN_PAREN) | (1L << OPEN_BRACK) | (1L << ADD) | (1L << MINUS) | (1L << NOT_OP) | (1L << OPEN_BRACE))) != 0)) {
					{
					setState(141);
					arglist();
					}
				}

				setState(144);
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
		enterRule(_localctx, 6, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(BLOCK);
			setState(148);
			match(COLON);
			setState(149);
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
		enterRule(_localctx, 8, RULE_funcdef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(DEF);
			setState(152);
			match(NAME);
			setState(153);
			parameters();
			setState(154);
			match(COLON);
			setState(155);
			match(NEWLINE);
			setState(156);
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
		public DecoratorContext decorator() {
			return getRuleContext(DecoratorContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(VerythonParser.NEWLINE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode DEDENT() { return getToken(VerythonParser.DEDENT, 0); }
		public TerminalNode EOF() { return getToken(VerythonParser.EOF, 0); }
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
		enterRule(_localctx, 10, RULE_blocks);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(INDENT);
			setState(159);
			decorator();
			setState(160);
			match(NEWLINE);
			setState(161);
			block();
			setState(162);
			_la = _input.LA(1);
			if ( !(_la==EOF || _la==DEDENT) ) {
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

	public static class ParametersContext extends ParserRuleContext {
		public TypedargslistContext typedargslist() {
			return getRuleContext(TypedargslistContext.class,0);
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
		enterRule(_localctx, 12, RULE_parameters);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(OPEN_PAREN);
			setState(165);
			typedargslist();
			setState(166);
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
		enterRule(_localctx, 14, RULE_typedargslist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(OPEN_BRACK);
			setState(169);
			match(DECIMAL_INTEGER);
			setState(170);
			match(COLON);
			setState(171);
			match(DECIMAL_INTEGER);
			setState(172);
			match(CLOSE_BRACK);
			setState(173);
			tfpdef();
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(174);
				match(COMMA);
				setState(175);
				match(OPEN_BRACK);
				setState(176);
				match(DECIMAL_INTEGER);
				setState(177);
				match(COLON);
				setState(178);
				match(DECIMAL_INTEGER);
				setState(179);
				match(CLOSE_BRACK);
				setState(180);
				tfpdef();
				}
				}
				setState(185);
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
		enterRule(_localctx, 16, RULE_tfpdef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(NAME);
			setState(189);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(187);
				match(COLON);
				setState(188);
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
		enterRule(_localctx, 18, RULE_stmt);
		try {
			setState(193);
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
				setState(191);
				simple_stmt();
				}
				break;
			case IF:
			case SWITCH:
			case WHILE:
			case FOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(192);
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
		enterRule(_localctx, 20, RULE_simple_stmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			small_stmt();
			setState(200);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(196);
					match(SEMI_COLON);
					setState(197);
					small_stmt();
					}
					} 
				}
				setState(202);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			setState(204);
			_la = _input.LA(1);
			if (_la==SEMI_COLON) {
				{
				setState(203);
				match(SEMI_COLON);
				}
			}

			setState(206);
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
		enterRule(_localctx, 22, RULE_small_stmt);
		try {
			setState(212);
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
				setState(208);
				expr_stmt();
				}
				break;
			case DEL:
				enterOuterAlt(_localctx, 2);
				{
				setState(209);
				del_stmt();
				}
				break;
			case PASS:
				enterOuterAlt(_localctx, 3);
				{
				setState(210);
				pass_stmt();
				}
				break;
			case RETURN:
			case CONTINUE:
			case BREAK:
				enterOuterAlt(_localctx, 4);
				{
				setState(211);
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
		enterRule(_localctx, 24, RULE_expr_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			testlist_star_expr();
			setState(225);
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
				setState(215);
				augassign();
				setState(216);
				testlist();
				}
				break;
			case NEWLINE:
			case SEMI_COLON:
			case ASSIGN:
				{
				setState(222);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ASSIGN) {
					{
					{
					setState(218);
					match(ASSIGN);
					setState(219);
					testlist_star_expr();
					}
					}
					setState(224);
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
		enterRule(_localctx, 26, RULE_testlist_star_expr);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(227);
				test();
				}
				break;
			case 2:
				{
				setState(228);
				star_expr();
				}
				break;
			}
			setState(238);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(231);
					match(COMMA);
					setState(234);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						setState(232);
						test();
						}
						break;
					case 2:
						{
						setState(233);
						star_expr();
						}
						break;
					}
					}
					} 
				}
				setState(240);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			setState(242);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(241);
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
		enterRule(_localctx, 28, RULE_augassign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
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
		enterRule(_localctx, 30, RULE_del_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			match(DEL);
			setState(247);
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
		enterRule(_localctx, 32, RULE_pass_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
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
		enterRule(_localctx, 34, RULE_flow_stmt);
		try {
			setState(254);
			switch (_input.LA(1)) {
			case BREAK:
				enterOuterAlt(_localctx, 1);
				{
				setState(251);
				break_stmt();
				}
				break;
			case CONTINUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(252);
				continue_stmt();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 3);
				{
				setState(253);
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
		enterRule(_localctx, 36, RULE_break_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
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
		enterRule(_localctx, 38, RULE_continue_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
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
		enterRule(_localctx, 40, RULE_return_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			match(RETURN);
			setState(262);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << NOT) | (1L << NONE) | (1L << TRUE) | (1L << FALSE) | (1L << NAME) | (1L << DECIMAL_INTEGER) | (1L << OCT_INTEGER) | (1L << HEX_INTEGER) | (1L << BIN_INTEGER) | (1L << STAR) | (1L << OPEN_PAREN) | (1L << OPEN_BRACK) | (1L << ADD) | (1L << MINUS) | (1L << NOT_OP) | (1L << OPEN_BRACE))) != 0)) {
				{
				setState(261);
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
		enterRule(_localctx, 42, RULE_compound_stmt);
		try {
			setState(268);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(264);
				if_stmt();
				}
				break;
			case SWITCH:
				enterOuterAlt(_localctx, 2);
				{
				setState(265);
				switch_stmt();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(266);
				while_stmt();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 4);
				{
				setState(267);
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
		enterRule(_localctx, 44, RULE_if_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			match(IF);
			setState(271);
			test();
			setState(272);
			match(COLON);
			setState(273);
			suite();
			setState(281);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELIF) {
				{
				{
				setState(274);
				match(ELIF);
				setState(275);
				test();
				setState(276);
				match(COLON);
				setState(277);
				suite();
				}
				}
				setState(283);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(287);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(284);
				match(ELSE);
				setState(285);
				match(COLON);
				setState(286);
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
		enterRule(_localctx, 46, RULE_switch_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			match(SWITCH);
			setState(290);
			match(OPEN_PAREN);
			setState(291);
			match(NAME);
			setState(292);
			match(CLOSE_PAREN);
			setState(293);
			match(COLON);
			setState(294);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerythonVisitor ) return ((VerythonVisitor<? extends T>)visitor).visitSwitch_suite(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Switch_suiteContext switch_suite() throws RecognitionException {
		Switch_suiteContext _localctx = new Switch_suiteContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_switch_suite);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			match(NEWLINE);
			setState(297);
			match(INDENT);
			setState(298);
			case_stmt();
			setState(299);
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
		public TerminalNode DEDENT() { return getToken(VerythonParser.DEDENT, 0); }
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerythonVisitor ) return ((VerythonVisitor<? extends T>)visitor).visitCase_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Case_stmtContext case_stmt() throws RecognitionException {
		Case_stmtContext _localctx = new Case_stmtContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_case_stmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			match(CASE);
			setState(302);
			number();
			setState(303);
			match(COLON);
			setState(310);
			switch (_input.LA(1)) {
			case RETURN:
				{
				setState(304);
				match(RETURN);
				setState(307);
				switch (_input.LA(1)) {
				case NAME:
					{
					setState(305);
					match(NAME);
					}
					break;
				case DECIMAL_INTEGER:
				case OCT_INTEGER:
				case HEX_INTEGER:
				case BIN_INTEGER:
					{
					setState(306);
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
				setState(309);
				expr_stmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(326);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(312);
					match(NEWLINE);
					setState(313);
					match(CASE);
					setState(314);
					number();
					setState(315);
					match(COLON);
					setState(322);
					switch (_input.LA(1)) {
					case RETURN:
						{
						setState(316);
						match(RETURN);
						setState(319);
						switch (_input.LA(1)) {
						case NAME:
							{
							setState(317);
							match(NAME);
							}
							break;
						case DECIMAL_INTEGER:
						case OCT_INTEGER:
						case HEX_INTEGER:
						case BIN_INTEGER:
							{
							setState(318);
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
						setState(321);
						expr_stmt();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					} 
				}
				setState(328);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			}
			setState(329);
			match(NEWLINE);
			setState(330);
			match(DEFAULT);
			setState(331);
			match(COLON);
			setState(338);
			switch (_input.LA(1)) {
			case RETURN:
				{
				setState(332);
				match(RETURN);
				setState(335);
				switch (_input.LA(1)) {
				case NAME:
					{
					setState(333);
					match(NAME);
					}
					break;
				case DECIMAL_INTEGER:
				case OCT_INTEGER:
				case HEX_INTEGER:
				case BIN_INTEGER:
					{
					setState(334);
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
				setState(337);
				expr_stmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(340);
			match(NEWLINE);
			setState(341);
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
		enterRule(_localctx, 52, RULE_while_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			match(WHILE);
			setState(344);
			test();
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
		enterRule(_localctx, 54, RULE_for_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			match(FOR);
			setState(353);
			exprlist();
			setState(354);
			match(IN);
			setState(355);
			testlist();
			setState(356);
			match(COLON);
			setState(357);
			suite();
			setState(361);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(358);
				match(ELSE);
				setState(359);
				match(COLON);
				setState(360);
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
		enterRule(_localctx, 56, RULE_suite);
		int _la;
		try {
			setState(373);
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
				setState(363);
				simple_stmt();
				}
				break;
			case NEWLINE:
				enterOuterAlt(_localctx, 2);
				{
				setState(364);
				match(NEWLINE);
				setState(365);
				match(INDENT);
				setState(367); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(366);
					stmt();
					}
					}
					setState(369); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << RETURN) | (1L << IF) | (1L << SWITCH) | (1L << WHILE) | (1L << FOR) | (1L << NOT) | (1L << NONE) | (1L << TRUE) | (1L << FALSE) | (1L << DEL) | (1L << PASS) | (1L << CONTINUE) | (1L << BREAK) | (1L << NAME) | (1L << DECIMAL_INTEGER) | (1L << OCT_INTEGER) | (1L << HEX_INTEGER) | (1L << BIN_INTEGER) | (1L << STAR) | (1L << OPEN_PAREN) | (1L << OPEN_BRACK) | (1L << ADD) | (1L << MINUS) | (1L << NOT_OP) | (1L << OPEN_BRACE))) != 0) );
				setState(371);
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
		enterRule(_localctx, 58, RULE_test);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			or_test();
			setState(381);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(376);
				match(IF);
				setState(377);
				or_test();
				setState(378);
				match(ELSE);
				setState(379);
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
		enterRule(_localctx, 60, RULE_or_test);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			and_test();
			setState(388);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(384);
				match(OR);
				setState(385);
				and_test();
				}
				}
				setState(390);
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
		enterRule(_localctx, 62, RULE_and_test);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(391);
			not_test();
			setState(396);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(392);
				match(AND);
				setState(393);
				not_test();
				}
				}
				setState(398);
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
		enterRule(_localctx, 64, RULE_not_test);
		try {
			setState(402);
			switch (_input.LA(1)) {
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(399);
				match(NOT);
				setState(400);
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
				setState(401);
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
		enterRule(_localctx, 66, RULE_comparison);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(404);
			star_expr();
			setState(410);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IN) | (1L << NOT) | (1L << IS) | (1L << LESS_THAN) | (1L << GREATER_THAN) | (1L << EQUALS) | (1L << GT_EQ) | (1L << LT_EQ) | (1L << NOT_EQ_1) | (1L << NOT_EQ_2))) != 0)) {
				{
				{
				setState(405);
				comp_op();
				setState(406);
				star_expr();
				}
				}
				setState(412);
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
		enterRule(_localctx, 68, RULE_comp_op);
		try {
			setState(426);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(413);
				match(LESS_THAN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(414);
				match(GREATER_THAN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(415);
				match(EQUALS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(416);
				match(GT_EQ);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(417);
				match(LT_EQ);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(418);
				match(NOT_EQ_1);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(419);
				match(NOT_EQ_2);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(420);
				match(IN);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(421);
				match(NOT);
				setState(422);
				match(IN);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(423);
				match(IS);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(424);
				match(IS);
				setState(425);
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
		enterRule(_localctx, 70, RULE_star_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			_la = _input.LA(1);
			if (_la==STAR) {
				{
				setState(428);
				match(STAR);
				}
			}

			setState(431);
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
		enterRule(_localctx, 72, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(433);
			xor_expr();
			setState(438);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR_OP) {
				{
				{
				setState(434);
				match(OR_OP);
				setState(435);
				xor_expr();
				}
				}
				setState(440);
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
		enterRule(_localctx, 74, RULE_xor_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(441);
			and_expr();
			setState(446);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==XOR) {
				{
				{
				setState(442);
				match(XOR);
				setState(443);
				and_expr();
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
		enterRule(_localctx, 76, RULE_and_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(449);
			shift_expr();
			setState(454);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND_OP) {
				{
				{
				setState(450);
				match(AND_OP);
				setState(451);
				shift_expr();
				}
				}
				setState(456);
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
		enterRule(_localctx, 78, RULE_shift_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(457);
			arith_expr();
			setState(464);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LEFT_SHIFT || _la==RIGHT_SHIFT) {
				{
				setState(462);
				switch (_input.LA(1)) {
				case LEFT_SHIFT:
					{
					setState(458);
					match(LEFT_SHIFT);
					setState(459);
					arith_expr();
					}
					break;
				case RIGHT_SHIFT:
					{
					setState(460);
					match(RIGHT_SHIFT);
					setState(461);
					arith_expr();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(466);
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
		enterRule(_localctx, 80, RULE_arith_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(467);
			term();
			setState(474);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ADD || _la==MINUS) {
				{
				setState(472);
				switch (_input.LA(1)) {
				case ADD:
					{
					setState(468);
					match(ADD);
					setState(469);
					term();
					}
					break;
				case MINUS:
					{
					setState(470);
					match(MINUS);
					setState(471);
					term();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(476);
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
		enterRule(_localctx, 82, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(477);
			factor();
			setState(486);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR) | (1L << DIV) | (1L << MOD))) != 0)) {
				{
				setState(484);
				switch (_input.LA(1)) {
				case STAR:
					{
					setState(478);
					match(STAR);
					setState(479);
					factor();
					}
					break;
				case DIV:
					{
					setState(480);
					match(DIV);
					setState(481);
					factor();
					}
					break;
				case MOD:
					{
					setState(482);
					match(MOD);
					setState(483);
					factor();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(488);
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
		enterRule(_localctx, 84, RULE_factor);
		try {
			setState(496);
			switch (_input.LA(1)) {
			case ADD:
				enterOuterAlt(_localctx, 1);
				{
				setState(489);
				match(ADD);
				setState(490);
				factor();
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(491);
				match(MINUS);
				setState(492);
				factor();
				}
				break;
			case NOT_OP:
				enterOuterAlt(_localctx, 3);
				{
				setState(493);
				match(NOT_OP);
				setState(494);
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
				setState(495);
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
		enterRule(_localctx, 86, RULE_power);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(498);
			atom();
			setState(502);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DOT) | (1L << OPEN_PAREN) | (1L << OPEN_BRACK))) != 0)) {
				{
				{
				setState(499);
				trailer();
				}
				}
				setState(504);
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
		enterRule(_localctx, 88, RULE_atom);
		int _la;
		try {
			setState(526);
			switch (_input.LA(1)) {
			case OPEN_PAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(505);
				match(OPEN_PAREN);
				setState(507);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << NOT) | (1L << NONE) | (1L << TRUE) | (1L << FALSE) | (1L << NAME) | (1L << DECIMAL_INTEGER) | (1L << OCT_INTEGER) | (1L << HEX_INTEGER) | (1L << BIN_INTEGER) | (1L << STAR) | (1L << OPEN_PAREN) | (1L << OPEN_BRACK) | (1L << ADD) | (1L << MINUS) | (1L << NOT_OP) | (1L << OPEN_BRACE))) != 0)) {
					{
					setState(506);
					testlist_comp();
					}
				}

				setState(509);
				match(CLOSE_PAREN);
				}
				break;
			case OPEN_BRACK:
				enterOuterAlt(_localctx, 2);
				{
				setState(510);
				match(OPEN_BRACK);
				setState(512);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << NOT) | (1L << NONE) | (1L << TRUE) | (1L << FALSE) | (1L << NAME) | (1L << DECIMAL_INTEGER) | (1L << OCT_INTEGER) | (1L << HEX_INTEGER) | (1L << BIN_INTEGER) | (1L << STAR) | (1L << OPEN_PAREN) | (1L << OPEN_BRACK) | (1L << ADD) | (1L << MINUS) | (1L << NOT_OP) | (1L << OPEN_BRACE))) != 0)) {
					{
					setState(511);
					testlist_comp();
					}
				}

				setState(514);
				match(CLOSE_BRACK);
				}
				break;
			case OPEN_BRACE:
				enterOuterAlt(_localctx, 3);
				{
				setState(515);
				match(OPEN_BRACE);
				setState(517);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << NOT) | (1L << NONE) | (1L << TRUE) | (1L << FALSE) | (1L << NAME) | (1L << DECIMAL_INTEGER) | (1L << OCT_INTEGER) | (1L << HEX_INTEGER) | (1L << BIN_INTEGER) | (1L << STAR) | (1L << OPEN_PAREN) | (1L << OPEN_BRACK) | (1L << ADD) | (1L << MINUS) | (1L << NOT_OP) | (1L << OPEN_BRACE))) != 0)) {
					{
					setState(516);
					dictorsetmaker();
					}
				}

				setState(519);
				match(CLOSE_BRACE);
				}
				break;
			case NAME:
				enterOuterAlt(_localctx, 4);
				{
				setState(520);
				match(NAME);
				}
				break;
			case DECIMAL_INTEGER:
			case OCT_INTEGER:
			case HEX_INTEGER:
			case BIN_INTEGER:
				enterOuterAlt(_localctx, 5);
				{
				setState(521);
				number();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 6);
				{
				setState(522);
				match(T__0);
				}
				break;
			case NONE:
				enterOuterAlt(_localctx, 7);
				{
				setState(523);
				match(NONE);
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 8);
				{
				setState(524);
				match(TRUE);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 9);
				{
				setState(525);
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
		enterRule(_localctx, 90, RULE_testlist_comp);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(528);
			test();
			setState(540);
			switch (_input.LA(1)) {
			case FOR:
				{
				setState(529);
				comp_for();
				}
				break;
			case CLOSE_PAREN:
			case COMMA:
			case CLOSE_BRACK:
				{
				setState(534);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(530);
						match(COMMA);
						setState(531);
						test();
						}
						} 
					}
					setState(536);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
				}
				setState(538);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(537);
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
		enterRule(_localctx, 92, RULE_trailer);
		int _la;
		try {
			setState(553);
			switch (_input.LA(1)) {
			case OPEN_PAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(542);
				match(OPEN_PAREN);
				setState(544);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << NOT) | (1L << NONE) | (1L << TRUE) | (1L << FALSE) | (1L << NAME) | (1L << DECIMAL_INTEGER) | (1L << OCT_INTEGER) | (1L << HEX_INTEGER) | (1L << BIN_INTEGER) | (1L << STAR) | (1L << OPEN_PAREN) | (1L << OPEN_BRACK) | (1L << ADD) | (1L << MINUS) | (1L << NOT_OP) | (1L << OPEN_BRACE))) != 0)) {
					{
					setState(543);
					arglist();
					}
				}

				setState(546);
				match(CLOSE_PAREN);
				}
				break;
			case OPEN_BRACK:
				enterOuterAlt(_localctx, 2);
				{
				setState(547);
				match(OPEN_BRACK);
				setState(548);
				subscriptlist();
				setState(549);
				match(CLOSE_BRACK);
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 3);
				{
				setState(551);
				match(DOT);
				setState(552);
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
		enterRule(_localctx, 94, RULE_subscriptlist);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(555);
			subscript();
			setState(560);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(556);
					match(COMMA);
					setState(557);
					subscript();
					}
					} 
				}
				setState(562);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
			}
			setState(564);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(563);
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
		enterRule(_localctx, 96, RULE_subscript);
		int _la;
		try {
			setState(577);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(566);
				test();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(568);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << NOT) | (1L << NONE) | (1L << TRUE) | (1L << FALSE) | (1L << NAME) | (1L << DECIMAL_INTEGER) | (1L << OCT_INTEGER) | (1L << HEX_INTEGER) | (1L << BIN_INTEGER) | (1L << STAR) | (1L << OPEN_PAREN) | (1L << OPEN_BRACK) | (1L << ADD) | (1L << MINUS) | (1L << NOT_OP) | (1L << OPEN_BRACE))) != 0)) {
					{
					setState(567);
					test();
					}
				}

				setState(570);
				match(COLON);
				setState(572);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << NOT) | (1L << NONE) | (1L << TRUE) | (1L << FALSE) | (1L << NAME) | (1L << DECIMAL_INTEGER) | (1L << OCT_INTEGER) | (1L << HEX_INTEGER) | (1L << BIN_INTEGER) | (1L << STAR) | (1L << OPEN_PAREN) | (1L << OPEN_BRACK) | (1L << ADD) | (1L << MINUS) | (1L << NOT_OP) | (1L << OPEN_BRACE))) != 0)) {
					{
					setState(571);
					test();
					}
				}

				setState(575);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(574);
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
		enterRule(_localctx, 98, RULE_sliceop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(579);
			match(COLON);
			setState(581);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << NOT) | (1L << NONE) | (1L << TRUE) | (1L << FALSE) | (1L << NAME) | (1L << DECIMAL_INTEGER) | (1L << OCT_INTEGER) | (1L << HEX_INTEGER) | (1L << BIN_INTEGER) | (1L << STAR) | (1L << OPEN_PAREN) | (1L << OPEN_BRACK) | (1L << ADD) | (1L << MINUS) | (1L << NOT_OP) | (1L << OPEN_BRACE))) != 0)) {
				{
				setState(580);
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
		enterRule(_localctx, 100, RULE_exprlist);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(583);
			star_expr();
			setState(588);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(584);
					match(COMMA);
					setState(585);
					star_expr();
					}
					} 
				}
				setState(590);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
			}
			setState(592);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(591);
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
		enterRule(_localctx, 102, RULE_testlist);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(594);
			test();
			setState(599);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(595);
					match(COMMA);
					setState(596);
					test();
					}
					} 
				}
				setState(601);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
			}
			setState(603);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(602);
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
		enterRule(_localctx, 104, RULE_dictorsetmaker);
		int _la;
		try {
			int _alt;
			setState(638);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(605);
				test();
				setState(606);
				match(COLON);
				setState(607);
				test();
				setState(622);
				switch (_input.LA(1)) {
				case FOR:
					{
					setState(608);
					comp_for();
					}
					break;
				case COMMA:
				case CLOSE_BRACE:
					{
					setState(616);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(609);
							match(COMMA);
							setState(610);
							test();
							setState(611);
							match(COLON);
							setState(612);
							test();
							}
							} 
						}
						setState(618);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
					}
					setState(620);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(619);
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
				setState(624);
				test();
				setState(636);
				switch (_input.LA(1)) {
				case FOR:
					{
					setState(625);
					comp_for();
					}
					break;
				case COMMA:
				case CLOSE_BRACE:
					{
					setState(630);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(626);
							match(COMMA);
							setState(627);
							test();
							}
							} 
						}
						setState(632);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
					}
					setState(634);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(633);
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
		enterRule(_localctx, 106, RULE_arglist);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(645);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(640);
					argument();
					setState(641);
					match(COMMA);
					}
					} 
				}
				setState(647);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
			}
			setState(648);
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
		enterRule(_localctx, 108, RULE_argument);
		int _la;
		try {
			setState(658);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(650);
				test();
				setState(652);
				_la = _input.LA(1);
				if (_la==FOR) {
					{
					setState(651);
					comp_for();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(654);
				test();
				setState(655);
				match(ASSIGN);
				setState(656);
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
		enterRule(_localctx, 110, RULE_comp_iter);
		try {
			setState(662);
			switch (_input.LA(1)) {
			case FOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(660);
				comp_for();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(661);
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
		enterRule(_localctx, 112, RULE_comp_for);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(664);
			match(FOR);
			setState(665);
			exprlist();
			setState(666);
			match(IN);
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
		enterRule(_localctx, 114, RULE_comp_if);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(671);
			match(IF);
			setState(672);
			or_test();
			setState(674);
			_la = _input.LA(1);
			if (_la==IF || _la==FOR) {
				{
				setState(673);
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
		enterRule(_localctx, 116, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(676);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3N\u02a9\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\3\2\7"+
		"\2z\n\2\f\2\16\2}\13\2\3\2\3\2\5\2\u0081\n\2\3\3\3\3\3\3\3\3\3\3\7\3\u0088"+
		"\n\3\f\3\16\3\u008b\13\3\3\4\3\4\3\4\3\4\5\4\u0091\n\4\3\4\5\4\u0094\n"+
		"\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7"+
		"\t\u00b8\n\t\f\t\16\t\u00bb\13\t\3\n\3\n\3\n\5\n\u00c0\n\n\3\13\3\13\5"+
		"\13\u00c4\n\13\3\f\3\f\3\f\7\f\u00c9\n\f\f\f\16\f\u00cc\13\f\3\f\5\f\u00cf"+
		"\n\f\3\f\3\f\3\r\3\r\3\r\3\r\5\r\u00d7\n\r\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\7\16\u00df\n\16\f\16\16\16\u00e2\13\16\5\16\u00e4\n\16\3\17\3\17\5"+
		"\17\u00e8\n\17\3\17\3\17\3\17\5\17\u00ed\n\17\7\17\u00ef\n\17\f\17\16"+
		"\17\u00f2\13\17\3\17\5\17\u00f5\n\17\3\20\3\20\3\21\3\21\3\21\3\22\3\22"+
		"\3\23\3\23\3\23\5\23\u0101\n\23\3\24\3\24\3\25\3\25\3\26\3\26\5\26\u0109"+
		"\n\26\3\27\3\27\3\27\3\27\5\27\u010f\n\27\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\7\30\u011a\n\30\f\30\16\30\u011d\13\30\3\30\3\30\3\30"+
		"\5\30\u0122\n\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32"+
		"\3\32\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0136\n\33\3\33\5\33\u0139\n"+
		"\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0142\n\33\3\33\5\33\u0145"+
		"\n\33\7\33\u0147\n\33\f\33\16\33\u014a\13\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\5\33\u0152\n\33\3\33\5\33\u0155\n\33\3\33\3\33\3\33\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\5\34\u0161\n\34\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\5\35\u016c\n\35\3\36\3\36\3\36\3\36\6\36\u0172\n\36\r"+
		"\36\16\36\u0173\3\36\3\36\5\36\u0178\n\36\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\5\37\u0180\n\37\3 \3 \3 \7 \u0185\n \f \16 \u0188\13 \3!\3!\3!\7!\u018d"+
		"\n!\f!\16!\u0190\13!\3\"\3\"\3\"\5\"\u0195\n\"\3#\3#\3#\3#\7#\u019b\n"+
		"#\f#\16#\u019e\13#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\5$\u01ad\n$"+
		"\3%\5%\u01b0\n%\3%\3%\3&\3&\3&\7&\u01b7\n&\f&\16&\u01ba\13&\3\'\3\'\3"+
		"\'\7\'\u01bf\n\'\f\'\16\'\u01c2\13\'\3(\3(\3(\7(\u01c7\n(\f(\16(\u01ca"+
		"\13(\3)\3)\3)\3)\3)\7)\u01d1\n)\f)\16)\u01d4\13)\3*\3*\3*\3*\3*\7*\u01db"+
		"\n*\f*\16*\u01de\13*\3+\3+\3+\3+\3+\3+\3+\7+\u01e7\n+\f+\16+\u01ea\13"+
		"+\3,\3,\3,\3,\3,\3,\3,\5,\u01f3\n,\3-\3-\7-\u01f7\n-\f-\16-\u01fa\13-"+
		"\3.\3.\5.\u01fe\n.\3.\3.\3.\5.\u0203\n.\3.\3.\3.\5.\u0208\n.\3.\3.\3."+
		"\3.\3.\3.\3.\5.\u0211\n.\3/\3/\3/\3/\7/\u0217\n/\f/\16/\u021a\13/\3/\5"+
		"/\u021d\n/\5/\u021f\n/\3\60\3\60\5\60\u0223\n\60\3\60\3\60\3\60\3\60\3"+
		"\60\3\60\3\60\5\60\u022c\n\60\3\61\3\61\3\61\7\61\u0231\n\61\f\61\16\61"+
		"\u0234\13\61\3\61\5\61\u0237\n\61\3\62\3\62\5\62\u023b\n\62\3\62\3\62"+
		"\5\62\u023f\n\62\3\62\5\62\u0242\n\62\5\62\u0244\n\62\3\63\3\63\5\63\u0248"+
		"\n\63\3\64\3\64\3\64\7\64\u024d\n\64\f\64\16\64\u0250\13\64\3\64\5\64"+
		"\u0253\n\64\3\65\3\65\3\65\7\65\u0258\n\65\f\65\16\65\u025b\13\65\3\65"+
		"\5\65\u025e\n\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\7\66\u0269"+
		"\n\66\f\66\16\66\u026c\13\66\3\66\5\66\u026f\n\66\5\66\u0271\n\66\3\66"+
		"\3\66\3\66\3\66\7\66\u0277\n\66\f\66\16\66\u027a\13\66\3\66\5\66\u027d"+
		"\n\66\5\66\u027f\n\66\5\66\u0281\n\66\3\67\3\67\3\67\7\67\u0286\n\67\f"+
		"\67\16\67\u0289\13\67\3\67\3\67\38\38\58\u028f\n8\38\38\38\38\58\u0295"+
		"\n8\39\39\59\u0299\n9\3:\3:\3:\3:\3:\5:\u02a0\n:\3;\3;\3;\5;\u02a5\n;"+
		"\3<\3<\3<\2\2=\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64"+
		"\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtv\2\5\3\3NN\3\2>G\3\2\35 \u02db\2{"+
		"\3\2\2\2\4\u0082\3\2\2\2\6\u0093\3\2\2\2\b\u0095\3\2\2\2\n\u0099\3\2\2"+
		"\2\f\u00a0\3\2\2\2\16\u00a6\3\2\2\2\20\u00aa\3\2\2\2\22\u00bc\3\2\2\2"+
		"\24\u00c3\3\2\2\2\26\u00c5\3\2\2\2\30\u00d6\3\2\2\2\32\u00d8\3\2\2\2\34"+
		"\u00e7\3\2\2\2\36\u00f6\3\2\2\2 \u00f8\3\2\2\2\"\u00fb\3\2\2\2$\u0100"+
		"\3\2\2\2&\u0102\3\2\2\2(\u0104\3\2\2\2*\u0106\3\2\2\2,\u010e\3\2\2\2."+
		"\u0110\3\2\2\2\60\u0123\3\2\2\2\62\u012a\3\2\2\2\64\u012f\3\2\2\2\66\u0159"+
		"\3\2\2\28\u0162\3\2\2\2:\u0177\3\2\2\2<\u0179\3\2\2\2>\u0181\3\2\2\2@"+
		"\u0189\3\2\2\2B\u0194\3\2\2\2D\u0196\3\2\2\2F\u01ac\3\2\2\2H\u01af\3\2"+
		"\2\2J\u01b3\3\2\2\2L\u01bb\3\2\2\2N\u01c3\3\2\2\2P\u01cb\3\2\2\2R\u01d5"+
		"\3\2\2\2T\u01df\3\2\2\2V\u01f2\3\2\2\2X\u01f4\3\2\2\2Z\u0210\3\2\2\2\\"+
		"\u0212\3\2\2\2^\u022b\3\2\2\2`\u022d\3\2\2\2b\u0243\3\2\2\2d\u0245\3\2"+
		"\2\2f\u0249\3\2\2\2h\u0254\3\2\2\2j\u0280\3\2\2\2l\u0287\3\2\2\2n\u0294"+
		"\3\2\2\2p\u0298\3\2\2\2r\u029a\3\2\2\2t\u02a1\3\2\2\2v\u02a6\3\2\2\2x"+
		"z\7\33\2\2yx\3\2\2\2z}\3\2\2\2{y\3\2\2\2{|\3\2\2\2|~\3\2\2\2}{\3\2\2\2"+
		"~\u0080\5\4\3\2\177\u0081\7\2\2\3\u0080\177\3\2\2\2\u0080\u0081\3\2\2"+
		"\2\u0081\3\3\2\2\2\u0082\u0083\7H\2\2\u0083\u0084\7\33\2\2\u0084\u0089"+
		"\5\n\6\2\u0085\u0088\7\33\2\2\u0086\u0088\5\n\6\2\u0087\u0085\3\2\2\2"+
		"\u0087\u0086\3\2\2\2\u0088\u008b\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a"+
		"\3\2\2\2\u008a\5\3\2\2\2\u008b\u0089\3\2\2\2\u008c\u0094\7I\2\2\u008d"+
		"\u008e\7J\2\2\u008e\u0090\7#\2\2\u008f\u0091\5l\67\2\u0090\u008f\3\2\2"+
		"\2\u0090\u0091\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0094\7$\2\2\u0093\u008c"+
		"\3\2\2\2\u0093\u008d\3\2\2\2\u0094\7\3\2\2\2\u0095\u0096\7\32\2\2\u0096"+
		"\u0097\7&\2\2\u0097\u0098\5:\36\2\u0098\t\3\2\2\2\u0099\u009a\7\4\2\2"+
		"\u009a\u009b\7\34\2\2\u009b\u009c\5\16\b\2\u009c\u009d\7&\2\2\u009d\u009e"+
		"\7\33\2\2\u009e\u009f\5\f\7\2\u009f\13\3\2\2\2\u00a0\u00a1\7M\2\2\u00a1"+
		"\u00a2\5\6\4\2\u00a2\u00a3\7\33\2\2\u00a3\u00a4\5\b\5\2\u00a4\u00a5\t"+
		"\2\2\2\u00a5\r\3\2\2\2\u00a6\u00a7\7#\2\2\u00a7\u00a8\5\20\t\2\u00a8\u00a9"+
		"\7$\2\2\u00a9\17\3\2\2\2\u00aa\u00ab\7)\2\2\u00ab\u00ac\7\35\2\2\u00ac"+
		"\u00ad\7&\2\2\u00ad\u00ae\7\35\2\2\u00ae\u00af\7*\2\2\u00af\u00b9\5\22"+
		"\n\2\u00b0\u00b1\7%\2\2\u00b1\u00b2\7)\2\2\u00b2\u00b3\7\35\2\2\u00b3"+
		"\u00b4\7&\2\2\u00b4\u00b5\7\35\2\2\u00b5\u00b6\7*\2\2\u00b6\u00b8\5\22"+
		"\n\2\u00b7\u00b0\3\2\2\2\u00b8\u00bb\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9"+
		"\u00ba\3\2\2\2\u00ba\21\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bc\u00bf\7\34\2"+
		"\2\u00bd\u00be\7&\2\2\u00be\u00c0\5<\37\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0"+
		"\3\2\2\2\u00c0\23\3\2\2\2\u00c1\u00c4\5\26\f\2\u00c2\u00c4\5,\27\2\u00c3"+
		"\u00c1\3\2\2\2\u00c3\u00c2\3\2\2\2\u00c4\25\3\2\2\2\u00c5\u00ca\5\30\r"+
		"\2\u00c6\u00c7\7\'\2\2\u00c7\u00c9\5\30\r\2\u00c8\u00c6\3\2\2\2\u00c9"+
		"\u00cc\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00ce\3\2"+
		"\2\2\u00cc\u00ca\3\2\2\2\u00cd\u00cf\7\'\2\2\u00ce\u00cd\3\2\2\2\u00ce"+
		"\u00cf\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1\7\33\2\2\u00d1\27\3\2\2"+
		"\2\u00d2\u00d7\5\32\16\2\u00d3\u00d7\5 \21\2\u00d4\u00d7\5\"\22\2\u00d5"+
		"\u00d7\5$\23\2\u00d6\u00d2\3\2\2\2\u00d6\u00d3\3\2\2\2\u00d6\u00d4\3\2"+
		"\2\2\u00d6\u00d5\3\2\2\2\u00d7\31\3\2\2\2\u00d8\u00e3\5\34\17\2\u00d9"+
		"\u00da\5\36\20\2\u00da\u00db\5h\65\2\u00db\u00e4\3\2\2\2\u00dc\u00dd\7"+
		"(\2\2\u00dd\u00df\5\34\17\2\u00de\u00dc\3\2\2\2\u00df\u00e2\3\2\2\2\u00e0"+
		"\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e4\3\2\2\2\u00e2\u00e0\3\2"+
		"\2\2\u00e3\u00d9\3\2\2\2\u00e3\u00e0\3\2\2\2\u00e4\33\3\2\2\2\u00e5\u00e8"+
		"\5<\37\2\u00e6\u00e8\5H%\2\u00e7\u00e5\3\2\2\2\u00e7\u00e6\3\2\2\2\u00e8"+
		"\u00f0\3\2\2\2\u00e9\u00ec\7%\2\2\u00ea\u00ed\5<\37\2\u00eb\u00ed\5H%"+
		"\2\u00ec\u00ea\3\2\2\2\u00ec\u00eb\3\2\2\2\u00ed\u00ef\3\2\2\2\u00ee\u00e9"+
		"\3\2\2\2\u00ef\u00f2\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1"+
		"\u00f4\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f3\u00f5\7%\2\2\u00f4\u00f3\3\2"+
		"\2\2\u00f4\u00f5\3\2\2\2\u00f5\35\3\2\2\2\u00f6\u00f7\t\3\2\2\u00f7\37"+
		"\3\2\2\2\u00f8\u00f9\7\26\2\2\u00f9\u00fa\5f\64\2\u00fa!\3\2\2\2\u00fb"+
		"\u00fc\7\27\2\2\u00fc#\3\2\2\2\u00fd\u0101\5&\24\2\u00fe\u0101\5(\25\2"+
		"\u00ff\u0101\5*\26\2\u0100\u00fd\3\2\2\2\u0100\u00fe\3\2\2\2\u0100\u00ff"+
		"\3\2\2\2\u0101%\3\2\2\2\u0102\u0103\7\31\2\2\u0103\'\3\2\2\2\u0104\u0105"+
		"\7\30\2\2\u0105)\3\2\2\2\u0106\u0108\7\5\2\2\u0107\u0109\5h\65\2\u0108"+
		"\u0107\3\2\2\2\u0108\u0109\3\2\2\2\u0109+\3\2\2\2\u010a\u010f\5.\30\2"+
		"\u010b\u010f\5\60\31\2\u010c\u010f\5\66\34\2\u010d\u010f\58\35\2\u010e"+
		"\u010a\3\2\2\2\u010e\u010b\3\2\2\2\u010e\u010c\3\2\2\2\u010e\u010d\3\2"+
		"\2\2\u010f-\3\2\2\2\u0110\u0111\7\6\2\2\u0111\u0112\5<\37\2\u0112\u0113"+
		"\7&\2\2\u0113\u011b\5:\36\2\u0114\u0115\7\7\2\2\u0115\u0116\5<\37\2\u0116"+
		"\u0117\7&\2\2\u0117\u0118\5:\36\2\u0118\u011a\3\2\2\2\u0119\u0114\3\2"+
		"\2\2\u011a\u011d\3\2\2\2\u011b\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c"+
		"\u0121\3\2\2\2\u011d\u011b\3\2\2\2\u011e\u011f\7\b\2\2\u011f\u0120\7&"+
		"\2\2\u0120\u0122\5:\36\2\u0121\u011e\3\2\2\2\u0121\u0122\3\2\2\2\u0122"+
		"/\3\2\2\2\u0123\u0124\7\t\2\2\u0124\u0125\7#\2\2\u0125\u0126\7\34\2\2"+
		"\u0126\u0127\7$\2\2\u0127\u0128\7&\2\2\u0128\u0129\5\62\32\2\u0129\61"+
		"\3\2\2\2\u012a\u012b\7\33\2\2\u012b\u012c\7M\2\2\u012c\u012d\5\64\33\2"+
		"\u012d\u012e\7N\2\2\u012e\63\3\2\2\2\u012f\u0130\7\n\2\2\u0130\u0131\5"+
		"v<\2\u0131\u0138\7&\2\2\u0132\u0135\7\5\2\2\u0133\u0136\7\34\2\2\u0134"+
		"\u0136\5v<\2\u0135\u0133\3\2\2\2\u0135\u0134\3\2\2\2\u0136\u0139\3\2\2"+
		"\2\u0137\u0139\5\32\16\2\u0138\u0132\3\2\2\2\u0138\u0137\3\2\2\2\u0139"+
		"\u0148\3\2\2\2\u013a\u013b\7\33\2\2\u013b\u013c\7\n\2\2\u013c\u013d\5"+
		"v<\2\u013d\u0144\7&\2\2\u013e\u0141\7\5\2\2\u013f\u0142\7\34\2\2\u0140"+
		"\u0142\5v<\2\u0141\u013f\3\2\2\2\u0141\u0140\3\2\2\2\u0142\u0145\3\2\2"+
		"\2\u0143\u0145\5\32\16\2\u0144\u013e\3\2\2\2\u0144\u0143\3\2\2\2\u0145"+
		"\u0147\3\2\2\2\u0146\u013a\3\2\2\2\u0147\u014a\3\2\2\2\u0148\u0146\3\2"+
		"\2\2\u0148\u0149\3\2\2\2\u0149\u014b\3\2\2\2\u014a\u0148\3\2\2\2\u014b"+
		"\u014c\7\33\2\2\u014c\u014d\7\13\2\2\u014d\u0154\7&\2\2\u014e\u0151\7"+
		"\5\2\2\u014f\u0152\7\34\2\2\u0150\u0152\5v<\2\u0151\u014f\3\2\2\2\u0151"+
		"\u0150\3\2\2\2\u0152\u0155\3\2\2\2\u0153\u0155\5\32\16\2\u0154\u014e\3"+
		"\2\2\2\u0154\u0153\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u0157\7\33\2\2\u0157"+
		"\u0158\7N\2\2\u0158\65\3\2\2\2\u0159\u015a\7\f\2\2\u015a\u015b\5<\37\2"+
		"\u015b\u015c\7&\2\2\u015c\u0160\5:\36\2\u015d\u015e\7\b\2\2\u015e\u015f"+
		"\7&\2\2\u015f\u0161\5:\36\2\u0160\u015d\3\2\2\2\u0160\u0161\3\2\2\2\u0161"+
		"\67\3\2\2\2\u0162\u0163\7\r\2\2\u0163\u0164\5f\64\2\u0164\u0165\7\16\2"+
		"\2\u0165\u0166\5h\65\2\u0166\u0167\7&\2\2\u0167\u016b\5:\36\2\u0168\u0169"+
		"\7\b\2\2\u0169\u016a\7&\2\2\u016a\u016c\5:\36\2\u016b\u0168\3\2\2\2\u016b"+
		"\u016c\3\2\2\2\u016c9\3\2\2\2\u016d\u0178\5\26\f\2\u016e\u016f\7\33\2"+
		"\2\u016f\u0171\7M\2\2\u0170\u0172\5\24\13\2\u0171\u0170\3\2\2\2\u0172"+
		"\u0173\3\2\2\2\u0173\u0171\3\2\2\2\u0173\u0174\3\2\2\2\u0174\u0175\3\2"+
		"\2\2\u0175\u0176\7N\2\2\u0176\u0178\3\2\2\2\u0177\u016d\3\2\2\2\u0177"+
		"\u016e\3\2\2\2\u0178;\3\2\2\2\u0179\u017f\5> \2\u017a\u017b\7\6\2\2\u017b"+
		"\u017c\5> \2\u017c\u017d\7\b\2\2\u017d\u017e\5<\37\2\u017e\u0180\3\2\2"+
		"\2\u017f\u017a\3\2\2\2\u017f\u0180\3\2\2\2\u0180=\3\2\2\2\u0181\u0186"+
		"\5@!\2\u0182\u0183\7\17\2\2\u0183\u0185\5@!\2\u0184\u0182\3\2\2\2\u0185"+
		"\u0188\3\2\2\2\u0186\u0184\3\2\2\2\u0186\u0187\3\2\2\2\u0187?\3\2\2\2"+
		"\u0188\u0186\3\2\2\2\u0189\u018e\5B\"\2\u018a\u018b\7\20\2\2\u018b\u018d"+
		"\5B\"\2\u018c\u018a\3\2\2\2\u018d\u0190\3\2\2\2\u018e\u018c\3\2\2\2\u018e"+
		"\u018f\3\2\2\2\u018fA\3\2\2\2\u0190\u018e\3\2\2\2\u0191\u0192\7\21\2\2"+
		"\u0192\u0195\5B\"\2\u0193\u0195\5D#\2\u0194\u0191\3\2\2\2\u0194\u0193"+
		"\3\2\2\2\u0195C\3\2\2\2\u0196\u019c\5H%\2\u0197\u0198\5F$\2\u0198\u0199"+
		"\5H%\2\u0199\u019b\3\2\2\2\u019a\u0197\3\2\2\2\u019b\u019e\3\2\2\2\u019c"+
		"\u019a\3\2\2\2\u019c\u019d\3\2\2\2\u019dE\3\2\2\2\u019e\u019c\3\2\2\2"+
		"\u019f\u01ad\7\67\2\2\u01a0\u01ad\78\2\2\u01a1\u01ad\79\2\2\u01a2\u01ad"+
		"\7:\2\2\u01a3\u01ad\7;\2\2\u01a4\u01ad\7<\2\2\u01a5\u01ad\7=\2\2\u01a6"+
		"\u01ad\7\16\2\2\u01a7\u01a8\7\21\2\2\u01a8\u01ad\7\16\2\2\u01a9\u01ad"+
		"\7\22\2\2\u01aa\u01ab\7\22\2\2\u01ab\u01ad\7\21\2\2\u01ac\u019f\3\2\2"+
		"\2\u01ac\u01a0\3\2\2\2\u01ac\u01a1\3\2\2\2\u01ac\u01a2\3\2\2\2\u01ac\u01a3"+
		"\3\2\2\2\u01ac\u01a4\3\2\2\2\u01ac\u01a5\3\2\2\2\u01ac\u01a6\3\2\2\2\u01ac"+
		"\u01a7\3\2\2\2\u01ac\u01a9\3\2\2\2\u01ac\u01aa\3\2\2\2\u01adG\3\2\2\2"+
		"\u01ae\u01b0\7\"\2\2\u01af\u01ae\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0\u01b1"+
		"\3\2\2\2\u01b1\u01b2\5J&\2\u01b2I\3\2\2\2\u01b3\u01b8\5L\'\2\u01b4\u01b5"+
		"\7+\2\2\u01b5\u01b7\5L\'\2\u01b6\u01b4\3\2\2\2\u01b7\u01ba\3\2\2\2\u01b8"+
		"\u01b6\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9K\3\2\2\2\u01ba\u01b8\3\2\2\2"+
		"\u01bb\u01c0\5N(\2\u01bc\u01bd\7,\2\2\u01bd\u01bf\5N(\2\u01be\u01bc\3"+
		"\2\2\2\u01bf\u01c2\3\2\2\2\u01c0\u01be\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1"+
		"M\3\2\2\2\u01c2\u01c0\3\2\2\2\u01c3\u01c8\5P)\2\u01c4\u01c5\7-\2\2\u01c5"+
		"\u01c7\5P)\2\u01c6\u01c4\3\2\2\2\u01c7\u01ca\3\2\2\2\u01c8\u01c6\3\2\2"+
		"\2\u01c8\u01c9\3\2\2\2\u01c9O\3\2\2\2\u01ca\u01c8\3\2\2\2\u01cb\u01d2"+
		"\5R*\2\u01cc\u01cd\7.\2\2\u01cd\u01d1\5R*\2\u01ce\u01cf\7/\2\2\u01cf\u01d1"+
		"\5R*\2\u01d0\u01cc\3\2\2\2\u01d0\u01ce\3\2\2\2\u01d1\u01d4\3\2\2\2\u01d2"+
		"\u01d0\3\2\2\2\u01d2\u01d3\3\2\2\2\u01d3Q\3\2\2\2\u01d4\u01d2\3\2\2\2"+
		"\u01d5\u01dc\5T+\2\u01d6\u01d7\7\60\2\2\u01d7\u01db\5T+\2\u01d8\u01d9"+
		"\7\61\2\2\u01d9\u01db\5T+\2\u01da\u01d6\3\2\2\2\u01da\u01d8\3\2\2\2\u01db"+
		"\u01de\3\2\2\2\u01dc\u01da\3\2\2\2\u01dc\u01dd\3\2\2\2\u01ddS\3\2\2\2"+
		"\u01de\u01dc\3\2\2\2\u01df\u01e8\5V,\2\u01e0\u01e1\7\"\2\2\u01e1\u01e7"+
		"\5V,\2\u01e2\u01e3\7\62\2\2\u01e3\u01e7\5V,\2\u01e4\u01e5\7\63\2\2\u01e5"+
		"\u01e7\5V,\2\u01e6\u01e0\3\2\2\2\u01e6\u01e2\3\2\2\2\u01e6\u01e4\3\2\2"+
		"\2\u01e7\u01ea\3\2\2\2\u01e8\u01e6\3\2\2\2\u01e8\u01e9\3\2\2\2\u01e9U"+
		"\3\2\2\2\u01ea\u01e8\3\2\2\2\u01eb\u01ec\7\60\2\2\u01ec\u01f3\5V,\2\u01ed"+
		"\u01ee\7\61\2\2\u01ee\u01f3\5V,\2\u01ef\u01f0\7\64\2\2\u01f0\u01f3\5V"+
		",\2\u01f1\u01f3\5X-\2\u01f2\u01eb\3\2\2\2\u01f2\u01ed\3\2\2\2\u01f2\u01ef"+
		"\3\2\2\2\u01f2\u01f1\3\2\2\2\u01f3W\3\2\2\2\u01f4\u01f8\5Z.\2\u01f5\u01f7"+
		"\5^\60\2\u01f6\u01f5\3\2\2\2\u01f7\u01fa\3\2\2\2\u01f8\u01f6\3\2\2\2\u01f8"+
		"\u01f9\3\2\2\2\u01f9Y\3\2\2\2\u01fa\u01f8\3\2\2\2\u01fb\u01fd\7#\2\2\u01fc"+
		"\u01fe\5\\/\2\u01fd\u01fc\3\2\2\2\u01fd\u01fe\3\2\2\2\u01fe\u01ff\3\2"+
		"\2\2\u01ff\u0211\7$\2\2\u0200\u0202\7)\2\2\u0201\u0203\5\\/\2\u0202\u0201"+
		"\3\2\2\2\u0202\u0203\3\2\2\2\u0203\u0204\3\2\2\2\u0204\u0211\7*\2\2\u0205"+
		"\u0207\7\65\2\2\u0206\u0208\5j\66\2\u0207\u0206\3\2\2\2\u0207\u0208\3"+
		"\2\2\2\u0208\u0209\3\2\2\2\u0209\u0211\7\66\2\2\u020a\u0211\7\34\2\2\u020b"+
		"\u0211\5v<\2\u020c\u0211\7\3\2\2\u020d\u0211\7\23\2\2\u020e\u0211\7\24"+
		"\2\2\u020f\u0211\7\25\2\2\u0210\u01fb\3\2\2\2\u0210\u0200\3\2\2\2\u0210"+
		"\u0205\3\2\2\2\u0210\u020a\3\2\2\2\u0210\u020b\3\2\2\2\u0210\u020c\3\2"+
		"\2\2\u0210\u020d\3\2\2\2\u0210\u020e\3\2\2\2\u0210\u020f\3\2\2\2\u0211"+
		"[\3\2\2\2\u0212\u021e\5<\37\2\u0213\u021f\5r:\2\u0214\u0215\7%\2\2\u0215"+
		"\u0217\5<\37\2\u0216\u0214\3\2\2\2\u0217\u021a\3\2\2\2\u0218\u0216\3\2"+
		"\2\2\u0218\u0219\3\2\2\2\u0219\u021c\3\2\2\2\u021a\u0218\3\2\2\2\u021b"+
		"\u021d\7%\2\2\u021c\u021b\3\2\2\2\u021c\u021d\3\2\2\2\u021d\u021f\3\2"+
		"\2\2\u021e\u0213\3\2\2\2\u021e\u0218\3\2\2\2\u021f]\3\2\2\2\u0220\u0222"+
		"\7#\2\2\u0221\u0223\5l\67\2\u0222\u0221\3\2\2\2\u0222\u0223\3\2\2\2\u0223"+
		"\u0224\3\2\2\2\u0224\u022c\7$\2\2\u0225\u0226\7)\2\2\u0226\u0227\5`\61"+
		"\2\u0227\u0228\7*\2\2\u0228\u022c\3\2\2\2\u0229\u022a\7!\2\2\u022a\u022c"+
		"\7\34\2\2\u022b\u0220\3\2\2\2\u022b\u0225\3\2\2\2\u022b\u0229\3\2\2\2"+
		"\u022c_\3\2\2\2\u022d\u0232\5b\62\2\u022e\u022f\7%\2\2\u022f\u0231\5b"+
		"\62\2\u0230\u022e\3\2\2\2\u0231\u0234\3\2\2\2\u0232\u0230\3\2\2\2\u0232"+
		"\u0233\3\2\2\2\u0233\u0236\3\2\2\2\u0234\u0232\3\2\2\2\u0235\u0237\7%"+
		"\2\2\u0236\u0235\3\2\2\2\u0236\u0237\3\2\2\2\u0237a\3\2\2\2\u0238\u0244"+
		"\5<\37\2\u0239\u023b\5<\37\2\u023a\u0239\3\2\2\2\u023a\u023b\3\2\2\2\u023b"+
		"\u023c\3\2\2\2\u023c\u023e\7&\2\2\u023d\u023f\5<\37\2\u023e\u023d\3\2"+
		"\2\2\u023e\u023f\3\2\2\2\u023f\u0241\3\2\2\2\u0240\u0242\5d\63\2\u0241"+
		"\u0240\3\2\2\2\u0241\u0242\3\2\2\2\u0242\u0244\3\2\2\2\u0243\u0238\3\2"+
		"\2\2\u0243\u023a\3\2\2\2\u0244c\3\2\2\2\u0245\u0247\7&\2\2\u0246\u0248"+
		"\5<\37\2\u0247\u0246\3\2\2\2\u0247\u0248\3\2\2\2\u0248e\3\2\2\2\u0249"+
		"\u024e\5H%\2\u024a\u024b\7%\2\2\u024b\u024d\5H%\2\u024c\u024a\3\2\2\2"+
		"\u024d\u0250\3\2\2\2\u024e\u024c\3\2\2\2\u024e\u024f\3\2\2\2\u024f\u0252"+
		"\3\2\2\2\u0250\u024e\3\2\2\2\u0251\u0253\7%\2\2\u0252\u0251\3\2\2\2\u0252"+
		"\u0253\3\2\2\2\u0253g\3\2\2\2\u0254\u0259\5<\37\2\u0255\u0256\7%\2\2\u0256"+
		"\u0258\5<\37\2\u0257\u0255\3\2\2\2\u0258\u025b\3\2\2\2\u0259\u0257\3\2"+
		"\2\2\u0259\u025a\3\2\2\2\u025a\u025d\3\2\2\2\u025b\u0259\3\2\2\2\u025c"+
		"\u025e\7%\2\2\u025d\u025c\3\2\2\2\u025d\u025e\3\2\2\2\u025ei\3\2\2\2\u025f"+
		"\u0260\5<\37\2\u0260\u0261\7&\2\2\u0261\u0270\5<\37\2\u0262\u0271\5r:"+
		"\2\u0263\u0264\7%\2\2\u0264\u0265\5<\37\2\u0265\u0266\7&\2\2\u0266\u0267"+
		"\5<\37\2\u0267\u0269\3\2\2\2\u0268\u0263\3\2\2\2\u0269\u026c\3\2\2\2\u026a"+
		"\u0268\3\2\2\2\u026a\u026b\3\2\2\2\u026b\u026e\3\2\2\2\u026c\u026a\3\2"+
		"\2\2\u026d\u026f\7%\2\2\u026e\u026d\3\2\2\2\u026e\u026f\3\2\2\2\u026f"+
		"\u0271\3\2\2\2\u0270\u0262\3\2\2\2\u0270\u026a\3\2\2\2\u0271\u0281\3\2"+
		"\2\2\u0272\u027e\5<\37\2\u0273\u027f\5r:\2\u0274\u0275\7%\2\2\u0275\u0277"+
		"\5<\37\2\u0276\u0274\3\2\2\2\u0277\u027a\3\2\2\2\u0278\u0276\3\2\2\2\u0278"+
		"\u0279\3\2\2\2\u0279\u027c\3\2\2\2\u027a\u0278\3\2\2\2\u027b\u027d\7%"+
		"\2\2\u027c\u027b\3\2\2\2\u027c\u027d\3\2\2\2\u027d\u027f\3\2\2\2\u027e"+
		"\u0273\3\2\2\2\u027e\u0278\3\2\2\2\u027f\u0281\3\2\2\2\u0280\u025f\3\2"+
		"\2\2\u0280\u0272\3\2\2\2\u0281k\3\2\2\2\u0282\u0283\5n8\2\u0283\u0284"+
		"\7%\2\2\u0284\u0286\3\2\2\2\u0285\u0282\3\2\2\2\u0286\u0289\3\2\2\2\u0287"+
		"\u0285\3\2\2\2\u0287\u0288\3\2\2\2\u0288\u028a\3\2\2\2\u0289\u0287\3\2"+
		"\2\2\u028a\u028b\5n8\2\u028bm\3\2\2\2\u028c\u028e\5<\37\2\u028d\u028f"+
		"\5r:\2\u028e\u028d\3\2\2\2\u028e\u028f\3\2\2\2\u028f\u0295\3\2\2\2\u0290"+
		"\u0291\5<\37\2\u0291\u0292\7(\2\2\u0292\u0293\5<\37\2\u0293\u0295\3\2"+
		"\2\2\u0294\u028c\3\2\2\2\u0294\u0290\3\2\2\2\u0295o\3\2\2\2\u0296\u0299"+
		"\5r:\2\u0297\u0299\5t;\2\u0298\u0296\3\2\2\2\u0298\u0297\3\2\2\2\u0299"+
		"q\3\2\2\2\u029a\u029b\7\r\2\2\u029b\u029c\5f\64\2\u029c\u029d\7\16\2\2"+
		"\u029d\u029f\5> \2\u029e\u02a0\5p9\2\u029f\u029e\3\2\2\2\u029f\u02a0\3"+
		"\2\2\2\u02a0s\3\2\2\2\u02a1\u02a2\7\6\2\2\u02a2\u02a4\5> \2\u02a3\u02a5"+
		"\5p9\2\u02a4\u02a3\3\2\2\2\u02a4\u02a5\3\2\2\2\u02a5u\3\2\2\2\u02a6\u02a7"+
		"\t\4\2\2\u02a7w\3\2\2\2W{\u0080\u0087\u0089\u0090\u0093\u00b9\u00bf\u00c3"+
		"\u00ca\u00ce\u00d6\u00e0\u00e3\u00e7\u00ec\u00f0\u00f4\u0100\u0108\u010e"+
		"\u011b\u0121\u0135\u0138\u0141\u0144\u0148\u0151\u0154\u0160\u016b\u0173"+
		"\u0177\u017f\u0186\u018e\u0194\u019c\u01ac\u01af\u01b8\u01c0\u01c8\u01d0"+
		"\u01d2\u01da\u01dc\u01e6\u01e8\u01f2\u01f8\u01fd\u0202\u0207\u0210\u0218"+
		"\u021c\u021e\u0222\u022b\u0232\u0236\u023a\u023e\u0241\u0243\u0247\u024e"+
		"\u0252\u0259\u025d\u026a\u026e\u0270\u0278\u027c\u027e\u0280\u0287\u028e"+
		"\u0294\u0298\u029f\u02a4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
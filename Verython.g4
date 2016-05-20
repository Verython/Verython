grammar Verython;

initial_state : (NEWLINE | stmt)* ENDMARKER;

decorator: '@' dotted_name  ( '(' arglist  ')' )? NEWLINE;
decorated: decorator funcdef;
funcdef: 'def' NAME parameters ':' suite;
parameters: '(' (varargslist)? ')';
varargslist:
    ((fpdef ('=' test)? ',')* ('*' NAME (',' '**' NAME)? | '**' NAME)
    | fpdef ('=' test)? (',' fpdef ('=' test)?)* (',')?)
    ;
fpdef: NAME | '(' fplist ')';
fplist: fpdef (',' fpdef)* (',')?;

stmt: simple_stmt | compound_stmt;
simple_stmt: small_stmt (';' small_stmt)* (';')? NEWLINE;
small_stmt:
    (expr_stmt
    | del_stmt
    | pass_stmt
    | flow_stmt)
    ;
expr_stmt: testlist (augassign testlist | ('=' testlist)*);
augassign: ('+=' | '-=' | '*=' | '/=' | '%=' | '&=' | '|=' | '^='
    |'<<=' | '>>=' | '**=' | '//=');

del_stmt: 'del' exprlist;
pass_stmt: 'pass';
flow_stmt: break_stmt | continue_stmt | return_stmt;
break_stmt: 'break';
continue_stmt: 'continue'; // *
return_stmt: 'return' (testlist)?;

dotted_name: NAME ('.' NAME)*;

compound_stmt: if_stmt | while_stmt | for_stmt | funcdef | decorated;
if_stmt: 'if' test ':' suite ('elif' test ':' suite)* ('else' ':' suite)?;
while_stmt: 'while' test ':' suite ('else' ':' suite)?;
for_stmt: 'for' exprlist 'in' testlist ':' suite ('else' ':' suite)?;

suite: simple_stmt | NEWLINE INDENT stmt+ DEDENT;

testlist_safe: or_test ((',' or_test)+ (',')?)?;

test: or_test ('if' or_test 'else' test)?;
or_test: and_test ('or' and_test)*;
and_test: not_test ('and' not_test)*;
not_test: 'not' not_test | comparison;
comparison: expr (comp_op expr)*;
comp_op: '<'|'>'|'=='|'>='|'<='|'<>'|'!='|'in'|'not' 'in'|'is'|'is' 'not';
expr: xor_expr ('|' xor_expr)*;
xor_expr: and_expr ('^' and_expr)*;
and_expr: shift_expr ('&' shift_expr)*;
shift_expr: arith_expr (('<<'|'>>') arith_expr)*;
arith_expr: term (('+'|'-') term)*;
term: factor (('*'|'/'|'%'|'//') factor)*;
factor: ('+'|'-'|'~') factor | power;
power: atom trailer* ('**' factor)?;
atom:
    ('(' testlist_comp? ')'
    | '[' listmaker? ']'
    | '{' dictorsetmaker? '}'
    | '`' testlist1 '`'
    | NAME | NUMBER | STRING+);

listmaker: test ( list_for | (',' test)* ','? );
testlist_comp: test ( comp_for | (',' test)* ','? );
trailer: '(' arglist? ')' | '[' subscriptlist ']' | '.' NAME;
subscriptlist: subscript (',' subscript)* ','?;
subscript: '.' '.' '.' | test | test? ':' test? sliceop?;
sliceop: ':' test?;
exprlist: expr (',' expr)* ','?;
testlist: test (',' test)* ','?;
dictorsetmaker: // dictionary or set generator
    ( (test ':' test (comp_for | (',' test ':' test)* ','?))
    | (test (comp_for | (',' test)* ','?)) )
    ;

arglist:
    (argument ',')* (argument ','?
    |'*' test (',' argument)* (',' '**' test)?
    |'**' test)
    ;
argument: test comp_for? | test '=' test;

list_iter: list_for | list_if;
list_for: 'for' exprlist 'in' testlist_safe list_iter?;
list_if: 'if' or_test list_iter?;

comp_iter: comp_for | comp_if;
comp_for: 'for' exprlist 'in' or_test comp_iter?;
comp_if: 'if' or_test comp_iter?;
testlist1: test (',' test)*;

NAME: ;
NEWLINE: ;
NUMBER: ;
STRING: ;
INDENT: ;
DEDENT: ;
ENDMARKER: ;

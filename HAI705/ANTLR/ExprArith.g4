grammar ExprArith;
expr : additionExpr;
additionExpr : multiplyExpr
('+'multiplyExpr|'-'multiplyExpr)*;
multiplyExpr : atomExpr('*'atomExpr|'/'atomExpr )*;
atomExpr : Number|Variable|'(' additionExpr ')'|'-'atomExpr;
Number : ('0'.. '9')+;
Variable : [a-z];
WS : [\t\r\n]+ -> skip;

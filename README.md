# ToyLangEx10
Toy Programming Language: Ex10

グローバル変数の宣言をできるようにサポート。シンボルテーブルの導入。

現状の文法．

\<Program\> ::= \<Statements\>

\<Statements\> ::= [\<Statement\>]\*

\<Statement\> :: = \<ExprStmt>　| \<EmptyStmt\> | \<Global\>

\<Global\> ::= 'global' \<Type\> Identifier ';'

\<Type\> ::= 'int'

\<ExprStmt> ::= \<AdditiExpr\>　 ';'

\<EmptyStmt\> :: = ';'

\<AdditiExpr\>　:: = \<MultiplicativeExpr\> [ ( '+' | '-' ) \<MultiplicativeExpr\> ]\*

\<MultiplicativeExpr\> :: = \<Primary\> [ ( '\*'  | '/' ) \<Primary\> ]\*

\<Primary\> :: = ( \<AdditiExpr\> ) | \<Integer\>　| \<Identifier\>　

// Generated from D:/Cours/M1/M1_GL/HAI705/ANTLR/ExprArith.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ExprArithParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ExprArithVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ExprArithParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(ExprArithParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprArithParser#additionExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditionExpr(ExprArithParser.AdditionExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprArithParser#multiplyExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplyExpr(ExprArithParser.MultiplyExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprArithParser#atomExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomExpr(ExprArithParser.AtomExprContext ctx);
}
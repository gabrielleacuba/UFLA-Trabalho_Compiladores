// Generated from /home/aluno/Área de Trabalho/TrabalhoCompiladores1/TrabalhoParser.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TrabalhoParserParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TrabalhoParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TrabalhoParserParser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(TrabalhoParserParser.CompilationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrabalhoParserParser#qualifiedIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedIdentifier(TrabalhoParserParser.QualifiedIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrabalhoParserParser#typeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDeclaration(TrabalhoParserParser.TypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrabalhoParserParser#modifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifiers(TrabalhoParserParser.ModifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrabalhoParserParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(TrabalhoParserParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrabalhoParserParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(TrabalhoParserParser.ClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrabalhoParserParser#memberDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberDecl(TrabalhoParserParser.MemberDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrabalhoParserParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(TrabalhoParserParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrabalhoParserParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(TrabalhoParserParser.BlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrabalhoParserParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(TrabalhoParserParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrabalhoParserParser#formalParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameters(TrabalhoParserParser.FormalParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrabalhoParserParser#formalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameter(TrabalhoParserParser.FormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrabalhoParserParser#parExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParExpression(TrabalhoParserParser.ParExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrabalhoParserParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclarationStatement(TrabalhoParserParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrabalhoParserParser#variableDeclarators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarators(TrabalhoParserParser.VariableDeclaratorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrabalhoParserParser#variableDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarator(TrabalhoParserParser.VariableDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrabalhoParserParser#variableInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableInitializer(TrabalhoParserParser.VariableInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrabalhoParserParser#arrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayInitializer(TrabalhoParserParser.ArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrabalhoParserParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(TrabalhoParserParser.ArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrabalhoParserParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(TrabalhoParserParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrabalhoParserParser#basicType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasicType(TrabalhoParserParser.BasicTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrabalhoParserParser#referenceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReferenceType(TrabalhoParserParser.ReferenceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrabalhoParserParser#statementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementExpression(TrabalhoParserParser.StatementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrabalhoParserParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(TrabalhoParserParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrabalhoParserParser#assignmentExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentExpression(TrabalhoParserParser.AssignmentExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrabalhoParserParser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalAndExpression(TrabalhoParserParser.ConditionalAndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrabalhoParserParser#equalityExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpression(TrabalhoParserParser.EqualityExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrabalhoParserParser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpression(TrabalhoParserParser.RelationalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrabalhoParserParser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression(TrabalhoParserParser.AdditiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrabalhoParserParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression(TrabalhoParserParser.MultiplicativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrabalhoParserParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(TrabalhoParserParser.UnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrabalhoParserParser#simpleUnaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleUnaryExpression(TrabalhoParserParser.SimpleUnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrabalhoParserParser#postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixExpression(TrabalhoParserParser.PostfixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrabalhoParserParser#selector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelector(TrabalhoParserParser.SelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrabalhoParserParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(TrabalhoParserParser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrabalhoParserParser#creator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreator(TrabalhoParserParser.CreatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrabalhoParserParser#newArrayDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewArrayDeclarator(TrabalhoParserParser.NewArrayDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrabalhoParserParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(TrabalhoParserParser.LiteralContext ctx);
}
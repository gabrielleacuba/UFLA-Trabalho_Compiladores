// Generated from /home/aluno/Área de Trabalho/TrabalhoCompiladores1/TrabalhoParser.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TrabalhoParserParser}.
 */
public interface TrabalhoParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TrabalhoParserParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(TrabalhoParserParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrabalhoParserParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(TrabalhoParserParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrabalhoParserParser#qualifiedIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedIdentifier(TrabalhoParserParser.QualifiedIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrabalhoParserParser#qualifiedIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedIdentifier(TrabalhoParserParser.QualifiedIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrabalhoParserParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeDeclaration(TrabalhoParserParser.TypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrabalhoParserParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeDeclaration(TrabalhoParserParser.TypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrabalhoParserParser#modifiers}.
	 * @param ctx the parse tree
	 */
	void enterModifiers(TrabalhoParserParser.ModifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrabalhoParserParser#modifiers}.
	 * @param ctx the parse tree
	 */
	void exitModifiers(TrabalhoParserParser.ModifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrabalhoParserParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(TrabalhoParserParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrabalhoParserParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(TrabalhoParserParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrabalhoParserParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(TrabalhoParserParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrabalhoParserParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(TrabalhoParserParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrabalhoParserParser#memberDecl}.
	 * @param ctx the parse tree
	 */
	void enterMemberDecl(TrabalhoParserParser.MemberDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrabalhoParserParser#memberDecl}.
	 * @param ctx the parse tree
	 */
	void exitMemberDecl(TrabalhoParserParser.MemberDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrabalhoParserParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(TrabalhoParserParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrabalhoParserParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(TrabalhoParserParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrabalhoParserParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(TrabalhoParserParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrabalhoParserParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(TrabalhoParserParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrabalhoParserParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(TrabalhoParserParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrabalhoParserParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(TrabalhoParserParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrabalhoParserParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameters(TrabalhoParserParser.FormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrabalhoParserParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameters(TrabalhoParserParser.FormalParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrabalhoParserParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameter(TrabalhoParserParser.FormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrabalhoParserParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameter(TrabalhoParserParser.FormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrabalhoParserParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void enterParExpression(TrabalhoParserParser.ParExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrabalhoParserParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void exitParExpression(TrabalhoParserParser.ParExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrabalhoParserParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclarationStatement(TrabalhoParserParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrabalhoParserParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclarationStatement(TrabalhoParserParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrabalhoParserParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarators(TrabalhoParserParser.VariableDeclaratorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrabalhoParserParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarators(TrabalhoParserParser.VariableDeclaratorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrabalhoParserParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarator(TrabalhoParserParser.VariableDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrabalhoParserParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarator(TrabalhoParserParser.VariableDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrabalhoParserParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializer(TrabalhoParserParser.VariableInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrabalhoParserParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializer(TrabalhoParserParser.VariableInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrabalhoParserParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitializer(TrabalhoParserParser.ArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrabalhoParserParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitializer(TrabalhoParserParser.ArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrabalhoParserParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(TrabalhoParserParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrabalhoParserParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(TrabalhoParserParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrabalhoParserParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(TrabalhoParserParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrabalhoParserParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(TrabalhoParserParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrabalhoParserParser#basicType}.
	 * @param ctx the parse tree
	 */
	void enterBasicType(TrabalhoParserParser.BasicTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrabalhoParserParser#basicType}.
	 * @param ctx the parse tree
	 */
	void exitBasicType(TrabalhoParserParser.BasicTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrabalhoParserParser#referenceType}.
	 * @param ctx the parse tree
	 */
	void enterReferenceType(TrabalhoParserParser.ReferenceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrabalhoParserParser#referenceType}.
	 * @param ctx the parse tree
	 */
	void exitReferenceType(TrabalhoParserParser.ReferenceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrabalhoParserParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void enterStatementExpression(TrabalhoParserParser.StatementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrabalhoParserParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void exitStatementExpression(TrabalhoParserParser.StatementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrabalhoParserParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(TrabalhoParserParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrabalhoParserParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(TrabalhoParserParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrabalhoParserParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression(TrabalhoParserParser.AssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrabalhoParserParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression(TrabalhoParserParser.AssignmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrabalhoParserParser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalAndExpression(TrabalhoParserParser.ConditionalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrabalhoParserParser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalAndExpression(TrabalhoParserParser.ConditionalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrabalhoParserParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(TrabalhoParserParser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrabalhoParserParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(TrabalhoParserParser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrabalhoParserParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(TrabalhoParserParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrabalhoParserParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(TrabalhoParserParser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrabalhoParserParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(TrabalhoParserParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrabalhoParserParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(TrabalhoParserParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrabalhoParserParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(TrabalhoParserParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrabalhoParserParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(TrabalhoParserParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrabalhoParserParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(TrabalhoParserParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrabalhoParserParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(TrabalhoParserParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrabalhoParserParser#simpleUnaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterSimpleUnaryExpression(TrabalhoParserParser.SimpleUnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrabalhoParserParser#simpleUnaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitSimpleUnaryExpression(TrabalhoParserParser.SimpleUnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrabalhoParserParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixExpression(TrabalhoParserParser.PostfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrabalhoParserParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixExpression(TrabalhoParserParser.PostfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrabalhoParserParser#selector}.
	 * @param ctx the parse tree
	 */
	void enterSelector(TrabalhoParserParser.SelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrabalhoParserParser#selector}.
	 * @param ctx the parse tree
	 */
	void exitSelector(TrabalhoParserParser.SelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrabalhoParserParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(TrabalhoParserParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrabalhoParserParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(TrabalhoParserParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrabalhoParserParser#creator}.
	 * @param ctx the parse tree
	 */
	void enterCreator(TrabalhoParserParser.CreatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrabalhoParserParser#creator}.
	 * @param ctx the parse tree
	 */
	void exitCreator(TrabalhoParserParser.CreatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrabalhoParserParser#newArrayDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterNewArrayDeclarator(TrabalhoParserParser.NewArrayDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrabalhoParserParser#newArrayDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitNewArrayDeclarator(TrabalhoParserParser.NewArrayDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrabalhoParserParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(TrabalhoParserParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrabalhoParserParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(TrabalhoParserParser.LiteralContext ctx);
}
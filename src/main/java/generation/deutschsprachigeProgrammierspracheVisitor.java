// Generated from /home/lukas/git/deutschsprachiges_programmieren_dsl/src/deutschsprachigeProgrammiersprache.g4 by ANTLR 4.13.2

package generation;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link deutschsprachigeProgrammierspracheParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface deutschsprachigeProgrammierspracheVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link deutschsprachigeProgrammierspracheParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(deutschsprachigeProgrammierspracheParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link deutschsprachigeProgrammierspracheParser#zeilenNummerierung}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitZeilenNummerierung(deutschsprachigeProgrammierspracheParser.ZeilenNummerierungContext ctx);
	/**
	 * Visit a parse tree produced by {@link deutschsprachigeProgrammierspracheParser#anweisung}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnweisung(deutschsprachigeProgrammierspracheParser.AnweisungContext ctx);
	/**
	 * Visit a parse tree produced by {@link deutschsprachigeProgrammierspracheParser#intergerDeklaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntergerDeklaration(deutschsprachigeProgrammierspracheParser.IntergerDeklarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link deutschsprachigeProgrammierspracheParser#wertzuweisungAddition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWertzuweisungAddition(deutschsprachigeProgrammierspracheParser.WertzuweisungAdditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link deutschsprachigeProgrammierspracheParser#wertzuweisungSubtraktion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWertzuweisungSubtraktion(deutschsprachigeProgrammierspracheParser.WertzuweisungSubtraktionContext ctx);
	/**
	 * Visit a parse tree produced by {@link deutschsprachigeProgrammierspracheParser#stopAnweisung}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStopAnweisung(deutschsprachigeProgrammierspracheParser.StopAnweisungContext ctx);
	/**
	 * Visit a parse tree produced by {@link deutschsprachigeProgrammierspracheParser#sprunganweisung}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSprunganweisung(deutschsprachigeProgrammierspracheParser.SprunganweisungContext ctx);
	/**
	 * Visit a parse tree produced by {@link deutschsprachigeProgrammierspracheParser#unbedingteSprunganweisung}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnbedingteSprunganweisung(deutschsprachigeProgrammierspracheParser.UnbedingteSprunganweisungContext ctx);
	/**
	 * Visit a parse tree produced by {@link deutschsprachigeProgrammierspracheParser#bedingteSprunganweisung}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBedingteSprunganweisung(deutschsprachigeProgrammierspracheParser.BedingteSprunganweisungContext ctx);
	/**
	 * Visit a parse tree produced by {@link deutschsprachigeProgrammierspracheParser#zeilenReferenzierung}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitZeilenReferenzierung(deutschsprachigeProgrammierspracheParser.ZeilenReferenzierungContext ctx);
	/**
	 * Visit a parse tree produced by {@link deutschsprachigeProgrammierspracheParser#eingabe}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEingabe(deutschsprachigeProgrammierspracheParser.EingabeContext ctx);
	/**
	 * Visit a parse tree produced by {@link deutschsprachigeProgrammierspracheParser#ausgabe}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAusgabe(deutschsprachigeProgrammierspracheParser.AusgabeContext ctx);
	/**
	 * Visit a parse tree produced by {@link deutschsprachigeProgrammierspracheParser#vergleichsOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVergleichsOperator(deutschsprachigeProgrammierspracheParser.VergleichsOperatorContext ctx);
}
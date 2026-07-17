// Generated from D:/Daten Jeremias/Bildung/FHDW Hannover/Semester 4/26Q3 Informationsinfrastrukturen - Unit 1/deutschsprachiges_programmieren_dsl/src/deutschsprachigeProgrammiersprache.g4 by ANTLR 4.13.2

package generation;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link deutschsprachigeProgrammierspracheParser}.
 */
public interface deutschsprachigeProgrammierspracheListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link deutschsprachigeProgrammierspracheParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(deutschsprachigeProgrammierspracheParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link deutschsprachigeProgrammierspracheParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(deutschsprachigeProgrammierspracheParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link deutschsprachigeProgrammierspracheParser#zeilenNummerierung}.
	 * @param ctx the parse tree
	 */
	void enterZeilenNummerierung(deutschsprachigeProgrammierspracheParser.ZeilenNummerierungContext ctx);
	/**
	 * Exit a parse tree produced by {@link deutschsprachigeProgrammierspracheParser#zeilenNummerierung}.
	 * @param ctx the parse tree
	 */
	void exitZeilenNummerierung(deutschsprachigeProgrammierspracheParser.ZeilenNummerierungContext ctx);
	/**
	 * Enter a parse tree produced by {@link deutschsprachigeProgrammierspracheParser#anweisung}.
	 * @param ctx the parse tree
	 */
	void enterAnweisung(deutschsprachigeProgrammierspracheParser.AnweisungContext ctx);
	/**
	 * Exit a parse tree produced by {@link deutschsprachigeProgrammierspracheParser#anweisung}.
	 * @param ctx the parse tree
	 */
	void exitAnweisung(deutschsprachigeProgrammierspracheParser.AnweisungContext ctx);
	/**
	 * Enter a parse tree produced by {@link deutschsprachigeProgrammierspracheParser#intergerDeklaration}.
	 * @param ctx the parse tree
	 */
	void enterIntergerDeklaration(deutschsprachigeProgrammierspracheParser.IntergerDeklarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link deutschsprachigeProgrammierspracheParser#intergerDeklaration}.
	 * @param ctx the parse tree
	 */
	void exitIntergerDeklaration(deutschsprachigeProgrammierspracheParser.IntergerDeklarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link deutschsprachigeProgrammierspracheParser#wertzuweisungAddition}.
	 * @param ctx the parse tree
	 */
	void enterWertzuweisungAddition(deutschsprachigeProgrammierspracheParser.WertzuweisungAdditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link deutschsprachigeProgrammierspracheParser#wertzuweisungAddition}.
	 * @param ctx the parse tree
	 */
	void exitWertzuweisungAddition(deutschsprachigeProgrammierspracheParser.WertzuweisungAdditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link deutschsprachigeProgrammierspracheParser#wertzuweisungSubtraktion}.
	 * @param ctx the parse tree
	 */
	void enterWertzuweisungSubtraktion(deutschsprachigeProgrammierspracheParser.WertzuweisungSubtraktionContext ctx);
	/**
	 * Exit a parse tree produced by {@link deutschsprachigeProgrammierspracheParser#wertzuweisungSubtraktion}.
	 * @param ctx the parse tree
	 */
	void exitWertzuweisungSubtraktion(deutschsprachigeProgrammierspracheParser.WertzuweisungSubtraktionContext ctx);
	/**
	 * Enter a parse tree produced by {@link deutschsprachigeProgrammierspracheParser#stopAnweisung}.
	 * @param ctx the parse tree
	 */
	void enterStopAnweisung(deutschsprachigeProgrammierspracheParser.StopAnweisungContext ctx);
	/**
	 * Exit a parse tree produced by {@link deutschsprachigeProgrammierspracheParser#stopAnweisung}.
	 * @param ctx the parse tree
	 */
	void exitStopAnweisung(deutschsprachigeProgrammierspracheParser.StopAnweisungContext ctx);
	/**
	 * Enter a parse tree produced by {@link deutschsprachigeProgrammierspracheParser#sprunganweisung}.
	 * @param ctx the parse tree
	 */
	void enterSprunganweisung(deutschsprachigeProgrammierspracheParser.SprunganweisungContext ctx);
	/**
	 * Exit a parse tree produced by {@link deutschsprachigeProgrammierspracheParser#sprunganweisung}.
	 * @param ctx the parse tree
	 */
	void exitSprunganweisung(deutschsprachigeProgrammierspracheParser.SprunganweisungContext ctx);
	/**
	 * Enter a parse tree produced by {@link deutschsprachigeProgrammierspracheParser#unbedingteSprunganweisung}.
	 * @param ctx the parse tree
	 */
	void enterUnbedingteSprunganweisung(deutschsprachigeProgrammierspracheParser.UnbedingteSprunganweisungContext ctx);
	/**
	 * Exit a parse tree produced by {@link deutschsprachigeProgrammierspracheParser#unbedingteSprunganweisung}.
	 * @param ctx the parse tree
	 */
	void exitUnbedingteSprunganweisung(deutschsprachigeProgrammierspracheParser.UnbedingteSprunganweisungContext ctx);
	/**
	 * Enter a parse tree produced by {@link deutschsprachigeProgrammierspracheParser#bedingteSprunganweisung}.
	 * @param ctx the parse tree
	 */
	void enterBedingteSprunganweisung(deutschsprachigeProgrammierspracheParser.BedingteSprunganweisungContext ctx);
	/**
	 * Exit a parse tree produced by {@link deutschsprachigeProgrammierspracheParser#bedingteSprunganweisung}.
	 * @param ctx the parse tree
	 */
	void exitBedingteSprunganweisung(deutschsprachigeProgrammierspracheParser.BedingteSprunganweisungContext ctx);
	/**
	 * Enter a parse tree produced by {@link deutschsprachigeProgrammierspracheParser#zeilenReferenzierung}.
	 * @param ctx the parse tree
	 */
	void enterZeilenReferenzierung(deutschsprachigeProgrammierspracheParser.ZeilenReferenzierungContext ctx);
	/**
	 * Exit a parse tree produced by {@link deutschsprachigeProgrammierspracheParser#zeilenReferenzierung}.
	 * @param ctx the parse tree
	 */
	void exitZeilenReferenzierung(deutschsprachigeProgrammierspracheParser.ZeilenReferenzierungContext ctx);
	/**
	 * Enter a parse tree produced by {@link deutschsprachigeProgrammierspracheParser#eingabe}.
	 * @param ctx the parse tree
	 */
	void enterEingabe(deutschsprachigeProgrammierspracheParser.EingabeContext ctx);
	/**
	 * Exit a parse tree produced by {@link deutschsprachigeProgrammierspracheParser#eingabe}.
	 * @param ctx the parse tree
	 */
	void exitEingabe(deutschsprachigeProgrammierspracheParser.EingabeContext ctx);
	/**
	 * Enter a parse tree produced by {@link deutschsprachigeProgrammierspracheParser#ausgabe}.
	 * @param ctx the parse tree
	 */
	void enterAusgabe(deutschsprachigeProgrammierspracheParser.AusgabeContext ctx);
	/**
	 * Exit a parse tree produced by {@link deutschsprachigeProgrammierspracheParser#ausgabe}.
	 * @param ctx the parse tree
	 */
	void exitAusgabe(deutschsprachigeProgrammierspracheParser.AusgabeContext ctx);
	/**
	 * Enter a parse tree produced by {@link deutschsprachigeProgrammierspracheParser#vergleichsOperator}.
	 * @param ctx the parse tree
	 */
	void enterVergleichsOperator(deutschsprachigeProgrammierspracheParser.VergleichsOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link deutschsprachigeProgrammierspracheParser#vergleichsOperator}.
	 * @param ctx the parse tree
	 */
	void exitVergleichsOperator(deutschsprachigeProgrammierspracheParser.VergleichsOperatorContext ctx);
}
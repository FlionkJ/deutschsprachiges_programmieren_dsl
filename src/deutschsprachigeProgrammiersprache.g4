grammar deutschsprachigeProgrammiersprache;

@header {
package generation;
}

program : zeilenNummerierung+ ;

zeilenNummerierung : zeilenReferenzierung ':' anweisung+ ; // unterscheidung zwischen Zeile für die Nummerierung und Zeile für die Sprunganweisungen

anweisung : intergerDeklaration |  wertzuweisungAddition | wertzuweisungSubtraktion | stopAnweisung | sprunganweisung | eingabe | ausgabe;

intergerDeklaration : ALPHANUMERIC ':=' NUMBER ';';

wertzuweisungAddition : ALPHANUMERIC ':=' ALPHANUMERIC '+' ALPHANUMERIC ';';

wertzuweisungSubtraktion : ALPHANUMERIC ':=' ALPHANUMERIC '-' ALPHANUMERIC ';';

stopAnweisung : 'STOPP' | 'HALT' ';';

sprunganweisung : unbedingteSprunganweisung | bedingteSprunganweisung;

unbedingteSprunganweisung : 'GEHE ZU ' zeilenReferenzierung ';';

bedingteSprunganweisung : 'WENN(' ALPHANUMERIC vergleichsOperator NUMBER ')DANN GEHE ZU' zeilenReferenzierung ';';

zeilenReferenzierung : 'Zeile' NUMBER;

eingabe : 'EINGABE' ALPHANUMERIC ';' ;

ausgabe : 'SCHREIBE' ALPHANUMERIC ';' ;

NUMBER : [0-9]+;
ALPHANUMERIC : [a-zA-Z0-9]+;
WS    : [ \t\r\n]+ -> skip ; // für die Akzeptanz von Leerzeichen
vergleichsOperator : '=' | '<' | '>' ;

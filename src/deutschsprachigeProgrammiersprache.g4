grammar deutschsprachigeProgrammiersprache;

program : zeile+ ;

zeile : 'Zeile' NUMBER ':' anweisung+ ;

anweisung : intergerDeklaration |  wertzuweisungAddition | wertzuweisungSubtraktion | stopAnweisung | sprunganweisung | eingabe | ausgabe;

intergerDeklaration : ALPHANUMERIC ':=' NUMBER ';';

wertzuweisungAddition : ALPHANUMERIC ':=' ALPHANUMERIC '+' ALPHANUMERIC ';';

wertzuweisungSubtraktion : ALPHANUMERIC ':=' ALPHANUMERIC '-' ALPHANUMERIC ';';

stopAnweisung : STOPP ';';

sprunganweisung : unbedingteSprunganweisung | bedingteSprunganweisung;

unbedingteSprunganweisung : 'GEHE ZU ' zeile ';';

bedingteSprunganweisung : 'WENN(' ALPHANUMERIC '=' NUMBER ')DANN GEHE ZU' zeile ';';

eingabe : 'EINGABE' ALPHANUMERIC ';' ;

ausgabe : 'SCHREIBE' ALPHANUMERIC ';' ;

NUMBER : [0-9]+;
ALPHANUMERIC : [a-zA-Z0-9]+;
STOPP : 'STOPP' | 'HALT' ;
WS    : [ \t\r\n]+ -> skip ; // für die Akzeptanz von Leerzeichen
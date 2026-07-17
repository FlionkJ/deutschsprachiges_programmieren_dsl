# Deutschsprachiges Programmieren DSL #

## Wahl des genutzten Plugins ##
Wir haben uns für die Verwendung von ANTLR für die Entwicklung der DSL entschieden. 
Damit konnten wir auf die Verwendung von Eclipse verzichten und bieten einen 
alternativen Lösungsweg zu dem Lösungsweg mit Xtext und Eclipse. 

## Entwicklung der Grammatik ##
Um die Grammatik der deutschen Programmiersprache zu entwickeln haben wir die Regeln,
welche in der Aufgabenstellung beschrieben waren, schrittweise in die Grammatik umgewandelt. 
Am Anfang hatten wir noch nicht zwischen der Zeilenreferenzierung und der Zeilen Angabe am 
Zeilenbeginn unterschieden, was dazu geführt hat, das die Grammatik nur "GEHE ZU Zeile 1:"
akzeptiert hat. Zunächst hatten wir dieses Problem versucht zu lösen, in dem wir eine Zeilennummerierung 
mit Doppelpunkt am Ende einführen und eine Zeilenreferenzierung ohne Doppelpunkt einführen. 
Im Nächsten Schritt haben wir dann die Zeilenreferenzierung als strukturellen Bestandteil in
die Definition der Zeilennummerierung geschrieben. So konnten wir erreichen, 
dass die Zeilenreferenzierung ohne das Terminalsymbol ":" akzeptiert wird und 
die Zeilennummerierung mit dem Terminalsymbol endet.

## Reflexion der Ergebnisse ##
Wir hatten am Anfang etwas Probleme damit, uns in dem neuen Plugin zurechtzufinden. 
Aber danach hatten wir kaum noch Probleme, was mit unter auch an der Verwendung von IntelliJ
statt Eclipse gelegen hat. Zudem war die Ordnerstruktur des Projektes deutlich übersichtlicher 
als die Ordnerstruktur in dem Xtext Projekt aus der Mathevorlesung. 



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

## Implementierung der DSL ##
Das bestehende Projekt wurde als Java-/Maven-Projekt eingerichtet. Zu Anfang haben wir die ANTLR-Runtime als Maven-Dependency hinzugefügt, um die aus der Grammatik generierten Lexer-, Parser- und Visitor-Klassen im Java-Code verwenden zu können.

Zunächst wurden die von ANTLR generierten Klassen über eine `Main`-Klasse getestet. Dazu haben wir ein Beispielprogramm eingelesen, durch den Lexer in Tokens aufgeteilt und anschließend durch den Parser anhand der definierten Grammatik analysiert. Den dabei erzeugten Parse Tree haben wir ausgegeben, um zu prüfen, ob das Beispielprogramm von der Grammatik korrekt erkannt und über die generierten Klassen verarbeitet werden kann.

Für die weitere Verarbeitung wurde ein `ProgramVisitor` implementiert, welcher den von ANTLR erzeugten Parse Tree durchläuft und die erkannten Anweisungen in ein eigenes internes Java-Modell überführt. Eine Programmzeile wird durch die Klasse `ProgramLine` repräsentiert und enthält die Zeilennummer, sowie die zugehörige Anweisung. 

Für die verschiedenen Anweisungstypen haben wir ein gemeinsames `Instruction`-Interface definiert. Die konkreten DSL-Anweisungen wie Zuweisung, Addition, Subtraktion, Ein- und Ausgabe, Sprunganweisungen und Stopp werden durch eigene Implementierungen dieses Interfaces repräsentiert. Durch die Verwendung des `Instruction`-Interfaces können die verschiedenen Anweisungen polymorph über eine gemeinsame `execute()`-Methode ausgeführt werden. Der `ProgramVisitor` übersetzt die Anweisungen in diese `Instruction`-Objekte. Dadurch wird die eigentliche Ausführungslogik von der Verarbeitung des Parse Trees getrennt.

Zur Ausführung des Programms haben wir einen `Interpreter` implementiert. Dieser verwaltet die in einer Liste gespeicherten Programmzeilen, die aktuell gespeicherten Variablenwerte und einen Programmzähler. Der Interpreter führt die `Instruction`-Objekte nacheinander aus. Über die `execute()`-Implementierung der jeweiligen konkreten Anweisung wird bestimmt, welche Logik ausgeführt wird.

Die Ein- und Ausgaben werden über die Konsole realisiert. Variablen und ihre aktuellen Werte werden während der Programmausführung in einer Map gespeichert, um einen einfachen Zugriff auf den aktuellen Programmzustand zu ermöglichen. Sprunganweisungen verändern den Programmzähler und ermöglichen dadurch die Umsetzung von Schleifen und bedingten Programmabläufen.

Die Implementierung wurde anhand verschiedener Tests und Beispielprogramme getestet, um die korrekte Verarbeitung und Ausführung der unterstützten DSL-Anweisungen zu überprüfen.
## Reflexion der Ergebnisse ##
Wir hatten am Anfang etwas Probleme damit, uns in dem neuen Plugin zurechtzufinden. 
Aber danach hatten wir kaum noch Probleme, was mit unter auch an der Verwendung von IntelliJ
statt Eclipse gelegen hat. Zudem war die Ordnerstruktur des Projektes deutlich übersichtlicher 
als die Ordnerstruktur in dem Xtext Projekt aus der Mathevorlesung. 



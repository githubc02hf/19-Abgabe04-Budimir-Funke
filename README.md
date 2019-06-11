# 19-Abgabe04-Budimir-Funke

## To Do

- [x] Übertragen Angabe Taskliste in Markdown Readme
- [x] Einspielen Queue Vorlage aus Respository: https://github.com/michaelulm/software-configuration-managment/tree/master/test-automation/Queue
Zum Übertragen der Queue Vorlage haben wir das angegebene Repository gecloned um es lokal zu haben und dann den Queue Ordner kopiert in unser Repository. Nur der notwendige src Ordner und die pom.xml wurden übertragen.
- [ ] Taskergebnisse Schritt für Schritt auf Git erstellen
    - [ ] Führung
    - [ ] Veröffentlichung in Git mit aktuell durchgeführten Tätigkeiten, z.B. Testfälle geschrieben so wird auch in der Taskliste diese Aufgabe als erledig markiert und Testfälle inkl. geänderter Taskliste ins Respository übertragen

- [x] Korrigieren Sie den Code bzw. Debuggen Sie ihn um die Fehler zu finden
Zur Fehlersuche haben wir den fehlerhaften Source-Code in unserer Entwicklungsumgebung geöffnet und genau nach Fehlern durchforstet. Uns sind die drei Fehler relativ schnell aufgefallen, da sie offensichtlich keinen Sinn ergeben haben. Alle Fehler waren in src/main/at/fhl/iit/StringQueue.java
    - [x] Es befinden sich gesamt 3 Fehler im Source Code
    Der erste Fehler war in Zeile 17 beim Construktor der Klasse Stringqueue. maxsize war einmal klein und einmal groß, dazu wurde ein this vergessen.
    Der zweite Fehler war in Zeile 34 in der poll() Methode beim if(elements.size() == 0) muss man auf ungleich (!= 0) abfragen da man nicht ein element von der Queue removen kann/soll wenn die Größe null ist.
    Der dritte Fehler war in Zeile 43, in der Methode remove() wo ein falsches extra "element = "";" stand. Dies hat mit der folgenden if-Abfrage kein Sinn gemacht, da sie auf "null" abfragen muss um zu entfernen und die unnötige zeile direkt vor der Abfrage das element überschrieben hat.
    - [x] Bei Bedarf Optimieren Sie das Queue Besipiel
    - Ergänzen Sie das Beispiel nach eigenen Ermessen um es testen zu können

- [ ] Erstellen Sie für Klasse und alle  Methoden Kommentare um mittels Javadoc eine API Dokumentation zu erzeugen
    - [ ] Integrieren Sie ein Bild (der generierten Dokumentation) in ihren Report

- [ ] Erstellung JUnit Tests (vollständig testen, mehrere Varianten)
    - [ ] Sie werden die „selben“ Testfälle mehrfach erstellen müssen um „mehrere Variationen“ für einen möglichst vollständigen Test zu erreichen. Achten Sie dabei mit unterschiedlichen Daten zu testen.
    - [ ] JavaDoc Kommentare erstellen.
    - [ ] Integrieren Sie ein Bild (der generierten Dokumentation) in Ihren Report.

- [x] Passen Sie Ihr pom.xml auf das Projekt an, damit Sie das Projekt erstellen aber auch Dokumentation generieren können.
Für die pom.xml mussten einige Anpassungen gemacht werden. Als erstes müssen Developer und Project Informationen angegeben werden. Bei uns waren dass persönliche Daten und Campus02 Daten. Danach mussten sowohl die plugins erweitert werden als auch die Dependencies. Für den Log4J2-Logger mussten die entsprechenden Dependencies (api und core) eingefügt werden.
Desweiteren ist für die Junit-Verwendung das dazugehörigen JUnit Dependency notwendig. Die Dependencies sind für die Java-Source Code Kompilierung notwendig.
Für das Builden sind ebenfalls plugins notwendig. Dies sind vor allem maven compiler und maven site plugins. Für die Dokumentation wird im pom.xml unter dem tag reporting ebenfalls einige plugins hinzugefügt Dies sind z.B. der surefire report das maven Site plugin oder vas maven -project info.
    - [x] EntwicklerInnen Informationen hinzufügen.
    Unter dem <developers> tag haben wir unsere Informationen eingefügt.
    - [x] Integration Logging Bibliothek log4j mittels Maven Dependencies.
    Orientiert an Stack Beispiel haben wir die notwendigen core und api dependencies eingefügt.

- [x] Log4j (Version 2) integrieren und in jeder Methode ins Log schreiben
    - [x] Siehe aktualisiertes Stack Beispiel.
    Bezug auf das offizielle Kurs Repository. Stack ist zu finden unter test-automation.
    - [x] Erstellen Sie einen Statischen Logger der auf die Konsole schreibt.
    private static final Logger LOG = LogManager.getLogger(StringQueue.class); benötigt zwei imports: einmal den LogManager und einmal den Logger
    - [x] Konfigurieren Sie Logger über ein properties File.
    Die properties file haben wir übernommen aus dem Stack Beispiel des offiziellen Kurs Repositories.
    - [x] Geben Sie eine Info Lognachricht bei Aufruf einer jeden Methode aus.
    Dies wurde mit LOG.info() erreicht. Es wurde der Methoden nahme und der return name ausgegeben.
    - [x] Geben Sie eine Error Lognachricht aus bevor Sie einen Fehler werfen.
    Dies wurde mit LOG.error() erreicht. Er wurde eine kurze Beschreibung der Exception bzw. des Grundes für die Exception geworfen.
    - [x] Ergebnisse (Konsolenausgabe) als Bild in Dokumentation einfließen lassen.
    Screenshot gemacht auf Ubuntu eines Laufes in eclipse

- [x] Maven Site Dokumentation erstellen
    - [x] Inklusive Javadoc Code und Javadoc Test Klassen
    Das Einbinden der JavaDoc und der TestKlassen war sehr einfach, da diese bereits schon durch Maven vor der Site Generation erstellt worden war und nur noch korrekt verlinkt werden musste. Diese Verlinkungen wurde innerhalb der site.xml erreicht mittels dem Menu Eintrag und zugleich Verlinkung <menu ref="reports">
    - [x] Inklusive Menü mit Verweis auf manuell erstellte Seite
    Der Verlink zum selbsterstellen Seite war wie der Link zu den reports einfach mittels eines href-Links auf die relative position zu erreichen. Die selbstgeschriebene Seite wurde im Ordner markdown unter dem src/site Ordner angelegt.
        - [x] Seite erläutert Funktionsweise Queue
        In der Datei src/site/markdown/Queue.md wurde eine kurze Beschreibung der Datenstruktur Queue und Ihrer Operationen beschrieben.
    - [x] Geben Sie ein Bild der Maven Site Dokumentation in den Lab Report
    Zwei Screenshots: Einmal von der index.html aus und einmal von der Queue.html
        - [x] Der Inhalt der manuell erstellten Seite sollte ersichtlich sein

- [ ] Erstellung detaillierter und nachvollziehbarer Markdown Lab Report
    - [ ] Übertragung Information aus Labreport Template.
    - [ ] Alle Schritte dieser Übung nachvollziehbar erläutern.
    - [ ] Übung Github Flavor: Erstellen Sie einen Codeblock im Dokument, welcher 3 Zeilen Python und 3 Zeilen Java Source Code korrekt darstellt.
    - [ ] Korrekturlesen Dokumentation
    - [ ] PDF erstellen (zB Dillinger)

- [ ] Überprüfung Vollständigkeit der Abgabe
- [ ] Abgabe PDF Version der Abgabe

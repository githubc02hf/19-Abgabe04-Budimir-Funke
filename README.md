# Lab Report
## Abgabe 4
Ivica Budimir
Henrik Funke
URL: https://github.com/githubc02hf/19-Abgabe04-Budimir-Funke

### TODO-Liste mit Vorgehens-Beschreibung der jeweiligen Tasks

- [x] Übertragen Angabe Taskliste in Markdown Readme
- [x] Einspielen Queue Vorlage aus Respository: https://github.com/michaelulm/software-configuration-managment/tree/master/test-automation/Queue
Zum Übertragen der Queue Vorlage haben wir das angegebene Repository gecloned um es lokal zu haben und dann den Queue Ordner kopiert in unser Repository. Nur der notwendige src Ordner und die pom.xml wurden übertragen.
- [x] Taskergebnisse Schritt für Schritt auf Git erstellen
    - [x] Führung
    - [x] Veröffentlichung in Git mit aktuell durchgeführten Tätigkeiten, z.B. Testfälle geschrieben so wird auch in der Taskliste diese Aufgabe als erledigt markiert und Testfälle inkl. geänderter Taskliste ins Respository übertragen
    Nach jeder erledigten Task wurde das jeweilige Kästchen mit einem "x" markiert.

- [x] Korrigieren Sie den Code bzw. Debuggen Sie ihn um die Fehler zu finden
Zur Fehlersuche haben wir den fehlerhaften Source-Code in unserer Entwicklungsumgebung geöffnet und genau nach Fehlern durchforstet. Uns sind die drei Fehler relativ schnell aufgefallen, da sie offensichtlich keinen Sinn ergeben haben. Alle Fehler waren in src/main/at/fhl/iit/StringQueue.java
    - [x] Es befinden sich gesamt 3 Fehler im Source Code
    Der erste Fehler war in Zeile 17 beim Construktor der Klasse Stringqueue. maxsize war einmal klein und einmal groß geschrieben, dazu wurde ein this vergessen.
    Der zweite Fehler war in Zeile 34 in der poll() Methode beim if(elements.size() == 0) muss man auf ungleich (!= 0) abfragen da man nicht ein element von der Queue removen kann/soll wenn die Größe 0 ist.
    Der dritte Fehler war in Zeile 43, in der Methode remove() wo ein falsches extra "element = "";" stand. Dies hat mit der folgenden if-Abfrage kein Sinn gemacht, da sie auf "null" abfragen muss um zu entfernen und die unnötige zeile direkt vor der Abfrage das element überschrieben hat.
    - [x] Bei Bedarf Optimieren Sie das Queue Besipiel
    - Ergänzen Sie das Beispiel nach eigenen Ermessen um es testen zu können

- [x] Erstellen Sie für Klasse und alle Methoden Kommentare um mittels Javadoc eine API Dokumentation zu erzeugen
    Um eine API Dokumentation mittels Javadoc zu erzeugen, müssen bestimmte Konventionen und Richtlinien eingehalten werden. Ein Javadoc Kommentar wird vor einer Klasse oder Methode geschrieben und besteht aus zwei Teilen: Eine Beschreibung gefolgt von Tags. In unserer Aufgabe haben wir hauptsächlich die Tags @return sowie @param für Methoden verwendet und @author sowie @version für Klassen. In Maven Site wurde dann die Javadoc eingebunden bzw. war diese bereits eingebunden.
    - [x] Integrieren Sie ein Bild (der generierten Dokumentation) in ihren Report
    Ein Screenshot wurden von der generierten Dokumentation gemacht.

    

- [x] Erstellung JUnit Tests (vollständig testen, mehrere Varianten)
    - [x] Sie werden die „selben“ Testfälle mehrfach erstellen müssen um „mehrere Variationen“ für einen möglichst vollständigen Test zu erreichen. Achten Sie dabei mit unterschiedlichen Daten zu testen.
      Tests sind ein wichtiger Bestandteil in der Softwareentwicklung, daher wurden von uns die methoden offer(), poll(), remove(), peek() und element() getestet. Hier haben wir hauptsächlich Assert.assertTrue, Assert.assertFalse und Assert.assertEquals verwendet. Bevor wir die Methoden getestet haben, wurde am Anfang das Setup aufgebaut. Danach wurden die Funktionalität getestet, wie z.B das Hinzufügen eines Strings mit offer() oder das Löschen und Zurückliefern des ersten Elements mit remove(). In der Dokumentation sind alle Tests beschrieben.
    - [x] JavaDoc Kommentare erstellen.
     Genau wie zuvor wurden hier auch Javadoc Kommentare geschrieben, jedoch waren hier für die Test-Methoden keine Tags, wie @return notwendig, sondern es wurden nur die Beschreibungen verfasst.
    - [x] Integrieren Sie ein Bild (der generierten Dokumentation) in Ihren Report.
    Hier wurde ebenfalls ein Schreenshot erstellt.


- [x] Passen Sie Ihr pom.xml auf das Projekt an, damit Sie das Projekt erstellen aber auch Dokumentation generieren können.
Für die pom.xml mussten einige Anpassungen gemacht werden. Als erstes müssen Developer und Project Informationen angegeben werden. Bei uns waren dass persönliche Daten und Campus02 Daten. Danach mussten sowohl die plugins erweitert werden als auch die Dependencies. Für den Log4J2-Logger mussten die entsprechenden Dependencies (api und core) eingefügt werden.
Desweiteren ist für die Junit-Verwendung das dazugehörigen JUnit Dependency notwendig. Die Dependencies sind für die Java-Source Code Kompilierung notwendig.
Für das Builden sind ebenfalls plugins notwendig. Dies sind vor allem maven compiler und maven site plugins. Für die Dokumentation werden im pom.xml unter dem tag reporting ebenfalls einige plugins hinzugefügt Dies sind z.B. der surefire report das maven Site plugin oder das maven -project info.
    - [x] EntwicklerInnen Informationen hinzufügen.
    Unter dem <developers> tag haben wir unsere Informationen eingefügt.
    - [x] Integration Logging Bibliothek log4j mittels Maven Dependencies.
    Orientiert an Stack Beispiel haben wir die notwendigen core und api dependencies eingefügt.

- [x] Log4j (Version 2) integrieren und in jeder Methode ins Log schreiben
    - [x] Siehe aktualisiertes Stack Beispiel.
    Bezug auf das offizielle Kurs Repository. Stack ist zu finden unter /test-automation.
    - [x] Erstellen Sie einen Statischen Logger der auf die Konsole schreibt.
    private static final Logger LOG = LogManager.getLogger(StringQueue.class); benötigt zwei imports: einmal den LogManager und einmal den Logger
    - [x] Konfigurieren Sie Logger über ein properties File.
    Die properties file haben wir übernommen aus dem Stack Beispiel des offiziellen Kurs Repositories.
    - [x] Geben Sie eine Info Lognachricht bei Aufruf einer jeden Methode aus.
    Dies wurde mit LOG.info() erreicht. Es wurde der Methoden nahme und der return name ausgegeben.
    - [x] Geben Sie eine Error Lognachricht aus bevor Sie einen Fehler werfen.
    Dies wurde mit LOG.error() erreicht. Er wurde eine kurze Beschreibung der Exception bzw. des Grundes für die Exception geworfen.
    - [x] Ergebnisse (Konsolenausgabe) als Bild in Dokumentation einfließen lassen.
    Screenshot gemacht auf Ubuntu eines Durchlaufs in eclipse

- [x] Maven Site Dokumentation erstellen
    - [x] Inklusive Javadoc Code und Javadoc Test Klassen
    Das Einbinden der JavaDoc und der TestKlassen war sehr einfach, da diese bereits durch Maven vor der Site Generation erstellt worden war und nur noch korrekt verlinkt werden musste. Diese Verlinkungen wurde innerhalb der site.xml erreicht mittels dem Menu Eintrag und zugleich Verlinkung <menu ref="reports">
    - [x] Inklusive Menü mit Verweis auf manuell erstellte Seite
    Der Verlink zum selbsterstellen Seite war wie der Link zu den reports einfach mittels eines href-Links auf die relative position zu erreichen. Die selbstgeschriebene Seite wurde im Ordner markdown unter dem src/site Ordner angelegt.
        - [x] Seite erläutert Funktionsweise Queue
        In der Datei src/site/markdown/Queue.md wurde eine kurze Beschreibung der Datenstruktur Queue und Ihrer Operationen beschrieben.
    - [x] Geben Sie ein Bild der Maven Site Dokumentation in den Lab Report
    Zwei Screenshots: Einmal von der index.html aus und einmal von der Queue.html
        - [x] Der Inhalt der manuell erstellten Seite sollte ersichtlich sein

- [x] Erstellung detaillierter und nachvollziehbarer Markdown Lab Report
    - [x] Übertragung Information aus Labreport Template.
    Informationen wurden von Anfang an im README.md geschrieben.
    - [x] Alle Schritte dieser Übung nachvollziehbar erläutern.
    Unter jeder Task wurden die Schritte erklärt.
    - [x] Übung Github Flavor: Erstellen Sie einen Codeblock im Dokument, welcher 3 Zeilen Python und 3 Zeilen Java Source Code korrekt darstellt.
    ```python
    def print_text():
        s = "Python"
        s2 = " is good"
        print s + s2
    ```
    ```java
    public void printText() {
        String s = "java";
        String s2 = " is better";
        System.out.print(s+s2);
    }
    ```
    Um Source Code korrekt darzustellen wurden 3 Backticks vor dem Codeblock und 3 Backticks nach dem Codblock geschrieben.
    - [x] Korrekturlesen Dokumentation
    Im Texteditor öffnen und drüberlesen bzw. Editor-Scanner kontrollieren lassen.
    - [x] PDF erstellen (zB Dillinger)
  Dillinger.io hat eigene Export as Funktionalität mit .pdf support.

- [x] Überprüfung Vollständigkeit der Abgabe
- [x] Abgabe PDF Version der Abgabe


### Links
Kurs-Repository mit Anleitungen und Beispiels-Konfigurations-Files: https://github.com/michaelulm/software-configuration-management

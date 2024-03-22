// Klasse "Klasse" mit Attributen und Methoden

class Klasse {

    // Statisches Attribut "anzahlObjekte" zählt die Anzahl der erstellten Objekte
    private static int anzahlObjekte;

    // Finales Attribut "name" speichert den Namen des Objekts
    private final String name;

    // Konstruktor initialisiert das Objekt mit dem Namen
    public Klasse(String name) {
        this.name = name;
        // Anzahl der Objekte erhöhen
        anzahlObjekte++;
    }

    // Methode "beenden()" beendet das Objekt und dekrementiert die Anzahl der Objekte
    public void beenden() {
        // Ausgabe einer Nachricht mit dem Namen des Objekts
        System.out.println(STR."Objekt \{name} wird beendet!");
        // Anzahl der Objekte verringern
        anzahlObjekte--;
    }

    // Main-Methode erstellt drei Objekte und beendet sie
    public static void main(String[] args) {
        // Erzeugen von drei Objekten
        Klasse objekt1 = new Klasse("Objekt 1");
        Klasse objekt2 = new Klasse("Objekt 2");
        Klasse objekt3 = new Klasse("Objekt 3");
        Klasse objekt4 = new Klasse("Objekt 4");

        // Ausgabe der Anzahl der Objekte
        System.out.println(STR."Anzahl Objekte: \{anzahlObjekte}");

        // Beenden von Objekt 1
        objekt1.beenden();

        // Ausgabe der Anzahl der Objekte
        System.out.println(STR."Anzahl Objekte: \{anzahlObjekte}");

        // Beenden von Objekt 2
        objekt2.beenden();

        // Ausgabe der Anzahl der Objekte
        System.out.println(STR."Anzahl Objekte: \{anzahlObjekte}");

        // Beenden von Objekt 3
        objekt3.beenden();

        // Ausgabe der Anzahl der Objekte
        System.out.println(STR."Anzahl Objekte: \{anzahlObjekte}");

        // Beenden von Objekt 4
        objekt4.beenden();

        // Ausgabe der Anzahl der Objekte
        System.out.println(STR."Anzahl Objekte: \{anzahlObjekte}");
    }
}




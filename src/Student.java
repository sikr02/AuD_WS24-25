// Oberklasse Student
public class Student {
    // Attribute (Zustaende) => protected, damit sie auch in den abgeleiteten Klassen sichtbar sind
    protected String name;
    protected int age;
    protected String studyField;

    // Konstruktor
    public Student(String name, int age, String studyField) {
        // this.name ist das Attribut name (s.o.), name ist der Parameter => 2 unterschiedliche Variablen!
        this.name = name;
        this.age = age;
        this.studyField = studyField;
    }

    // Standard-Konstruktor (Default-Konstruktor)
    public Student() { // Keine Parameter
        this("Max Mustermann", 42, "BWL"); // Aufrufen eines anderen Konstruktors derselben Klasse
    }

    // Instanz-Methode (Aktionen)
    public void study(int duration) {
        // Innerhalb dieser Methode kann mit den Attributen des Objekts gearbeitet werden (z.B. name, age, studyField)
        System.out.println(name + " hat " + duration + " Stunden gelernt.");
    }

    // Ueberschreiben der toString-Methode von Object (Ausgabe bei System.out.println(...))
    @Override
    public String toString() {
        return "Hallo, mein Name ist " + name + ", ich bin " + age + " Jahre alt und studiere " + studyField + ".";
    }
}

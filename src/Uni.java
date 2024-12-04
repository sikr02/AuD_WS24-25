// Klasse, die Objekte vom Typ Student bzw. AuDStudent verwendet
public class Uni {
    // main-Methode gehoert nicht zum Objekt => static
    public static void main(String[] args) {
        // Hier kann die Klasse Student wie ein eigener Datentyp verwendet werden
        Student friedrich = new Student("Friedrich Alexander", 25, "Philosophie");
        Student max = new Student();
        AuDStudent simon = new AuDStudent("Simon", 22, "Medizintechnik", false);

        System.out.println(friedrich); // implizit wird hier .toString() aufgerufen
        System.out.println(max);
        System.out.println(simon);

        friedrich.study(3);
        max.study(4);
        // Lernen ohne Computer
        simon.study(2);

        // Computer kaufen
        simon.setHasComputer(true);
        // Lernen mit Computer :D
        simon.study(3);
    }
}

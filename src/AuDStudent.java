// Unterklasse AuDStudent
public class AuDStudent extends Student {
    private boolean hasComputer;
    private int money;

    // Konstruktor
    public AuDStudent(String name, int age, String studyField, boolean hasComputer) {
        super(name, age, studyField); // Konstruktor der Oberklasse aufrufen
        this.hasComputer = hasComputer;
        money = 1000; // Start-Kapital ;)
    }

    // Ueberschreiben der Methode study aus der Oberklasse
    @Override
    public void study(int duration) {
        if (hasComputer) {
            // Falls der/die AuD-StudentIn einen Computer besitzt, wird natuerlich programmiert :D
            System.out.println(name + " hat " + duration + " Stunden gelernt und gaanz viel programmiert."); // name ist hier bereits aus der Oberklasse bekannt => protected
        } else {
            // Falls nicht, wird ohne programmieren gelernt :( (=> Methode "study" der Oberklasse aufrufen)
            super.study(duration);
        }
    }

    // Getter-Methode => Gibt den Wert unseres private-Attribut heraus (wichtig: NUR den Wert, nicht die Variable selbst)
    public boolean getHasComputer() {
        return hasComputer;
    }

    public void setHasComputer(boolean hasComputer) {
        // Hier kann der Zugriff reguliert werden. Beispiel: Nur, wenn der/die StudentIn mehr als 500 Euro hat, kann er/sie sich einen Computer leisten
        /*
        if (hasComputer && (money > 500)) {
            this.hasComputer = true;
        } else {
            this.hasComputer = false;
        }
        */
        this.hasComputer = hasComputer && (money > 500); // Kurzform des if-else-Blocks
    }
}

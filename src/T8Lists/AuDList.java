package T8Lists;

import T5OOP1.AuDStudent;
import T5OOP1.Student;

public class AuDList<E> {
    /**
     * Innere Klasse mit Nutzlast "value" und Zeiger auf das naechste Element "next"
     */
    private static class ListItem<E> {
        private E value;
        private ListItem<E> next;

        public ListItem(E value) {
            this.value = value;
        }
    }

    // Attribut, das den Anfang der Liste speichert
    // => private (!), sonst kann ein Benutzer von aussen die Liste veraendern
    private ListItem<E> head;

    /**
     * Konstruktor mit Initialwerten.
     *
     * @param values Werte in der Liste.
     */
    public AuDList(E[] values) {
        // Werte nacheinander einfuegen
        for (int i = 0; i < values.length; i++) {
            ListItem<E> item = new ListItem<>(values[i]);

            if (i == 0) {
                // Sonderfall: Anfang der Liste
                head = item;
            } else {
                ListItem<E> pos = head;
                // Finden der Einfuege-Position
                while (pos.next != null) {
                    pos = pos.next;
                }
                // Anhaengen des Elements
                pos.next = item;
            }
        }
    }

    /**
     * Methode zur Berechnung der Laenge der Liste.
     *
     * @return Die Anzahl der Elemente in der Liste.
     */
    public int getLength() {
        int length = 0; // Akkumulator
        // Iteration ueber die Liste
        for (ListItem<E> i = head; i != null; i = i.next) {
            length++;
        }
        return length;
    }

    /**
     * Ueberprueft iterativ, ob ein Wert in der Liste enthalten ist.
     *
     * @param value Wert, der ueberprueft werden soll.
     * @return true, wenn der Wert in der Liste existiert, sonst false.
     */
    public boolean existsIter(E value) {
        // Iteration ueber die Liste
        for (ListItem<E> i = head; i != null; i = i.next) {
            // Ueberpruefen, ob Wert gefunden ist
            if (value.equals(i.value)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Ueberprueft rekursiv, ob ein Wert in der Liste enthalten ist.
     *
     * @param value Wert, der ueberprueft werden soll.
     * @return true, wenn der Wert in der Liste existiert, sonst false.
     */
    public boolean existsRec(E value) {
        // Hilfsmethode => Basisfaelle
        return existsRecHelper(head, value);
    }

    // Hilfsmethode
    private boolean existsRecHelper(ListItem<E> i, E value) {
        if (i == null) {
            // Basisfall: Ende der Liste => Nicht enthalten
            return false;
        } else if (value.equals(i.value)) {
            // Basisfall: Element gefunden => Enthalten
            return true;
        } else {
            // Rekursion mit dem naechsten Element
            return existsRecHelper(i.next, value);
        }
    }


    public static void main(String[] args) {
        // Anlegen eines Student-Arrays mit Student- und AuDStudent-Objekten
        // => Polymorphie at its finest :D
        Student[] students = new Student[]{
                new Student("Friedrich", 250, "Geschichte"),
                new AuDStudent("Simon", 22, "Medizintechnik", true),
                new Student("Alexander", 249, "Philosophie"),
                new AuDStudent("Der Franke", 50, "Elegdrodechnig", false)
        };

        // Neue AuDList
        AuDList<Student> a = new AuDList<>(students);
        // Laenge der Liste: 4
        System.out.println("Length of the list: " + a.getLength() + " elements");
        System.out.println();

        // Testen von Werten
        Student[] valuesToTest = new Student[]{
                new Student("Friedrich", 250, "Geschichte"),
                new AuDStudent("Simon", 22, "Medizintechnik", true),
                // Max Mustermann ist leider nicht mehr dabei :(
                new AuDStudent("Max Mustermann", 25, "Wirtschaftsinformatik", true)
        };

        for (Student s : valuesToTest) { // for-each-Schleife
            // Aufrufen beider exists-Methoden
            System.out.println("Does " + s + " exist in the list? -- Iterative: "
                    + a.existsIter(s) + " -- Recursive: " + a.existsRec(s));
        }

    }
}

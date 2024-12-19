package T9StacksQueuesHash;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ForEachList<E> implements Iterable<E> { // Interface Iterable<E>
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
    public ForEachList(E[] values) {
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
     * Innere Klasse ForEachIterator, der das Interface Iterator implementiert.
     */
    private static class ForEachIterator<E> implements Iterator<E> {
        // Aktuelle Position
        private ListItem<E> current;

        // Konstruktor mit Startwert
        public ForEachIterator(ListItem<E> head) {
            this.current = head;
        }

        // Methode, die checkt, ob noch Elemente nachher kommen
        @Override
        public boolean hasNext() {
            return current != null;
        }

        // Methode, die das aktuelle Element herausgibt und das current-Attribut weitersetzt
        @Override
        public E next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            E res = current.value;
            current = current.next;
            return res;
        }
    }

    // Methode, die einen Iterator mit Start bei head
    @Override
    public Iterator<E> iterator() {
        return new ForEachIterator<>(this.head);
    }

    // Main-Methode
    public static void main(String[] args) {
        ForEachList<String> a = new ForEachList<>(new String[]{"a", "b", "c", "d", "e", "f"});

        for (String s : a) {
            System.out.println(s);
        }
    }
}

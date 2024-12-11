package T2LoopsArrays;

public class T2RepZip {
    public static void main(String[] args) {
        int[] a = new int[]{1, 3, 5, 7, 9};
        int[] b = new int[]{2, 4, 6, 8, 10};

        // Legen Sie ein neues Array c an und implementieren Sie ein Programm, das die
        // Elemente von a und b im "Reissverschluss-Verfahren" in c einfuegt. Am Ende soll c
        // also die Elemente a[0], b[0], a[1], b[1], ... enthalten
        int[] c = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            c[2 * i] = a[i];
            c[2 * i + 1] = b[i];
        }

        // Ausgabe des Arrays c:
         System.out.println(java.util.Arrays.toString(c));
    }
}

public class T2RepArray {
    public static void main(String[] args) {
        int[] a = new int[]{7, 6, 5, 4, 3, 2, 1, 4, 3, 2};
        int[] b = new int[]{4, 3, 2};

        // Schreiben Sie ein Programm, das ueberprueft, ob b ein Teil-Array von a ist, also ob
        // es eine Position in a gibt, an der alle Elemente von b der Reihe nach liegen.
        for (int i = 0; i <= a.length - b.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i + j] != b[j]) {
                    break;
                }
                if (j == b.length - 1) {
                    System.out.println("Gefunden an Position " + (i + 1));
                }
            }

        }
    }
}

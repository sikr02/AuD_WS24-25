package T8Lists;

public class Repetitorium {

    /**
     * Standard rekursive Methode. Linearer Aufrufbaum => siehe Tafeluebungs-Folien.
     *
     * @param n Die Zahl von der die Fakultaet berechnet werden soll.
     * @return Die Fakultaet von n => n!
     */
    public static int fak(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * fak(n - 1);
        }
    }

    /**
     * Rekursive Methode mit Akkumulator.
     * Der Hilfsmethode wird zu Beginn der Rekursion ein Startwert mitgegeben, auf den im Anschluss die Fakultaet
     * aufmultipliziert wird.
     *
     * @param n Die Zahl von der die Fakultaet berechnet werden soll.
     * @return Die Fakultaet von n => n!
     */
    public static int fakWithAccumulator(int n) {
        return fakAccumulatorHelper(n, 1);
    }

    private static int fakAccumulatorHelper(int n, int acc) {
        if (n == 0) {
            return acc;
        } else {
            return fakAccumulatorHelper(n - 1, n * acc);
        }
    }

    public static int fibonacci(int n) {
        if (n < 2) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    /**
     * Endrekursive Methode zur Berechnung der Fibonacci-Zahlen.
     *
     * @param n Gibt an, welche Fibonacci-Zahl berechnet werden.
     * @return Gibt die n-te Fibonacci-Zahl aus der Reihe zurueck.
     */
    public static int fibonacciEndRecursive(int n) {
        return fibonacciEndRecursiveHelper(n, 1, 0);
    }

    private static int fibonacciEndRecursiveHelper(int n, int fMinusOne, int fMinusTwo) {
        // Endrekursiv: Beim Aufrufen der Rekursion wird gerechnet (+).
        // Auf der tiefsten Ebene steht das Ergebnis allerdings schon fest.
        // Mathematisch: f(n) = f(n - 1) + f(n - 2) => f(n + 1) = f(n) + f(n - 1) = (f(n - 1) + f(n - 2)) + f(n - 1)
        if (n == 0) {
            return fMinusTwo;
        } else if (n == 1) {
            return fMinusOne;
        } else {
            return fibonacciEndRecursiveHelper(n - 1, fMinusOne + fMinusTwo, fMinusOne);
        }
    }

    /**
     * Iterative Implementierung der Fibonacci-Zahlen. Zuerst werden die Startwerte fuer die Schleife initialisiert und
     * danach werden die Variablen in der Schleife aktualisiert.
     *
     * @param n Gibt an, welche Fibonacci-Zahl berechnet werden.
     * @return Gibt die n-te Fibonacci-Zahl aus der Reihe zurueck.
     */
    public static int fibonacciIter(int n) {
        if (n < 2) {
            // Sonderfaelle
            return n;
        } else {
            // Initialisierung
            int fnMinusTwo = 0;
            int fnMinusOne = 1;

            // Aktualisieren der Variablen
            for (int i = 2; i <= n; i++) {
                int fn = fnMinusOne + fnMinusTwo; // neue Fibonacci-Zahl
                fnMinusTwo = fnMinusOne; // f(n - 1) wird im naechsten Schritt zu f(n - 2)
                fnMinusOne = fn; // f(n) wird im naechsten Schritt zu f(n - 1)
            }
            return fnMinusOne;
        }
    }

    public static void main(String[] args) {
        System.out.println(fak(5));
        System.out.println(fakWithAccumulator(5));

        System.out.println(fibonacci(10));
        System.out.println(fibonacciEndRecursive(10));
        System.out.println(fibonacciIter(10));
    }
}

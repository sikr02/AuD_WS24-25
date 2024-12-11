package T2LoopsArrays;

public class T2RepRandom {
    public static void main(String[] args) {
        // Generieren Sie ein zufaelliges x, bis Sie ein x > 0.999 erzeugt haben
        int n = 0;
        double r;
        // Tipp: Schleife... Math.random();
        do {
            n++;
            r = Math.random();
        } while (r <= 0.999);

        // Geben Sie danach aus, wie viele Versuche Ihr Programm dafuer gebraucht hat
        System.out.println("Beim " + n + ". Versuch war x zum ersten Mal groesser als 0.999");
    }
}











/*
do {
        r = Math.random();
        n++;
        } while (r <= 0.999);*/

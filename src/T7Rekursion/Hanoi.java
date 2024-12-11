package T7Rekursion;

public class Hanoi {
    public static void moveDisc(int n, char from, char to) {
        System.out.println("Move Disc No. " + n + " from " + from + " to " + to);
    }

    public static void moveStack(int n, char from, char via, char to) {
        // Basisfall
        if (n == 1) {
            moveDisc(n, from, to);
            return;
        }

        // Rekursion
        moveStack(n - 1, from, to, via);
        moveDisc(n, from, to);
        moveStack(n - 1, via, from, to);
    }

    public static void main(String[] args) {
        char start = 'A';
        char end = 'C';
        char via = 'B';
        int numberOfDiscs = 10;

        moveStack(numberOfDiscs, start, via, end);
    }
}

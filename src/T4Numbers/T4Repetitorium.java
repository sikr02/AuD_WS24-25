package T4Numbers;

public class T4Repetitorium {
    public static String convertNumberToBinaryString(int x) {
        String res = "";
        while (x > 0) {
            // Verwende & (logisches AND) und >> (Rechtsschieben)
            res = (x & 1) + res;
            x = x >> 1;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(convertNumberToBinaryString(21));
    }
}

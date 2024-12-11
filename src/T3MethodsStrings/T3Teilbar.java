package T3MethodsStrings;

public class T3Teilbar {
    public static void alleTeiler(int x) {
        for (int i = 1; i <= x; i++) {
            if (teilbar(x, i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean teilbar(int x, int y) {
        return x % y == 0;
    }

    public static void main(String[] args) {
        int a1 = 100;
        int a2 = 5;

        boolean b = teilbar(a1, a2);
        System.out.println(a1 + " ist durch " + a2 + " teilbar: " + b);

        boolean c = teilbar(a2, a1);
        System.out.println(a2 + " ist durch " + a1 + " teilbar: " + c);

        alleTeiler(a1);
        alleTeiler(a2);
    }
}

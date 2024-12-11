package T3MethodsStrings;

public class T3Repetitorium {
    // public static ... irgendwas mit int
    public static int quadrat(int a) {
        return a * a;
        // return (int) Math.pow(a, 2);
    }

    // public static ... irgendwas mit double
    public static double quadrat(double a) {
        return a * a;
    }

    // public static ... irgendwas mit void

    // public static ... irgendwas mit int[]


    public static String changeCase(String s) {
        String res = "";
        // Tipp: Schleife ueber s
        // ...
        return res;
    }

    public static double mean(int[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum / arr.length;
    }

    public static void main(String[] args) {
        System.out.println(quadrat(6));
        System.out.println(quadrat(4.0));

        int[] a = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};


//        int[] array1 = new int[]{1, 2, 3, 4, 5};
//        inc1(array1);
//        System.out.println("array1: " + java.util.Arrays.toString(array1));

//        int[] array2 = inc2(array1);
//        System.out.println("array1: " + java.util.Arrays.toString(array1));
//        System.out.println("array2: " + java.util.Arrays.toString(array2));

//        System.out.println(changeCase("aUd iST tOLL! :)"));
//        System.out.println(changeCase("dAS WAR'S FUER HEUTE. bIS NAECHSTE wOCHE!"));
    }
}

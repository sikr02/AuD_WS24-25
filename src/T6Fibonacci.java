public class T6Fibonacci {
    public int mixColor(T6Fibonacci i) {
        System.out.println(i);
        return 0;
    }

    public static int[] computeFibonacciSequence(int n) {
        int[] sequence = new int[n];
        sequence[0] = 1;
        sequence[1] = 1;
        for (int i = 2; i < n; i++) {
            sequence[i] = sequence[i - 1] + sequence[i - 2];
        }
        return sequence;
    }


    public static void main(String[] args) {
        int lengthOfSequence = 100;
        int[] sequence = computeFibonacciSequence(lengthOfSequence);
        System.out.println(java.util.Arrays.toString(sequence));
    }
}

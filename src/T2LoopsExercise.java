public class T2LoopsExercise {
    public static void main(String[] args) {
        // Legen Sie ein int-Array mit drei Werten Ihrer Wahl an
        int[] array = new int[]{1, 2, 3};
        // Schreiben Sie eine Schleife, um jeden Eintrag des Arrays um 1 zu erhoehen
        for (int i = 0; i < array.length; i++) {
            array[i]++;
        }
        // Erhoehen Sie den letzten Eintrag im Array zusaetzlich um 2
        array[array.length - 1] += 2;
        // Schreiben Sie eine weitere Schleife, um die Werte im Array auf die Standardausgabe auszugeben
        for (int i = 0; i < array.length; i++) {
            System.out.println("Wert an Stelle " + (i + 1) + ": " + array[i]);
        }
    }
}

package algorithms.homework001;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        final int QUANTITY = 10_000_000;
        int[] array1 = createArray(QUANTITY);

        long startTime = System.currentTimeMillis();
        new HeapSort().sort(array1);
        System.out.println("Время: " + (System.currentTimeMillis() - startTime));

        int[] array2 = createArray(QUANTITY);

        startTime = System.currentTimeMillis();
        Arrays.sort(array2);
        System.out.println("Время: " + (System.currentTimeMillis() - startTime));

    }

    private static int[] createArray(int n) {
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = new Random().nextInt(-99, 100);
        }
        return array;
    }

}

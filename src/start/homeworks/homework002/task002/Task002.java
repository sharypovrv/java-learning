package start.homeworks.homework002.task002;

/*
 * 2) Реализуйте алгоритм сортировки пузырьком числового массива,
 * результат после каждой итерации запишите в лог-файл.
 * 1 3 4 2
 * 1 3 2 4
 * 1 2 3 4
 * */

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Task002 {
    public static void main(String[] args) {
        try {
            File file = new File("./src/start/homeworks/homework002/task002/log.txt");
            FileWriter fileWriter = new FileWriter(file);
            int[] array = new int[]{8, 5, 3, 4, 1, 6};
            fileWriter.write(Arrays.toString(array) + "\n");

            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length - i - 1; j++) {
                    if (array[j] > array[j + 1]) {
                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                        fileWriter.write(Arrays.toString(array) + "\n");
                    }
                }
            }

            fileWriter.close();
        } catch (Exception exception) {
            System.out.println("!!! Ошибка !!!");
        }
    }
}

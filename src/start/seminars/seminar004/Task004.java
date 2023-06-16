package start.seminars.seminar004;

import java.util.*;

/*
Написать метод, который принимает массив элементов,
помещает их в очередь и выводит на консоль содержимое очереди.
* */
public class Task004 {
    public static void main(String[] args) {

        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(-9, 10);
        }
        System.out.println(Arrays.toString(array));
        printQueue(array);
    }

    static void printQueue(int[] inArray) {
        Queue<Integer> list = new LinkedList<>();
        for (int el : inArray) {
            list.add(el);
        }
        System.out.println(list);
    }
}

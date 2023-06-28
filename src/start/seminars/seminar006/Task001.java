package start.seminars.seminar006;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/*
1. Напишите метод, который заполнит массив из 99 элементов случайными цифрами от 0 до 50.

2. Создайте метод, в который передайте заполненный выше массив и с помощью Set вычислите процент уникальных значений
в данном массиве и верните его в виде числа с плавающей запятой.

Для вычисления процента используйте формулу:

процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.
*/
public class Task001 {
    public static void main(String[] args) {
        int[] array = createArray(99, 50);
        System.out.println(percentOfUnique(array));
    }

    static int[] createArray(int size, int range) {
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(50);
        }
        return array;
    }
    static double percentOfUnique(int[] inArray) {
        if (inArray.length == 0) return 0;
        Set<Integer> set = new HashSet<>();
        for (int el : inArray) {
            set.add(el);
        }
        return (double) set.size() * 100 / inArray.length;
    }
}

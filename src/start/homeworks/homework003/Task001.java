package start.homeworks.homework003;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
Задание
Пусть дан произвольный список целых чисел.
1) Нужно удалить из него чётные числа
2) Найти минимальное значение
3) Найти максимальное значение
4) Найти среднее ариф. значение
*/

public class Task001 {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(10));
        }
        System.out.println(list);
        System.out.println();
        System.out.println(getOddList(list));
        System.out.printf("Min = %d\n", getMin(list));
        System.out.printf("Max = %d\n", getMax(list));
        System.out.printf("Average = %.3f\n", getAverage(list));

    }

    static List<Integer> getOddList(List<Integer> inList) {
        List<Integer> list = new ArrayList<>();
        for (Integer num : inList) {
            if (num % 2 != 0) {
                list.add(num);
            }
        }
        return list;
    }

    static int getMin(List<Integer> inList) {
        if (inList.size() == 0) return 0;
        int min = inList.get(0);
        for (Integer num : inList) {
            if (num < min) min = num;
        }
        return min;
    }

    static int getMax(List<Integer> inList) {
        if (inList.size() == 0) return 0;
        int max = inList.get(0);
        for (Integer num : inList) {
            if (num > max) max = num;
        }
        return max;
    }

    static double getAverage(List<Integer> inList) {
        if (inList.size() == 0) return 0;
        int sum = 0;
        for (Integer integer : inList) sum += integer;
        return (double) sum / inList.size();
    }
}

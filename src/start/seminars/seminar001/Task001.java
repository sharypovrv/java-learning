package start.seminars.seminar001;

public class Task001 {
    public static void main(String[] args) {
//        Дан массив двоичных чисел, например [1, 1, 0, 1, 1, 1].
//        Вывести максимальное количество подряд идущих 1.

        int[] array = new int[] {1, 1, 0, 1, 1, 1, 1, 0, 1, 1};

        int count = 0;
        int countMax = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                count++;
            } else {
                if (countMax < count) countMax = count;
                count = 0;
            }
        }
        if (countMax < count) countMax = count;

        System.out.println(countMax);
    }
}

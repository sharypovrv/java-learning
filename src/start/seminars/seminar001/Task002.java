package start.seminars.seminar001;

public class Task002 {
    public static void main(String[] args) {
        //Дан массив nums = [3,2,4,3,3,1,5,3,3] и число val = 3.
        //Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
        //Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного,
        //а остальные - равны ему.
        //
        //[2 4 1 5 3 3 3 3 3]
        //
        //Работать разрешается только с 1 массивом.

        int[] array = {3, 2, 4, 3, 3, 1, 5, 3, 3};
        int val = 3;
        int count = 0;

        print(array);

        for (int i = 0; i < array.length; i++)
            if (array[i] != val) {
                array[count++] = array[i];
            }

        while (count < array.length)
            array[count++] = val;

        print(array);
    }

    // Знаю, что плохо так использовать статические методы = сделал для упрощения
    static void print(int[] inArray) {
        for (int i = 0; i < inArray.length; i++) {
            System.out.printf("%d ", inArray[i]);
        }
        System.out.println();
    }
}

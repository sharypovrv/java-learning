package start.homeworks.homework001;

import java.util.Scanner;

public class Task001 {
    public static void main(String[] args) {
        // Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число N: ");
        int n = sc.nextInt();
        int triangle = 0;
        int fact = 1;

        for (int i = 1; i <= n; i++) {
            triangle += i;
            fact = fact * i;
        }

        System.out.printf("Triangle = %d, fact = %d", triangle, fact);

        sc.close();
    }
}

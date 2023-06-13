package start.homeworks.homework001;

import java.util.Scanner;

public class Task003 {
    public static void main(String[] args) {
        // 3) Реализовать простой калькулятор (+-/*)

        Scanner sc = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int first = Integer.parseInt(sc.nextLine());
        System.out.print("Введите операцию: ");
        String op = sc.nextLine();
        System.out.print("Введите второе число: ");
        int second = Integer.parseInt(sc.nextLine());

        double result = 0;

        switch (op) {
            case ("+"):
                result = first + second;
                break;
            case ("-"):
                result = first - second;
                break;
            case ("*"):
                result = first * second;
                break;
            case ("/"):
                result = (double) first / second;
                break;
        }
        System.out.printf("Результат: %.3f", result);
        sc.close();
    }
}

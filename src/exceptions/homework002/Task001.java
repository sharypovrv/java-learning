package exceptions.homework002;

import java.util.Scanner;

/*
Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
и возвращает введенное значение.
Ввод текста вместо числа не должно приводить к падению приложения,
вместо этого, необходимо повторно запросить у пользователя ввод данных.
*/
public class Task001 {
    public static void main(String[] args) {
        System.out.println(inputFloatWithTryCatch());
        System.out.println(inputFloatWithRegex());
    }

    private static float inputFloatWithTryCatch() {
        float result = 0;
        boolean isFloat = false;

        System.out.print("Введите дробное число: ");
        while(!isFloat) {
            try {
                result = Float.parseFloat(inputString());
                isFloat = true;
            } catch (Exception e) {
                System.out.print("Пожалуйста, введите именно дробное число: ");
            }
        }
        return result;
    }

    private static float inputFloatWithRegex() {
        float result = 0;
        boolean isFloat = false;

        System.out.print("Введите дробное число: ");
        while (!isFloat) {
            String line = inputString();
            if (line.matches("-?\\d+(\\.\\d+)?")) {
                result = Float.parseFloat(line);
                isFloat = true;
            } else {
                System.out.print("Пожалуйста, введите именно дробное число: ");
            }
        }

        return result;
    }

    private static String inputString() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}

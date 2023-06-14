package start.homeworks.homework002.task004;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

/*
 * 4) К калькулятору из предыдущего ДЗ добавить логирование.
 * */
public class Task004 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            File file = new File("./src/start/homeworks/homework002/task004/log.txt");
            FileWriter fileWriter = new FileWriter(file, true);
            StringBuilder sb = new StringBuilder();

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
            sb.append(first).append(op).append(second).append("=").append(result).append("\n");
            fileWriter.write(sb.toString());
            System.out.printf("Результат: %.3f", result);
            sc.close();
            fileWriter.close();
        } catch (Exception ex) {
            System.out.println("!!! Ошибка !!!");
        }
    }
}

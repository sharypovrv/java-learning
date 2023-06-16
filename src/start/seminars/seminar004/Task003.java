package start.seminars.seminar004;
/*
* Реализовать консольное приложение, которое:

1. Принимает от пользователя и “запоминает” строки.
2. Если введено print, выводит строки так, чтобы последняя введенная
была первой в списке, а первая - последней и чистит весь перечень.
* */

import java.util.Scanner;
import java.util.Stack;

public class Task003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<String> list = new Stack<>();
        System.out.print("Введите текст: ");
        String text = sc.nextLine();

        while (!text.toLowerCase().equals("exit")) {
            if (text.equals("print")) {
                while (!list.empty()) {
                    if (list.size() != 1) {
                        System.out.printf("%s, ", list.pop());
                    } else {
                        System.out.printf("%s", list.pop());
                    }
                }
                System.out.println();
            } else {
                list.push(text);
            }
            System.out.println(list);
            System.out.print("Введите текст: ");
            text = sc.nextLine();
        }
        sc.close();
    }
}

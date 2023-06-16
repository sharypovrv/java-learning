package start.seminars.seminar004;
/*
Реализовать консольное приложение, которое:
1. Принимает от пользователя строку вида: text

1. Нужно сохранить text в связный список.
2. Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка.
3. Выход из программы - exit*/

import java.util.LinkedList;
import java.util.Scanner;

public class Task002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<String> list = new LinkedList<>();
        System.out.print("Введите текст: ");
        String text = sc.nextLine();

        while(!text.toLowerCase().equals("exit")) {
            if (text.startsWith("print~")) {
                int num = Integer.parseInt(text.substring(6));
                if (num < list.size()) {
                    System.out.println(list.get(num));
                    list.remove(num);
                } else {
                    System.out.println("Нет элемента с таким номером.");
                }
            } else {
                list.add(text);
            }
            System.out.println(list);
            System.out.print("Введите текст: ");
            text = sc.nextLine();
        }
    }
}

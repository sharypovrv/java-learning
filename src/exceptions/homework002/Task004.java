package exceptions.homework002;

import java.util.Scanner;

/*
Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
*/
public class Task004 {
    public static void main(String[] args) {
        try {
            System.out.print("Введи строку: ");
            inputString();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


    private static String inputString() throws Exception {
        String line = new Scanner(System.in).nextLine();
        if (line.equals("")) {
            throw new Exception("Пустые строки вводить нельзя!");
        }
        return line;
    }
}

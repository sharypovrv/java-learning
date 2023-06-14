package start.seminars.seminar002;

import java.util.Scanner;

public class Task001 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Введите n: ");
        int n = Integer.parseInt(sc.nextLine());
        System.out.print("Введите первый символ: ");
        char c1 = sc.nextLine().charAt(0);
        System.out.print("Введите второй символ: ");
        char c2 = sc.nextLine().charAt(0);

        System.out.println(func(n, c1, c2));

        sc.close();
        
    }

    public static String func(int n, char c1, char c2) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append((i % 2 == 0) ? c1 : c2);
        }
        return sb.toString();
    }

}

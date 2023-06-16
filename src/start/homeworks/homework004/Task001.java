package start.homeworks.homework004;

import java.util.*;

/*
Даны два Deque, представляющие два целых числа. Цифры хранятся в обратном порядке и каждый из их узлов содержит одну цифру.
1) Умножьте два числа и верните произведение в виде связанного списка.
2) Сложите два числа и верните сумму в виде связанного списка. Одно или два числа могут быть отрицательными.

Даны два Deque, цифры в обратном порядке.
[3,2,1] - пример Deque
[5,4,3]- пример второго Deque
1) 123 * 345 = 42 435
Ответ всегда - связный список, в обычном порядке
[4,2,4,3,5] - пример ответа
*/
public class Task001 {
    public static void main(String[] args) {
        Deque<String> deque1 = readIntDeque();
        Deque<String> deque2 = readIntDeque();

        System.out.println(deque1);
        System.out.println(deque2);

        System.out.println(multiDeque(deque1, deque2));
        System.out.println(sumDeque(deque1, deque2));

    }

    static LinkedList<String> multiDeque(Deque<String> d1, Deque<String> d2) {
//        if (d1.isEmpty() || d2.isEmpty()) return null;
//        Интересный вопрос: произведение чего-то на null, будет null или ноль?

        LinkedList<String> list = new LinkedList<>();

        int multi = getIntFromDeque(d1) * getIntFromDeque(d2);

        for (char ch : Integer.toString(multi).toCharArray()) {
            list.add(Character.toString(ch));
        }

        return list;
    }

    static LinkedList<String> sumDeque(Deque<String> d1, Deque<String> d2) {

        LinkedList<String> list = new LinkedList<>();

        int sum = getIntFromDeque(d1) + getIntFromDeque(d2);

        for (char ch : Integer.toString(sum).toCharArray()) {
            list.add(Character.toString(ch));
        }

        return list;
    }

    static int getIntFromDeque(Deque<String> deque) {
        if (deque.isEmpty()) return 0;

        Deque<String> tempDeque = new LinkedList<>(deque);
        StringBuilder sb = new StringBuilder();

        while (!tempDeque.isEmpty()) {
            sb.append(tempDeque.removeLast());
        }
        return Integer.parseInt(sb.toString());
    }

    static Deque<String> readIntDeque() {
        Deque<String> deque = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        for (char ch : Integer.toString(number).toCharArray()) {
            deque.push(Character.toString(ch));
        }
        return deque;
    }

}

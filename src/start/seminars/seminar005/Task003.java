package start.seminars.seminar005;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/*
Написать программу, определяющую правильность расстановки скобок в выражении.
Пример 1: a+(d*3) - истина
Пример 2: [a+(1*3) - ложь
Пример 3: [6+(3*3)] - истина
Пример 4: {a}[+]{(d*3)} - истина
Пример 5: <{a}+{(d*3)}> - истина
Пример 6: {a+]}{(d*3)} - ложь
<({[]})> --- истина
* */
public class Task003 {
    public static void main(String[] args) {
        System.out.println(isTrue("a+(d*3)"));
        System.out.println(isTrue("[a+(1*3)"));
        System.out.println(isTrue("[6+(3*3)]"));
        System.out.println(isTrue("{a}[+]{(d*3)}"));
        System.out.println(isTrue("<{a}+{(d*3)}>"));
        System.out.println(isTrue("{a+]}{(d*3)}"));
        System.out.println(isTrue("<({[]})>"));
        System.out.println(isTrue("<({[]})>"));

    }

    static boolean isTrue(String line) {
        Map<Character, Character> map = new HashMap<>();
        map.put('}', '{');
        map.put(')', '(');
        map.put(']', '[');
        map.put('>', '<');
        Stack<Character> stack = new Stack<>();

        for (Character ch : line.toCharArray()) {
            if (map.containsValue(ch)) stack.push(ch);
            if (map.containsKey(ch)) {
                if (stack.empty() || map.get(ch) != stack.pop()) {
                    return false;
                }
            }
        }
        return stack.empty();
    }
}

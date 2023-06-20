package start.seminars.seminar005;

import java.util.HashMap;
import java.util.Map;

/*
Создать структуру для хранения Номеров паспортов и Фамилий сотрудников организации.
123456 Иванов
321456 Васильев
234561 Петрова
234432 Иванов
654321 Петрова
345678 Иванов
Вывести данные по сотрудникам с фамилией Иванов.
*/
public class Task001 {
    public static void main(String[] args) {
        String findName = "Иванов";
        Map<Integer, String> map = new HashMap<>();
        map.put(123456, "Иванов");
        map.put(321456, "Васильев");
        map.put(234561, "Петрова");
        map.put(234432, "Иванов");
        map.put(654321, "Петрова");
        map.put(345678, "Иванов");

        for (Integer key : map.keySet()) {
            if (map.get(key).equals(findName)) System.out.println(key);
        }

        System.out.println();

        for (var item : map.entrySet()){
            if (item.getValue().equals(findName)) System.out.printf("%d: %s\n", item.getKey(), item.getValue());
        }
    }
}

package start.homeworks.homework005;

/*
Реализуйте структуру телефонной книги с помощью HashMap.
Программа также должна учитывать, что во входной структуре будут
повторяющиеся имена с разными телефонами,
их необходимо считать, как одного человека с разными телефонами.
Вывод должен быть отсортирован по убыванию числа телефонов.

Пример меню:
1) Добавить контакт
2) Вывести всех
3) Выход

Иванов 123432
Иванов 546457
Иванов 788354

Map<String, ArrayList> ---- {Иванов:[23145, 456745, 56787], Петров:[4325, 45674]}
*/

import java.util.*;

public class Task001 {

    public static void main(String[] args) {

        boolean isWorking = true;
        Map<String, ArrayList<String>> map = new HashMap<>();

        while (isWorking) {
            switch (menu()) {
                case "1" -> addContact(map);
                case "2" -> printContacts(map);
                case "q" -> isWorking = false;
            }
        }

    }

    static String menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nВведите команду:\nq - выход\n1 - добавить контакт\n2 - вывести все контакты\nВведите команду: ");
        return scanner.nextLine();
    }

    static void addContact(Map<String, ArrayList<String>> map) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Добавление контакта.");
        System.out.print("Введите фамилию: ");
        String surName = scanner.nextLine();
        System.out.print("Введите номер: ");
        String phoneNumber = scanner.nextLine();

        if (surName.isEmpty() || phoneNumber.isEmpty()) {
            System.out.println("Данные не введены, контакт не добавлен.");
        } else {
            if (map.containsKey(surName)) {
                if (map.get(surName).contains(phoneNumber)) {
                    System.out.println("Контакт с таким телефон уже есть.");
                } else {
                    map.get(surName).add(phoneNumber);
                }
            } else {
                ArrayList<String> newPhoneNumberList = new ArrayList<>();
                newPhoneNumberList.add(phoneNumber);
                map.put(surName, newPhoneNumberList);
            }
        }
    }

    static void printContacts(Map<String, ArrayList<String>> map) {
        if (!map.isEmpty()) {
            System.out.println("Все контакты:");
            printSortMap(map);
        } else {
            System.out.println("Контактов нет.");
        }
    }

    static void printSortMap(Map<String, ArrayList<String>> map) {
        Map<String, Integer> tempMap = new HashMap<>();
        for (String key : map.keySet()) {
            tempMap.put(key, map.get(key).size());
        }

        ArrayList<Integer> tempArray = new ArrayList<>(tempMap.values());
        Collections.sort(tempArray);

        for (int i = tempArray.size() - 1; i >= 0 ; i--) {
            for (String key : tempMap.keySet()) {
                if (tempMap.get(key) == tempArray.get(i)) {
                    System.out.printf("Фамилия: %s. Номера: %s\n", key, map.get(key));
                    tempMap.remove(key);
                    break;
                }
            }
        }

    }

}

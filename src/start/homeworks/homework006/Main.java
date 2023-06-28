package start.homeworks.homework006;

import java.util.*;

/*
Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
Создать множество ноутбуков.
Написать метод, который будет запрашивать у пользователя критерий фильтрации и выведет ноутбуки, отвечающие фильтру.
NoteBook notebook1 = new NoteBook
NoteBook notebook2 = new NoteBook
NoteBook notebook3 = new NoteBook
NoteBook notebook4 = new NoteBook
NoteBook notebook5 = new NoteBook

Например: “Введите цифру, соответствующую необходимому критерию:
1 - ОЗУ
2 - Объем ЖД
3 - Операционная система
4 - Цвет

Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.

Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.

Класс сделать в отдельном файле

приветствие
Выбор параметра
выбор конкретнее
вывод подходящих
*/
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Notebook> notebooks = new ArrayList<>();

        notebooks.add(new Notebook(1, 16, 512, "MacOS", "black"));
        notebooks.add(new Notebook(2, 8, 256, "Windows", "white"));
        notebooks.add(new Notebook(3, 16, 1024, "MacOS", "white"));
        notebooks.add(new Notebook(4, 32, 2048, "Windows", "black"));
        notebooks.add(new Notebook(5, 8, 128, "Linux", "silver"));
        notebooks.add(new Notebook(6, 4, 128, "Linux", "silver"));

        System.out.println(notebooks);

        boolean isWorking = true;
        String choiceMenu = "\nКритерии:\n" +
                "0 - Выход\n" +
                "1 - ОЗУ\n" +
                "2 - Объем диска\n" +
                "3 - Операционная система\n" +
                "4 - Цвет\n" +
                "9 - Вывести список с учетом введенных критериев\n" +
                "Введите цифру, соответствующую необходимому критерию: ";

        Map<String, String> criteria = new HashMap<>();

        while (isWorking) {
            System.out.print(choiceMenu);
            switch (scanner.nextInt()) {
                case 0 -> {
                    isWorking = false;
                }
                case 1 -> {
                    System.out.print("Введите минимальное значение \"ОЗУ\": ");
                    int minRam = scanner.nextInt();
                    criteria.put("minRam", String.valueOf(minRam));
                }
                case 2 -> {
                    System.out.print("Введите минимальное значение \"Объем диска\": ");
                    int minDiskStorageCapacity = scanner.nextInt();
                    criteria.put("minDiskStorageCapacity", String.valueOf(minDiskStorageCapacity));
                }
                case 3 -> {
                    scanner.nextLine();
                    System.out.print("Введите значение \"Операционная система\": ");
                    String findOperationSystem = scanner.nextLine();
                    if (findOperationSystem.equals("null")) findOperationSystem = null;
                    criteria.put("operationSystem", findOperationSystem);
                }
                case 4 -> {
                    scanner.nextLine();
                    System.out.print("Введите значение \"Цвет\": ");
                    String findColor = scanner.nextLine();
                    if (findColor.equals("null")) findColor = null;
                    criteria.put("color", findColor);
                }
                case 9 -> {
                    for (Notebook findNotebook : notebooks) {
                        boolean isMatchRam = true;
                        boolean isMatchDisk = true;
                        boolean isMatchSystem = true;
                        boolean isMatchColor = true;
                        if (criteria.containsKey("minRam") && !criteria.get("minRam").isEmpty()) {
                            isMatchRam = findNotebook.getRam() >= Integer.parseInt(criteria.get("minRam"));
                        }
                        if (criteria.containsKey("minDiskStorageCapacity") && !criteria.get("minDiskStorageCapacity").isEmpty()) {
                            isMatchDisk = findNotebook.getDiskStorageCapacity() >= Integer.parseInt(criteria.get("minDiskStorageCapacity"));
                        }
                        if (criteria.containsKey("operationSystem") && criteria.get("operationSystem") != null) {
                            isMatchSystem = findNotebook.getOperationSystem().equals(criteria.get("operationSystem"));
                        }
                        if (criteria.containsKey("color") && criteria.get("color") != null) {
                            isMatchColor = findNotebook.getColor().equals(criteria.get("color"));
                        }

                        if (isMatchRam && isMatchDisk && isMatchSystem && isMatchColor) {
                            System.out.println(findNotebook);
                        }

                    }
                }

            }
        }
        
    }
}

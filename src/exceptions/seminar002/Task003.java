package exceptions.seminar002;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/*
* Запишите в файл следующие строки:
Анна=4
Елена=5
Марина=6
Владимир=?
Константин=?
Иван=4
Реализуйте метод, который считывает данные из файла и сохраняет в двумерный массив
* (либо HashMap, если студенты с ним знакомы).
* В отдельном методе нужно будет пройти по структуре данных,
* если сохранено значение ?, заменить его на соответствующее число.
* Если на каком-то месте встречается символ, отличный от числа или ?,
* бросить подходящее исключение. Записать в тот же файл данные с замененными символами ?.
* */
public class Task003 {
    public static void main(String[] args) {
        try {
            Map<String, String> map = readFile("src/exceptions/seminar002/test1.txt");
            replaceText(map);
            saveToFile("src/exceptions/seminar002/test2.txt", map);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void saveToFile(String filePath, Map<String, String> map) throws IOException {
        FileWriter writer = new FileWriter(filePath);
        for (Map.Entry<String, String> entry : map.entrySet()) {
            writer.write(entry.toString() + "\n");
            writer.flush();
        }
        writer.close();
    }

    private static Map<String, String> readFile(String filePath) throws FileNotFoundException {
        File file = new File(filePath);
        Map<String, String> map = new LinkedHashMap<>();

        Scanner scanner = new Scanner(file);
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            String[] strings = line.split("=");
            map.put(strings[0], strings[1]);
        }
        scanner.close();
        return map;
    }

    private static void replaceText(Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry.getValue().equals("?")) {
                entry.setValue(String.valueOf(entry.getKey().length()));
            } else if (!entry.getValue().matches("[0-9]+")) {
                throw new IllegalArgumentException("Ошибка в строке: " + entry);
            }
        }
    }
}

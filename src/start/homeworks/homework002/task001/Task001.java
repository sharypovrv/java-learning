package start.homeworks.homework002.task001;

/*
 * 1) Дана строка sql-запроса "select * from students WHERE ".
 * Сформируйте часть WHERE этого запроса, используя StringBuilder.
 * Данные для фильтрации приведены ниже в виде json-строки.
 * Если значение null, то параметр не должен попадать в запрос.
 * Пример данной строки {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
 * Вывод: select * from students WHERE name=Ivanov AND country=Russia AND city=Moscow
 * */

import java.io.File;
import java.io.FileReader;
import java.util.Arrays;

public class Task001 {
    public static void main(String[] args) {
        try {
            File file = new File("./src/start/homeworks/homework002/task001/test1.txt");
            FileReader fileReader = new FileReader(file);
            char[] chars = new char[(int) file.length()];
            fileReader.read(chars);
            String line = new String(chars);
            String[] array = line.replaceAll("[{}\"\s]", "").split("[:,]");
            System.out.println(Arrays.toString(array));

            StringBuilder sb = new StringBuilder("select * from students");

            boolean isFirst = true;
            for (int i = 1; i < array.length; i += 2) {
                if (!array[i].equals("null")) {
                    if (isFirst) {
                        sb
                                .append(" WHERE ")
                                .append(array[i - 1])
                                .append("=")
                                .append(array[i]);
                        isFirst = false;
                    } else {
                        sb
                                .append(" AND ")
                                .append(array[i - 1])
                                .append("=")
                                .append(array[i]);
                    }
                }
            }

            System.out.println(sb);
            fileReader.close();
        } catch (Exception ex) {
            System.out.println("!!! Ошибка !!!");
        }

    }
}

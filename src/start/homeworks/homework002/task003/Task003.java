package start.homeworks.homework002.task003;

/*
* 3) Дана строка в файле(читать из файла)
* [{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},{"фамилия":"Петрова","оценка":"4","предмет":"Информатика"}]
* Написать метод(ы), который распарсит строчку и, используя StringBuilder,
* создаст строки вида: Студент [фамилия] получил [оценка] по предмету [предмет].
* Пример вывода:
* Студент Иванов получил 5 по предмету Математика.
* Студент Петрова получил 4 по предмету Информатика.
* Студент Краснов получил 5 по предмету Физика.*/

import java.io.File;
import java.io.FileReader;

public class Task003 {
    public static void main(String[] args) {
        try {
            File file = new File("./src/start/homeworks/homework002/task003/text.txt");
            FileReader fileReader = new FileReader(file);
            char[] chars = new char[(int) file.length()];
            fileReader.read(chars);
            String line = new String(chars);
            System.out.println(line);
            String[] array = line.replaceAll("[{}\"]", "").split("[:,]");
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < array.length; i += 6) {
                sb
                        .append("Студент ")
                        .append(array[i + 1])
                        .append(" получил ")
                        .append(array[i + 3])
                        .append(" по предмету ")
                        .append(array[i + 5])
                        .append(".");
                System.out.println(sb);
                sb.setLength(0);
            }

            fileReader.close();
        } catch (Exception ex) {
            System.out.println("!!! Ошибка !!!");
        }

    }
}

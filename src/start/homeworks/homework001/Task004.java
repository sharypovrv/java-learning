package start.homeworks.homework001;

public class Task004 {
    // 4) (дополнительное задание) Задано уравнение вида q + w = e, q, w, e >= 0.
    // Некоторые цифры могут быть заменены знаком вопроса, например, 2? + ?5 = 69.
    // Требуется восстановить выражение до верного равенства.
    // Предложить хотя бы одно решение или сообщить, что его нет.
    // Под знаком вопроса - всегда одинаковая ЦИФРА.
    // Введите уравнение: ?? + ?? = 44
    // Решение: 22 + 22 = 44

    public static void main(String[] args) {
        
        String line = "2? + ?5 = 69";
        System.out.println(line);

        String tempLine = "";
        boolean isSolution = false;
        String solution = null;

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < line.length(); j++) {
                if (line.charAt(j) == '?') {
                    tempLine += i;
                    continue;
                }
                tempLine += line.charAt(j);
            }

            String[] array = tempLine.split(" ");

            if ((Integer.parseInt(array[0]) + Integer.parseInt(array[2])) == Integer.parseInt(array[4])) {
                isSolution = true;
                solution = tempLine;
            }

            tempLine = "";
        }

        if (isSolution) {
            System.out.printf("Решение: %s.\n", solution);
        }

    }
}

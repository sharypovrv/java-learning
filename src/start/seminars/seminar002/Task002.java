package start.seminars.seminar002;

/**
 * Напишите метод, который сжимает строку
 * Пример:
 * Вход: aaaabbbcdd
 * Выход: a4b3cd2
 */
public class Task002 {
    public static void main(String[] args) {
        String str = "aaasssdsdsdddsd";
        System.out.println(str);
        System.out.println(func(str));
    }

    public static String func(String line) {
        StringBuilder sb = new StringBuilder();
        int count = 1;
        if (line.length() <= 1) return line;

        for (int i = 0; i < line.length() - 1; i++) {
            if (line.charAt(i) == line.charAt(i + 1)) {
                count++;
            } else {
                sb.append(line.charAt(i));
                if (count != 1) sb.append(count);
                count = 1;
            }
        }
        sb.append(line.charAt(line.length() - 1));
        if (count != 1) sb.append(count);

        return sb.toString();
    }
}
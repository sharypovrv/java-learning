package start.homeworks.homework001;

public class Task002 {
    public static void main(String[] args) {
        // 2) Вывести все простые числа от 1 до 1000

        for (int i = 1; i < 1000; i++) {
            boolean isSimple = true;
            for (int j = 2; j < i / 2 + 1; j++) {
                if (i % j == 0) {
                    isSimple = false;
                    break;
                }
            }
            if (isSimple) System.out.println(i);
        }
    }
}

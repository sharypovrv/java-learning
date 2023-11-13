import java.util.Random;
import java.util.Scanner;

public class Draft {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isWorking = true;
        int sum = 0;

        while (isWorking) {
            if (sc.hasNextInt()) {
                int number = sc.nextInt();
                sum += number;
            } else {
                if (sc.nextLine().equals("ENTER")) {
                    isWorking = false;
                }
            }
        }
        System.out.println(sum);
    }

    private static int getSum(Random random) {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += random.nextInt(100);
        }
        return sum;
    }
}

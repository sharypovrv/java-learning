import java.util.Random;

public class Draft {
    public static void main(String[] args) {
        Random random = new Random();
        int sum = getSum(random);
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

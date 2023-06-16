package start.seminars.seminar004;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Task001 {
    public static void main(String[] args) {
        Random random = new Random();
        int n = 100000;

        long timeStart = System.currentTimeMillis();
        ArrayList<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list1.add(0, random.nextInt(-99, 100));
        }
        long timeEnd = System.currentTimeMillis();
        System.out.println(timeEnd - timeStart);

        timeStart = System.currentTimeMillis();
        LinkedList<Integer> list2 = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            list2.add(0, random.nextInt(-99, 100));
        }
        timeEnd = System.currentTimeMillis();
        System.out.println(timeEnd - timeStart);
    }
}

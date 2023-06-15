package start.seminars.seminar003;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task001 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>(Arrays.asList("земля", "земля", "марс", "юпитер", "земля", "юпитер", "марс"));
        int count = 1;
        for (int i = 0; i < list.size(); i++) {
            if (!list.subList(0, i).contains(list.get(i))) {
                for (int j = i + 1; j < list.size(); j++) {
                    if (list.get(i).equals(list.get(j))) {
                        count++;
                    }
                }
                System.out.printf("%s : %d\n", list.get(i), count);
                count = 1;
            }
        }

    }
}

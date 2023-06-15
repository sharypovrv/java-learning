package start.seminars.seminar003;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Task002 {
    public static void main(String[] args) {

        List<Object> list = new ArrayList<>(Arrays.asList("rt", 5, 3, 5.5, "tttt", 3));
//        Вариант 1
//        for (int i = 0; i < list.size(); i++) {
//            if (list.get(i) instanceof Integer) {
//                list.remove(i--);
//            }
//        }

//        Вариант 2
//        for (int i = list.size() - 1; i >= 0; i--) {
//            if (list.get(i) instanceof Integer) {
//                list.remove(i);
//            }
//        }

//        Вариант 3
        Iterator iter = list.iterator();
        while (iter.hasNext()) {
            if (iter.next() instanceof Integer) {
                iter.remove();
            }
        }


        System.out.println(list);

    }
}

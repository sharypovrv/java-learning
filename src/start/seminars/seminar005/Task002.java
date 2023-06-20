package start.seminars.seminar005;

import java.util.HashMap;
import java.util.Map;

/*
Даны 2 строки, написать метод, который вернет true, если эти строки являются изоморфными и false, если нет.
Строки изоморфны, если одну букву в первом слове можно заменить на некоторую букву во втором слове, при этом
1. повторяющиеся буквы одного слова меняются на одну и ту же букву с сохранением порядка следования. (Например, add - egg изоморфны)
2. буква может не меняться, а остаться такой же. (Например, note - code)  n:c, o:o, t:d, e:e

Пример 1:
Input: s = "foo", t = "bar", f:b, o:a, --- false
Output: false

Пример 2:
Input: s = "paper", t = "title" p:t, a:i, e:l, r:e,
Output: true
*/
public class Task002 {
    public static void main(String[] args) {
        String word1 = "paperr";
        String word2 = "titlee";

        System.out.println(isIsomorphic(word1, word2));

    }

    static boolean isIsomorphic(String word1, String word2) {
        if (word1.length() != word2.length()) return false;
        int len = word1.length();
        Map<Character, Character> map = new HashMap<>(len);

        for (int i = 0; i < len; i++) {

            if (!map.containsKey(word1.charAt(i))) {
                if (map.containsValue(word2.charAt(i))) {
                    return false;
                }
                map.put(word1.charAt(i), word2.charAt(i));

            } else {
                if (word2.charAt(i) != map.get(word1.charAt(i))) return false;
            }

        }

        return true;
    }
}

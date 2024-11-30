package validAnagram;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("racecar","carrace"));
    }
    public static boolean isAnagram(String s, String t) {
        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();

         Arrays.sort(sChar);
         Arrays.sort(tChar);

        Map<String,String> map = new HashMap<>();
        map.computeIfAbsent(new String(sChar), k -> new String(sChar));
        map.computeIfAbsent(new String(tChar), k -> new String(tChar));
        return !(map.entrySet().size()>1);
    }
}

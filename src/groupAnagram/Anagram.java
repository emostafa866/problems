package groupAnagram;

import java.util.*;

public class Anagram {
    public static void main(String[] args) {
//        Problem: Group words that are anagrams of each other.
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        Map<String, List<String>> map = new HashMap<>();
         for (String str : strs) {
             char[] chars = str.toCharArray();
             Arrays.sort(chars);

             map.computeIfAbsent(new String(chars), k -> new ArrayList<>()).add(str);

         }
        System.out.println(map.values());
    }
}

package substringWithRepeatingChar;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LongestSubstring {
    public static void main(String[] args) {
        String s = "abcabcbb";
        //result should be abc
        int count=0;
        //Set<Character> set = new HashSet<>();
        List<Character>set=new ArrayList<>();
        for(char c : s.toCharArray()){
            if(!set.contains(c)){
                set.add(c);
            } else {
                set.add(',');
                set.add(c);
            }
        }
       String result = set.toString();
        String[]chars=result.split(",");
        String smallest = chars[0]; // Assume the first string is the smallest
        for (String str : chars) {
            if (str.length() < smallest.length()) {
                smallest = str;
            }
        }

    }
}

package twoSum;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class TwoSum {
    public static void main(String[] args) {

//        Problem: Find two numbers in an array that add up to a target value.



        int[] nums = {2, 7, 11, 15};
        int target = 9;
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums) {
            map.put(num, map.containsKey(target-num)? (target-num):null);
        }
        map.entrySet().stream().filter(entry -> entry.getValue() != null)
                .forEach(m->System.out.println(m.getKey() + " " + m.getValue()));
    }
}

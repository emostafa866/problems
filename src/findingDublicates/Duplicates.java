package findingDublicates;

import java.util.HashSet;
import java.util.Set;

public class Duplicates {
    public static void main(String[] args) {
//        Problem: Check if there are duplicate elements in an array.
        int[] nums = {1, 2, 3, 4, 2};
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        System.out.println(set.size() == nums.length);
    }
}

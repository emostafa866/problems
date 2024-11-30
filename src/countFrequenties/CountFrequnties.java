package countFrequenties;

import java.util.HashMap;
import java.util.Map;

public class CountFrequnties {

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 3, 3, 3};
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        System.out.println("freq is ::"+freq.toString());
    }

}

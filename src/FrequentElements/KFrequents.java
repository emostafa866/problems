package FrequentElements;

import java.util.*;

public class KFrequents {
    public static void main(String[] args) {
        int[] result = topKFrequent(new int[]{1, 2, 2, 3, 3, 3}, 2);
        System.out.println(Arrays.toString(result));
    }

    public static int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        List<int[]>listArr = new ArrayList<>();
        map.entrySet().forEach(entry -> listArr.add(new int[]{entry.getKey(), entry.getValue()}));

        listArr.sort((a,b)->b[1]-a[1]);

        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = listArr.get(i)[0];
        }

        return res;
    }
}

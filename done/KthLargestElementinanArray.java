package done;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class KthLargestElementinanArray {

    public int findKthLargest(int[] nums, int k) {
        Map<Integer, Integer> numberQuantityMap = new TreeMap<>(Collections.reverseOrder());

        for (int num : nums) {
            int val = numberQuantityMap.getOrDefault(num, 0) + 1;
            numberQuantityMap.put(num, val);
        }

        System.out.println(numberQuantityMap);
        int sum = 0;
        for (Map.Entry<Integer,Integer> entry : numberQuantityMap.entrySet()) {
            sum += entry.getValue();
            if (sum >= k) {
                return entry.getKey();
            }
        }

        return -1;
    }
}

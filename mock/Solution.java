package mock;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {

//        var res = solve(new int[] {1,2,3,4,5}, 9);
        var res = solve(new int[] {1,-1,1,2,3}, 6);
        System.out.println(Arrays.toString(res));
    }

    public static int[] solve(int[] arr, int x) {
//        arr[] - positive and negative numbers
        int n = arr.length;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,-1);

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
//            System.out.println(sum);

            map.put(sum, i);
            int dif = sum - x;
            System.out.println(dif);
            if (map.containsKey(dif)) {
                return new int[] {map.get(dif) + 1, i + 1};
            }
        }
        return new int[] {-1, -1};

//        arr[] - only positive numbers
//        int start = 0, end = 0, sum = 0;
//
//        while (sum != x && end < arr.length) {
//            if (sum < x) {
//                sum += arr[end];
//                end++;
//            }
//            else {
//                sum -= arr[start];
//                start++;
//            }
//        }
//
//        if (sum != x) { return new int[] {-1, -1}; }
//        return new int[] {start, end};
    }
}

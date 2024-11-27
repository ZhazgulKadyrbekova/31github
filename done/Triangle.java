package done;

import java.util.ArrayList;
import java.util.List;

public class Triangle {
    public int minimumTotal(List<List<Integer>> a) {
        // Initialize with the last row to avoid reallocation
        List<Integer> dp = new ArrayList<>(a.get(a.size() - 1));

        for (int i = a.size() - 2; i >= 0; i--) {  // Iterate from second-last row to top
            for (int j = 0; j < a.get(i).size(); j++) {
                dp.set(j, a.get(i).get(j) + Math.min(dp.get(j), dp.get(j + 1)));
            }
        }
        return dp.get(0);
    }

    public int minimumTotal3(List<List<Integer>> a) {
        List<Integer> prev = new ArrayList<>();
        prev.add(a.get(0).get(0));
        List<Integer> cur = new ArrayList<>();

        for (int i = 1; i < a.size(); i++) {
            cur = a.get(i);
            for (int j = 0; j < a.get(i).size(); j++) {
                int min;
                if (j == 0) {
                    min = prev.get(j);
                }
                else if (j == cur.size() - 1) {
                    min = prev.get(j - 1);
                }
                else {
                    min = Math.min(prev.get(j), prev.get(j - 1));
                }
                cur.set(j, min + cur.get(j));
            }
            prev = cur;
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < a.size(); i++) {
            int value = prev.get(i);
            min = Math.min(min, value);
        }

        return min;
    }

    public int minimumTotal2(List<List<Integer>> a) {
        for (int i = 1; i < a.size(); i++) {
            var prevList = a.get(i - 1);
            var curList = a.get(i);
            for (int j = 0; j < curList.size(); j++) {
                int min;
                if (j == 0) {
                    min = prevList.get(j);
                }
                else if (j == curList.size() - 1) {
                    min = prevList.get(j - 1);
                }
                else {
                    min = Math.min(prevList.get(j), prevList.get(j - 1));
                }
                curList.set(j, min + curList.get(j));
            }
        }

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < a.size(); i++) {
            int value = a.get(a.size() - 1).get(i);
            min = Math.min(min, value);
        }

        return min;
    }
}

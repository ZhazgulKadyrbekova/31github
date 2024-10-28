package done;

import java.util.*;

public class JumpGameIV {
    public int minJumps(int[] arr) {
        int distance = 0, n = arr.length;

        if (n == 1) return 0;

        boolean[] reached = new boolean[arr.length];
        reached[0] = true;

        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);

        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.computeIfAbsent(arr[i], l -> new ArrayList<>()).add(i);
        }
        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size-- > 0) {
                int index = queue.poll();
                if (index == n - 1) return distance;

                List<Integer> toVisit = map.get(arr[index]);
                toVisit.add(index - 1);
                toVisit.add(index + 1);

//                System.out.println(distance + "\t" + index + "\t" + queue);

                for (int j : toVisit) {
                    if (j >= 0 && j < n && !reached[j]) {
                        queue.add(j);
                        reached[j] = true;
                    }
                }
                toVisit.clear();

//                System.out.println(queue);
            }
            distance++;
        }

        return distance;
    }
    //Time C:       O(n)        53ms        53.13%
    //Space C:      O(n)        57.47MB     80.56%

}

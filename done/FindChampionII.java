package done;

import java.util.Arrays;

public class FindChampionII {
    public int findChampion(int n, int[][] edges) {
        int trueSize = n;
        boolean[] isChampion = new boolean[n];
        Arrays.fill(isChampion, true);

        for (int[] edge : edges) {
            if (isChampion[edge[1]]) {
                isChampion[edge[1]] = false;
                trueSize--;
            }
        }

        if (trueSize != 1) return -1;
        for (int i = 0; i < n; i++) {
            if (isChampion[i]) {
                return i;
            }
        }
        return -1;
    }
}

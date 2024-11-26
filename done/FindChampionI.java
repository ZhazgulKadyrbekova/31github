package done;

import java.util.ArrayList;
import java.util.List;

public class FindChampionI {
    public int findChampion(int[][] grid) {
        List<Integer> champions = new ArrayList<>();
        List<Integer> losers = new ArrayList<>();
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    champions.add(i);
                    losers.add(j);
                }
            }
        }

        for (int champion : champions) {
            if (!losers.contains(champion)) {
                return champion;
            }
        }

        return -1;
    }
}

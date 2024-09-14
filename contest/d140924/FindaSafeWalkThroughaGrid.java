package contest.d140924;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class FindaSafeWalkThroughaGrid {
    public boolean findSafeWalk(List<List<Integer>> grid, int health) {
        int m = grid.size();
        int n = grid.get(0).size();

        int[][] directions = {{0,1},{1,0},{0,-1},{-1,0}};

        int[][] visited = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                visited[i][j] = -1;
            }
        }

        CoordinateHealth coordinateHealth = new CoordinateHealth(0, 0);
        if (grid.get(0).get(0) == 1) {
            coordinateHealth.health = health - 1;
        }
        else coordinateHealth.health = health;
        Queue<CoordinateHealth> queue = new LinkedList<>();
        queue.add(coordinateHealth);

        visited[0][0] = health;

        while (!queue.isEmpty()) {
            CoordinateHealth current = queue.poll();

            if (current.row == m - 1 && current.col == n - 1 && current.health >= 1) {
                return true;
            }

            for (int[] direction : directions) {
                int newRow = current.row + direction[0];
                int newCol = current.col + direction[1];

                if (newRow >= 0 && newRow < m && newCol >= 0 && newCol < n) {
                    int newHealth = current.health;
                    if (grid.get(newRow).get(newCol) == 1) {
                        newHealth -= 1;
                    }

                    if (newHealth >= 1) {
                        if (visited[newRow][newCol] < newHealth) {
                            visited[newRow][newCol] = newHealth;
                            queue.add(new CoordinateHealth(newRow, newCol, newHealth));
                        }
                    }
                }
            }
        }

        return false;
    }


    class CoordinateHealth {
        int row;
        int col;
        int health;
        CoordinateHealth(int row, int col) {
            this.row = row;
            this.col = col;
        }
        CoordinateHealth(int row, int col, int health) {
            this.row = row;
            this.col = col;
            this.health = health;
        }
    }
}

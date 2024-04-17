package done;

public class EqualRowAndColumnPairs {
    public int equalPairs(int[][] grid) {
        int n = grid.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (isSame(grid, i, j)) {
                    count++;
                }
            }
        }
        return count;
    }

    private boolean isSame(int[][] grid, int i, int j) {
        int n = grid.length;
        int count = 0;
        for (int k = 0; k < n; k++) {
            if (grid[i][k] == grid[k][j]) {
                count++;
            }
        }
        return count == n;
    }
}

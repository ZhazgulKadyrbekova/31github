package done;

public class CountSubIslands {
    public int countSubIslands(int[][] grid1, int[][] grid2) {
        int m = grid1.length, n = grid1[0].length;
        boolean visited[][] = new boolean[m][n];
        int counter = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid2[i][j] == 1 && !visited[i][j]) {
                    if (isSubIsland(grid1, grid2, visited, i, j)) {
                        counter++;
                    }
                }
            }
        }

        return counter;
    }

    private boolean isSubIsland(int[][] grid1, int[][] grid2, boolean visited[][], int i, int j) {
        // ranges of indexes
        if (i < 0 || i >= grid1.length || j < 0 || j >= grid1[0].length) {
            return true;
        }

        // visited
        if (visited[i][j]) {
            return true;
        }

        //set the cell asvisited
        visited[i][j] = true;

        // water check
        if (grid2[i][j] == 0) {
            return true;
        }

        boolean res = true;
        // not subisland
        if (grid1[i][j] == 0) {
            res = false;
        }

        res = isSubIsland(grid1, grid2, visited, i - 1, j) && res;
        res = isSubIsland(grid1, grid2, visited, i + 1, j) && res;
        res = isSubIsland(grid1, grid2, visited, i, j - 1) && res;
        res = isSubIsland(grid1, grid2, visited, i, j + 1) && res;

        return res;
    }

}
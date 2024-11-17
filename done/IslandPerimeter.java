package done;

public class IslandPerimeter {
    //dfs
    public int islandPerimeter(int[][] grid) {
        boolean[][] visited = new boolean[grid.length][grid[0].length];

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    return dfs(grid, i, j, visited);
                }
            }
        }
        return -1;
    }

    private int dfs(int[][] grid, int i, int j, boolean[][] visited) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == 0) {
            return 1;
        }
        if (visited[i][j]) {
            return 0;
        }

        visited[i][j] = true;

        int sum = 0;
        sum += dfs(grid, i - 1, j, visited);
        sum += dfs(grid, i + 1, j, visited);
        sum += dfs(grid, i, j - 1, visited);
        sum += dfs(grid, i, j + 1, visited);

        return sum;
    }


    //math
    public int islandPerimeter2(int[][] grid) {
        int per = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    per +=4;
                    if (i - 1 >= 0 && grid[i - 1][j] == 1) {
                        per -= 2;
                    }
                    if (j - 1 >= 0 && grid[i][j - 1] == 1) {
                        per -= 2;
                    }
                }
            }
        }

        return per;
    }
}

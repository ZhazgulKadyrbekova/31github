package done;

public class MaxAreaofIsland {
    public int maxAreaOfIsland(int[][] grid) {
        boolean[][] visited = new boolean[grid.length][grid[0].length];

        int area = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1 && !visited[i][j]) {
                    area = Math.max(area, dfs(grid, i, j, visited));
                }
            }
        }
        return area;
    }

    private int dfs(int[][] grid, int i, int j, boolean[][] visited) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == 0 || visited[i][j]) {
            return 0;
        }
        visited[i][j] = true;

        int localArea = 1;
        localArea += dfs(grid, i - 1, j, visited);
        localArea += dfs(grid, i + 1, j, visited);
        localArea += dfs(grid, i, j - 1, visited);
        localArea += dfs(grid, i, j + 1, visited);
        return localArea;
    }
}

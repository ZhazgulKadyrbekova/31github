package done;

public class UniquePathsII {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length, n = obstacleGrid[0].length;
        if (obstacleGrid[m - 1][n - 1] == 1 || obstacleGrid[0][0] == 1) {
            return 0;
        }

        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (obstacleGrid[i][j] == 1) {
                    arr[i][j] = 0;
                } else {
                    arr[i][j] = -1;
                }
            }
        }

        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                if (i == m - 1 && j == n - 1) {
                    arr[i][j] = 1;
                    continue;
                }

                if (obstacleGrid[i][j] == 1) {
                    continue;
                }

                int sum = 0;
                if (i + 1 <= m - 1) {
                    sum += arr[i + 1][j];
                }
                if (j + 1 <= n - 1) {
                    sum += arr[i][j + 1];
                }
                arr[i][j] = sum;
            }
        }

        return arr[0][0];
    }
}
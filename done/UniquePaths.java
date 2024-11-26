package done;

public class UniquePaths {
    public int uniquePaths(int m, int n) {
        int[][] arr = new int[m][n];

        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                if (i == m - 1 && j == n - 1) {
                    arr[i][j] = 1;
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
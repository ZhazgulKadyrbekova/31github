package done;

public class DifferenceBetweenOnesandZerosinRowandColumn {
    public int[][] onesMinusZeros(int[][] grid) {
        int rows = grid.length;
        int columns = grid[0].length;

        int[] onesRow = new int[rows];
        int[] onesColumn = new int[columns];

        for (int i = 0 ; i < rows; i++) {
            int row = 0;
            for (int j = 0; j < columns; j++) {
                if (grid[i][j] == 1) {
                    row++;
                }
            }
            onesRow[i] = row;
        }

        for (int i = 0 ; i < columns; i++) {
            int col = 0;
            for (int j = 0; j < rows; j++) {
                if (grid[j][i] == 1) {
                    col++;
                }
            }
            onesColumn[i] = col;
        }


        int[][] diff = new int[rows][columns];
        for (int i = 0 ; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                diff[i][j] = onesRow[i] + onesColumn[j] - (rows - onesRow[i]) - (columns - onesColumn[j]);
            }
        }
        return diff;
    }
}
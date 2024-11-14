package done;

public class SetMatrixZeroes {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;

        boolean hasFirstRow = false;
        boolean hasFirstColumn = false;

        //if first rows and columns have zero
        for (int i = 0; i < n; i++) {
            if (matrix[0][i] == 0) {
                hasFirstRow = true;
                break;
            }
        }

        for (int i = 0; i < m; i++) {
            if (matrix[i][0] == 0) {
                hasFirstColumn = true;
                break;
            }
        }

        //change first rows and columns if further elems have zero
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] == 0) {
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }

        //change row elems if first is zero
        for (int i = 1; i < m; i++) {
            if (matrix[i][0] == 0) {
                for (int j = 1; j < n; j++) {
                    matrix[i][j] = 0;
                }
            }
        }

        //change column elems if first is zero
        for (int j = 1; j < n; j++) {
            if (matrix[0][j] == 0) {
                for (int i = 1; i < m; i++) {
                    matrix[i][j] = 0;
                }
            }
        }

        //change first row
        if (hasFirstRow) {
            for (int j = 0; j < n; j++) {
                matrix[0][j] = 0;
            }
        }

        //change first column
        if (hasFirstColumn) {
            for (int j = 0; j < m; j++) {
                matrix[j][0] = 0;
            }
        }

    }
}

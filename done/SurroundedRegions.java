package done;

import java.util.Arrays;

public class SurroundedRegions {
    public void solve(char[][] board) {
        int m = board.length, n = board[0].length;
        boolean toChange[][] = new boolean[m][n];
        for (boolean arr[] : toChange) {
            Arrays.fill(arr, true);
        }


        //four sides
        for (int i = 0; i < m; i++) {
            if (board[i][0] == 'O' && toChange[i][0]) {
                update(toChange, board, i, 0);
            }
        }

        for (int i = 0; i < m; i++) {
            if (board[i][n - 1] == 'O' && toChange[i][n - 1]) {
                update(toChange, board, i, n - 1);
            }
        }

        for (int i = 0; i < n; i++) {
            if (board[0][i] == 'O' && toChange[0][i]) {
                update(toChange, board, 0, i);
            }
        }

        for (int i = 0; i < n; i++) {
            if (board[m - 1][i] == 'O' && toChange[m - 1][i]) {
                update(toChange, board, m - 1, i);
            }
        }


        //operations with board
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 'O' && toChange[i][j]) {
                    updateBoard(toChange, board, i, j);
                }
            }
        }

    }

    private void update(boolean toChange[][], char[][] board, int i, int j) {
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length
                || board[i][j] == 'X' || !toChange[i][j]) return;

        toChange[i][j] = false;
        update(toChange, board, i - 1, j);
        update(toChange, board, i + 1, j);
        update(toChange, board, i, j - 1);
        update(toChange, board, i, j + 1);
    }

    private void updateBoard(boolean toChange[][], char[][] board, int i, int j) {
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length
                || board[i][j] == 'X' || !toChange[i][j]) return;

        board[i][j] = 'X';
        updateBoard(toChange, board, i - 1, j);
        updateBoard(toChange, board, i + 1, j);
        updateBoard(toChange, board, i, j - 1);
        updateBoard(toChange, board, i, j + 1);
    }
}

public class WordSearch {
    public boolean exist(char[][] board, String word) {
        int iSize = board.length, jSize = board[0].length;
        boolean[][] used = new boolean[iSize][jSize];
        char first = word.charAt(0);
        while (true) {
            for (int i = 0; i < iSize; i++) {
                for (int j = 0; j < jSize; j++) {
                    if (board[i][j] == first) {

                    }
                }
            }
        }

    }
}

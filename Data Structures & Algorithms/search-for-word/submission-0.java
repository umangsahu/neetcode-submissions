
class Solution {
    int rows, column;

    int[] delRows = {-1, 0, 1, 0};
    int[] delCol = {0, 1, 0, -1};

    public boolean solveExist(
        char[][] board, String word,
        int i, int j, int wordIndex
    ) {
        // All characters matched
        if (wordIndex == word.length()) {
            return true;
        }

        // Boundary check
        if (i < 0 || i >= rows || j < 0 || j >= column) {
            return false;
        }

        // Character mismatch or already visited
        if (board[i][j] == '#' ||
            board[i][j] != word.charAt(wordIndex)) {
            return false;
        }

        // Mark current cell as visited
        char original = board[i][j];
        board[i][j] = '#';

        // Explore all four directions
        for (int d = 0; d < 4; d++) {
            int newRow = i + delRows[d];
            int newCol = j + delCol[d];

            if (solveExist(
                board, word, newRow, newCol, wordIndex + 1
            )) {
                board[i][j] = original;
                return true;
            }
        }

        // Backtrack: restore the cell
        board[i][j] = original;
        return false;
    }

    public boolean exist(char[][] board, String word) {
        rows = board.length;
        column = board[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < column; j++) {
                if (board[i][j] == word.charAt(0)) {
                    if (solveExist(board, word, i, j, 0)) {
                        return true;
                    }
                }
            }
        }

        return false;
    }
}

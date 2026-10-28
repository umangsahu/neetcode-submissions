class Solution {
    int[] delRow = {0, -1, 0, 1};
    int[] delCol = {-1, 0, 1, 0};

    public void dfs(char[][] grid, int i, int j, int[][] vis) {
        // if (i == grid.length || j == grid[0][j] || i == -1 || j == -1)
        //     return;
        vis[i][j] = 1;
        for (int del = 0; del < 4; del++) {
            int newRow = i + this.delRow[del];
            int newCol = j + this.delCol[del];
            if (newRow >= 0 && newRow < grid.length && newCol >= 0 && newCol < grid[0].length
                && grid[newRow][newCol] == '1' && vis[newRow][newCol] == 0) {
                dfs(grid, newRow, newCol, vis);
            }
        }
    }
    public int numIslands(char[][] grid) {
        int count = 0;
        int row = grid.length;
        int col = grid[0].length;
        int[][] vis = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == '1' && vis[i][j] == 0) {
                    count++;
                    dfs(grid, i, j, vis);
                }
            }
        }

        return count;
    }
}

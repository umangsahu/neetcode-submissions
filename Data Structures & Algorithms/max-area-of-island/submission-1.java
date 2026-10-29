class Solution {
    int[] delRow = new int[] {0, -1, 0, 1};
    int[] delCol = new int[] {-1, 0, 1, 0};

    public int dfs(int[][] grid, int[][] vis, int row, int col, int temp) {
        vis[row][col] =1;
        int ans =1;
        for (int i = 0; i < 4; i++) {
            int newRow = row + delRow[i];
            int newCol = col + delCol[i];

            if (newRow >= 0 && newRow < grid.length && newCol >= 0 && newCol < grid[0].length
                && grid[newRow][newCol] == 1 && vis[newRow][newCol] != 1) {
                ans+= dfs(grid, vis, newRow, newCol, temp + 1);
            }
        }

        return ans;
    }
    public int maxAreaOfIsland(int[][] grid) {
        int rowSize = grid.length;
        int colSize = grid[0].length;
        int[][] vis = new int[rowSize][colSize];
            int max = 0;


        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < colSize; j++) {
                if (grid[i][j] == 1 && vis[i][j] != 1) {
                  max = Math.max(dfs(grid, vis, i, j, 0), max);
                }
            }
        }

        return max;
    }
}

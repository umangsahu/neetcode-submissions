class Solution {
    int[] delRow = new int[] {-1, 0, 1, 0};
    int[] delCol = new int[] {0, 1, 0, -1};

    public int orangesRotting(int[][] grid) {
        Queue<int[]> q = new ArrayDeque<>();

        int rows = grid.length;
        int cols = grid[0].length;
        int[][] vis = new int[rows][cols];
        int freshFruit = 0;
        int rottenFruit = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (vis[i][j] != 1 && grid[i][j] == 2) {
                    q.offer(new int[] {i, j});
                    vis[i][j] = 1;
                }
                if (grid[i][j] == 1) {
                    freshFruit += 1;
                }
            }
        }

        int count = 0;

        while (!q.isEmpty()) {
            int size = q.size();
              boolean changed = false;
            for (int i = 0; i < size; i++) {
                int[] curr = q.poll();
                int r = curr[0];
                int c = curr[1];

                for (int j = 0; j < 4; j++) {
                    int nr = r + delRow[j];
                    int nc = c + delCol[j];

                    if (nr >= 0 && nr < rows && nc >= 0 && nc < cols && grid[nr][nc] == 1 && vis[nr][nc] != 1) {
                        vis[nr][nc] = 1;
                        changed = true;
                        rottenFruit += 1;
                        q.offer(new int[] {nr, nc});
                    }
                }
            }
            if(changed)count += 1;
        }

        return rottenFruit != freshFruit ? -1 : count ;
    }
}

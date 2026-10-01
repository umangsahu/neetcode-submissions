class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        int row = -1;

        for (int i = 0; i < n; i++) {
            int left = 0;
            int right = m - 1;
            int ans = -1;
            while ((target <= matrix[i][right] && target >= matrix[i][left]) && left <= right) {
                int mid = left + (right - left) / 2;

                if (matrix[i][mid] < target) {
                    left = mid + 1;
                } else if (matrix[i][mid] > target) {
                    right = mid - 1;
                } else if (matrix[i][mid] == target) {
                    return true;
                }
            }
        }

        return false;
    }
}

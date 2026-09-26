class Solution {
    public int search(int[] nums, int target) {
        int startInd = 0;
        int endInd = nums.length - 1;
        int ans = -1;

        while (startInd <= endInd) {
            int mid = (startInd + endInd) / 2;

            if (nums[mid] < target) {
                startInd = mid + 1;
            } else if (nums[mid] > target) {
                endInd = mid -1;
            } else {
                return mid;
            }
        }

        return ans;
    }
}

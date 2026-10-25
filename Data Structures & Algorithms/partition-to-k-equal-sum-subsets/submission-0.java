class Solution {
    public int sum(int[] nums) {
        int ans = 0;

        for (int i = 0; i < nums.length; i++) {
            ans += nums[i];
        }

        return ans;
    }
    public boolean solveCanPartitionKSubsets(
        int[] nums, int k, int subsetSum, int[] choices, int index, int target) {
  
        if (k == 0)
            return true;
        if (target == subsetSum)
            return solveCanPartitionKSubsets(nums, k - 1, 0, choices, 0, target);
                  if (index == nums.length)
            return false;

        if (solveCanPartitionKSubsets(nums, k, subsetSum, choices, index + 1, target)) {
            return true;
        }
        if (choices[index] != 1 && nums[index] + subsetSum <= target) {
            choices[index] = 1;
            if (solveCanPartitionKSubsets(
                    nums, k, subsetSum + nums[index], choices, index + 1, target)) {
                return true;
            }
            choices[index] = 0;
        }
        return false;
    }
    public boolean canPartitionKSubsets(int[] nums, int k) {
        int total = sum(nums) ;
        int target = total / k;

        int size = nums.length;
        int[] choices = new int[size];

        if (total % k != 0)
            return false;

        return solveCanPartitionKSubsets(nums, k, 0, choices, 0, target);
    }
}
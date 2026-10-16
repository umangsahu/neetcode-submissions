class Solution {
    public void solveCombinationSum(
        int[] nums, int target, int ind, List<Integer> temp, List<List<Integer>> ans) {
        if (target == 0) {
            ans.add(new ArrayList(temp));
            return;
        }

        if ( target < -1 || ind == nums.length)
            return;

        int i = 0;
        while (ind + i < nums.length && nums[ind] == nums[ind + i]) i++;

        solveCombinationSum(nums, target, ind + i, temp, ans);
        temp.add(nums[ind]);
        solveCombinationSum(nums, target - nums[ind], ind + 1, temp, ans);
        temp.removeLast();
    }
    public List<List<Integer>> combinationSum2(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

        Arrays.sort(nums);
        solveCombinationSum(nums, target, 0, temp, ans);

        return ans;
    }
}

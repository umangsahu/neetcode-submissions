class Solution {
    public void solveSubsets(int[] nums, int i, List<Integer> temp, List<List<Integer>> ans) {
        if (i == nums.length){
            ans.add(new ArrayList<>(temp));
            return;
        }
        solveSubsets(nums, i + 1, temp, ans);
        temp.add(nums[i]);
        solveSubsets(nums, i + 1, temp, ans);
        temp.removeLast();
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        solveSubsets(nums, 0, temp, ans);
        return ans;
    }
}

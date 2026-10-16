class Solution {
    public void solveCombinationSum(int[] nums ,int target, int ind,List<Integer> temp,List<List<Integer>> ans, int sum){
        if(sum == target){
            ans.add(new ArrayList(temp));
            return;
        }

        if(sum > target || ind == nums.length ) return;


        solveCombinationSum(nums, target, ind+1, temp, ans, sum);
        temp.add(nums[ind]);
        solveCombinationSum(nums, target, ind, temp, ans, sum+nums[ind]);
        temp.removeLast();

    }
    public List<List<Integer>> combinationSum(int[] nums, int target) {

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp= new ArrayList<>();

        solveCombinationSum(nums, target, 0, temp, ans, 0);

        return ans; 
    }
}

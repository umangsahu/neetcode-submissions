class Solution {
    public void solveSubsets(int[] nums, int i, List<Integer> temp, List<List<Integer>> ans, Set<List<Integer>> st) {
        ArrayList<Integer>ar = new ArrayList<>(temp);
        Collections.sort(ar);
        if (i == nums.length && !st.contains(ar)) {
            ans.add(new ArrayList<>(temp));
            st.add(new ArrayList<>(ar));
            return;
        }
        if(i>= nums.length) return;
        solveSubsets(nums, i + 1, temp, ans,st);
        temp.add(nums[i]);
        solveSubsets(nums, i + 1, temp, ans, st);
        temp.removeLast();
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        Set<List<Integer>> st = new HashSet<>();
        solveSubsets(nums, 0, temp, ans,st);
        return ans;
    }
}

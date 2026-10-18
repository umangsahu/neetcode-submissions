class Solution {
    public void solvePermute(
        int[] nums, Map<Integer, Boolean> mp, List<Integer> temp, List<List<Integer>> ans, Set<List<Integer>> st) {
        ArrayList<Integer> ar = new ArrayList<>(temp);
        // Collections.sort(ar);
        if (temp.size() == nums.length) {
            if(!st.contains(ar)){
            ans.add(new ArrayList(temp));
            st.add(ar);
            }
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (mp.get(i))
                continue;
            mp.put(i, true);
            temp.add(nums[i]);
            solvePermute(nums, mp, temp, ans, st);
            temp.removeLast();
            mp.put(i, false);
        }
    }

    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Map<Integer, Boolean> mp = new HashMap<>();
        List<Integer> temp = new ArrayList<>();
        Set<List<Integer>> st = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            mp.put(i, false);
        }

        solvePermute(nums, mp, temp, ans, st);

        return ans;
    }
}
class Solution {
    public void solvePermute(int[] nums, Map<Integer, Boolean> mp ,List<Integer> temp, List<List<Integer>> ans){
        if(temp.size() ==nums.length){
            ans.add(new ArrayList(temp));
            return;
        }
        for(int i =0;i<nums.length;i++){
            if(mp.get(i)) continue;
            mp.put(i, true);
            temp.add(nums[i]);
            solvePermute(nums,mp, temp, ans);
            temp.removeLast();
            mp.put(i, false);
        }


    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans= new ArrayList<>();
        Map<Integer, Boolean> mp = new HashMap<>();
        List<Integer> temp = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            mp.put(i, false);
        }

       solvePermute(nums,mp, temp, ans);

       return ans;
    }
}

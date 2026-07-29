class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> hs = new HashSet<>();
        int l = 0;
        int r = 1;
        hs.add(nums[l]);

        while(r < nums.length){
            if(Math.abs(l -r) > k){
                hs.remove(nums[l]);
                l+=1;
            }else{
               if(hs.contains(nums[r])){
                return true;
               }
               hs.add(nums[r]);
               r++;
            }
        }

        return false;
    }
}
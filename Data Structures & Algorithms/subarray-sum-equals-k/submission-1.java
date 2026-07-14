class Solution {
    public int subarraySum(int[] nums, int k) {

        int size = nums.length;
        
        Map<Integer, Integer> mp = new HashMap<>();
        int prefixSum =0;



        int ans =0;
        prefixSum =0;
        mp.put(0, 1);
        for(int i=0; i<size;i++){
            prefixSum += nums[i];
            int b1 = prefixSum - k;
            if(mp.containsKey(b1)){
                ans += mp.get(b1);
            }
            mp.put(prefixSum, mp.getOrDefault(prefixSum, 0)+1);
        }


        return ans;
    }
}
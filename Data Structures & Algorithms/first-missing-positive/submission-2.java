class Solution {
    public int firstMissingPositive(int[] nums) {
        Map<Integer,Integer>mp = new HashMap<>();
        int ans =1;
        
        for(int num: nums){
            if( ans > num && num >= 0 ){
                ans = num;
            }
            mp.put(num, 1);
        }
        System.out.println(ans);

        while(mp.containsKey(ans)){
            ans+=1;
        }
        return ans;
    }
}
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l=0;
        int  r=0;
        int ans = Integer.MAX_VALUE;
        int len = nums.length;

        for(int i=1; i<nums.length;i++){
            nums[i] = nums[i]+ nums[i-1];
        }
        if(nums[len -1] < target) return 0;

        while(r < nums.length){
            int sum = nums[r] - (l-1 >= 0 ? nums[l-1] : 0);

            if(sum< target){
                r++;
            }else{
                ans = Math.min(ans, r -l+1);
                l++;
            }         
        }


        return ans;
    }
}
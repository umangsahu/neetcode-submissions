class Solution {
    public int[] productExceptSelf(int[] nums) {
        int size = nums.length;
        int[] prefix = new int[size];
        int[] suffix = new int[size];
        int[] ans = new int[size];

     for(int i=0;i<size;i++){
        prefix[i]= 1;
        suffix[i] = 1;
        }
        for(int i=1;i<size;i++){
            int pro = nums[i-1] * prefix[i-1];
            prefix[i] = pro;
        }

        for(int i=size-2;i>=0;i--){
            int pro = nums[i+1] * suffix[i+1];
            suffix[i] = pro;
        }

        for(int i=0;i<size;i++){
            ans[i] = suffix[i] * prefix[i];
        }
   return ans; 

    }
}  

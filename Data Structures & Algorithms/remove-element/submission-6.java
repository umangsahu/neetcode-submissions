class Solution {
    public int removeElement(int[] nums, int val) {
        int n= nums.length -1;
      if( n ==-1 ) return 0;
        for( int i =0; i<=n; i++){
           if(nums[i] == val){
            while(n>0 && i< n&& nums[n] == val) {
                n--;
            }
            int a = nums[i];
            nums[i] = nums[n];
            nums[n] = a;
            n--;
           }
        }

        return n+1;
    }
}
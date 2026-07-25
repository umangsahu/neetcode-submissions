class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int r= k%n;

        for(int i=0;i< r;i++){
            int le = nums[n-1];
            for( int j=n-2;j>=0;j--){
              nums[j+1] =nums[j];
            }
            nums[0]=le;
        }


    }
}
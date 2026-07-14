class Solution {
    public int[] getConcatenation(int[] nums) {
       int size = nums.length;
       int[] ans = new int[size * 2];
       
       for( int i =0;i< size*2 ;i++){
        ans[i] = nums[i%size];
       }

       return ans;
       
    }
}
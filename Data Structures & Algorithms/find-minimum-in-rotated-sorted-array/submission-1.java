class Solution {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length -1;
        int mini = Integer.MAX_VALUE;


        while(left <= right){
            int mid = left + (right - left)/2;
           
            if(nums[left] <= nums[mid]){
               mini = Math.min(nums[left], mini);
               left = mid+1;
            }else{
                mini = Math.min(nums[mid], mini);
                right = mid-1;
            }
        }

        return mini;
    }
}

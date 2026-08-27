class Solution {
    public int removeElement(int[] nums, int val) {
        int l =0;
        int r = nums.length - 1;

        while(l <= r){
            if(nums[l] == val){
                nums[l] = nums[r];
                r--;
            }else{
                l++;
            }
          
        }

        // if( r == 0 || r == -1 ) return 0;
        // if( l == nums.length) return l;
        return l;

    }
}
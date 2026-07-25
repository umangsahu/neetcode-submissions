class Solution {
    public int removeDuplicates(int[] nums) {
        int p1=0, p2=0;
        int count =1;
        while(p2 < nums.length){
            if(nums[p1] != nums[p2]){
                p1+=1;
                nums[p1] = nums[p2];
                count+=1;
            }
            p2+=1;
        }
        return count;
    }
}
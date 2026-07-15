class Solution {
    public int firstMissingPositive(int[] nums) {
        int size = nums.length;

        for(int i =0;i<size;i++){
            if(!(nums[i]>=1 && nums[i]<= size)){
                nums[i] = Integer.MAX_VALUE;

            }
        }
       

        for(int i =0;i<size;i++){
            int index = Math.abs(nums[i])-1;
            if(index<size && nums[index]>0){
                nums[index] = -nums[index]; 
            }
        }
           System.out.println(Arrays.toString(nums));
        for(int i =0;i<size;i++){
            if(nums[i]>0)return i+1;
        }

        return size+1;
    }
}
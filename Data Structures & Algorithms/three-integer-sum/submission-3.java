class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);

        List<List<Integer>>ans = new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            int low = i + 1;
            int high = nums.length -1;
            while(low < high){
               if(nums[low]+nums[high]+nums[i] == 0){
                    ArrayList<Integer> temp = new ArrayList<>();
                    temp.add (nums[low]);
                    temp.add(nums[high]);
                    temp.add(nums[i]);
                    ans.add(temp);
                    low++;
                    high--;
                     while (low < high && nums[low] == nums[low - 1]) low++;   // skip duplicate low
                    while (low < high && nums[high] == nums[high + 1]) high--; 
               }
               else if( nums[low]+nums[high]+nums[i] < 0){
                  low++;
               }else{
                  high--;
               }
            }
            while(i+1 < nums.length && nums[i] == nums[i+1]) i++;
        }

        return ans;

    }
}

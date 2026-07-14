class Solution {
    public List<Integer> majorityElement(int[] nums) {
      Arrays.sort(nums);
      List<Integer> ans = new ArrayList<>();
      int count = 0;
      int n = nums.length;
      int major = n/3;

      for(int i=0; i < n-1; i++){
        if(nums[i] == nums[i+1]){
           count++;
        }else{
           
            if(count +1> major){
              ans.add(nums[i]);
            }
             count = 0;
        }
      } 
    if(count+1 > major){
        ans.add(nums[n-1]);
        }


      return ans;
    }
}
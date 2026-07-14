class Solution {
    public int longestConsecutive(int[] nums) {
        Map<Integer, Boolean> mp = new HashMap<>();
        int maxLen = 0;

        for(int num : nums ){
            mp.put(num, Boolean.FALSE);
        }

        for(int num : nums){
           int currLen = 0;
           int nextNum = num;

           while(mp.containsKey(nextNum) && mp.get(nextNum) == Boolean.FALSE){
             mp.put(nextNum, Boolean.TRUE);
             currLen++;
             nextNum++;
           }

           int prevNum = num-1;
           while(mp.containsKey(prevNum) && mp.get(prevNum) == Boolean.FALSE){
             mp.put(prevNum, Boolean.TRUE);
             currLen++;
             prevNum--;
           }

          maxLen = Math.max(maxLen, currLen);
        }

        return maxLen;
    }
}

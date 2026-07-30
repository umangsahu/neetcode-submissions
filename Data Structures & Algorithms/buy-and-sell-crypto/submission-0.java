class Solution {
    public int maxProfit(int[] prices) {
        int size = prices.length;
         int[] left = new int[size];
         int[] right = new int[size];

         left[0] = prices[0];
         for(int i =1; i< size;i++){
            left[i] = Math.min(prices[i], left[i-1]); 
         }
         right[size -1] = prices[size -1];
         for(int i=size-2;i>=0;i--){
            right[i] = Math.max(prices[i], right[i+1]);
         }
         System.out.println(Arrays.toString(left));
         System.out.println(Arrays.toString(right));

         int ans =0;
         for(int i =1; i< size;i++){
            ans = Math.max(ans, right[i] - left[i]);
         }
         return ans;
    }
}

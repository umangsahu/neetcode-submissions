class Solution {
    public int maxProfit(int[] prices) {
        int size = prices.length;
        int minima = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i=0;i<size;i++){
           minima = Math.min(minima, prices[i]);
           maxProfit = Math.max(maxProfit, prices[i] - minima);
         
        }


        return maxProfit;
    }
}

class Solution {
    public int maxArea(int[] heights) {
        int l= 0;
        int r = heights.length -1;
        int ans =0;

        while( l < r){
            int area = (r - l)  * Math.min(heights[r], heights[l]);
            ans = Math.max(area, ans);
            if(heights[r] > heights[l]) l++;
            else r--;
        }

        return ans;
    }
}

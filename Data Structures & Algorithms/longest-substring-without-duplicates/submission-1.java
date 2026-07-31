class Solution {
    public int lengthOfLongestSubstring(String s) {
        int size = s.length();
        int ans =0;
        int l = 0;
        int r =0;

        HashSet<String> hs = new HashSet<>();
        
        while(r < size){
            String sChar =  ""+s.charAt(r)+"";
            if(!hs.contains(sChar)){
                hs.add(sChar);
                r++;
            }else{
                hs.remove(""+s.charAt(l)+"");
                l++;
            }
            ans = Math.max(ans, r-l);
        }
    return ans;
    }
}

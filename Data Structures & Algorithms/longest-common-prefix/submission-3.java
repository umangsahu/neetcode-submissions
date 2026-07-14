class Solution {
    public String longestCommonPrefix(String[] strs) {
        int arrSize = strs.length;
        String ans = "";
        if(arrSize == 0) return ans;
        int index = 0;
        while(index < strs[0].length()){
            char common =  strs[0].charAt(index);
            for(int i = 0; i < arrSize; i++){
                if(strs[i].length() <= index) return ans;
                if(common != strs[i].charAt(index)) return ans;
            }
            ans += common;
            index++;
        }

        return ans;
    }
}
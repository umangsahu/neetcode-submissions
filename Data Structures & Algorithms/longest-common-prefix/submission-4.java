class Solution {
    public String longestCommonPrefix(String[] strs) {
        int arrSize = strs.length;
        String ans = "";
        if(arrSize == 0) return ans;
        int index = 0;
        while(index < strs[0].length()){
            String common = strs[0].substring(0, index+1);
            for(int i = 0; i < arrSize; i++){
                if(strs[i].length() <= index) return ans;
                if(common.charAt(common.length() -1) != strs[i].charAt(index)) return ans;
            }
            ans = common;
            index++;
        }

        return ans;
    }
}
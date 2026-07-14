class Solution {
    public String longestCommonPrefix(String[] strs) {
        int arrSize = strs.length;
        String ans = "";
        if(arrSize == 0) return ans;
        int index = 0;
        while(index < strs[0].length()){
            for(int i = 1; i < arrSize; i++){
                if(strs[i].length() <= index) return strs[0].substring(0, index);
                if(strs[0].charAt(index) != strs[i].charAt(index)) return strs[0].substring(0, index);
            }
          
            index++;
        }

        return strs[0].substring(0, index);
    }
}
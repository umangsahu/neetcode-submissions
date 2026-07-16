class Solution {
    public String mergeAlternately(String word1, String word2) {
        int size = word1.length();
        int size1 = word2.length();
        String ans = "";
        int i=0, i1=0;

      
        while(i < size && i1 < size1){
            ans+=word1.charAt(i);
            ans+=word2.charAt(i1);
            i++;
            i1++;
        }

        while(i < size){
            ans+=word1.charAt(i);
            i++;
        }
         while(i1 < size1){
            ans+=word2.charAt(i1);
            i1++;
        }
        return ans;
    }
}
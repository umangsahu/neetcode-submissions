class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        int size = s.length();
        s = s.toLowerCase();
        
        for(int i=0;i<size/2;i++){
          if(s.charAt(i) != s.charAt(size - 1 -i)) return false;
        }


        return true;
    }
}

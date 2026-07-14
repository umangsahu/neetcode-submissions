class Solution {
    public boolean isAnagram(String s, String t) {
        int n = s.length();

       if(n != t.length() ) return false;

        for( int i =0; i< n; i++){
            char a = s.charAt(i);
            int index = t.indexOf(a);
            if(index == -1) break;
            t = t.substring(0,index) + t.substring(index+1, t.length());
          
        }
        return t.length() == 0;
    }
}

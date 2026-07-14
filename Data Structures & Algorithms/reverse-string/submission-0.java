class Solution {
    public void reverseString(char[] s) {
        int size = s.length;

        for(int i =0;i<size/2;i++){
            char r = s[i];
            s[i] = s[size -1 -i];
            s[size -1 -i] = r;
        }
    }
}
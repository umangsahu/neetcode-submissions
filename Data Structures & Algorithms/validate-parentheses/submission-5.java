class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        int size = s.length();

        for (char c : s.toCharArray()) {
            if (c == '[') {
                st.push(']');
            } else if (c == '{') {
                st.push('}');
            } else if (c == '(') {
                st.push(')');
            } else {
                if (st.isEmpty() || st.pop() != c) {
                    return false;
                }
            }
        }

        return st.isEmpty();
    }
}

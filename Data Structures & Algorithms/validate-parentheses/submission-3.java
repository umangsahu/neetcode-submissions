class Solution {
    public boolean isValid(String s) {
        Stack<String> st = new Stack<>();
        int size = s.length();

        for (int i = 0; i < size; i++) {
            String a = "" + s.charAt(i) + "";
            if (a.equals("[") || a.equals("{") || a.equals("(")) {
                st.push(a);
            } else {
                if (st.size() == 0)
                    return false;
                String ll = st.pop();
                if (ll.equals("[")) {
                    if (!a.equals("]"))
                        return false;
                } else if (ll.equals("{")) {
                    if (!a.equals("}"))
                        return false;
                } else if (ll.equals("(")) {
                    if (!a.equals(")"))
                        return false;
                }
            }
        }

        if (st.size() > 0)
            return false;
        return true;
    }
}

class Solution {
    public String simplifyPath(String path) {
        Stack<String> st = new Stack<>();
           Stack<String> st2 = new Stack<>();
        String temp="";
        for (int i = 0; i < path.length(); i++) {
            if (path.charAt(i) != '/') {
                temp += "" + path.charAt(i) + "";
            } 
            if (path.charAt(i) == '/' || i == path.length() - 1) {
                if(temp.length() == 0) {}
                else if (temp.length() == 1 && temp.charAt(0) == '.') {
                  
                } else if (temp.length() == 2 && temp.charAt(0) == '.' && temp.charAt(1) == '.'
                    && !st.isEmpty()) {
                    st.pop();
                } else if(!(temp.length() == 2 && temp.charAt(0) == '.' && temp.charAt(1) == '.')) {
                    st.push(temp);
                }
                temp= "";
            }
        }

        temp = "/";
         while (!st.isEmpty()) {
            st2.push(st.pop());
         }

        while (!st2.isEmpty()) {
            temp += st2.pop();
         
            if(st2.size() != 0){
                temp +="/";
            }
        }

        return temp;
    }
}
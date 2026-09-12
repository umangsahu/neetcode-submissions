class Solution {
    public int evalRPN(String[] tokens) {
    

    Stack<Integer>st = new Stack<>();
    
    int one, two;

    for(int i =0; i<tokens.length; i++){
        switch (tokens[i]){
            case "+":
                 one = st.pop();
                 two = st.pop();
                st.push(one+two);
                break;
            case "-":
                 one = st.pop();
                 two = st.pop();
                st.push(two - one);
                break;
            case "*":
               one = st.pop();
               two = st.pop();
             st.push(one*two);
              break;
            case "/":
               one = st.pop();
               two = st.pop();
              st.push(two/one);
               break;
            default:
               one = Integer.parseInt(tokens[i]);
               st.push(one);
                  break;
        }

    }


     return st.pop();
    }
}

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st= new Stack<>();


        for(int curr: asteroids){
            boolean alive = true;

            while(alive && curr < 0 && !st.isEmpty() && st.peek() > 0){
                int currSize = Math.abs(curr);
                int top = st.peek();

                if(top < currSize){
                    st.pop();
                }else if(top > currSize){
                    alive = false;
                }else{
                    st.pop();
                    alive = false;
                }
            }
            if(alive){
                st.push(curr);
            }
        }
          int[] result = new int[st.size()];
        for(int i = 0 ; i<st.size(); i++){
            result[i] = st.get(i);
        }

        return result;
    }
}
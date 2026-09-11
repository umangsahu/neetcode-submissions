class MyQueue {
    Stack<Integer> st1 = new Stack<>();
    Stack<Integer> st2 = new Stack<>();


    public MyQueue() {
        
    }
    
    public void push(int x) {
      while(!st2.isEmpty()){
        int y = st2.pop();
        st1.push(y);
       }
        st1.push(x);
    }
    
    public int pop() {
       while(!st1.isEmpty()){
        int x = st1.pop();
        st2.push(x);
       }
     return st2.pop();
    }
    
    public int peek() {
       while(!st1.isEmpty()){
        int x = st1.pop();
        st2.push(x);
       }
     return st2.peek();
    }
    
    public boolean empty() {
         while(!st1.isEmpty()){
        int x = st1.pop();
        st2.push(x);
       }
         return st2.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
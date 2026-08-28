class MyStack {

    List<Integer> arr = new ArrayList<>();

    public MyStack() {
        
    }
    
    public void push(int x) {
        arr.add(x);
        return;
    }
    
    public int pop() {
        int lastItem = arr.get(arr.size() - 1);
        arr.removeLast();
        return lastItem;

    }
    
    public int top() {
        int lastItem = arr.get(arr.size() - 1);
        return lastItem;
    }
    
    public boolean empty() {
        // while(!arr.isEmpty()){
        //       arr.removeLast();
        // }
        return arr.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
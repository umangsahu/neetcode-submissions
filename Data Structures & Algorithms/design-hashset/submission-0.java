class MyHashSet {
    private int size = 1000;
    private LinkedList[] bucket = new LinkedList[size];
   
    public MyHashSet() {
        for(int i=0;i<size;i++){
           LinkedList<Integer> ll = new LinkedList<>();
           bucket[i] = ll;
        }
    }
    
    public void add(int key) {
        int index = key%size;
         if(!contains(key))bucket[index].add(key);
    }
    
    public void remove(int key) {
            int index = key%size;
            if(contains(key)) bucket[index].remove(Integer.valueOf(key));
    }
    
    public boolean contains(int key) {
        int index = key%size;;
        return bucket[index].contains(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */
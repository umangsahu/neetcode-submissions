class Pair {
    int key, value;
    public Pair(int key, int value){
        this.key = key;
        this.value = value;
    }
    
}

class MyHashMap {
    private int size = 10000;
    private LinkedList[] buckets = new LinkedList[size];

    public MyHashMap() {
        for(int i=0; i < size; i++){
          LinkedList<Pair> p = new LinkedList<>();
          buckets[i] = p;
        }
    }

    public void put(int key, int value) {
       int index = key%size;
        LinkedList<Pair> bucket = buckets[index];
        for(Pair p : bucket) {  // enhanced for loop
            if(p.key == key) {
               p.value = value;
               return;
            }
        }
        bucket.add(new Pair(key, value));
    } 
    
    public int get(int key) {
        int index = key%size;
        boolean keyFound = false;
        LinkedList<Pair> bucket = buckets[index];
        for(Pair p : bucket) {  // enhanced for loop
            if(p.key == key) {
                return p.value;
            }
        }
        return -1;
    }
    
    public void remove(int key) {
        int index = key%size;
        LinkedList<Pair> bucket = buckets[index];
        for(Pair p : bucket) {  // enhanced for loop
            if(p.key == key) {
                bucket.remove(p);
            }
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */
class KthLargest {
    PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    int kLen; 
    public KthLargest(int k, int[] nums) {
        int n = nums.length;
        kLen = k;
        for(int num: nums){
            minHeap.add(num);
            if(kLen < minHeap.size()) minHeap.poll();
        }
    }
    
    public int add(int val) {
        minHeap.add(val);
        if(kLen < minHeap.size()) minHeap.poll();
        return minHeap.peek();
    }
}

class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((s1, s2)-> (s1 - s2));
        int size = nums.length;

          for (int i = 0; i < size; i++) {
            pq.add(nums[i]);
            while(pq.size() > k){
                pq.poll();
            }
        }

        return pq.poll();

    }
}

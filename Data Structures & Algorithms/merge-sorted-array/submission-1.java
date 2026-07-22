class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        PriorityQueue<Integer>pq = new PriorityQueue<>();

        for(int i=0;i<n;i++){
            pq.add(nums2[i]);
        }

        int i=0;
        while(i<m && pq.size()>0){
            int minElement = pq.poll();

            if(nums1[i] > minElement){
                pq.add(nums1[i]);
                nums1[i]= minElement;
            }else{
                pq.add(minElement);
            }
            i++;
        }
        while(i<m+n && pq.size()>0){
            int minElement = pq.poll();
            nums1[i]= minElement;
            i++;
        }
    }
}
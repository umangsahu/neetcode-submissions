class Pair {
    int d, i = 0;

    public Pair(int d, int i) {
        this.d = d;
        this.i = i;
    }
}

class Solution {
    public int[][] kClosest(int[][] points, int k) {
        int size = points.length;
        PriorityQueue<Pair> pq = new PriorityQueue<>((s1, s2)-> -(s1.d - s2.d));


        for (int i = 0; i < size; i++) {
            int dist = points[i][0] * points[i][0]
                     + points[i][1] * points[i][1];
            pq.add(new Pair(dist, i));
            while(pq.size() > k){
                pq.poll();
            }
        }

        int[][] ans = new int[k][2];
        for(int i =0; i<k;i++){
            int ind = pq.poll().i;
            ans[i][0] = points[ind][0];
            ans[i][1] = points[ind][1];

        }
        return ans;
    }
}

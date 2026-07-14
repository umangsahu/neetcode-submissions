class Solution {
    public class Pair{
        int node, wt;
        Pair(int node, int wt){
            this.wt = wt;
            this.node = node;
        }
    }
    public Map<Integer, Integer> shortestPath(int n, List<List<Integer>> edges, int src) {
      Queue<Pair> q = new PriorityQueue<>((a,b) ->  a.wt - b.wt);
      List<List<Pair>> arr = new ArrayList<>(); 
      Map<Integer, Integer> ans = new HashMap<>();

      for (int i = 0; i < n; i++) {
            arr.add(new ArrayList<>());
        }


      for(int i = 0; i<edges.size(); i++){
        int u = edges.get(i).get(0);
        int v = edges.get(i).get(1);
        int wt = edges.get(i).get(2);
        arr.get(u).add(new Pair(v,wt));
      }

      q.offer(new Pair(src, 0));
      int wt =0;

      while(!q.isEmpty()){
        Pair cell = q.poll();
        if (!ans.containsKey(cell.node)){
        ans.put(cell.node, cell.wt);
        }
        
        for(Pair nei: arr.get(cell.node)) {
            if (!ans.containsKey(nei.node)){
             q.offer(new Pair(nei.node, cell.wt+nei.wt));
            }
        }
      }
      for(int i =0; i<n; i++){
        if (!ans.containsKey(i)){
             ans.put(i, -1);
            }

      }


      return ans;
    }  
}

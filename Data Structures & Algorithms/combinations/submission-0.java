class Solution {
    public void solveCombine(int n, int x,  int k, List<List<Integer>> ans,List<Integer> temp){
        if(k == temp.size()) {
            ans.add(new ArrayList(temp));
            return;
        }
        if(n <  x) return;
        solveCombine(n,x+1,  k, ans, temp);
        temp.add(x);
        solveCombine(n,x+1, k, ans, temp);
        temp.removeLast();
    
    }
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();;

        solveCombine(n, 1, k, ans, temp);


        return ans;
    }
}
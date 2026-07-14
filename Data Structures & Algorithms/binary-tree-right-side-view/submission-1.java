/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public List<Integer> rightSideView(TreeNode root) {
  

        List<Integer>ans = new ArrayList<>();

        Queue<TreeNode> q =  new ArrayDeque<>();
      if(root == null) return ans;
        q.offer(root);

        while(!q.isEmpty()){
            int size = q.size();

            for( int i=0;i<size;i++){
                TreeNode top = q.peek();
                q.poll();
                if(top.left != null) q.offer(top.left);
                if(top.right != null) q.offer(top.right);

                if(i == size-1){
                    ans.add(top.val);
                }
            }


        }
return ans;
    }
}

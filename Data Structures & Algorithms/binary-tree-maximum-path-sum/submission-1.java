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
    int ans = Integer.MIN_VALUE;

    public int solve(TreeNode root, int max){
     if(root == null) return 0;

     int left = Math.max(0, solve(root.left, max));
     int right = Math.max(0, solve(root.right, max));
      ans = Math.max(ans,left+right+root.val);
     return Math.max(left+root.val, right+root.val);
    }

    public int maxPathSum(TreeNode root) {
        int max = Integer.MIN_VALUE;
        solve(root, max);
        return ans;
    }
}

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
    int count;
    int ans = -1;
    public void kthSmallestElem(TreeNode root ){
         if (root == null || ans != -1) return;
      

           kthSmallestElem(root.left);
            count--;   
           if(count == 0){ 
            ans = root.val;
            return;
            }
           kthSmallestElem(root.right);
               
    }
    public int kthSmallest(TreeNode root, int k) {
        count = k;
      kthSmallestElem(root);
        return ans;

    }
}

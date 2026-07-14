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
 
    public boolean validateBinaryTree(TreeNode root, int min, int max){
        if(root == null) return true;
        if( root.val <= min || root.val >= max) return false;

        return validateBinaryTree(root.left, min, root.val) && validateBinaryTree(root.right, root.val, max);
    }
    public boolean isValidBST(TreeNode root) {
        return validateBinaryTree(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
}

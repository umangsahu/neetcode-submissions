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
    public int findGoodNode(TreeNode root, int pathMaxValue){
        int count = 0;
        if(root.val >= pathMaxValue){
         count+=1;
        }
        int maxValueTillPoint = Math.max(pathMaxValue,root.val);

        if(root.left != null) count += findGoodNode(root.left, maxValueTillPoint);
        if(root.right != null) count += findGoodNode(root.right, maxValueTillPoint);

        return count;
    }
    public int goodNodes(TreeNode root) {
        return findGoodNode(root, Integer.MIN_VALUE);
    }
}

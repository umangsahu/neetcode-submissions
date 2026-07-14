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
    public TreeNode createTree(int[] preorder, int[] inorder, int inStart, int inEnd, int preStart,  Map<Integer, Integer> mp){
         if(inStart > inEnd) return null;
         TreeNode root = new TreeNode(preorder[preStart]);
         int rootIndex = mp.get(preorder[preStart]);
         int left = rootIndex - inStart;
         int right = inEnd - rootIndex;
         root.left = createTree(preorder, inorder, inStart,rootIndex -1, preStart+1, mp);

         root.right = createTree(preorder, inorder, rootIndex +1,inEnd, preStart + left + 1 , mp);

         return root;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer, Integer>  mp = new HashMap<>();
        int size = preorder.length;
        for(int i=0; i<size; i++){
            mp.put(inorder[i], i);
        }

        return createTree(preorder, inorder, 0,size-1, 0, mp );
    }
}

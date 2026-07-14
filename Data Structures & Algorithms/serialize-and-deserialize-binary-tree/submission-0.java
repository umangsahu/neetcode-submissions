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

public class Codec {
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root == null) return "#";
        String s ="";
            s =""+root.val+"";
        String left =  serialize(root.left);
        String right =  serialize(root.right);
        return s+","+left+","+right;

    }
    public TreeNode solve(Queue<String> q){
        String s = q.poll();

        if(s.equals("#")) return null;

        TreeNode root = new TreeNode(Integer.parseInt(s));
        root.left = solve(q);
        root.right = solve(q);

        return root;
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
      Queue<String> q = new LinkedList<>(Arrays.asList(data.split(",")));
        return solve(q);
    }
}

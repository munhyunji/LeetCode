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
    public TreeNode bstToGst(TreeNode root) {
        inOrder(root);
        return root;
    }
    int val;
    
    public void inOrder(TreeNode root) {
        if(root==null) return;
        
        inOrder(root.right);
        val+= root.val;
        root.val = val;
        inOrder(root.left);
    }
}
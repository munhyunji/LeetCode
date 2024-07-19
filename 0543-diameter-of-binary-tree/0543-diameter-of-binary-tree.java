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
    public int diameterOfBinaryTree(TreeNode root) {
        traverse(root);
        return diameter;
    }
    int diameter;
    
    public int traverse(TreeNode root) {
        if(root==null) return 0;
        
        int ld = traverse(root.left);
        int rd = traverse(root.right);
        
        diameter = Math.max(diameter, ld+rd);
        return 1 + Math.max(ld, rd);
    }
}
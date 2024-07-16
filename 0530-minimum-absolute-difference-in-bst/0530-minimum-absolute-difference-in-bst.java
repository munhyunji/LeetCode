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
    public int getMinimumDifference(TreeNode root) {
        inOrder(root);
        return min;
    }
    int min = Integer.MAX_VALUE;
    TreeNode prev = null;
    
    public void inOrder(TreeNode root){
        if(root==null) return;
        
        inOrder(root.left);
        if(prev != null){
            min = Math.min(min, root.val-prev.val);
        }
        prev = root;
        inOrder(root.right);
    }
}
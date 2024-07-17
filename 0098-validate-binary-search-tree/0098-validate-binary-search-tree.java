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
    public boolean isValidBST(TreeNode root) {
        if(root==null || root.left==null && root.right==null) return true;
        return inOrder(root, Long.MIN_VALUE, Long.MAX_VALUE); // Long 을써야 Integer.MAX_VALUE까지 커버됨;;
    }
    public boolean inOrder(TreeNode root, long left, long right) {
        if(root==null) return true;
        
        if(root.val <= left || root.val >= right) return false;
        
        return inOrder(root.left, left, root.val) && inOrder(root.right, root.val, right);       
    }
}
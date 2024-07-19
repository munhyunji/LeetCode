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
    public int kthSmallest(TreeNode root, int k) {
        inOrder(root, k);
        return val;
    }
    int val;
    int con = 0;
    
    public void inOrder(TreeNode root, int k) {
        if(root==null) return;
        
        inOrder(root.left, k);
        con++;
        if(con==k) val = root.val;
        
        inOrder(root.right, k);
    }
}
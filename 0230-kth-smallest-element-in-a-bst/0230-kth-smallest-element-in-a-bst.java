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
    int val = 0;
    int index = 1;
    public void inOrder(TreeNode root, int k) {
        if(root==null) return;
        
        inOrder(root.left, k);
        if(index==k) { val = root.val; }
        index++;
        inOrder(root.right, k);
        
    }
}
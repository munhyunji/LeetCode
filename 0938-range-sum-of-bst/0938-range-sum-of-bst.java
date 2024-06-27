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
    public int rangeSumBST(TreeNode root, int low, int high) {
        traverse(root, low, high);
        return res;
    }
    public int res = 0;
    
    public void traverse(TreeNode root, int low, int high) {
        if(root.left != null) {
          traverse(root.left, low, high);  
        }
        
        if(root.val >= low && root.val <= high) {
          res += root.val;  
        }
        
        if(root.right != null) {
            traverse(root.right, low, high);
        }
        
    }
}
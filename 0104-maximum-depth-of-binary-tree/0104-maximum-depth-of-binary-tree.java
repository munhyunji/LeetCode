
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
   
    //root = [3,9,20,null,null,15,7]
    int depth = 1;
    
    public int maxDepth(TreeNode root) {
        
        if(root == null) return 0;
        
        int leftCount = maxDepth(root.left);
        int rightCount = maxDepth(root.right);
        
        return Math.max(leftCount, rightCount) +1;
        
    }
}
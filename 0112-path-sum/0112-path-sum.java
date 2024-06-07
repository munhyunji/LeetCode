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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        TreeNode currentNode = root;
            
            if(currentNode == null) return false;
            targetSum -= currentNode.val;
            if (currentNode.left == null && currentNode.right == null) {
                return targetSum == 0;
            }
            
            
               //(22-5 = 17) (17-4 / 13) (13-1 = 2) (2 - 7 = -5)


            return hasPathSum(root.left, targetSum) || hasPathSum(root.right, targetSum);
        
    }
}
    



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
    public boolean isBalanced(TreeNode root) {
        traverse(root); 
        return result;
    }
    
    public boolean result = true; 
    
    public int traverse(TreeNode root) {
        if(root == null) return 0;
        
        int leftNode = traverse(root.left) + 1;
        int rightNode = traverse(root.right) + 1;
        
        if(Math.abs(leftNode-rightNode) > 1) { // 1이상 차이가나면 balanced되지않은 노드트리임. 
            result = false;
        }
        
        return Math.max(leftNode, rightNode);
    }
}

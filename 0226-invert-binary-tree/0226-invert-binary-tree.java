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
    public TreeNode invertTree(TreeNode root) {
        TreeNode currentNode = root;
        if(currentNode == null) {return null;}
           
        TreeNode temp = currentNode.left;
        currentNode.left = invertTree(currentNode.right);
        currentNode.right = invertTree(temp);
        
        return currentNode; 
    }
}
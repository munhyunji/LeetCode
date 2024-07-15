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
        
        TreeNode tmp = currentNode.left;
        currentNode.left = invertTree(currentNode.right); //left값 저장하고 right바로 
        currentNode.right = invertTree(tmp);
                
        return currentNode; 
    }
}
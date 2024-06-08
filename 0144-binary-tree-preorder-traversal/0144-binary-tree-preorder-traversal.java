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
    public List<Integer> preorderTraversal(TreeNode root) {
        preOrder(root);
        return nodeList;
    }
    
    private List<Integer> nodeList = new ArrayList<>();
    
    public void preOrder(TreeNode root) {
        if(root == null) return;
        
        nodeList.add(root.val);
        preOrder(root.left);
        preOrder(root.right);
    }
}
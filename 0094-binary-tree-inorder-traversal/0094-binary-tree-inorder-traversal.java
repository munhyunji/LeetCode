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
    public List<Integer> inorderTraversal(TreeNode root) {
        inOrder(root);
        return nodeList;
    }
    
    private List<Integer> nodeList = new ArrayList<>();
    
    public void inOrder(TreeNode root) {
        if(root == null) return;
        
        inOrder(root.left);
        nodeList.add(root.val);
        inOrder(root.right);
    }
}
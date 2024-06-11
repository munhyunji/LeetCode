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
    public List<Integer> postorderTraversal(TreeNode root) {
        traverse(root);
        return nodeList;
    }
    
    private List<Integer> nodeList = new ArrayList<>();
    
    public void traverse(TreeNode root) {
        if(root == null) return;
        
        traverse(root.left);
        traverse(root.right);
        nodeList.add(root.val);
    }
}
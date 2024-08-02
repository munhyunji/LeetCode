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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> r1 = new ArrayList<>();
        List<Integer> r2 = new ArrayList<>();
        inOrder(root1, r1);
        inOrder(root2, r2);
        
        return r1.equals(r2);
    }
    
    public void inOrder(TreeNode root, List<Integer> list) {
        if(root==null) return;
        
        inOrder(root.left, list);
        if(root.left == null && root.right == null) list.add(root.val);
        inOrder(root.right, list);
    }
    
}
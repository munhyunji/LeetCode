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
    public boolean findTarget(TreeNode root, int k) {
        return traverse(root, k);
    } 
    
    HashSet<Integer> hss = new HashSet<>();
    
    public boolean traverse(TreeNode root, int k) {
        if(root == null) return false;
        
        int targetNum = k - root.val;
        
        if(hss.contains(targetNum)) {
            return true;
        }
        
        hss.add(root.val);
        
        return traverse(root.left, k) || traverse(root.right, k);
    }
}
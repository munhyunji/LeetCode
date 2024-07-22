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
    public TreeNode sortedArrayToBST(int[] nums) {
        return recursiveBST(nums, 0, nums.length-1);
    }
    
    public TreeNode recursiveBST(int[] nums, int left, int right) {
        if(left>right) return null;
        
        int rootNode = left + (right-left)/2;
        TreeNode root = new TreeNode(nums[rootNode]);
        root.left = recursiveBST(nums, left, rootNode-1);
        root.right = recursiveBST(nums, rootNode+1, right);
        
        return root;
    }
}
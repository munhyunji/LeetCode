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
       //need left and right
        return  recursionBST(nums, 0, nums.length-1);
    }
    
    private TreeNode recursionBST(int[] nums, int left, int right) {
        if(left > right) { return null; }
        int mid = left + (right-left) /2;
        TreeNode newNode = new TreeNode(nums[mid]);
        newNode.left = recursionBST(nums, left, mid-1);
        newNode.right = recursionBST(nums, mid+1, right);
        return newNode;
    }
    
}
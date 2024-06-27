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
    
    TreeNode currentNode = null;
    public TreeNode increasingBST(TreeNode root) {
        TreeNode dummy = new TreeNode(0); //dummyNode를 만들고
        currentNode = dummy; // 기준포인트를 생성
        
        traverse(root);
        return dummy.right;
    }
    
    
    public void traverse(TreeNode root) {
        if(root == null) return; //초장에 null처리를해주면 if(currenntNode.left != null) 안해도됨 . 
        
        traverse(root.left);
        currentNode.right = new TreeNode(root.val);
        currentNode = currentNode.right;
        traverse(root.right);
    }
}

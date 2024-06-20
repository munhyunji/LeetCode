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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        
        if( p == null && q == null ) {
            return true;
        }
        
        if( p == null || q == null || p.val != q.val) {
            return false;
        }
        
        //여기까지 내려왔다는 의미는
        //두개의 노드가 모두 null이 아니고
        //p.val == q.val 이똑같다는것을 의미함
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
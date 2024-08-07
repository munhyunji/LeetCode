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
    public int maxLevelSum(TreeNode root) {
        int level = 1;
        int curLevel = 0;
        
        Queue<TreeNode> queue = new LinkedList<>();
        int maxSum = Integer.MIN_VALUE;
        
        queue.add(root);
        while(!queue.isEmpty()) {
            curLevel++;
            int sum = 0;
            int size = queue.size();
            
            for(int i=0; i<size; i++){
                TreeNode cur = queue.poll();
                if(cur.left != null) queue.add(cur.left);
                if(cur.right != null) queue.add(cur.right);
                sum += cur.val;    
            }
           if(maxSum < sum) {
               maxSum = sum;
               level = curLevel;
           }          
        }
      return level;  
    }
}
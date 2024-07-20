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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> nodeList = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if(root==null) return nodeList;
        queue.add(root);
        while(!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> node = new ArrayList<>();
            
            for(int i=0; i<size; i++){
                TreeNode cur = queue.poll();
                if(cur.left != null) queue.add(cur.left);
                if(cur.right != null) queue.add(cur.right);
                
                node.add(cur.val);
            }
            nodeList.add(0, node);
        }
        return nodeList;
    }
}
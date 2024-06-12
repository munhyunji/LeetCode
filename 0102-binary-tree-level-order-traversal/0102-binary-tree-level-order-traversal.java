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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> nodeList = new ArrayList<>();
        
        Queue<TreeNode> queue = new LinkedList<>();
        
        TreeNode currentNode = root;
        
        if(currentNode == null) return nodeList;
        
        queue.add(currentNode);
        while(!queue.isEmpty()) {
            
           int size = queue.size();
           List<Integer> innerList = new ArrayList<>();
        
            for(int i = 0; i < size; i++) {
                currentNode = queue.poll();
                if(currentNode.left != null) {
                    queue.add(currentNode.left);
                }
                if(currentNode.right != null) {
                    queue.add(currentNode.right);
                }
                innerList.add(currentNode.val);
                
            }
           if(!innerList.isEmpty()) {
                nodeList.add(innerList);
                }
        }
        return nodeList;
    }
    
}
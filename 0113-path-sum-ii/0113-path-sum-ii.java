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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {       
        List<Integer> path = new ArrayList<>();
        List<List<Integer>> ll = new ArrayList<>(); 
        traversal(root, targetSum, path, ll);
        return ll;
    }
       
    public void traversal(TreeNode root, int targetSum, List<Integer> path, List<List<Integer>> ll){
        if(root == null) return;
        
        targetSum -= root.val;
        path.add(root.val);
        
        if(root.left == null && root.right == null) {
            if (targetSum == 0) {
                ll.add(new ArrayList<>(path));
                
            } else {
                path.remove(path.size()-1);
            }
        }
        
        
        traversal(root.left, targetSum, new ArrayList<>(path), ll);
        traversal(root.right, targetSum, new ArrayList<>(path), ll);
    }
}
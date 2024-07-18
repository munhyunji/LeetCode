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
    public int[] findMode(TreeNode root) {
        Map<Integer, Integer> map = new HashMap<>();
        traverse(root, map);
        int max = Integer.MIN_VALUE;
        
        //해쉬맵에서 max값 찾기
        for(int key : map.keySet()) {
            max = Math.max(max, map.get(key));
        }
        //max값과 동일한 key값 insert
        List<Integer> result = new ArrayList<>();
        for(int key : map.keySet()) {
            if(map.get(key) == max) result.add(key);
        }
        //List=>array로 변환 
        int[] ans = new int[result.size()];
        for(int i=0; i<result.size(); i++) ans[i] = result.get(i);
        
        return ans;
    }
    
    public void traverse(TreeNode root, Map<Integer, Integer> map) {
        if(root==null) return;
        
        traverse(root.left, map);
        map.put(root.val, map.getOrDefault(root.val, 0)+1);
        traverse(root.right, map);
        
    }
}
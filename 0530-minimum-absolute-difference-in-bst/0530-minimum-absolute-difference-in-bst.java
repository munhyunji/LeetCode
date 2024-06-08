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
    public int getMinimumDifference(TreeNode root) {
        inOrder(root); //따로 메소드 생성해줘야 초기화되지않음 
        return minValue; 
    }
    
    private int minValue = Integer.MAX_VALUE; //비교할 값
    private Integer prev = null; //이전 노드값을 저장할 Integer 변수 (null도 허용함)
    
    public void inOrder(TreeNode root) {
        if(root == null) return;
        
        inOrder(root.left); //InOrder 함수 호출후 
        if(prev != null) {
            minValue = Math.min(minValue, Math.abs(root.val - prev)); // 중간에서 값구하기 
        }
        prev = root.val;
        inOrder(root.right);
        
    }
}
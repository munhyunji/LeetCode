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
    public List<Double> averageOfLevels(TreeNode root) {
        
      List<Double> average = new ArrayList<>();
      Queue<TreeNode> queue = new LinkedList<>();
        
        queue.add(root);
        while(!queue.isEmpty()) {
            double size = queue.size(); //size를 먼저 설정
            double averageOfLevels = 0.0;
            
            for(int i = 0; i < size; i++) {
                TreeNode currentNode = queue.poll(); //for문 안쪾에 설정해줘야 모든 노드확인
                averageOfLevels += currentNode.val;
                
                if(currentNode.left != null) {
                    queue.add(currentNode.left);
                }
                
                if(currentNode.right != null) {
                    queue.add(currentNode.right);
                }
            }
            averageOfLevels = averageOfLevels / size; //평균이니 size대로 나누고 double로 설정
            average.add(averageOfLevels);
        }
       return average; 
    }
}

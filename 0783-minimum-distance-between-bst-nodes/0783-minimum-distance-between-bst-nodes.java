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
    public int minDiffInBST(TreeNode root) {
      inorder(root);
        return ans;
    }
    //Inorder할때는 함수를 하나 만들어야함
    // 비교할 maxvalue와 현재 currentNode 를 넣을 변수도 밖에다가 생성 해줌,, 
    
    private int ans = Integer.MAX_VALUE;
    private Integer pred = null;
    
    // 
    private void inorder(TreeNode root) {
        if(root == null) return;
        
        inorder(root.left);
        if(pred != null) {
            ans = Math.min(ans, root.val - pred);
        }
        pred = root.val;
        inorder(root.right);
    }
}


// class Solution 
// {
//   public int minDiffInBST(TreeNode root) 
//   {
//     inorder(root);
//     return ans;
//   }

//   private int ans = Integer.MAX_VALUE;
//   private Integer pred = null;

//   private void inorder(TreeNode root) 
//   {
//     if (root == null)
//       return;

//     inorder(root.left);
//     if (pred != null)
//       ans = Math.min(ans, root.val - pred);
//     pred = root.val;
//     inorder(root.right);
//   }
// }
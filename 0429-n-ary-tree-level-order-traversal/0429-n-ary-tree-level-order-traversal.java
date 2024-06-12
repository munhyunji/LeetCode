/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        
        List<List<Integer>> nodeList = new ArrayList<>();

        Queue<Node> queue = new LinkedList<>();
        Node currentNode = root;
        
        if(root == null) return nodeList;
        
        queue.add(root);
        
        while(!queue.isEmpty()) {
           int size = queue.size(); //현재 레벨의 노드수
            
            List<Integer> innerList = new ArrayList<>();
    
            for(int i = 0; i < size; i++) {
                currentNode = queue.poll();
                for(Node node : currentNode.children) {
                   queue.add(node); 
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
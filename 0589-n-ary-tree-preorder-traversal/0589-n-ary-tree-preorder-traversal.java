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
    public List<Integer> preorder(Node root) {
        List<Integer> nodeList = new ArrayList<>();
        traverse(root, nodeList);
        return nodeList;
    }
    
    public void traverse(Node root, List<Integer> nodeList) {
        if(root == null) return;
        
        Node currentNode = root;
        nodeList.add(currentNode.val);
        
        for(Node node : currentNode.children) {
            traverse(node, nodeList);
        }
    }
}
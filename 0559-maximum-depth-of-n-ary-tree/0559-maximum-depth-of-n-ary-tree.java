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
    public int maxDepth(Node root) {
        if(root == null) return 0;
        
        int depth = 1; 
        
        if(root.children == null || root.children.isEmpty()) {
            return 1;  //마지막 depth return ... . .
        }
        
        for(Node child : root.children) { 
            depth = Math.max(depth, maxDepth(child)+1);
        }
        
        return depth; //마지막으로 최대깊이 반환 
    }
}

//각 노드의 최대길이를 구하려면 각 루트마다 최대 depth를 생성하고, 저장해줘야하는데
//굳이 currentDepth를 생성할 필요 없이 recursive를 하면서 1+해주면 갂각의 depth를 알 수 있음
// 
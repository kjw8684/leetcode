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
    public List<Integer> postorder(Node root) {
        List<Integer> answer = new ArrayList<>();
        if(root != null) {
            travel(answer, root);
        }
        return answer;
    }

    public void travel(List<Integer> answer, Node root) {
        int len = root.children.size();
        for(int i = 0; i < len; i++) {
            travel(answer, root.children.get(i));
        }

        answer.add(root.val);
    }
}
/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head == null){
            return head;
        }
        HashMap<Node, Node> map = new HashMap<>();
        Node now = head;
        while(true){
            map.put(now, new Node(now.val));
            if(now.next == null){
                break;
            }
            now = now.next;
        }
        now = head;
        while(true){
            map.get(now).next = map.get(now.next);
            map.get(now).random = map.get(now.random);
            if(now.next == null){
                break;
            }
            now = now.next;
        }
        return map.get(head);
    }
}
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {        
        ListNode root = new ListNode(0);
        ListNode front = root, back = root;
        root.next = head;
        
        for(int i = 0; i <= n; i++){
            back = back.next;
        }
        
        while(back != null) {
            front = front.next;
            back = back.next;
        }
        
        front.next = front.next.next;
        
        return root.next;
    }
}
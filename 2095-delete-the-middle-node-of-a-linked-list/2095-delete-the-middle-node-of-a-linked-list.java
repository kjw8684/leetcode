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
    public ListNode deleteMiddle(ListNode head) {
        int count = 0;
        ListNode tree = head;

        while(tree != null) {
            count++;
            tree = tree.next;
        }
        if(count == 1) {
            return null;
        }
        int half = count / 2;

        tree = head;
        for(int i = 0; i < half - 1; i++) {
            tree = tree.next;
        }
        tree.next = tree.next.next;

        return head;
    }
}
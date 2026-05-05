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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null) {
            return head;
        }
        int len = 1;
        ListNode cur = head;
        while(cur.next != null) {
            cur = cur.next;
            len++;
        }
        cur.next = head;

        k %= len;
        k = len - k;

        for(int i = 0; i < k; i++) {
            head = head.next;
        }

        cur = head;
        for(int i = 1; i < len; i++) {
            cur = cur.next;
        }
        cur.next = null;

        return head;
    }
}
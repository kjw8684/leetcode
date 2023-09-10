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
    public ListNode reverseList(ListNode head) {
        ListNode cur = head, temp = null, rev = null;
        while(cur != null){
            temp = cur.next;
            cur.next = rev;
            rev = cur;
            cur = temp;
        }
        return rev;
    }
}
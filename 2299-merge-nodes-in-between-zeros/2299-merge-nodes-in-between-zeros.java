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
    public ListNode mergeNodes(ListNode head) {
        ListNode cur = head.next, answer = new ListNode(), zero = answer;
        int sum = 0;

        while(cur != null) {
            if(cur.val == 0) {
                zero.next = new ListNode(sum, null);
                zero = zero.next;
                sum = 0;
            }
            else {
                sum += cur.val;
            }

            cur = cur.next;
        }

        return answer.next;
    }
}
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode answer = new ListNode(0), cur = answer;
        int val, pass = 0;

        while (l1 != null || l2 != null) {
            val = pass;
            pass = 0;

            if (l1 != null) {
                val += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                val += l2.val;
                l2 = l2.next;
            }

            if (val > 9) {
                pass = 1;
                val -= 10;
            }

            cur.next = new ListNode(val);
            cur = cur.next;
        }
        if (pass == 1) {
            cur.next = new ListNode(1);
        }

        return answer.next;
    }

}
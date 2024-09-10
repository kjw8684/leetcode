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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode front = head, end = head.next;
        int f_val = 0, e_val = 0;

        while(end != null) {
            f_val = front.val;
            e_val = end.val;
            front.next = new ListNode(divisor(f_val, e_val));
            front.next.next = end;
            front = end;
            end = end.next;
        }

        return head;
    }

    public int divisor(int a, int b) {
        int answer = 0;
        if(a > b) {
            for(int i = 1; i <= b; i++) {
                if(a % i == 0 && b % i == 0) {
                    answer = i;
                }
            }
            return answer;
        }
        else {
            for(int i = 1; i <= a; i++) {
                if(a % i == 0 && b % i == 0) {
                    answer = i;
                }
            }
            return answer;
        }
    }
}
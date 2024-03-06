/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode tortle = head, rabit = head;
        
        while (rabit != null) {
            tortle = tortle.next;
            if (rabit.next == null) {
                return false;
            }
            rabit = rabit.next.next;
            if (rabit == tortle) {
                return true;
            }
        }
        
        return false;
    }
}
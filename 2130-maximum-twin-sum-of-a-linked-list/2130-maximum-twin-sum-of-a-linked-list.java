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
    public int pairSum(ListNode head) {
        int len = 0, max = 0;
        List<Integer> list = new ArrayList<>();
        while(head != null) {
            list.add(head.val);
            head = head.next;
            len++;
        }

        for(int i = 0; i < len / 2; i++) {
            max = Math.max(list.get(i) + list.get(len - i - 1), max);
        }

        return max;
    }
}
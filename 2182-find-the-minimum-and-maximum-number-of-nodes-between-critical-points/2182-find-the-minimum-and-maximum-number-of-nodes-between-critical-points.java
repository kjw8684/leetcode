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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE, first = -1, before = 0, index = 0;
        int cur, bef, aft;
        int[] answer = new int[2];

        while(head.next != null && head.next.next != null) {
            bef = head.val;
            cur = head.next.val;
            aft = head.next.next.val;
            if(cur < aft && cur < bef) {
                if(first == -1) {
                    first = index;
                    before = index;
                    head = head.next;
                    index++;
                    continue;
                }
                min = Math.min(min, index - before);
                max = index - first;
                before = index;
            }
            
            if(cur > aft && cur > bef) {
                if(first == -1) {
                    first = index;
                    before = index;
                    head = head.next;
                    index++;
                    continue;
                }
                min = Math.min(min, index - before);
                max = index - first;
                before = index;
            }
            head = head.next;
            index++;
        }

        if(max < 0) {
            answer[0] = -1;
            answer[1] = -1;
        }
        else {
            answer[0] = min;
            answer[1] = max;
        }

        return answer;
    }
}
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
        ListNode tree = head;
        int bbefore = tree.val, index = 2, min = 100001, max = -1000001;
        tree = tree.next;
        int before = tree.val;
        tree = tree.next;
        int[] answer = new int[2];
        answer[0] = 100001;

        while(tree != null) {
            if((before > bbefore && before > tree.val) || (before < bbefore && before < tree.val)){
                answer[0] = Math.min(answer[0], index - max);
                max = index;
                if(min == 100001) {
                    min = index;
                }
            }
            bbefore = before;
            before = tree.val;
            tree = tree.next;
            index++;
        }

        if(min == 100001 || min == max) {
            return new int[] {-1, -1};
        }
        answer[1] = max - min;

        return answer;
    }
}
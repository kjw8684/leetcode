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
    public ListNode[] splitListToParts(ListNode head, int k) {
        int size = 0;
        ListNode[] answer = new ListNode[k];
        ListNode cur = head, temp = null;
        while(cur != null) {
            size++;
            cur = cur.next;
        }
        int avg = size / k, left = size % k;

        for(int i = 0; i < k; i++) {
            cur = head;
            if(head != null) {
                for(int j = 0; j < avg; j++) {
                    temp = head;
                    head = head.next;
                }
                if(i < left) {
                    temp = head;
                    head = head.next;
                }
                temp.next = null;
                answer[i] = cur;
            }
            else {
                break;
            }
        }


        return answer;
    }
}
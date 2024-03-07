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
    public ListNode middleNode(ListNode head) {
        ListNode middle = head, travle = head;
        int count = 0;
        
        while(travle != null) {
            count++;
            travle = travle.next;
        }
        count /= 2;
        
        for (int i = 0; i < count; i++) {
            middle = middle.next;
        }
        
        return middle;
    }
}
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
    public ListNode removeZeroSumSublists(ListNode head) {
        ListNode root = new ListNode(-1);
        root.next = head;
        ListNode current = root;
        
        while(current != null){
            if(current.next != null && current.next.val == 0) {
                current.next = current.next.next;
            }
            if(removeList(current)){
                current = current.next;   
            }
        }
        
        return root.next;
    }
    
    public boolean removeList(ListNode head) {
        ListNode left = head, right = head.next;
        int sum = 0;
        
        while(right != null) {
            sum += right.val;
            if(sum == 0) {
                left.next = right.next;
                return false;
            }
            right = right.next;
        }
        return true;
    }
}
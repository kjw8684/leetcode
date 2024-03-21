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
    public ListNode reverseList(ListNode head) {
        ListNode root = head, reverse = null, temp = null;
        while(root != null) {
            temp = root;
            root = root.next;
            temp.next = reverse;
            reverse = temp;
        }
        
        return reverse;
    }
}
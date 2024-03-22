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
    public boolean isPalindrome(ListNode head) {
        ListNode root = head;
        Deque<Integer> deque = new ArrayDeque<>();
        
        while (root != null) {
            deque.addFirst(root.val);
            root = root.next;
        }
        
        while (deque.size() > 1) {
            if(deque.peekFirst() == deque.peekLast()){
                deque.removeFirst();
                deque.removeLast();
                continue;
            }
            
            break;
        }
        
        if(deque.size() < 2) {
            return true;
        }
        
        return false;
    }
}
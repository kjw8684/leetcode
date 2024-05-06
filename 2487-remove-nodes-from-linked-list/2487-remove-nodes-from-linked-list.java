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
    public ListNode removeNodes(ListNode head) {
        ListNode answer = null, temp;
        Stack<Integer> stack = new Stack<>();
        while(head != null) {
            while(!stack.isEmpty() && stack.peek() < head.val) {
                stack.pop();
            }
            stack.push(head.val);
            head = head.next;
        }
        
        while(!stack.isEmpty()) {
            temp = answer;
            answer = new ListNode(stack.pop());
            answer.next = temp;
        }
        
        return answer;
    }
}
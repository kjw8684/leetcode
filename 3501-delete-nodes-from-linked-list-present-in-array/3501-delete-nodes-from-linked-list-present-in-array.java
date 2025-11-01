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
    public ListNode modifiedList(int[] nums, ListNode head) {
        Set<Integer> set = new HashSet<>();

        for(int num : nums) {
            set.add(num);
        }

        ListNode answer = head;

        while(answer != null && set.contains(answer.val)) {
            answer = answer.next;
        }

        ListNode start = answer;

        while(start.next != null) {
            if(set.contains(start.next.val)) {
                start.next = start.next.next;
            }
            else {
                start = start.next;
            }
        }

        return answer;
    }
}
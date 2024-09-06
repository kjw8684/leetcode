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
        Set<Integer> delete = new HashSet<>();
        int len = nums.length;

        for(int i = 0; i < len; i++) {
            delete.add(nums[i]);
        }

        while(head != null) {
            if(!delete.contains(head.val)) {
                break;
            }
            head = head.next;
        }
        search(delete, head);

        return head;
    }

    public void search(Set<Integer> delete, ListNode head) {
        while(head.next != null) {
            if(delete.contains(head.next.val)) {
                head.next = head.next.next;
            }
            else {
                head = head.next;
            }
        }
    }
}
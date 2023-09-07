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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || left == right) return head;
        //head 값이 없을경우와 바뀌는 범위가 1일경우 원값과 같음으로 바로 head를 return한다.
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        // dummy, prev = [0,head]
        for (int i = 0; i < left - 1; ++i) {
            prev = prev.next;
        }
        //prev 값을 left 시작값으로 설정해둠
        ListNode current = prev.next;
        //current 값을 left 위치부터 남은값 전부로 설정
        for (int i = 0; i < right - left; ++i) {
            ListNode nextNode = current.next;
            current.next = nextNode.next;
            nextNode.next = prev.next;
            prev.next = nextNode;
        }
        //for 문으로 left랑 right 위치를 바꿔줌
        return dummy.next;
    }
}
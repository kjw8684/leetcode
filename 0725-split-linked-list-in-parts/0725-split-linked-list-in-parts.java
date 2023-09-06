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
        ListNode[] listnode = new ListNode[k];
        ListNode now = head;
        int size = 0;
        while(now != null){
            size++;
            now = now.next;
        }
        int count = size % k;
        now = head;
        ListNode temp = null;
        for(int i = 0; i < k; i++){
            listnode[i] = now;
            for(int j = 0; j < (size / k) + (count > 0 ? 1 : 0); j++){
                temp = now;
                now = now.next;
            }
            count--;
            if(temp != null){
                temp.next = null;
            }
        }
        return listnode;
    }
}
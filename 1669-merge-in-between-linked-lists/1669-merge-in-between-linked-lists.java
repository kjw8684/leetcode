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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode root1 = list1, root2 = list1, root3 = list2;
        int i = 1;
        while(root3.next != null) {
            root3 = root3.next;
        }
        
        while(root2 != null) {
            if(i < a) {
                root1= root1.next;
            }
            
            if(i < b + 2) {
                root2 = root2.next;
            }
            if(i == b + 2) {
                root3.next = root2;
                break;
            }
            
            i++;
        }
        root1.next = list2;
        
        return list1;
    }
}
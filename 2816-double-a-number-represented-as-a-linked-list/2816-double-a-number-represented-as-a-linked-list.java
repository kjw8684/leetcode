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
import java.math.BigInteger;

class Solution {
    public ListNode doubleIt(ListNode head) {
        ListNode answer = null, temp;
        BigInteger num = new BigInteger("0"), compare = new BigInteger("0"), ten = new BigInteger("10");
        while(head != null) {
            num = num.multiply(ten);
            num = num.add(new BigInteger(String.valueOf(head.val)));
            head = head.next;
        }
        
        num = num.multiply(new BigInteger("2"));
        if(num.compareTo(compare) == 0) {
            return new ListNode(0);
        }
        while(num.compareTo(compare) != 0) {
            temp = answer;
            answer = new ListNode(num.remainder(ten).intValue());
            num = num.divide(ten);
            answer.next = temp;
        }
        
        return answer;
    }
}
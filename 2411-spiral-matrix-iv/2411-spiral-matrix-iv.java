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
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        if(head == null) {
            return new int[0][0];
        }
        int[] cur = new int[2];
        int[][] answer = new int[m][n];

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                answer[i][j] = -1;
            }
        }

        m--;
        cur[1] = -1;
        while(head != null) {
            for(int i = 0; i < n; i++) {
                if(head == null) {
                    break;
                }
                cur[1]++;
                answer[cur[0]][cur[1]] = head.val;
                head = head.next;
                
            }
            n--;

            for(int i = 0; i < m; i++) {
                if(head == null) {
                    break;
                }
                cur[0]++;
                System.out.println(cur[0] + " " + cur[1]);
                answer[cur[0]][cur[1]] = head.val;
                head = head.next;
            }
            m--;

            for(int i = 0; i < n; i++) {
                if(head == null) {
                    break;
                }
                cur[1]--;
                answer[cur[0]][cur[1]] = head.val;
                head = head.next;
            }
            n--;

            for(int i = 0; i < m; i++) {
                if(head == null) {
                    break;
                }
                cur[0]--;
                answer[cur[0]][cur[1]] = head.val;
                head = head.next;
            }
            m--;
        }

        return answer;
    }
}
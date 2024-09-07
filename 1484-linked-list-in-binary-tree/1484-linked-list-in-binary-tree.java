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
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    ListNode start;
    public boolean isSubPath(ListNode head, TreeNode root) {
        start = head;
        return search(root);
    }

    public boolean search(TreeNode root) {
        if(root.val == start.val && cheak(start, root)) {
            return true;
        }

        if(root.left != null && search(root.left)) {
            return true;
        }
        if(root.right != null && search(root.right)) {
            return true;
        }

        return false;
    }

    public boolean cheak(ListNode head, TreeNode root) {
        if(head.next == null) {
            return true;
        }
        if(root.left != null && root.left.val == head.next.val && cheak(head.next, root.left)) {
            return true;
        }
        if(root.right != null && root.right.val == head.next.val && cheak(head.next, root.right)) {
            return true;
        }

        return false;
    }
    
}
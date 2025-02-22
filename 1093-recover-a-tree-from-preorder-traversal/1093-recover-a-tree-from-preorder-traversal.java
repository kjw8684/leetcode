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
    String TRAVAR;
    int index = 0, len;
    public TreeNode recoverFromPreorder(String traversal) {
        TRAVAR = traversal;
        len = traversal.length();
        TreeNode node = new TreeNode();
        add(node, 0);

        return node;
    }

    public int add(TreeNode node, int depth) {
        int val = 0;

        while(index < len && TRAVAR.charAt(index) != '-') {
            val *= 10;
            val += TRAVAR.charAt(index) - '0';
            index++;
        }
        node.val = val;

        int count = 0;
        while(index < len && TRAVAR.charAt(index) == '-') {
            count++;
            index++;
        }

        while(count == depth + 1) {
            if(node.left == null) {
                node.left = new TreeNode();
                count = add(node.left, count);
            }
            else {
                node.right = new TreeNode();
                count = add(node.right, count);
            }
        }

        return count;
    }
}
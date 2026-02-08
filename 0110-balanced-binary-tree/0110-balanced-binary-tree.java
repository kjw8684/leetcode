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
    boolean answer = true;
    public boolean isBalanced(TreeNode root) {
        if(root == null || (root.left == null && root.right == null)) {
            return true;
        }
        check(root, 1);
        return answer;
    }

    public int check(TreeNode root, int depth) {
        int left = depth, right = depth;
        if(root.left != null) {
            left = check(root.left, depth + 1);
        }
        if(root.right != null) {
            right = check(root.right, depth + 1);
        }

        if(!(left == right || left + 1 == right || left == right + 1)) {
            answer = false;
        }

        return Math.max(left, right);
    }
}
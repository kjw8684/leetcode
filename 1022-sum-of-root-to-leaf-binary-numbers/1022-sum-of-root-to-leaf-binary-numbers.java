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
    public int sumRootToLeaf(TreeNode root) {
        return sum(root, 0);
    }

    public int sum(TreeNode root, int val) {
        val *= 2;
        if(root.val == 1) {
            val++;
        }
        int cur = 0;
        if(root.left == null && root.right == null) {
            return val;
        }

        if(root.left != null) {
            cur += sum(root.left, val);
        }
        if(root.right != null) {
            cur += sum(root.right, val);
        }

        return cur;
    }
}
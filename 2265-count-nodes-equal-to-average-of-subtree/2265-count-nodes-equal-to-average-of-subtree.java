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
    int count = 0;
    public int averageOfSubtree(TreeNode root) {
        sum(root);
        return count;
    }

    private int sum(TreeNode root) {
        int cur = root.val;
        if(root.left != null) {
            cur += sum(root.left);
        }
        if(root.right != null) {
            cur += sum(root.right);
        }

        if(cur / counting(root) == root.val) {
            count++;
        }

        return cur;
    }

    private int counting(TreeNode root) {
        int cur = 1;
        if(root.left != null) {
            cur += counting(root.left);
        }
        if(root.right != null) {
            cur += counting(root.right);
        }

        return cur;
    }
}
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
    long max = 0L;
    int sum = 0;
    public int maxProduct(TreeNode root) {
        dfs(root);
        search(root);
        max %= 1000000007;

        return (int)max;
    }

    public void dfs(TreeNode root) {
        sum += root.val;

        if(root.left != null) {
            dfs(root.left);
        }
        if(root.right != null) {
            dfs(root.right);
        }
    }

    public int search(TreeNode root) {
        int cursum = root.val;
        if(root.left != null) {
            int cur = search(root.left);
            if(max < (long)cur * (sum - cur)) {
                max = (long)cur * (sum - cur);
            }
            cursum += cur;
        }

        if(root.right != null) {
            int cur = search(root.right);
            if(max < (long)cur * (sum - cur)) {
                max = (long)cur * (sum - cur);
            }
            cursum += cur;
        }

        return cursum;
    }
}
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
    int max = 0, count = 0;
    TreeNode answer;
    boolean found = false;
    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        dfs(root, 1);
        search(root, 1);

        return answer;
    }

    public void dfs(TreeNode root, int depth) {
        if(depth == max) {
            count++;
        }
        if(depth > max) {
            max = depth;
            count = 1;
        }

        if(root.left != null) {
            dfs(root.left, depth + 1);
        }
        if(root.right != null) {
            dfs(root.right, depth + 1);
        }
    }

    public int search(TreeNode root, int depth) {
        if(count == 1 && depth == max) {
            answer = root;
            found = true;
            return 1;
        }
        if(depth == max) {
            return 1;
        }
        int cur = 0;

        if(root.left != null) {
            cur += search(root.left, depth + 1);
        }
        if(root.right != null) {
            cur += search(root.right, depth + 1);
        }

        if(!found && cur == count) {
            answer = root;
            found = true;
        }

        return cur;
    }
}
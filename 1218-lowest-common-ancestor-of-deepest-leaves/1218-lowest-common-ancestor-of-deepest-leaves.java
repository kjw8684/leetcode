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
    int deepest = -1;
    TreeNode answer;
    public TreeNode lcaDeepestLeaves(TreeNode root) {
        find(root, 0);
        return answer;
    }

    public int find(TreeNode root, int depth) {
        if(depth > deepest) {
            deepest = depth;
            answer = root;
        }

        int left = 0, right = 0;
        if(root.left != null && root.right != null) {
            left = find(root.left, depth + 1);
            right = find(root.right, depth + 1);

            if(left == deepest && right == deepest) {
                answer = root;
            }
        }
        else if(root.left != null) {
            left = find(root.left, depth + 1);
        }
        else if(root.right != null) {
            right = find(root.right, depth + 1);
        }
        
        return Math.max(depth, Math.max(left, right));
    }
}
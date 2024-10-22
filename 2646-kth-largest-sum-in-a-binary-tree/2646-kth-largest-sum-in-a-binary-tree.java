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
    public long kthLargestLevelSum(TreeNode root, int k) {
        int level = depth(root, 1);
        if(level < k) {
            return -1;
        }
        long[] answer = new long[level];

        add(root, answer, 0);
        Arrays.sort(answer);

        return answer[level - k];
    }

    public int depth(TreeNode root, int level) {
        int max = level;
        if(root.left != null) {
            max = Math.max(max, depth(root.left, level + 1));
        }
        if(root.right != null) {
            max = Math.max(max, depth(root.right, level + 1));
        }

        return max;
    }

    public void add(TreeNode root, long[] answer, int level) {
        answer[level] += root.val;
        if(root.left != null) {
            add(root.left, answer, level + 1);
        }
        if(root.right != null) {
            add(root.right, answer, level + 1);
        }
    }
}
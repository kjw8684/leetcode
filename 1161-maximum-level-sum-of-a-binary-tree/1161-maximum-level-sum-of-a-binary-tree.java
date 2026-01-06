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
    Map<Integer, Integer>map = new HashMap<>();
    public int maxLevelSum(TreeNode root) {
        dfs(1, root);

        int max = Integer.MIN_VALUE, depth = 1, answer = 0;

        while(map.containsKey(depth)) {
            int cur = map.get(depth);
            if(max < cur) {
                max = cur;
                answer = depth;
            }
            depth++;
        }

        return answer;
    }

    public void dfs(int depth, TreeNode root) {
        map.put(depth, map.getOrDefault(depth, 0) + root.val);

        if(root.left != null) {
            dfs(depth + 1, root.left);
        }

        if(root.right != null) {
            dfs(depth + 1, root.right);
        }
    }
}
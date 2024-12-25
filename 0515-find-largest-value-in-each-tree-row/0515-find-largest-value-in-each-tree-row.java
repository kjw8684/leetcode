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
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        add(list, root, 0);

        return list;
    }

    public void add(List<Integer> list, TreeNode root, int depth) {
        if(root == null) {
            return;
        }

        if(list.size() == depth) {
            list.add(Integer.MIN_VALUE);
        }

        if(list.get(depth) < root.val) {
            list.set(depth, root.val);
        }

        add(list, root.left, depth + 1);
        add(list, root.right, depth + 1);
    }
}
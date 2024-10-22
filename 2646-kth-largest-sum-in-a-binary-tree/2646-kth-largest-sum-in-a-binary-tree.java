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
        List<Long> list = new ArrayList<>();
        add(root, list, 0);
        int size = list.size();
        if(size < k) {
            return -1;
        }
        Collections.sort(list);

        return list.get(size - k);
    }

    public void add(TreeNode root, List<Long> list, int level) {
        if(list.size() < level + 1) {
            list.add(Long.valueOf(root.val));
        }
        else {
            list.set(level, list.get(level) + root.val);
        }
        if(root.left != null) {
            add(root.left, list, level + 1);
        }
        if(root.right != null) {
            add(root.right, list, level + 1);
        }
    }
}
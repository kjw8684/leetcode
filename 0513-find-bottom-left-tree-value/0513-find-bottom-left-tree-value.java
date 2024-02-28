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
    int max_depth = -1;
    int max_value = 0;
        
    public int findBottomLeftValue(TreeNode root) {
        if (search(root, 1)) {
            return root.val;
        }
        
        return max_value;
    }
    
    public boolean search(TreeNode root, int depth) {
        if (root == null && depth - 1 > max_depth) {
            return true;
        }
        if (root == null) {
            return false;
        }
        
        if (search(root.left, depth + 1)) {
            max_depth = depth;
            max_value = root.val;
        }
        
        if (search(root.right, depth + 1)) {
            max_depth = depth;
            max_value = root.val;
        }
        
        return false;
    }
}
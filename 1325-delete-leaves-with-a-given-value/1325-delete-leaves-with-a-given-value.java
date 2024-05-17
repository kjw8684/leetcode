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
    public TreeNode removeLeafNodes(TreeNode root, int target) {
        return remove(root, target);
    }
    
    public TreeNode remove(TreeNode root, int target) {
        if(root.left != null) root.left = remove(root.left, target);
        if(root.right != null) root.right = remove(root.right, target);
        
        if(root.left == null && root.right == null && root.val == target) return null;
        
        return root;
    }
}
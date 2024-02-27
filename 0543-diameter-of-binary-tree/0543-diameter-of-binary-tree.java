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
    int max = 0;
    
    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }

        search(root);
        
        return max;
    }
    
    public int search (TreeNode cur) {
        if (cur == null) {
            return 0;
        }
        int left = search(cur.left);
        int right = search(cur.right);
        
        if (max < left + right) {
            max = left + right;
        }
        
        if (left > right) {
            return left + 1;
        }
        else {
            return right + 1;
        }
    }
}
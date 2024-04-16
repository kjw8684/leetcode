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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if(depth == 1) {
            TreeNode temp = new TreeNode(val);
            temp.left = root;
            
            return temp;
        }
        search(root, val, depth, 2);
        
        return root;
    }
    
    public void search(TreeNode root, int val, int depth, int current) {
        if(root == null) {
            return;
        }
        
        if(depth == current) {
            TreeNode templ = new TreeNode(val), tempr = new TreeNode(val), left = root.left, right = root.right;
            root.left = templ;
            templ.left = left;
            root.right = tempr;
            tempr.right = right;
            return;
        }
        
        search(root.left, val, depth, current + 1);
        search(root.right, val, depth, current + 1);
    }
}
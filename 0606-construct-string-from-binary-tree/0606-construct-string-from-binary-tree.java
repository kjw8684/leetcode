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
    String result;
    public void scuba(TreeNode root){
        if(root.left != null){
            result += "(" + Integer.toString(root.left.val);
            scuba(root.left);
            result += ")";
        }
        else if(root.right != null){
            result += "()";
        }
        if(root.right != null){
            result += "(" + Integer.toString(root.right.val);
            scuba(root.right);
            result += ")";
        }
    }
    
    public String tree2str(TreeNode root) {
        result = Integer.toString(root.val);
        scuba(root);
        return result;
    }
}
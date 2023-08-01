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
    ArrayList<Integer> result = new ArrayList<Integer>();
    
    public void leftt(TreeNode root){
        if(root.left != null)
            leftt(root.left);
        result.add(root.val);
        if(root.right != null)
            leftt(root.right);
    }
    
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root != null){
            if(root.left != null)
                leftt(root.left);
            result.add(root.val);
            if(root.right != null)
                leftt(root.right);   
        }
        return result;
    }
}
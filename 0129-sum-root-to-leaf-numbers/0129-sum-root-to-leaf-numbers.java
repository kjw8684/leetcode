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
    int answer = 0;
    public int sumNumbers(TreeNode root) {
        search(root, 0);
        return answer;
    }
    
    public void search(TreeNode root, int current_val) {
        current_val += root.val;
        if(root.left == null && root.right == null) {
            answer += current_val;
            return;
        }
        
        if(root.left != null) {
            search(root.left, current_val * 10);
        }
        
        if(root.right != null) {
            search(root.right, current_val * 10);
        }
    }
}
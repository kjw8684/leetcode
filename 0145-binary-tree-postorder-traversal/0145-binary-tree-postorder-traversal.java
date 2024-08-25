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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> answer = new ArrayList<>();
        if(root != null) {
            travel(answer, root);
        }
        return answer;
    }

    public void travel(List<Integer> answer, TreeNode root) {
        if(root.left != null) {
            travel(answer, root.left);
        }
        if(root.right != null) {
            travel(answer, root.right);
        }

        answer.add(root.val);
    }
}
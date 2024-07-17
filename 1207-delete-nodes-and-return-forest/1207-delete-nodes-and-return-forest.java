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
    int len = 0;
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        List<TreeNode> answer = new ArrayList<>();
        Arrays.sort(to_delete);
        len = to_delete.length;
        search(answer, root, to_delete);
        boolean cheak = true;
        
        for(int i = 0; i < len; i++) {
            if(root.val == to_delete[i]) {
                cheak = false;
            }
        }

        if(cheak) {
            answer.add(root);
        }

        return answer;
    }

    public boolean search(List<TreeNode> answer, TreeNode root, int[] to_delete){
        if(root.left != null && search(answer, root.left, to_delete)) {
            root.left = null;
        }
        if(root.right != null && search(answer, root.right, to_delete)) {
            root.right = null;
        }

        for(int i = 0; i < len; i++) {
            if(root.val == to_delete[i]) {
                if(root.left != null) {
                    answer.add(root.left);
                }
                if(root.right != null) {
                    answer.add(root.right);
                }
                return true;
            }
            if(root.val < to_delete[i]) {
                return false;
            }
        }
        return false;
    }
}
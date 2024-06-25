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
    int size = 0;
    Queue<Integer> queue = new LinkedList<>();
    public TreeNode bstToGst(TreeNode root) {
        search(root);
        add(root);
        return root;
    }
    
    public void search(TreeNode root) {
        queue.offer(root.val);
        size++;
        if(root.left != null) {
            search(root.left);
        }
        if(root.right != null) {
            search(root.right);
        }
    }
    
    public void add(TreeNode root) {
        int start = root.val;
        for(int i = 0; i < size; i++) {
            if(queue.peek() > start) {
                root.val += queue.peek();
            }
            queue.add(queue.poll());
        }
        if(root.left != null) {
            add(root.left);
        }
        if(root.right != null) {
            add(root.right);
        }
    }
}
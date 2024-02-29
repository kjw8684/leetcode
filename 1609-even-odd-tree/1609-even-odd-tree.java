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
    Map<Integer, Integer> hashmap = new HashMap<>();
    boolean answer = true;
    
    public boolean isEvenOddTree(TreeNode root) {
        if (root == null) {
            return false;
        }
        
        search (root, 0);
        
        return answer;
    }
    
    public boolean search(TreeNode root, int depth) {
        if (root == null) {
            return true;
        }
        
        if (!(search(root.left, depth + 1) && search(root.right, depth + 1))) {
            answer = false;
        }
        
        if (depth % 2 == 0 && root.val % 2 == 1) {
            if (hashmap.get(depth) != null && hashmap.get(depth) < root.val) {
                hashmap.put(depth, root.val);
                return true;
            }
            
            if (hashmap.get(depth) == null) {
                hashmap.put(depth, root.val);
                return true;
            }
            
        }
        
        if (depth % 2 == 1 && root.val % 2 == 0) {
            if (hashmap.get(depth) != null && hashmap.get(depth) > root.val) {
                hashmap.put(depth, root.val);
                return true;
            }
            
            if (hashmap.get(depth) == null) {
                hashmap.put(depth, root.val);
                return true;
            }
        }
        
        answer = false;
        return true;
    }
}
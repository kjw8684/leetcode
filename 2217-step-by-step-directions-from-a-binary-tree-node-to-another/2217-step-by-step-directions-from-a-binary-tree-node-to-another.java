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
    public String getDirections(TreeNode root, int startValue, int destValue) {
        Deque<Character>startroot = new ArrayDeque<>();
        Deque<Character>destroot = new ArrayDeque<>();
        StringBuilder answer = new StringBuilder();
        search(startroot, root, startValue);
        search(destroot, root, destValue);

        while(!startroot.isEmpty() && !destroot.isEmpty()) {
            if(startroot.peekFirst() == destroot.peekFirst()) {
                startroot.pollFirst();
                destroot.pollFirst();
            }
            else {
                break;
            }
        }

        while(!startroot.isEmpty()) {
            answer.append("U");
            startroot.pollFirst();
        }

        while(!destroot.isEmpty()) {
            answer.append(destroot.pollFirst());
        }


        return answer.toString();
    }

    public boolean search(Deque<Character> deque, TreeNode root, int value){
        if(root.val == value) {
            return true;
        }
        if(root.left != null) {
            deque.addLast('L');
            if (search(deque, root.left, value)){
                return true;
            }
            deque.pollLast();
        }
        if(root.right != null) {
            deque.addLast('R');
            if (search(deque, root.right, value)){
                return true;
            }
            deque.pollLast();
        }

        return false;
    }
}
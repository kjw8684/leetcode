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
    public TreeNode createBinaryTree(int[][] descriptions) {
        Map<Integer, int[]> list = new HashMap<>();
        Set<Integer> root = new HashSet<>();
        Set<Integer> node = new HashSet<>();
        int len = descriptions.length;
        for(int i = 0; i < len; i++) {
            list.putIfAbsent(descriptions[i][0], new int[2]);
            list.putIfAbsent(descriptions[i][1], new int[2]);
            list.get(descriptions[i][0])[descriptions[i][2]] = descriptions[i][1];
            node.add(descriptions[i][1]);
            if(!node.contains(descriptions[i][0])) {
                root.add(descriptions[i][0]);
            }
            root.remove(descriptions[i][1]);
        }

        TreeNode answer = new TreeNode(root.iterator().next());
        adding(answer, list);

        return answer;
    }

    public void adding(TreeNode answer, Map<Integer, int[]> list) {
        if(list.get(answer.val)[1] != 0) {
            answer.left = new TreeNode(list.get(answer.val)[1]);
            adding(answer.left, list);
        }
        if(list.get(answer.val)[0] != 0) {
            answer.right = new TreeNode(list.get(answer.val)[0]);
            adding(answer.right, list);
        }
    }
}
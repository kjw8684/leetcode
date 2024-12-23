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
    int count = 0;
    public int minimumOperations(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if(root == null) {
            return count;
        }
        add(root, list, 0);

        for(List<Integer> cur : list) {
            count += minimumSwaps(cur);
        }

        return count;
    }

    public void add(TreeNode root, List<List<Integer>> list, int depth) {
        if(root == null) {
            return;
        }

        if(list.size() <= depth) {
            list.add(new ArrayList<>());
        }

        list.get(depth).add(root.val);

        add(root.left, list, depth + 1);
        add(root.right, list, depth + 1);
    }

    public int minimumSwaps(List<Integer> list) {
        int n = list.size();
        boolean[] visited = new boolean[n];
        int swaps = 0;

        // 원래 인덱스를 함께 저장 (값, 인덱스 쌍으로 저장)
        List<int[]> valueIndexPairs = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            valueIndexPairs.add(new int[]{list.get(i), i});
        }

        // 값 기준으로 정렬
        valueIndexPairs.sort(Comparator.comparingInt(a -> a[0]));

        // 사이클 탐색
        for (int i = 0; i < n; i++) {
            // 이미 올바른 위치에 있거나 방문한 경우 건너뜀
            if (visited[i] || valueIndexPairs.get(i)[1] == i) {
                continue;
            }

            // 사이클의 길이 계산
            int cycleLength = 0;
            int j = i;

            while (!visited[j]) {
                visited[j] = true;
                j = valueIndexPairs.get(j)[1]; // 다음 위치로 이동
                cycleLength++;
            }

            // 사이클 길이가 2 이상이면 (사이클 길이 - 1)번의 스왑 필요
            if (cycleLength > 1) {
                swaps += (cycleLength - 1);
            }
        }

        return swaps;
    }
}
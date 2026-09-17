class Solution {
    public int minSumOfLengths(int[] arr, int target) {
        int n = arr.length;

        // best[i] = 0 ~ i까지에서 찾은 target 구간 중 최소 길이
        int[] best = new int[n];

        int INF = 100001;
        for (int i = 0; i < n; i++) {
            best[i] = INF;
        }

        int left = 0;
        int sum = 0;
        int answer = INF;

        for (int i = 0; i < n; i++) {
            sum += arr[i];

            while (sum > target) {
                sum -= arr[left];
                left++;
            }

            // 현재까지의 최솟값을 우선 그대로 가져온다.
            if (i > 0) {
                best[i] = best[i - 1];
            }

            // 현재 [left, i]가 target을 만족한다면
            if (sum == target) {
                int curLen = i - left + 1;

                // 현재 구간과 겹치지 않는 이전 구간이 존재한다면
                if (left > 0 && best[left - 1] != INF) {
                    answer = Math.min(answer, curLen + best[left - 1]);
                }

                // 현재 구간도 이후를 위해 저장한다.
                best[i] = Math.min(best[i], curLen);
            }
        }

        return answer == INF ? -1 : answer;
    }
}
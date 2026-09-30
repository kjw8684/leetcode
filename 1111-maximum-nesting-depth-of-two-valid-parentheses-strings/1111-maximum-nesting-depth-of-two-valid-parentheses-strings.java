class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int len = seq.length(), before = 1;
        int[] answer = new int[len];

        for(int i = 0; i < len; i++) {
            char cur = seq.charAt(i);

            if(cur == '(') {
                before = (before + 1) % 2;
                answer[i] = before;
            }
            else {
                answer[i] = before;
                before = (before + 1) % 2;
            }
        }

        return answer;
    }
}
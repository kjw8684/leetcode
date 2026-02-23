class Solution {
    public boolean hasAllCodes(String s, int k) {
        Set<Integer> left = new HashSet<>();
        int max = (int)Math.pow(2, k), len = s.length();

        for(int i = 0; i < max; i++) {
            left.add(i);
        }

        for(int i = k; i <= len; i++) {
            left.remove(change(s.substring(i - k, i), k));
        }

        return left.isEmpty();
    }

    public int change(String s, int len) {
        int answer = 0;
        for(int i = 0; i < len; i++) {
            answer *= 2;
            if(s.charAt(i) == '1') {
                answer++;
            }
        }

        return answer;
    }
}
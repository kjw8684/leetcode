class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] alpha1 = new int[26];
        int len1 = s1.length(), len2 = s2.length(), sum1 = 0;
        char cur = '1';
        Queue<Character> queue = new LinkedList<>();

        for(int i = 0; i < len1; i++) {
            alpha1[s1.charAt(i) - 'a']++;
            sum1++;
        }

        for(int i = 0; i < len2; i++) {
            cur = s2.charAt(i);
            if(alpha1[cur - 'a'] > 0) {
                queue.add(cur);
                alpha1[cur - 'a']--;
                sum1--;
                if(sum1 == 0) {
                    return true;
                }
            }
            else {
                while(!queue.isEmpty()) {
                    if(queue.peek() == cur) {
                        queue.poll();
                        queue.add(cur);
                        break;
                    }
                    else {
                        alpha1[queue.peek() - 'a']++;
                        queue.poll();
                        sum1++;
                    }
                }
            }
        }
        
        return false;
    }
}
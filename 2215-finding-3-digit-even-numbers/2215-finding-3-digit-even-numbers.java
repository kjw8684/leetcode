class Solution {
    public int[] findEvenNumbers(int[] digits) {
        Arrays.sort(digits);
        int len = digits.length;
        Set<Integer> set = new HashSet<>();
        List<Integer> arr = new ArrayList<>();

        for(int i = 0; i < len; i++) {
            if(digits[i] != 0) {
                for(int j = 0; j < len; j++) {
                    if(i == j) {
                        continue;
                    }
                    for(int k = 0; k < len; k++) {
                        if(k != i && k != j && digits[k] % 2 == 0) {
                            int num = digits[i] * 100 + digits[j] * 10 + digits[k];
                            if(!set.contains(num)) {
                                set.add(num);
                                arr.add(num);
                            }
                        }
                    }
                }
            }
        }

        len = arr.size();
        int[] answer = new int[len];
        for(int i = 0; i < len; i++) {
            answer[i] = arr.get(i);
        }

        return answer;
    }
}
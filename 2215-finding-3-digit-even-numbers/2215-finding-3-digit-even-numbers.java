class Solution {
    public int[] findEvenNumbers(int[] digits) {
        int[] digit = new int[10];
        List<Integer> arr = new ArrayList<>();

        for(int index : digits) {
            digit[index]++;
        }

        int first = 0, second = 0, third = 0;
        for(int i = 100; i < 1000; i += 2) {
            int num = i;
            third = num % 10;
            num /= 10;
            second = num % 10;
            num /= 10;
            first = num;

            digit[first]--;
            digit[second]--;
            digit[third]--;

            if(digit[first] >= 0 && digit[second] >= 0 && digit[third] >= 0) {
                arr.add(i);
            }

            digit[first]++;
            digit[second]++;
            digit[third]++;
        }

        int len = arr.size();
        int[] answer = new int[len];

        for(int i = 0; i < len; i++) {
            answer[i] = arr.get(i);
        }

        return answer;
    }
}
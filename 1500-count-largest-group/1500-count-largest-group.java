class Solution {
    public int countLargestGroup(int n) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] sum = new int[n + 1];

        for(int i = 1; i <= n; i++) {
            sum[i] = digitSum(i);
        }

        for(int num : sum) {
            if(num != 0) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }

        int max = Collections.max(map.values()), count = 0;

        for (int value : map.values()) {
            if (value == max) {
                count++;
            }
        }

        return count;
    }

    public int digitSum(int n) {
        int digitsum = 0;
        while(n != 0) {
            digitsum += n % 10;
            n /= 10;
        }

        return digitsum;
    }
}
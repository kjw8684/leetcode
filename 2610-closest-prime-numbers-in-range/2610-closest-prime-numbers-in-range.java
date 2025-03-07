class Solution {
    public int[] closestPrimes(int left, int right) {
        int[] answer = new int[] {-1, -1};
        int before = -1;

        for(int i = left; i <= right; i++) {
            if(isPrime(i)) {
                before = i;
                break;
            }
        }

        if(before != -1) {
            for(int i = before + 1; i <= right; i++) {
                if(isPrime(i)) {
                    if(answer[0] == -1 || answer[1] - answer[0] > i - before) {
                        answer[0] = before;
                        answer[1] = i;

                    }
                    before = i;
                }
            }
        }

        return answer;
    }

    public static boolean isPrime(int number) {
        if (number <= 1) return false; // 1 이하의 숫자는 소수가 아님
        if (number == 2) return true;  // 2는 소수
        if (number % 2 == 0) return false; // 짝수는 소수가 아님 (2 제외)

        // 제곱근까지만 반복 (효율성 향상)
        int sqrt = (int) Math.sqrt(number);
        for (int i = 3; i <= sqrt; i += 2) {
            if (number % i == 0) return false; // 나누어떨어지면 소수가 아님
        }
        return true; // 위 조건에 걸리지 않으면 소수
    }
}
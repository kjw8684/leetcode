class Solution {
    public String addBinary(String a, String b) {
        int alen = a.length() - 1, blen = b.length() - 1, index = 0, max = Math.max(alen, blen);
        StringBuilder answer = new StringBuilder();
        boolean next = false;

        while(index <= max) {
            int sum = 0;
            if(index <= alen && a.charAt(alen - index) == '1') {
                sum++;
            }
            if(index <= blen && b.charAt(blen - index) == '1') {
                sum++;
            }
            if(next) {
                sum++;
            }

            if(sum % 2 == 1) {
                answer.insert(0, "1");
            }
            else {
                answer.insert(0, "0");
            }

            if(sum > 1) {
                next = true;
            }
            else {
                next = false;
            }

            index++;
        }

        if(next) {
            answer.insert(0, "1");
        }

        return answer.toString();
    }
}
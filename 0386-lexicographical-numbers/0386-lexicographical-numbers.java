class Solution {
    List<Integer> answer = new ArrayList<>();
    public List<Integer> lexicalOrder(int n) {
        int num = 1, anchor = 1;
        while(num <= n) {
            num *= 10;
            anchor *= 10;
        }
        num /= 10;
        anchor /= 10;
        anchor--;
        if(anchor * 10 <= n) {
            anchor = n;
        }

        while(true) {
            if(num > n) {
                num /= 10;
                if(answer.contains(num)) {
                    num++;
                }
            }

            if(num % 10 == 0) {
                under(num / 10);
            }

            answer.add(num);

            if(anchor == num) {
                break;
            }
            num++;
        }        
        
        return answer;
    }

    public void under(int a) {
        if(a % 10 == 0) {
            under(a / 10);
        }

        answer.add(a);
    }
}
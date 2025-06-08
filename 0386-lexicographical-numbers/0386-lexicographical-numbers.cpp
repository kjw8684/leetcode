class Solution {
public:
    vector<int> answer;
    vector<int> lexicalOrder(int n) {
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
                while(num % 10 != 0) {
                    num++;
                };
                num /= 10;
            }

            if(num % 10 == 0) {
                under(num / 10);
            }

            answer.push_back(num);

            if(anchor == num) {
                break;
            }
            num++;
        }        
        
        return answer;
    }

    void under(int a) {
        if(a % 10 == 0) {
            under(a / 10);
        }

        answer.push_back(a);
    }
};
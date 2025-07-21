class Solution {
public:
    string makeFancyString(string s) {
        int count = 1, len = s.length();
        char before = '0', cur = '0';
        string answer = "";

        for(int i = 0; i < len; i++) {
            cur = s[i];
            if(cur == before) {
                count++;
            }
            else {
                count = 1;
                before = cur;
            }

            if(count <= 2) {
                answer += cur;
            }
        }

        return answer;
    }
};
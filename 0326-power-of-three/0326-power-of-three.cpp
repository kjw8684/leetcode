#include <cmath>

class Solution {
public:
    bool isPowerOfThree(int n) {
        if (n <= 0) {
            return false;
        }
        for(int i = 0; i < 20; i++) {
            int cur = (int)pow(3, i);
            if(cur == n) {
                return true;
            }
            else if(cur > n) {
                return false;
            }
        }

        return false;
    }
};
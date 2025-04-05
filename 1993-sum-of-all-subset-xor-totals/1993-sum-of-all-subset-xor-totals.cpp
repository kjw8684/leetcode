class Solution {
public:
    int sum = 0, len = 0;
    int subsetXORSum(vector<int>& nums) {
        len = nums.size();
        for(int i = 0; i < len; i++) {
            cal(nums, i, 0);
        }

        return sum;
    }

    void cal(vector<int>& nums, int pos, int cur) {
        cur ^= nums[pos];
        sum += cur;
        for(int i = pos + 1; i < len; i++) {
            cal(nums, i, cur);
        }
    }
};
class Solution {
public:
    void sortColors(vector<int>& nums) {
        int len = nums.size();

        for(int i = 0; i < len; i++) {
            for(int j = i + 1; j < len; j++) {
                if(nums[i] > nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
    }
};
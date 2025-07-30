class Solution:
    def longestSubarray(self, nums: List[int]) -> int:
        length = len(nums)
        max_val = 0
        max_answer = 0
        cheak = False

        for i in range(length) :
            if max_val <= nums[i] :
                cheak = True
            if max_val < nums[i] :
                max_val = nums[i]
                max_answer = 0
                cur = 1
            elif cheak & (nums[i] == max_val):
                cur += 1
            else :
                cur = 0
                cheak = False
            
            max_answer = max(max_answer, cur)

        return max_answer
            

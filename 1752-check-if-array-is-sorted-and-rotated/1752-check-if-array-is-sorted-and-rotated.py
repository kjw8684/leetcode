class Solution:
    def check(self, nums: List[int]) -> bool:
        issorted = True

        for i in range(1, len(nums)) :
            if not issorted and nums[i - 1] > nums[i] : 
                return False
            
            if nums[i - 1] > nums[i] :
                issorted = False

        return issorted or nums[len(nums) - 1] <= nums[0]
class Solution:
    def subsetXORSum(self, nums: List[int]) -> int:
        sum = 0
        sizeOfNum = len(nums)

        def cal(nums, pos, cur) -> int:
            dsum = 0
            cur ^= nums[pos]
            dsum += cur
            for i in range(pos + 1, sizeOfNum) :
                dsum += cal(nums, i, cur)
            
            return dsum

        for i in range(sizeOfNum) :
            sum += cal(nums, i, 0)

        return sum
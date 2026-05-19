class Solution:
    def getCommon(self, nums1: List[int], nums2: List[int]) -> int:
        cur1 = 0
        cur2 = 0
        len1 = len(nums1)
        len2 = len(nums2)

        nums1.sort()
        nums2.sort()

        while cur1 < len1 and cur2 < len2:
            if nums1[cur1] < nums2[cur2]:
                cur1 += 1
            elif nums1[cur1] > nums2[cur2]:
                cur2 += 1
            else:
                break

        if cur1 == len1 or cur2 == len2:
            return -1

        return nums1[cur1]

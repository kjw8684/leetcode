/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */

 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int ml = mountainArr.length(), left = 0, rigth = ml, max_index = -1, mid;
        int num1, num2, num3;
        while (left < rigth) {
            mid = left + (rigth - left) / 2;

            if (mid > ml - 2) {
                mid = ml - 2;
            }

            if (mid < 1) {
                mid = 1;
            }

            num1 = mountainArr.get(mid - 1);
            num2 = mountainArr.get(mid);
            num3 = mountainArr.get(mid + 1);

            if (num1 < num2 && num2 < num3) {
                left = mid + 1;
            }

            if (num1 > num2 && num2 > num3) {
                rigth = mid;
            }

            if (num1 < num2 && num2 > num3) {
                if (num2 < target) {
                    return -1;
                }

                if (num2 == target) {
                    return mid;
                }
                max_index = mid;
                break;
            }
        }

        left = Binary_Search_left(mountainArr, 0, max_index, target);
        if (left != -1) {
            return left;
        }

        rigth = Binary_Search_rigth(mountainArr, max_index, ml, target);
        if (rigth != -1) {
            return rigth;
        }

        return -1;
    }

    private int Binary_Search_left(MountainArray mountainArr, int start, int length, int target) {
        int left = start, rigth = length, mid, cur;

        while (left < rigth) {
            mid = left + (rigth - left) / 2;
            cur = mountainArr.get(mid);

            if (cur == target) {
                return mid;
            }

            if (cur < target) {
                left = mid + 1;
            }else {
                rigth = mid;
            }
        }

        return -1;
    }

    private int Binary_Search_rigth(MountainArray mountainArr, int start, int length, int target) {
        int left = start, rigth = length, mid, cur;

        while (left < rigth) {
            mid = left + (rigth - left) / 2;
            cur = mountainArr.get(mid);

            if (cur == target) {
                return mid;
            }

            if (cur > target) {
                left = mid + 1;
            }else {
                rigth = mid;
            }
        }

        return -1;
    }
}
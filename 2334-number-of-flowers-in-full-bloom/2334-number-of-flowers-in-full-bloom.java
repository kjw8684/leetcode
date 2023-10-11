class Solution {
    public int[] fullBloomFlowers(int[][] flowers, int[] people) {
        int fl = flowers.length, pl = people.length, cur_start, cur_end;
        int[] start = new int[fl], end = new int[fl], answer = new int[pl];

        for (int i = 0; i < fl; i++) {
            start[i] = flowers[i][0];
            end[i] = flowers[i][1];
        }

        Arrays.sort(start);
        Arrays.sort(end);

        for (int i = 0; i < pl; i++) {
            int t = people[i];
            int started = binarySearchUpperBound(start, t);
            int ended = binarySearchLowerBound(end, t);
            answer[i] = started - ended;
        }
        
        return answer;
    }
    
    private int binarySearchUpperBound(int[] arr, int target) {
        int left = 0;
        int right = arr.length;
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        
        return left;
    }
    
    private int binarySearchLowerBound(int[] arr, int target) {
        int left = 0;
        int right = arr.length;
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        
        return left;
    }
}
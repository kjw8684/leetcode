class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        int len = nums1.length;
        Map<Integer, Integer> map = new HashMap<>();
        int[] diff = new int[len + 1];

        for(int i = 0; i < len; i++) {
            diff[i] = Math.abs(nums1[i] - nums2[i]);
        }
        Arrays.sort(diff);
        for (int i = 0; i < diff.length / 2; i++) {
            int temp = diff[i];
            diff[i] = diff[len - i];
            diff[len - i] = temp;
        }

        //이게 분명 차이가 커질수록 불리해지는거다보니깐 가장 차이가 큰 값을 줄이는거고 사실상 k1과 k2는 나늬어질 이유가 없는건데 차이가 크면 클수록 값이 더더욱 커지니깐 이걸 어떻게 해야할지 모르겠네 diff를 Map으로 저장해서 해야하나
        int change = k1 + k2, same = 1;
        for(int i = 1; i < len; i++) {
            if(diff[0] == diff[i]) {
                same++;
            }
            else {
                break;
            }
        }

        while(change > 0 && same <= len && diff[0] != 0) {
            if(change >= (long)(diff[0] - diff[same]) * same) {
                change -= (diff[0] - diff[same]) * same;
                for(int i = 0; i < same; i++) {
                    diff[i] = diff[same];
                }

                while(same != len && diff[0] == diff[same]) {
                    same++;
                }
            }
            else if(change >= same) {
                for(int i = 0; i < same; i++) {
                    diff[i] -= change / same;
                }
                change %= same;
            }
            else {
                int index = 0;
                while(change != 0) {
                    diff[index]--;
                    change--;
                    index++;
                    if(index == same) {
                        index = 0;
                    }
                }
            }
        }

        long sum = 0;
        for(int i = 0; i < len; i++) {
            sum += (long)diff[i] * diff[i];
        }

        return sum;
    }
}
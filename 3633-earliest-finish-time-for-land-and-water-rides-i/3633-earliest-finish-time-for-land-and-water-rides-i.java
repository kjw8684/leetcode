class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int min = Integer.MAX_VALUE, landLen = landStartTime.length, waterLen = waterStartTime.length;
        
        for(int i = 0; i < landLen; i++) {
            for(int j = 0; j < waterLen; j++) {
                if(landStartTime[i] > waterStartTime[j]) {
                    min = Math.min(min, Math.max(landStartTime[i], (waterStartTime[j] + waterDuration[j])) + landDuration[i]);
                }
                else {
                    min = Math.min(min, Math.max(waterStartTime[j], (landStartTime[i] + landDuration[i])) + waterDuration[j]);
                }
            }
        }

        return min;
    }
}
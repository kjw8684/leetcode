class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int itemp, len = names.length;
        String ntemp;
        for(int i = 0; i < len; i++) {
            for(int j = i; j < len; j++) {
                if(heights[i] < heights[j]) {
                    itemp = heights[j];
                    ntemp = names[j];
                    heights[j] = heights[i];
                    names[j] = names[i];
                    heights[i] = itemp;
                    names[i] = ntemp;
                }
            }
        }

        return names;
    }
}
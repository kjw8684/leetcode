class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int itemp;
        String ntemp;
        for(int i = 0; i < names.length; i++) {
            for(int j = i; j < names.length; j++) {
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
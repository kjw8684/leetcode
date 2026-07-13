class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        int[] premake = new int[36];
        int start = 1, index = 0;
        List<Integer> answer = new ArrayList<>();

        for(int i = 0; i < 8; i++) {
            start = ((i + 1) * 10) + (i + 2);
            premake[index] = start;
            index++;
            for(int j = 0; j < 7 - i; j++) {
                start *= 10;
                start += (j + i + 3);
                premake[index] = start;
                index++;
            }
        }
        Arrays.sort(premake);
        index = 0;

        while(index < 36 && premake[index] <= high) {
            if(premake[index] >= low) {
                answer.add(premake[index]);
            }
            index++;
        }

        return answer;
    }

    
}
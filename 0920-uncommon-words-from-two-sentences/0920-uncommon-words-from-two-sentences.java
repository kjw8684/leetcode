class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String sum = s1 + " " + s2;
        String[] uc = sum.split(" ");
        int len = uc.length;

        Map<String, Integer> map = new HashMap<>();
        List<String> uncommon = new ArrayList<>();

        for(int i = 0; i < len; i++) {
            map.put(uc[i], map.getOrDefault(uc[i], 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if(entry.getValue() == 1) {
                uncommon.add(entry.getKey());
            }
        }

        return uncommon.toArray(new String[0]);
    }
}
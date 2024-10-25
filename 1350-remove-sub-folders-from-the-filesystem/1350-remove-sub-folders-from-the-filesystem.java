class Solution {
    public List<String> removeSubfolders(String[] folder) {
        List<String> answer = new ArrayList<>(Arrays.asList(folder));
        Set<String> set = new HashSet<>(Arrays.asList(folder));
        int len = folder.length, clen = 0;
        String cur = "";

        for(int i = 0; i < len; i++) {
            cur = answer.get(i);
            clen = cur.length();
            for(int j = 1; j < clen; j++) {
                if(cur.charAt(j) == '/' && set.contains(cur.substring(0, j))) {
                    answer.remove(cur);
                    i--;
                    len--;
                    break;
                }
            }
        }

        return answer;
    }
}
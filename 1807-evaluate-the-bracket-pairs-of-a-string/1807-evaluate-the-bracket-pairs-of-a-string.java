class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        HashMap<String, String> map = new HashMap<>();
        int len = knowledge.size();
        for(int i = 0; i < len; i++) {
            map.put(knowledge.get(i).get(0), knowledge.get(i).get(1));
        }

        len = s.length();
        StringBuilder sb = new StringBuilder();
        StringBuilder temp = new StringBuilder();
        boolean left = false;
        for(int i = 0; i < len; i++) {
            char cur = s.charAt(i);
            if(cur == '(') {
                left = true;
                temp.setLength(0);
            }
            else if(cur == ')') {
                left = false;

                if(map.containsKey(temp.toString())) {
                    sb.append(map.get(temp.toString()));
                }
                else {
                    sb.append("?");
                }
            }
            else if(!left){
                sb.append(cur);
            }
            else {
                temp.append(cur);
            }
        }

        return sb.toString();
    }
}
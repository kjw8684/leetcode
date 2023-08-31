class Solution {
    public String reorganizeString(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int check = 0;
        StringBuffer Answer = new StringBuffer();
        for(int i = 97; i < 123; i++){
            map.put((char)i,0);
        }
        for(int i = 0; i < s.length(); i++){
            map.put(s.charAt(i), (int)map.get(s.charAt(i))+1);
            check++;
        }
        if(check != 0){
            int max = 0;
            char maxchar = 'A';
            for(int i = 97; i < 123; i++){
                if((int)map.get((char)i) > max){
                    max = (int)map.get((char)i);
                    maxchar = (char)i;
                }
            }
            for(int i = 0; i < max; i++){
                Answer.append(maxchar);
                map.put(maxchar, (int)map.get(maxchar)-1);
            }
            check -= max;
        }
        int dupindex = 0;
        while(check != 0){
            for(int i = 97; i < 123; i++){
                if((int)map.get((char)i) != 0){
                    for(int j = 1; j < Answer.length(); j++){
                        if(Answer.charAt(j - 1) == Answer.charAt(j)){
                            dupindex = j;
                            break;
                        }
                        if(j == Answer.length() - 1){
                            for(int k = 1; k < Answer.length(); k++){
                                if(Answer.charAt(k - 1) != (char)i && (char)i != Answer.charAt(k)){
                                    dupindex = k;
                                    break;
                                }
                                if(k == Answer.length() - 1){
                                    if((char)i != Answer.charAt(k)){
                                        dupindex = k + 1;
                                    }
                                }
                            }
                        }
                    }
                    Answer.insert(dupindex, (char)i);
                    map.put((char)i, (int)map.get((char)i)-1);
                    check--;
                }
            }
        }
        for(int i = 0; i < Answer.length() - 1; i++){
            if(Answer.charAt(i) == Answer.charAt(i + 1)){
                return "";
            }
        }
        return Answer.toString();
    }
}
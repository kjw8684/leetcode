class Solution {
    public int romanToInt(String s) {
        int answer = 0;
        for(int i = 0; i < s.length() - 1; i++){
            if(Transform(s.charAt(i)) < Transform(s.charAt(i + 1))){
                answer -= Transform(s.charAt(i));
            }
            else{answer += Transform(s.charAt(i));}
        }
        return answer + Transform(s.charAt(s.length()- 1));
    }
    public int Transform(char s){
        switch(s) {
            case 'M': return 1000;
            case 'D': return 500;
            case 'C': return 100;
            case 'L': return 50;
            case 'X': return 10;
            case 'V': return 5;
            default: return 1;
         }
    }
}
class Solution {
    public String convertToTitle(int columnNumber) {
        //이 26진수에는 0이라는 개념이 없음으로 자릿수를 넘어갈때 1을 빼주어 0을 없앤다
        String Answer = "";
        while(true){
            if(columnNumber > 26){
                columnNumber--;
                Answer = (char)('A' + columnNumber % 26) + Answer;
                columnNumber /= 26;
            }else{
                columnNumber--;
                Answer = (char)('A' + columnNumber % 26) + Answer;
                break;
            }
        }
        return Answer;
    }
}
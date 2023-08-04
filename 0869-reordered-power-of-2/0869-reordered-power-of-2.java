class Solution {
    public static int countChar(String str, char ch) {
        return str.length() - str.replace(String.valueOf(ch), "").length();
    }
    
    public boolean reorderedPowerOf2(int n) {
        int temp = 1;
        String stemp = "";
        String num = Integer.toString(n);
        List<Integer> Po2 = new ArrayList<>();
        while(true){
            if(Integer.toString(temp).length() == num.length())
                Po2.add(temp);
            temp *= 2;
            if(Integer.toString(temp).length() > num.length())
                break;
        }

        for(int num2:Po2){
            stemp = Integer.toString(num2);
            for(int i = 0; i < num.length(); i++){
                if(countChar(stemp, num.charAt(i)) != countChar(num, num.charAt(i)))
                    break;
                if(i + 1 == num.length())
                    return true;
            }
        }
        return false;
    }
}
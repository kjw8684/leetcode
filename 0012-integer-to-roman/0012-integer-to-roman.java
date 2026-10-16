class Solution {
    public String intToRoman(int num) {
        int index = 0;
        StringBuilder sb = new StringBuilder();

        while(num != 0) {
            int cur = num % 10;
            if(index == 0) {
                if(cur == 4) {
                    sb.insert(0, "IV");
                }
                else if(cur == 9) {
                    sb.insert(0, "IX");
                }
                else {
                    sb.insert(0, "I".repeat(cur % 5));
                    if(cur >= 5) {
                        sb.insert(0, "V");
                    }
                }
            }
            else if(index == 1) {
                if(cur == 4) {
                    sb.insert(0, "XL");
                }
                else if(cur == 9) {
                    sb.insert(0, "XC");
                }
                else {
                    sb.insert(0, "X".repeat(cur % 5));
                    if(cur >= 5) {
                        sb.insert(0, "L");
                    }
                }
            }
            else if(index == 2) {
                if(cur == 4) {
                    sb.insert(0, "CD");
                }
                else if(cur == 9) {
                    sb.insert(0, "CM");
                }
                else {
                    sb.insert(0, "C".repeat(cur % 5));
                    if(cur >= 5) {
                        sb.insert(0, "D");
                    }
                }
            }
            else {
                sb.insert(0, "M".repeat(num));
            }

            num /= 10;
            index++;
        }

        return sb.toString();
    }
}
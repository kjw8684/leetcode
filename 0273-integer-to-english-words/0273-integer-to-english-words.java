class Solution {
    public String numberToWords(int num) {
        StringBuilder sb = new StringBuilder();
        String[] oneToNine = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        String[] tens = {"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
        String[] tenTimes = {"Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
        String[] step = {"", "Thousand", "Million", "Billion"};
        int temp = 0, count = 2, st = 1;
        if(num == 0) {
            return "Zero";
        }
        else {
            temp = num % 10;
            num /= 10;
        }

        while(num != 0) {
            if(count == 1) {
                if(num % 1000 != 0) {
                    sb.insert(0, step[st] + " ");
                    temp = num % 10;
                }
                else {
                    num /= 100;
                    count = 0;
                }
                st++;
            }
            else if(count == 2) {
                if(num % 10 == 0) {
                    if(temp != 0) {
                        sb.insert(0, oneToNine[temp - 1] + " ");
                    }
                }
                else if(num % 10 == 1) {
                    sb.insert(0, tens[temp] + " ");
                }
                else if(temp == 0){
                    sb.insert(0, tenTimes[(num % 10) - 2] + " ");
                }
                else {
                    sb.insert(0, tenTimes[(num % 10) - 2] + " " + oneToNine[temp - 1] + " ");
                }
            }
            else {
                if(num % 10 != 0) {
                    sb.insert(0, oneToNine[(num % 10) - 1] + " Hundred ");
                }
                count = 0;
            }

            num /= 10;
            count++;
        }

        if(count == 2) {
            sb.insert(0, oneToNine[temp - 1] + " ");
        }
        sb.deleteCharAt(sb.length() - 1);

        return sb.toString();
    }
}
class Solution {
    public boolean lemonadeChange(int[] bills) {
        int change5 = 0, change10 = 0, len = bills.length;

        for(int i = 0; i < len; i++) {
            switch (bills[i]) {
                case 5:
                    change5++;
                    break;
                case 10:
                    if(change5 == 0) {
                        return false;
                    }
                    change5--;
                    change10++;
                    break;
                default:
                    if(change10 >= 1 && change5 >= 1) {
                        change5--;
                        change10--;
                        break;
                    }
                    else if(change5 >= 3) {
                        change5 -= 3;
                        break;
                    }
                    else {
                        return false;
                    }
            }
        }

        return true;
    }
}
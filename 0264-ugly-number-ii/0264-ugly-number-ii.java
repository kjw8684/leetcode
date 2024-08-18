class Solution {
    public int nthUglyNumber(int n) {
        if(n == 1) {
            return 1;
        }
        List<Long> list = new ArrayList<>();
        list.add(1L);
        int two = 0, three = 0, five = 0;

        while(true) {
            while(true) {
                if(list.get(two) * 2 == list.get(three) * 3 || list.get(three) * 3 == list.get(five) * 5) {
                    three++;
                }
                else if(list.get(two) * 2 == list.get(five) * 5) {
                    five++;
                }
                else {
                    break;
                }
            }
            if(list.get(two) * 2 < list.get(three) * 3 && list.get(two) * 2 < list.get(five) * 5) {
                list.add(list.get(two) * 2);
                two++; 
            }
            else if(list.get(three) * 3 < list.get(two) * 2 && list.get(three) * 3 < list.get(five) * 5) {
                list.add(list.get(three) * 3);
                three++;
            }
            else {
                list.add(list.get(five) * 5);
                five++;
            }
            n--;
            if(n == 1) {
                return list.get(list.size() - 1).intValue();
            }
        }
    }
}
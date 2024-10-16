class Solution {
    public String longestDiverseString(int a, int b, int c) {
        StringBuilder sb = new StringBuilder();
        int count = 0, bariation = 0, current;
        int[] value = new int[3];
        value[0] = a;
        value[1] = b;
        value[2] = c;

        while(value[0] != 0 || value[1] != 0 || value[2] != 0) {
            if(count != 2) {
                current = add(value, sb);
                if(current == bariation) {
                    count++;
                }
                else {
                    bariation = current;
                    count = 1;
                }
            }
            else {
                bariation = add_with_out(value, bariation, sb);
                count = 1;
            }

            if(bariation == -1) {
                break;
            }
        }

        return sb.toString();
    }

    int add(int[] value, StringBuilder sb) {
        int max = 0, index = 0;

        for(int i = 0; i < 3; i++) {
            if(max < value[i]) {
                index = i;
                max = value[i];
            }
        }

        if(index == 0) {
            sb.append("a");
            value[0]--;
        }
        else if(index == 1) {
            sb.append("b");
            value[1]--;
        }
        else {
            sb.append("c");
            value[2]--;
        }

        return index;
    }

    int add_with_out(int[] value, int bariation, StringBuilder sb) {
        int max = 0, index = 0;

        for(int i = 0; i < 3; i++) {
            if(i == bariation) {
                continue;
            }
            if(max < value[i]) {
                index = i;
                max = value[i];
            }
        }

        if(max == 0) {
            return -1;
        }

        if(index == 0) {
            sb.append("a");
            value[0]--;
        }
        else if(index == 1) {
            sb.append("b");
            value[1]--;
        }
        else {
            sb.append("c");
            value[2]--;
        }

        return index;
    }
}
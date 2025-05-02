class Solution {
    public String pushDominoes(String dominoes) {
        int len = dominoes.length();
        int[] force = new int[len];
        if(dominoes.charAt(0) == 'R') {
            force[0] = 1;
        }

        for(int i = 1; i < len; i++) {
            if(dominoes.charAt(i) == 'R') {
                force[i] = 1;
            }

            if(dominoes.charAt(i) != 'L' && force[i] == 0 && force[i - 1] > 0) {
                force[i] = force[i - 1] + 1;
            }
        }

        if(dominoes.charAt(len - 1) == 'L') {
            force[len - 1] = -1;
        }

        for(int i = len - 2; i >= 0; i--) {
            if(dominoes.charAt(i) == 'L') {
                force[i] = -1;
            }

            if(force[i] != -1 && force[i + 1] < 0) {
                int before = Math.abs(force[i + 1] - 1);

                if(force[i] == 0) {
                    force[i] = force[i + 1] - 1;
                }
                else if(before == force[i]) {
                    force[i] = 0;
                }
                else if(before < force[i]) {
                    force[i] = force[i + 1] - 1;
                }
            }
        }

        if(force[len - 1] > 0) {
            int index = -1;

            for(int i = len - 1; i >= 0; i--) {
                if(force[i] == 1) {
                    break;
                }
                else if(force[i] < 0) {
                    index = i + 1;
                    break;
                }
            }

            if(index != -1) {
                for(int i = index; i < len; i++) {
                    force[i] = 0;
                }
            }
        }

        StringBuilder sb = new StringBuilder();

        for(int power : force) {
            if(power > 0) {
                sb.append("R");
            }
            else if(power < 0) {
                sb.append("L");
            }
            else {
                sb.append(".");
            }
        }

        return sb.toString();
    }
}
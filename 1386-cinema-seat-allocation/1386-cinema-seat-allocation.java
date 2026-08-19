class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        int assigned = 2 * n;
        int[] before = new int[2];
        boolean[] cur = new boolean[11];
        Arrays.sort(reservedSeats, (a, b) -> {
            if (a[0] == b[0]) {
                return Integer.compare(a[1], b[1]);
            }
            return Integer.compare(a[0], b[0]);
        });

        for(int[] reservedSeat : reservedSeats ) {
            if(reservedSeat[0] == before[0]) {
                cur[reservedSeat[1]] = true;
            }
            else {
                boolean left = true, middle = true, right = true;
                if(cur[2] || cur[3] || cur[4] || cur[5]) {
                    left = false;
                }
                if(cur[4] || cur[5] || cur[6] || cur[7]) {
                    middle = false;
                }
                if(cur[6] || cur[7] || cur[8] || cur[9]) {
                    right = false;
                }

                if(!left && !middle && !right) {
                    assigned -= 2;
                }
                else if(((!left && !right) && middle) || (left && !right) || (!left && right)) {
                    assigned--;
                }

                clear(cur);
                cur[reservedSeat[1]] = true;
            }

            before[0] = reservedSeat[0];
        }

        boolean left = true, middle = true, right = true;
        if(cur[2] || cur[3] || cur[4] || cur[5]) {
            left = false;
        }
        if(cur[4] || cur[5] || cur[6] || cur[7]) {
            middle = false;
        }
        if(cur[6] || cur[7] || cur[8] || cur[9]) {
            right = false;
        }

        if(!left && !middle && !right) {
            assigned -= 2;
        }
        else if(((!left && !right) && middle) || (left && !right) || (!left && right)) {
            assigned--;
        }

        return assigned;
    }

    private void clear(boolean[] cur) {
        for(int i = 1; i < 11; i++) {
            cur[i] = false;
        }
    }
}
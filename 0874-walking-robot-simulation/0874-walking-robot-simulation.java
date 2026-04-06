class Solution {
    public int robotSim(int[] commands, int[][] obstacles) {
        int x = 0, y = 0, len = obstacles.length, direction = 0, max = 0;
        Set<String> set = new HashSet<>();

        for(int i = 0; i < len; i++) {
            set.add(obstacles[i][0] + " "+ obstacles[i][1]);
        }
        len = commands.length;

        for(int i = 0; i < len; i++) {
            if(commands[i] == -1) {
                direction = (direction + 1) % 4;
            }
            else if(commands[i] == -2) {
                direction = (direction + 3) % 4;
            }
            else {
                for(int j = 0; j < commands[i]; j++) {
                    if(direction % 4 == 0 && !set.contains(x + " " + (y + 1))) {
                        y++;
                    }
                    else if(direction % 4 == 1 && !set.contains((x + 1) + " " + y)) {
                        x++;
                    }
                    else if(direction % 4 == 2 && !set.contains(x + " " + (y - 1))) {
                        y--;
                    }
                    else if(direction % 4 == 3 && !set.contains((x - 1) + " " + y)) {
                        x--;
                    }

                    max = Math.max(max, x * x + y * y);
                }
            }
        }

        return max;
    }
}
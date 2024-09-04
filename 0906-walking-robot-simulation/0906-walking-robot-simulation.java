public class Rock {
    int x;
    int y;

    public Rock(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Rock cur = (Rock) obj;
        return x == cur.x && y == cur.y;
    }

    public int hashCode() {
        return Objects.hash(x, y);
    }
}

class Solution {
    public int robotSim(int[] commands, int[][] obstacles) {
        int direction = 0, len = commands.length, max = 0;
        int[] current = new int[]{0, 0};
        Set<Rock> set = new HashSet<>();

        for(int[] cur : obstacles) {
            set.add(new Rock(cur[0], cur[1]));
        }

        for(int i = 0; i < len; i++) {
            if(commands[i] == -1) {
                direction++;
                direction %= 4;
            }
            else if(commands[i] == -2) {
                direction--;
                if(direction < 0) {
                    direction = 3;
                }
            }
            else {
                move(direction, set, commands[i], current);
                max = Math.max(max, current[0] * current[0] + current[1] * current[1]);
            }
        }

        return max;
    }

    public void move(int direction, Set<Rock> set, int moving, int[] current) {
        if(direction == 0) {
            for(int i = 0; i < moving; i++) {
                current[1]++;
                if(set.contains(new Rock(current[0], current[1]))) {
                    current[1]--;
                    break;
                }
            }
        }
        else if(direction == 1) {
            for(int i = 0; i < moving; i++) {
                current[0]++;
                if(set.contains(new Rock(current[0], current[1]))) {
                    current[0]--;
                    break;
                }
            }
        }
        else if(direction == 2) {
            for(int i = 0; i < moving; i++) {
                current[1]--;
                if(set.contains(new Rock(current[0], current[1]))) {
                    current[1]++;
                    break;
                }
            }
        }
        else if(direction == 3) {
            for(int i = 0; i < moving; i++) {
                current[0]--;
                if(set.contains(new Rock(current[0], current[1]))) {
                    current[0]++;
                    break;
                }
            }
        }
    }
}
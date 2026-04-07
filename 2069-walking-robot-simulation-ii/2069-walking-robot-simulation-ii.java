class Robot {
    int WIDTH, HEIGHT;
    int[] pos = new int[2];
    int dir = 0;
    boolean start = false;

    public Robot(int width, int height) {
        WIDTH = width - 1;
        HEIGHT = height - 1;
    }
    
    public void step(int num) {
        if(!start) {
            dir += 3;
            start = true;
        }
        
        num %= (WIDTH + HEIGHT) * 2;
        while(num != 0) {
            if(dir % 4 == 0) {
                if(num + pos[0] > WIDTH) {
                    dir++;
                    num -= WIDTH - pos[0];
                    pos[0] = WIDTH;
                }
                else {
                    pos[0] += num;
                    num = 0;
                }
            }
            else if(dir % 4 == 1) {
                if(num + pos[1] > HEIGHT) {
                    dir++;
                    num -= HEIGHT - pos[1];
                    pos[1] = HEIGHT;
                }
                else {
                    pos[1] += num;
                    num = 0;
                }
            }
            else if(dir % 4 == 2) {
                if(num - pos[0] > 0) {
                    dir++;
                    num -= pos[0];
                    pos[0] = 0;
                }
                else {
                    pos[0] -= num;
                    num = 0;
                }
            }
            else {
                if(num - pos[1] > 0) {
                    dir++;
                    num -= pos[1];
                    pos[1] = 0;
                }
                else {
                    pos[1] -= num;
                    num = 0;
                }
            }
        }
    }
    
    public int[] getPos() {
        return pos;
    }
    
    public String getDir() {
        if(dir % 4 == 0) {
            return "East";
        }
        else if(dir % 4 == 1) {
            return "North";
        }
        else if(dir % 4 == 2) {
            return "West";
        }
        else {
            return "South";
        }
    }
}

/**
 * Your Robot object will be instantiated and called as such:
 * Robot obj = new Robot(width, height);
 * obj.step(num);
 * int[] param_2 = obj.getPos();
 * String param_3 = obj.getDir();
 */
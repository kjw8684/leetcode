class Solution {
    int COL = 0, ROW = 0;
    public int latestDayToCross(int row, int col, int[][] cells) {
        ROW = row;
        COL = col;
        int len = cells.length;
        boolean pass = false;
        int[][] map = new int[row][col];

        for(int i = len - 1; i >= 0; i--) {
            if(cells[i][0] == 1) {
                map[cells[i][0] - 1][cells[i][1] - 1] = 2;
                pass = check(map, cells[i][0] - 1, cells[i][1] - 1, 2);
            }
            else if(cells[i][0] == row) {
                map[cells[i][0] - 1][cells[i][1] - 1] = 3;
                pass = check(map, cells[i][0] - 1, cells[i][1] - 1, 3);
            }
            else {
                int cur = adjacent(map, cells[i][0] - 1, cells[i][1] - 1);
                map[cells[i][0] - 1][cells[i][1] - 1] = cur;
                if(cur > 1) {
                    pass = check(map, cells[i][0] - 1, cells[i][1] - 1, cur);
                }
            }

            if(pass) {
                return i;
            }
        }

        return 0;
    }

    public int adjacent(int[][] map, int row, int col) {
        if(map[row - 1][col] > 1) {
            return map[row - 1][col];
        }
        if(map[row + 1][col] > 1) {
            return map[row + 1][col];
        }
        if(col != 0 && map[row][col - 1] > 1) {
            return map[row][col - 1];
        }
        if(col != COL - 1 && map[row][col + 1] > 1) {
            return map[row][col + 1];
        }

        return 1;
    }

    public boolean check(int[][] map, int row, int col, int val) {
        if(row != 0) {
            if(map[row - 1][col] > 1 && map[row - 1][col] != val) {
                return true;
            }
            if(map[row - 1][col] == 1) {
                map[row - 1][col] = val;
                if(check(map, row - 1, col, val)) {
                    return true;
                }
            } 
        }
        if(row != ROW - 1) {
            if(map[row + 1][col] > 1 && map[row + 1][col] != val) {
                return true;
            }
            if(map[row + 1][col] == 1) {
                map[row + 1][col] = val;
                if(check(map, row + 1, col, val)) {
                    return true;
                }
            } 
        }
        if(col != 0) {
            if(map[row][col - 1] > 1 && map[row][col - 1] != val) {
                return true;
            }
            if(map[row][col - 1] == 1) {
                map[row][col - 1] = val;
                if(check(map, row, col - 1, val)) {
                    return true;
                }
            } 
        }
        if(col != COL - 1) {
            if(map[row][col + 1] > 1 && map[row][col + 1] != val) {
                return true;
            }
            if(map[row][col + 1] == 1) {
                map[row][col + 1] = val;
                if(check(map, row, col + 1, val)) {
                    return true;
                }
            } 
        }

        return false;
    }
}
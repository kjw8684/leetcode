class Spreadsheet {
    Map<String, Integer> map;

    public Spreadsheet(int rows) {
        map = new HashMap<>();
    }
    
    public void setCell(String cell, int value) {
        map.put(cell, value);
    }
    
    public void resetCell(String cell) {
        map.put(cell, 0);
    }
    
    public int getValue(String formula) {
        formula = formula.substring(1);
        String[] split = formula.split("\\+");
        int[] value = new int[2];

        if(Character.isDigit(split[0].charAt(0))) {
            value[0] = Integer.valueOf(split[0]);
        }
        else {
            value[0] = map.getOrDefault(split[0], 0);
        }

        if(Character.isDigit(split[1].charAt(0))) {
            value[1] = Integer.valueOf(split[1]);
        }
        else {
            value[1] = map.getOrDefault(split[1], 0);
        }

        return value[0] + value[1];
    }
}

/**
 * Your Spreadsheet object will be instantiated and called as such:
 * Spreadsheet obj = new Spreadsheet(rows);
 * obj.setCell(cell,value);
 * obj.resetCell(cell);
 * int param_3 = obj.getValue(formula);
 */
class Solution {
    List<Integer> result = new ArrayList<>();
    public boolean scuba(String intr, int i, int k, int Depht, int CDepht){
        if(CDepht == Depht){
            result.add(Integer.parseInt(intr));
            return true;
        }
        if(i - k > -1){
            intr += Integer.toString(i - k);
            scuba(intr, i - k, k, Depht, CDepht + 1);
            intr = intr.substring(0, intr.length() - 1);
        }
        if(i + k < 10 && k != 0){
            intr += Integer.toString(i + k);
            scuba(intr, i + k, k, Depht, CDepht + 1);
        }
        return false;
    }
    
    public int[] numsSameConsecDiff(int n, int k) {
        String intr;
        for(int i = 1; i < 10; i++){
            intr = Integer.toString(i);
            if(i - k > -1){
                intr += Integer.toString(i - k);
                scuba(intr, i - k, k, n, 2);
                intr = intr.substring(0, intr.length() - 1);
            }
            if(i + k < 10 && k != 0){
                intr += Integer.toString(i + k);
                scuba(intr, i + k, k, n, 2);
            }
        }
        int[] Lresult = new int[result.size()];
        int size = 0;
        for(int temp : result){
            Lresult[size++] = temp;
        }
        return Lresult;
    }
}
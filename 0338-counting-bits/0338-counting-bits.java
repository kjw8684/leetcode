class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n + 1];
        ans[0] = 0;
        for(int i = 1; i < n + 1; i++){
            ans[i] = Counting(Integer.toBinaryString(i));
        }
        return ans;
    }
    public int Counting(String num){
        int count = 0;
        for(int i = 0; i < num.length(); i++){
            if(num.charAt(i) == '1'){
                count++;
            }
        }
        return count;
    }
}
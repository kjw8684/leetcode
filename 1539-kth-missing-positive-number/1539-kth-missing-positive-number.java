class Solution {
    public int findKthPositive(int[] arr, int k) {
        HashSet hashset = new HashSet<>();
        for (int i=0; i<arr.length; i++){
            hashset.add(arr[i]);
        }
        int j=1;
        while(k>0){
            if(hashset.contains(j)){
                j++;
            }else{
                k--;
                j++;
            }
        }
        return --j;
    }
}
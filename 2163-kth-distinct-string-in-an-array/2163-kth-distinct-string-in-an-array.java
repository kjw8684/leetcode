class Solution {
    public String kthDistinct(String[] arr, int k) {
        int len = arr.length;
        List<String> dup = new ArrayList<>();
        List<String> uni = new ArrayList<>();

        for(int i = 0; i < len; i++) {
            if(dup.contains(arr[i])) {
                uni.remove(arr[i]);
                continue;
            }
            dup.add(arr[i]);
            uni.add(arr[i]);
        }

        if(uni.size() < k) {
            return "";
        }

        return uni.get(k - 1);
    }
}
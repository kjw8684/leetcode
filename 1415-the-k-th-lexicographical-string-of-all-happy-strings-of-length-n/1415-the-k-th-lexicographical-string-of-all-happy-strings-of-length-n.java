class Solution {
    List<String> list = new ArrayList<>();
    public String getHappyString(int n, int k) {
        if(k > 3 * Math.pow(2, n - 1)) {
            return "";
        }
        make(n, 'd', "");
        Collections.sort(list);

        return list.get(k - 1);
    }

    public void make(int n, char before, String cur) {
        if(n == 0) {
            list.add(cur);
            return;
        }

        if(before != 'a') {
            make(n - 1, 'a', cur + "a");
        }
        if(before != 'b') {
            make(n - 1, 'b', cur + "b");
        }
        if(before != 'c') {
            make(n - 1, 'c', cur + "c");
        }

        return;
    }
}
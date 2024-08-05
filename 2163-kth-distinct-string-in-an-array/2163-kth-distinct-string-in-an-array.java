class Solution {
    public String kthDistinct(String[] arr, int k) {
        int len = arr.length;
        List<String> dup = new ArrayList<>();
        Queue<String> queue = new LinkedList<>();

        for(int i = 0; i < len; i++) {
            if(queue.contains(arr[i])) {
                dup.add(arr[i]);
            }
            else {
                queue.offer(arr[i]);
            }
        }

        while(!queue.isEmpty()) {
            if(!dup.contains(queue.peek())) {
                if(k == 1) {
                    return queue.poll();
                }
                k--;
            }
            queue.poll();
        }

        return "";
    }
}
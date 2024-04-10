class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        int len = deck.length - 1;
        int[] answer = new int[len + 1];
        Queue<Integer> queue = new LinkedList<>();
        Arrays.sort(deck);
        
        for(int i = len; i >= 0; i--) {
            if(!queue.isEmpty()) {
                queue.offer(queue.remove());
            }
            queue.offer(deck[i]);
        }
        
        for(int i = len; i >= 0; i--) {
            answer[i] = queue.remove();
        }

        return answer;
    }
}
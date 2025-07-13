class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);

        int pindex = 0, tindex = 0, plen = players.length, tlen = trainers.length, count = 0;

        while(pindex < plen && tindex < tlen) {
            if(players[pindex] <= trainers[tindex]) {
                pindex++;
                count++;
            }
            tindex++;
        }

        return count;
    }
}
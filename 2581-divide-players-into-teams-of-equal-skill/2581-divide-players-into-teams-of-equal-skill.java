class Solution {
    public long dividePlayers(int[] skill) {
        int len = skill.length, team = 0, flen = len / 2;
        long sum = 0;
        Arrays.sort(skill);
        team = skill[0] + skill[len - 1];
        sum += skill[0] * skill[len - 1];

        for(int i = 1; i < flen; i++) {
            if(team != skill[i] + skill[len - i - 1]) {
                team = -1;
                break;
            }

            sum += skill[i] * skill[len - i - 1];
        }

        if(team == -1) {
            return -1;
        }
        return sum;
    }
}
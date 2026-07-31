class Solution:
    def minimumPushes(self, word: str) -> int:
        alpha = [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]

        for cur in word:
            alpha[ord(cur) - ord('a')] += 1

        alpha.sort()
        answer = 0
        count = 1

        for i in range(25, -1, -1):
            answer += alpha[i] * count
            if i % 8 == 2 :
                count += 1

        return answer
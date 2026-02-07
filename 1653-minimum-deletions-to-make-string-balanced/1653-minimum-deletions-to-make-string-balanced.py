class Solution:
    def minimumDeletions(self, s: str) -> int:
        length = len(s)
        acount = 0
        bcount = 0
        answer = 0
        start = 0

        while start < length :
            if s[start] == 'b' :
                break
            start += 1
        
        for i in range(start, length) :
            if (i > 0) & (s[i] == 'b') & (s[i - 1] == 'a'):
                if bcount < acount:
                    answer += bcount
                    bcount = 0
                    acount = 0
            if s[i] == 'b':
                bcount += 1
            else :
                acount += 1

        if bcount < acount:
            answer += bcount
        else :
            answer += acount
        
        return answer
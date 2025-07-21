class Solution:
    def makeFancyString(self, s: str) -> str:
        answer = ""
        count = 1
        before = '0'
        for i in s:
            if i == before :
                count += 1
            else :
                count = 1
                before = i
            
            if count <= 2 :
                answer += i

        return answer
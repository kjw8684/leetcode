class Solution:
    def removeSubfolders(self, folder: List[str]) -> List[str]:
        folder.sort()
        root = []
        answer = []

        for f in folder:
            cheak = True
            for r in root:
                if r in '\\' + f:
                    cheak = False
                    break
            if cheak == True:
                root.append('\\' + f + '/')
                answer.append(f)

        return answer
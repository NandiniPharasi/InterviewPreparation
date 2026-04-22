class Solution:
    def twoEditWords(self, queries: List[str], dictionary: List[str]) -> List[str]:
        res =[]
        for q in queries:
            for d in dictionary:
                if self.isValid(q,d):
                    res.append(q)
                    break
        return res
    

    def isValid(self, s, d):
        k=0
        for i in range(len(s)):
            if(s[i]!=d[i]):
                k+=1
                if(k>2):
                    return False
        return True

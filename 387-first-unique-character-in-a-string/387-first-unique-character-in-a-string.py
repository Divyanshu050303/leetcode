class Solution:
    def firstUniqChar(self, s: str) -> int:
        c=0
        for i in s:
            if(s.count(i)==1):
                return c
            c+=1
        return -1
        
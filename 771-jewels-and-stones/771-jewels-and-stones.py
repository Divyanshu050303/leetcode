class Solution:
    def numJewelsInStones(self, jewels: str, stones: str) -> int:
        su=0
        for i in jewels:
            su+=stones.count(i);
        return su;
        
class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        n=set(nums)
        count=0
        d={}
        for i in n:
            time=nums.count(i)
            d.update({i:time})   
        Keymax = max(d, key= lambda x: d[x])
        return Keymax
        
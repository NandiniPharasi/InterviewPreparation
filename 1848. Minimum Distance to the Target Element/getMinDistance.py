class Solution:
    def getMinDistance(self, nums: List[int], target: int, start: int) -> int:
        minAbs=float('inf')
        for i in range(len(nums)):
            if(nums[i]==target):
               minAbs= min(minAbs, abs(i-start))

        return minAbs

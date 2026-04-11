
class Solution:
    def minimumDistance(self, nums: list[int]) -> int:
        n = len(nums)
        if n <= 2:
            return -1
        ans = float('inf')
        for i in range(n):
            for j in range(i+1, n):
                if nums[i] == nums[j]:
                    for k in range(j+1, n):
                        if nums[j] == nums[k]:
                            ans = min(ans, 2*(k-i))
                            '''
                            Hint 1
The distance formula abs(i - j) + abs(j - k) + abs(k - i) simplifies to 2 * (max(i, j, k) - min(i, j, k)).
Hint 2
Group the indices for each unique number. For a number to form a good tuple, it must appear at least 3 times.
Hint 3
For each number that appears at least 3 times, we want to find three of its indices p < q < r that minimize r - p. This is achieved by considering every three consecutive indices in the sorted list of indices.
                            '''
        return -1 if ans == float('inf') else ans

examples
Example 1:

Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
Output: [[1,6],[8,10],[15,18]]
Explanation: Since intervals [1,3] and [2,6] overlap, merge them into [1,6].

Example 2:

Input: intervals = [[1,4],[4,5]]
Output: [[1,5]]
Explanation: Intervals [1,4] and [4,5] are considered overlapping.

Steps:

Sort → [[1,3],[2,6],[8,10],[15,18]]

Start = 1, End = 3

Compare [2,6] → overlaps → End = 6

Compare [8,10] → no overlap → add [1,6], reset Start=8, End=10

Compare [15,18] → no overlap → add [8,10], reset Start=15, End=18

Add last → [15,18]


Example 1:

Input: s = "00110011"
Output: 6
Explanation: There are 6 substrings that have equal number of consecutive 1's and 0's: "0011", "01", "1100", "10", "0011", and "01".
Notice that some of these substrings repeat and are counted the number of times they occur.
Also, "00110011" is not a valid substring because all the 0's (and 1's) are not grouped together.
Example 2:

Input: s = "10101"
Output: 4
Explanation: There are 4 substrings: "10", "01", "10", "01" that have equal number of consecutive 1's and 0's.

 Example 1:
s = "00110011"
Analysis:

Blocks: [2, 2, 2, 2] (two zeros, two ones, two zeros, two ones)
Adjacent pairs: min(2,2) + min(2,2) + min(2,2) = 2 + 2 + 2 = 6
Valid substrings: "0011", "01", "1100", "10", "0011", "01"
Answer: 6
💠 Example 2:
s = "10101"
Analysis:

Blocks: [1, 1, 1, 1, 1] (alternating ones and zeros)
Adjacent pairs: min(1,1) + min(1,1) + min(1,1) + min(1,1) = 1 + 1 + 1 + 1 = 4
Valid substrings: "10", "01", "10", "01"
Answer: 4
💠 Example 3:
s = "00100"
Analysis:

Blocks: [2, 1, 2] (two zeros, one one, two zeros)
Adjacent pairs: min(2,1) + min(1,2) = 1 + 1 = 2
Valid substrings: "01", "10"

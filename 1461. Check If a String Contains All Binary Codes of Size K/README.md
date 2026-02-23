1461. Check If a String Contains All Binary Codes of Size K
Approach
Use a sliding window of size k.
Traverse the string:
Whenever the window size becomes k, extract the substring.
Insert it into a HashSet to keep only unique patterns.
Slide the window forward by moving the left pointer.
After traversal:
Compute total possible codes = 2^k.
If the set size equals 2^k, return true; otherwise false.

1463. Example 1:

Input: s = "00110110", k = 2
Output: true
Explanation: The binary codes of length 2 are "00", "01", "10" and "11". They can be all found as substrings at indices 0, 1, 3 and 2 respectively.

Example 2:

Input: s = "0110", k = 1
Output: true
Explanation: The binary codes of length 1 are "0" and "1", it is clear that both exist as a substring. 

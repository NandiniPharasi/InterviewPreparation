Approach
Condition 1: (n & (n >> 1)) == 0
This ensures there are no two adjacent 1s.

If two adjacent bits are both 1, AND will produce a non-zero value.

If alternating, AND will always be 0.

Condition 2: (n | (n >> 2)) == n
This ensures there are no two adjacent 0s breaking the alternating pattern.

OR fills gaps between alternating bits.

If pattern is correct, result remains same as original number.

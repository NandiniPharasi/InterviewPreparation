APPROACHH


For each number from 1 to n, you convert it to binary (Integer.toBinaryString(i)).

Append it to a growing string (sb).

Example for n = 3:

1 → "1"

2 → "10"

3 → "11"

Concatenated string = "11011"

For each character in the binary string:

Multiply res by 2 (like shifting left in binary).

Add the current bit (curr).

Take modulo 
10
9
+
7
 to keep the number within bounds.
-------------------
Example 1:

Input: n = 1
Output: 1
Explanation: "1" in binary corresponds to the decimal value 1. 
Example 2:

Input: n = 3
Output: 27
Explanation: In binary, 1, 2, and 3 corresponds to "1", "10", and "11".
After concatenating them, we have "11011", which corresponds to the decimal value 27.
Example 3:

Input: n = 12
Output: 505379714
Explanation: The concatenation results in "1101110010111011110001001101010111100".
The decimal value of that is 118505380540.
After modulo 109 + 7, the result is 505379714.

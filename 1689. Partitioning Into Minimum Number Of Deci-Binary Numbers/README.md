A decimal number is called deci-binary if each of its digits is either 0 or 1 without any leading zeros. For example, 101 and 1100 are deci-binary, while 112 and 3001 are not.

Intuition
A deci-binary number contains only digits 0 or 1.
We are given a decimal number n, and we must split it into the minimum number of deci-binary numbers whose sum equals n.
Approach
Traverse the string.
Track the maximum digit.
Return that digit.

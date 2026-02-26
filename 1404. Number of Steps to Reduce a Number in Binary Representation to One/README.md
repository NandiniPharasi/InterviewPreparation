**Example 1:

Input: s = "1101"
Output: 6
Explanation: "1101" corressponds to number 13 in their decimal representation.
Step 1) 13 is odd, add 1 and obtain 14. 
Step 2) 14 is even, divide by 2 and obtain 7.
Step 3) 7 is odd, add 1 and obtain 8.
Step 4) 8 is even, divide by 2 and obtain 4.  
Step 5) 4 is even, divide by 2 and obtain 2. 
Step 6) 2 is even, divide by 2 and obtain 1.  
Example 2:

Input: s = "10"
Output: 1
Explanation: "10" corresponds to number 2 in their decimal representation.
Step 1) 2 is even, divide by 2 and obtain 1.  **

TRIED THIS, runtime error on s =
"1111011110000011100000110001011011110010111001010111110001" can't take large input value
class Solution {
    public int numSteps(String s) {
        int n = Integer.parseInt(s, 2);
        int count=0;
        while (n!=1){
            if(n%2==0){
                n=n/2;
                count++;
            } else{
                n+=1;
                count++;
            }
        }
        return count;
    }
}

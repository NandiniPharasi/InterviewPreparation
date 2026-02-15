Intuition
We have two strings, a and b, that look like ordinary text but actually represent numbers in binary — you know, the language of computers made of 0s and 1s. Our job is to add them together, just like you'd add decimal numbers on paper, and then give back the result also as a binary string.

Approach
class Solution {
public String addBinary(String a, String b) {
//0+0=0
//0+1= 1
//1+0 =1
//1+1=10

i and j are pointers that move from the last character of each string towards the front (like your finger pointing at the current digit).

    int i=a.length()-1;
    int j=b.length()-1;
carry holds any extra value that overflows from a column
int carry=0;

    StringBuilder sb= new StringBuilder();
   
What's happening here:

The loop condition is generous: it runs while either string still has digits we haven't processed, or there's a leftover carry (like when you have a final carry after the last digit). This covers all cases, even when one string is shorter.

sum is the total for the current column: carry from before plus the digit from a (if any) plus the digit from b (if any).
a.charAt(i--) - '0' is a neat trick to turn the character '0' or '1' into its numeric value 0 or 1. The i-- means we use the current i and then move it one step left for the next iteration.

 while (i >=0 || j>=0 || carry ==1){
     int sum=carry;
     if (i >=0){
         sum+= a.charAt(i)-'0'; //ASCII number (48-49 // 48-48)
        
         i--;
     }
     if (j >=0){
         sum+= b.charAt(j)-'0';
         j--;
     }
    
Complexity
Time complexity:
0(n)
Code
class Solution {
    public String addBinary(String a, String b) {
        //0+0=0
        //0+1=
        //1+0
        //1+1=10
        int i=a.length()-1;
        int j=b.length()-1;
        int carry=0;
        StringBuilder sb= new StringBuilder();
       
        while (i >=0 || j>=0 || carry ==1){
            int sum=carry;
            if (i >=0){
                sum+= a.charAt(i)-'0'; //ASCII number (48-49 // 48-48)
                i--;
            }
            if (j >=0){
                sum+= b.charAt(j)-'0';
                j--;
            }
            sb.append(sum%2);
            carry=sum/2;

        }
    return sb.reverse().toString();
    }
}

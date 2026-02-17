
class Solution {
    public boolean isHappy(int n) {
        int slow=squareNum(n);
        int fast=squareNum(squareNum (n));

        while (slow!=fast){
            slow=squareNum(slow);
            fast=squareNum(squareNum(fast));

            if(slow==1 || fast==1){
                return true;
            }
        }
        if(slow==1){
            return true;
        } else{
        return false;}
        
    }

    private int squareNum(int n){
        //12
         
         int sum=0;
        while (n >0){
           int sq=n%10; // 2 // 1
            // 2*2 =4
           sum+=sq*sq;
           n/=10; 
        }
        return sum;
    }
}

class Solution {
    public int numSteps(String s) {
        int carry=0;
        int step=0;
        for(int i=s.length()-1; i>0; i--){
            int bit = (s.charAt(i) - '0')+carry;

            if(bit==1) { //odd {
                step+=2;
                carry=1;
            } else{
                //even
                step+=1;
            }
        }
    return step+carry;
    }
}
        //this will fail for long string 
        //1111011110000011100000110001011011110010111001010111110001
        // int n = Integer.parseInt(s, 2);

        // //13 
        // int count=0;
        // while (n!=1){
        //     if(n%2==0){
        //         n=n/2;
        //         count++;
        //     } else{
        //         n+=1;
        //         count++;
        //     }

        // }
        // return count;
    

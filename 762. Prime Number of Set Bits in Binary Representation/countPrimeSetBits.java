class Solution {
    public int countPrimeSetBits(int left, int right) {
        int count=0;
       
        for(int i=left; i<=right;i++){
            int bit= Integer.bitCount(i);

            boolean fl=isPrime(bit);
            if(fl){
                count++;
            }

        }
        return count;
    }

    private boolean isPrime(int bit){
        if(bit<=1){
            return false;
        }
        for(int i=2; i<bit; i++){ // or i*i <= bit
            if(bit%i==0){
                return false;
            }
        }
        return true;
    }
}

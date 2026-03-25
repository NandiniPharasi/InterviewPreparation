class Solution {
    public int findGCD(int[] nums) {
        int small=Integer.MAX_VALUE;
        int big=Integer.MIN_VALUE;
        int gcp=1;
        for(int i=0; i<nums.length; i++){
            if(nums[i]> big){
                big=nums[i];
            } 
             if(nums[i]<small){
                small=nums[i];
            }
        }
        // System.out.println(big);
        //  System.out.println(small);
        for(int i=1; i<=small; i++){
            if(small%i==0 && big%i==0){
                gcp=i;
            }
        }
        return gcp;
    }
}

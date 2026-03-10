class Solution {
    public int firstMissingPositive(int[] nums) {
           int n=nums.length;
        int sum=0;
        //If nums contains [0, 1, 2, 3, 5] then we calculate 1+2+3+4+5 then subtract 1+2+3+5 which would give us 4.
        int total=n*(n+1)/2;

        for(int a: nums){
            sum+=a;
        }

        return total-sum;
    }
}

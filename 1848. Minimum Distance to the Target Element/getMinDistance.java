class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int minAbs= Integer.MAX_VALUE;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==target){
                int out=Math.abs(i-start);
                minAbs=Math.min(minAbs, out);
            }
        }
        return minAbs;
    }
}

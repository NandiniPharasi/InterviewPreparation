

class Solution {
    public int removeDuplicates(int[] nums) {
        int count =0;
        int n=nums.length;

        for (int i=1; i<n; i++){
            if(nums[i]!=nums[count]){
                nums[count+1]=nums[i];
                count++;
            }
        }
        return count+1;
    }
}

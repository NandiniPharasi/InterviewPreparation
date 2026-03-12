class Solution {
    public int[] twoSum(int[] nums, int target) {

        
        Map<Integer, Integer> hs = new HashMap<>();

        for(int i=0; i<nums.length; i++){
           
        int curr=target-nums[i];

        if(hs.containsKey(curr)){
            return new int[]{hs.get(curr), i};
        }
         hs.put(nums[i], i);
        }

        return new int[]{};
        
    }
}

class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
      Map<Integer, Integer> rem = new HashMap<>();
      rem.put(0,-1);
      int sum=0;

      for(int i=0; i<nums.length; i++){
        sum+=nums[i];
        int reminder=sum%k;

        if(rem.containsKey(reminder)){
            if(i-rem.get(reminder)>1){
                return true; //valid subarrya
            } else{
                rem.put(reminder,i);
            }
        }
      }
      return false;
    }
}

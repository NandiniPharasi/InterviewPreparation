class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
        List<Integer> list= new ArrayList<>();
        int i=0;

        while(i< nums.length){
            int correctIdx=nums[i]-1;
            if(nums[i] != nums[correctIdx]){
                int temp= nums[i];
                nums[i]=nums[correctIdx];
                nums[correctIdx]=temp;
            } else{
                i++;
            }
        }

        for(int j=0; j< nums.length; j++){
            if(nums[j] != j+1){
                list.add(j+1);
            }
        }
        return list;
        
        
    }
}

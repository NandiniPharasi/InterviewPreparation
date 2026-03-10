class Solution {
    public int firstMissingPositive(int[] nums) {
        Set<Integer> hs= new TreeSet<>();
        for(int n: nums){
            if(n>0){
                hs.add(n);
            }
        }


        for (int i=1; i<=hs.size(); i++){
            if(hs.contains(i)){

            }
            else{
                return i;
            }
        }
        return hs.size()+1;
        
    }
}

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set <Integer> hs = new TreeSet<>();
        List<Integer> list= new ArrayList<>();
        for(int n: nums){
            hs.add(n);
        }

        for(int i=1; i<=nums.length; i++){
            if(hs.contains(i)){

            } else{
                list.add(i);
            }
        }

        return list;
        
    }
}

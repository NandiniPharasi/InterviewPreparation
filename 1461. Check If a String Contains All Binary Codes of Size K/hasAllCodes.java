class Solution {
    public boolean hasAllCodes(String s, int k) {
        Set<String> seen = new HashSet<>();
        int left=0;

        for(int right=0; right<s.length();right++ ){
            if(right-left+1==k){
                seen.add(s.substring(left, right+1));
                left++;
            }
        }

        int tot=(int)Math.pow(2,k);
        return seen.size()==tot;


        
    }
}

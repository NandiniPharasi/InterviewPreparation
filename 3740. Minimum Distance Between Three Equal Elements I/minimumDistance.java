class Solution {
    public int minimumDistance(int[] nums) {
        int n=nums.length;
        int ans=Integer.MAX_VALUE;
        if (n<=2){
            return -1;
        }
        for(int i =0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(nums[i]==nums[j]){
                    for(int k=j+1; k<n; k++){
                        if(nums[j]==nums[k]){
                            int absval=Math.abs(i-j)+ Math.abs(j-k)+ Math.abs(k-i);
                            ans=Math.min(ans, absval);
                            System.out.print(ans);
                        }
                        
                    }
                }
            }
        }

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}

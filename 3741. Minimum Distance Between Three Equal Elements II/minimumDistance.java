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
                            //  int absval=Math.abs(i-j)+ Math.abs(j-k)+ Math.abs(k-i);
                            int absval= 2*(k-i);
                          //did this because in hint
                            ans=Math.min(ans, absval);
                /*
                Hint 1
The distance formula abs(i - j) + abs(j - k) + abs(k - i) simplifies to 2 * (max(i, j, k) - min(i, j, k)).
Hint 2
Group the indices for each unique number. For a number to form a good tuple, it must appear at least 3 times.
Hint 3
For each number that appears at least 3 times, we want to find three of its indices p < q < r that minimize r - p. This is achieved by considering every three consecutive indices in the sorted list of indices.

so k-i
*/
                        }
                        
                    }
                }
            }
        }

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}

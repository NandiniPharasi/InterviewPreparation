import java.util.*;

class Solution {
    public int minimumDistance(int[] nums) {
        int n = nums.length;
        if (n <= 2) return -1;

        // Build array of (value, index)
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = nums[i];
            arr[i][1] = i;
        }

        // Sort by value, then index
        Arrays.sort(arr, (a, b) -> {
            if (a[0] != b[0]) return Integer.compare(a[0], b[0]);
            return Integer.compare(a[1], b[1]);
        });

        int ans = Integer.MAX_VALUE;

        // Scan consecutive triples
        for (int i = 0; i + 2 < n; i++) {
            if (arr[i][0] == arr[i+1][0] && arr[i][0] == arr[i+2][0]) {
                int dist = 2 * (arr[i+2][1] - arr[i][1]);
                ans = Math.min(ans, dist);
            }
        }

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}

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

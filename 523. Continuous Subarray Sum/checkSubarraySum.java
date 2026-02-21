import java.util.*;

class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        Map<Integer, Integer> rem = new HashMap<>();
        rem.put(0, -1); // handle subarray starting at index 0
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            int remainder = k == 0 ? sum : sum % k;

            if (rem.containsKey(remainder)) {
                if (i - rem.get(remainder) > 1) {
                    return true; // valid subarray found
                }
            } else {
                rem.put(remainder, i); // store first occurrence only
            }
        }
        return false;
    }
}

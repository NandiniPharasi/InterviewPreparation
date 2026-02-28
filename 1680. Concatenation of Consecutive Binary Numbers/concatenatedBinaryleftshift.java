class Solution {
    public int concatenatedBinary(int n) {
      long MOD = 1000000007; long result = 0; int length = 0; for (int i = 1; i <= n; i++) { 
// Increase binary length when i is a power of 2 
      if ((i & (i - 1)) == 0) { length++; } 
result = ((result << length) + i) % MOD;
} 
return (int) result;
    }
}

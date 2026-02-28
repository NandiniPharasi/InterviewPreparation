class Solution {
    public int concatenatedBinary(int n) {
        int sum=0;
        StringBuilder sb=new StringBuilder();
        for (int i=1; i<=n; i++){
            String s=Integer.toBinaryString(i);
            sb.append(s);
        
        }

       long res = 0;
        int MOD = 1000000007;
        String bs = sb.toString();
        for (int i = 0; i < bs.length(); i++) {
            int curr = bs.charAt(i) - '0';
            res = (res * 2 + curr) % MOD;
        }
        return (int) res;
    }
}

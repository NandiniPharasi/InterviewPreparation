class Solution {
    public int binaryGap(int n) {
        // If fewer than 2 ones, no gap possible
        if (Integer.bitCount(n) < 2) return 0;

        String binary = Integer.toBinaryString(n);
        int last = -1;   // index of last '1'
        int maxGap = 0;

        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '1') {
                if (last != -1) {
                    maxGap = Math.max(maxGap, i - last);
                }
                last = i;
            }
        }

        return maxGap;
    }
}

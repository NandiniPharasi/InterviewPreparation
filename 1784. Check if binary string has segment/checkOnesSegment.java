class Solution {
    public boolean checkOnesSegment(String s) {
        int idx = 0, n = s.length();
        boolean flag = true;

        while (idx < n) {
            if (!flag && s.charAt(idx) == '1') return false;

            if (s.charAt(idx) == '0') {
                flag = false;
            }
            idx++;
        }

        return true;
    }
}

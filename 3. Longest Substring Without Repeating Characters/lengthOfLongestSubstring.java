class Solution {
    public int lengthOfLongestSubstring(String s) {

            Set<Character> set= new HashSet<>();
            int left=0;
            int size=0;
            for (int  right=0; right<s.length(); right++){
                while(set.contains(s.charAt(right))){
                   set.remove(s.charAt(left));
                    left++;
                }

                set.add(s.charAt(right));
                size=Math.max(size, right-left+1);
                
            }

            return size;
        
    }
}

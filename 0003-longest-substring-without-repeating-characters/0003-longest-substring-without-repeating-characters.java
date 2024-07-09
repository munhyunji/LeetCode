class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        Set<Character> set = new HashSet<>();
        
        int max = 0;
        int lp = 0;
        int rp = 0;
        
        for(rp = 0; rp < s.length(); rp++) {
            
            while(set.contains(s.charAt(rp))) {
                set.remove(s.charAt(lp++));
                                
            }            
            set.add(s.charAt(rp));
            max = Math.max(max, rp-lp+1);
        }
        return max;
    }
}
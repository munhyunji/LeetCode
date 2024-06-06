class Solution {
    public boolean isSubsequence(String s, String t) {
        
        int j = 0;
        int i = 0;
        // s = abc
        // t = ahbgdc
        while ( j < s.length() && i < t.length() ) {
            if(s.charAt(j) == t.charAt(i)) {
                j++;
            }
            i++;
        }
        
        return j == s.length();
    }
}
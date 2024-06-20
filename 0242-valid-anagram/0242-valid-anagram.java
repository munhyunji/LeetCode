class Solution {
    public boolean isAnagram(String s, String t) {
        
        char[] strs = s.toCharArray();
        char[] strt = t.toCharArray();
        
        Arrays.sort(strs);
        Arrays.sort(strt);
                
        return Arrays.equals(strs,strt);
    }
}
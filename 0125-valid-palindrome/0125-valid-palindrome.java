class Solution {
    public boolean isPalindrome(String s) {
        String ms = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        
        if(ms.length() == 0) {
            return true;
        }
        
        int first = 0;
        int last = ms.length()-1;
        
        while(first < last) {
            if(ms.charAt(first) != ms.charAt(last)) {
                return false;
            }
            first++;
            last--;
        }
        
        return true;
    }
}
class Solution {
    public boolean isPalindrome(String s) {
        String os = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        
        int l = 0;
        int r = os.length()-1;
        
        while(l <= r) {
            if(os.charAt(l) != os.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
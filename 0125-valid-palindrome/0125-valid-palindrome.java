class Solution {
     public boolean isPalindrome(String s) {
        String os = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        
        int ep = os.length()-1;
        
        for( char c : os.toCharArray()) {
            if(c != os.charAt(ep)) {
                return false;
            } 
            ep--;
            
        }
        return true;
    }
}
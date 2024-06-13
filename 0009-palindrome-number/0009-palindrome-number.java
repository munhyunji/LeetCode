class Solution {
    public boolean isPalindrome(int x) {
        if(x == 0) return true;
        
        String intToString = String.valueOf(x);                
        int endPointer = intToString.length()-1;
        
        for(int i = 0; i < intToString.length()/2; i++) {
                if(intToString.charAt(i) != intToString.charAt(endPointer)) {
                    return false;
                }
            endPointer--;
        }
        return true;
    }
}
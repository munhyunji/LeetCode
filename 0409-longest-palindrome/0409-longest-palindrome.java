class Solution {
    public int longestPalindrome(String s) {
        
        HashMap<Character, Integer> hsm = new HashMap<>();
        
        for(char c : s.toCharArray()) {
            hsm.put(c, hsm.getOrDefault(c, 0)+1);
        }
        
        int length = 0;
        
        for(Map.Entry<Character, Integer> entry : hsm.entrySet()) {
            if(entry.getValue() % 2 == 0) {
                length += entry.getValue();
            } else {
                length += entry.getValue()-1;
            }
        }
        
        for( int value : hsm.values()) {
            if( value % 2 != 0) {
                length++;
                break;
            }
        }
        
        return length;
    }
}
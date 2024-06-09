class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder strb = new StringBuilder();
        int i = 0;
        int j = 0;
        
        while( i < word1.length() || j < word2.length() ) {
            if ( i < word1.length() ) {
                strb.append(word1.charAt(i++));
            }
            
            if( j < word2.length() ) {
                strb.append(word2.charAt(j++));
            }
            
        }
        return strb.toString();
    }
}
class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder strb = new StringBuilder();
        
        char[] char1 = word1.toCharArray();
        char[] char2 = word2.toCharArray();
        
        int i = 0;
        int j = 0;
        while( i < char1.length || j < char2.length  ) {
            if(i < char1.length) {
                strb.append(char1[i++]);
            }
            
            if(j < char2.length) {
                strb.append(char2[j++]);
            }
        
        }
        return strb.toString();
    }
}
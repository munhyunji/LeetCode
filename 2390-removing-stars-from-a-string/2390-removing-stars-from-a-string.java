class Solution {
    public String removeStars(String Str) {
     
        StringBuilder sb = new StringBuilder();
        
        //leet**cod*e
        
        
        // leco 
        for( char s : Str.toCharArray()) {
            int size = sb.length();
            if(size > 0 && s == '*' && sb.charAt(size-1) != '*' ) {
                sb.deleteCharAt(size-1);
            } else {
                sb.append(s);
            }
        }
        return sb.toString();
    }
}
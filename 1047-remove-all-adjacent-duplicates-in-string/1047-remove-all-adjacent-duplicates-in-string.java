class Solution {
    public String removeDuplicates(String s) {

        StringBuilder sb = new StringBuilder(); //"" 문자를 자유자재로
        
        for( char c : s.toCharArray()) {
            int size = sb.length();
            if(size > 0 && sb.charAt(size-1) == c) {
                sb.deleteCharAt(size-1);
            } else {
                sb.append(c); //a -> ca
            }
        }
        return sb.toString();
    }
}
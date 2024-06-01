class Solution {
    public int scoreOfString(String s) {
        int result = 0;
        for(int i = 0; i < s.length()-1; i++) {
            int ascii = s.toLowerCase().charAt(i);
            int nextAscii = s.toLowerCase().charAt(i+1);
            
            result += Math.abs(ascii - nextAscii);
        }
        return result;
    }
}
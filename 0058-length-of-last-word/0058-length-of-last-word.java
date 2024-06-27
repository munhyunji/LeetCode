class Solution {
    public int lengthOfLastWord(String s) {
        
        int count = 0;
        int i = s.length()-1;
        //"   fly me   to   the moon  " 
        
        while( i >= 0) {
           if(s.charAt(i) != ' ') count++;
            else if (count > 0) return count;
            i--;
        }                      
        return count;
    }
}

class Solution {
    public String reverseWords(String s) {
                
        String[] words = s.split("\\s+"); //1개이상의 공백제거 
        StringBuilder sb = new StringBuilder();
        
        for(int i = words.length-1; i >= 0; i--) {
            sb.append(words[i]);
            if(i > 0) {
                sb.append(" ");
            }
        }       
        return sb.toString().trim();
    }
}
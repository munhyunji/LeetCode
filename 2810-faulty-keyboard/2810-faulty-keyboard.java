class Solution {
    public String finalString(String s) {
        
        StringBuilder strb = new StringBuilder();
        String revseredString = "";
        for(char c : s.toCharArray()) {
            if(c == 'i') {                
                strb.reverse();
                continue;
            }  
            strb.append(c);
        }
        return strb.toString();
    }
    
}
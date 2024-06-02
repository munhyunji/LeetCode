class Solution {
    public void reverseString(char[] s) {
       
        //s = ["h","e","l","l","o"]      
        // temp= h 
        
        int length = s.length;
          
        for(int i = 0, j = i + 1; i < length / 2; i++, j++) {    
            char temp = s[i];
            s[i] = s[length-j];  
            s[length-j] = temp;                     
        }    
    }
}
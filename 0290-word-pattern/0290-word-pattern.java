class Solution {
    public boolean wordPattern(String pattern, String s) {
        if( pattern == null || s == null ) { return false; }
        
        Map<Character, Integer> phsm = new HashMap<>();
        Map<String, Integer> shsm = new HashMap<>();
        
        String[] words = s.split(" ");
        
        for(int i = 0; i < pattern.length(); i++) {
            
            if(words.length != pattern.length()) {
                return false;
            }
            
            int indexPattern = phsm.getOrDefault(pattern.charAt(i), -1);
            int indexString = shsm.getOrDefault(words[i], -1);
            
            
            if(indexPattern != indexString) {                
                return false;
            }       
            
            phsm.put(pattern.charAt(i), i); 
            shsm.put(words[i], i);
                          
        }        
        return true;        
    }
}
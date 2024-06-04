class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        HashMap<Character, Integer> hsm = new HashMap<>();
        
        for( char c : magazine.toCharArray()) {
            hsm.put(c, hsm.getOrDefault(c, 0) +1);
        }
        
        for( char c : ransomNote.toCharArray()) { // (a, 2) (b, 1)
            if(hsm.containsKey(c) && hsm.get(c) > 0) {
                   hsm.put(c, hsm.getOrDefault(c, 0) -1);
               } else {
                   return false;
               }            
        } 
        return true;
    }
}
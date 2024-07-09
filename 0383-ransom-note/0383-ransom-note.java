class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        HashMap<Character, Integer> hsm = new HashMap<>();
        
        for( char c : magazine.toCharArray()) {
            hsm.put(c, hsm.getOrDefault(c, 0) +1);
        }
        
        for ( char c : ransomNote.toCharArray()) {
           if (hsm.containsKey(c) && hsm.get(c) > 0) { //문자가 하나라도 -1 이돤다면 
               hsm.put(c, hsm.getOrDefault(c, 0)-1);
           } else {
               return false;
           }
        } 
        return true;
    }
}
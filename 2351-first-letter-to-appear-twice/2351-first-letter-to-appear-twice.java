class Solution {
    public char repeatedCharacter(String s) {
        
        HashMap<Character, Integer> hsm = new HashMap<>();
        
        //s = "abccbaacz"
        for(char c : s.toCharArray()) {
            hsm.put(c, hsm.getOrDefault(c, 0) + 1);  
            
            if(hsm.get(c) == 2) {
                return c;
            }
        }

        throw new IllegalArgumentException("No repeated character found");
    }
}
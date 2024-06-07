class Solution {
    public int minimizedStringLength(String s) {
        Map<Character, Integer> charmap = new HashMap<>();
        
        if(s.length() == 1 ) return 1;

        for(int i = 1; i < s.length(); i++) {
           if(s.charAt(i) != s.charAt(i-1)) {
               charmap.put(s.charAt(i-1), i-1);
           }
           if(!charmap.containsKey(s.charAt(i))) {
               charmap.put(s.charAt(i), i);
           }
       } 

        return charmap.size();
    }
}
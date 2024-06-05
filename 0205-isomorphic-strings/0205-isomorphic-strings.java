class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s == null || t == null) { return false;}
        if(s.length() != t.length()) { return false; }
        
        Map<Character, Integer> sm = new HashMap<>(); 
        Map<Character, Integer> st = new HashMap<>();
        
        for(int i = 0; i < s.length(); i++) {
          int indexS = sm.getOrDefault(s.charAt(i), -1); // index check1
          int indexT = st.getOrDefault(t.charAt(i), -1); 
            
            if( indexS != indexT ) {
                return false;
            }
            
            sm.put(s.charAt(i), i);
            st.put(t.charAt(i), i);
            
        }
        return true;
    }
}
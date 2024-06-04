class Solution {
    public boolean isAnagram(String s, String t) {
       HashMap<String, Boolean> hsm = new HashMap<>();
        
             char[] cs = s.toCharArray();
            Arrays.sort(cs);
            String sortedString1 = new String(cs); //anagram
            hsm.put(sortedString1, true);

            char[] ts = t.toCharArray();
            Arrays.sort(ts);
            String sortedString2 = new String(ts);
            
            if(hsm.containsKey(sortedString2)) {
                return true;
            }
        return false;
    }
}
class Solution {
    public int firstUniqChar(String s) {
       HashMap<Character, Integer> hsm = new HashMap<>();
        
        char[] sc = s.toCharArray();
        
        //s = "leetcode"
        for (int i = 0; i < sc.length; i++) {
            hsm.put(sc[i], hsm.getOrDefault(sc[i], 0) +1);
        }
        
        for(int j = 0; j < s.length(); j++) {
            if(hsm.get(s.charAt(j)) == 1) {
                return j;
            }
        }                        
        return -1;
    }
}
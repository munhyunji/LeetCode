class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hsm = new HashMap<>();
        // ("aet", ['eat', 'tea', 'tan'])
        
        for( String s : strs) {
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String newString = new String(ch);
            
            if(hsm.containsKey(newString)) {
                hsm.get(newString).add(s);
            } else {
                List<String> group = new ArrayList<>();
                group.add(s);
                hsm.put(newString, group);
            }
        }
        return new ArrayList<>(hsm.values());
    }
}
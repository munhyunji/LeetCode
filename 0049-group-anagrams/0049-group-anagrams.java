class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String, List<String>> hsm = new HashMap<>();
        
        for(String word : strs) {
            char[] c = word.toCharArray();
            Arrays.sort(c);
            String sortedWord = new String(c);
            
            if(!hsm.containsKey(sortedWord)) {
                hsm.put(sortedWord, new ArrayList<>());
            } 
            
            hsm.get(sortedWord).add(word);
            
        }
        return new ArrayList<>(hsm.values());
    }
}
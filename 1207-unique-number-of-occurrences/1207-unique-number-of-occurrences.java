class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> hsm = new HashMap<>();
        
        for(int n : arr) {
            hsm.put(n, hsm.getOrDefault(n, 0) +1);
        }
        Set<Integer> occurences = new HashSet<>();
        
        for(int count : hsm.values()) {
            occurences.add(count);
        }
        
        return occurences.size() == hsm.size();
    }
}
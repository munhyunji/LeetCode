class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> hsm = new HashMap<>();
        
        for(int num : nums) {
            hsm.put(num, hsm.getOrDefault(num, 0)+1);
        }
        
        for(Map.Entry<Integer, Integer> entry : hsm.entrySet()) {
            if(entry.getValue() > 1) {
                return true;
            }
        }
        return false;
    }
}
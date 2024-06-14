class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        HashMap<Integer, Integer> hsm = new HashMap<>();
        List<Integer> numList = new ArrayList<>();
        
        for(int num : nums) {
            hsm.put(num, hsm.getOrDefault(num, 0)+1);            
        }
        
        int n = nums.length/3;
        
        for(Map.Entry<Integer, Integer> entry : hsm.entrySet()) {
            if(entry.getValue() > n) {
                numList.add(entry.getKey());
            }
        }
        return numList;
    }
}
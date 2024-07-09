class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hsm = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++) {
            
            if(hsm.containsKey(target-nums[i])) {
                return new int[]{i, hsm.get(target-nums[i])};
            }
            
            hsm.put(nums[i], i);
            
        }
        return new int[]{};
    }
}
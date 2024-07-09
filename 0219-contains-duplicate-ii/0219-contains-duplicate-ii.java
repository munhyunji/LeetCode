class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        
        // i와 j가 있고 i == j 이며, 인덱스 i - j가 k 보다 이상인 경우 
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++) {
            
            if(map.containsKey(nums[i]) && i - map.get(nums[i]) <= k) {
                return true;
            }
            
            map.put(nums[i], i);
        }
        return false; 
    }
}
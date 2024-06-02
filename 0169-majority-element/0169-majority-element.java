class Solution {
    public int majorityElement(int[] nums) {
        
        
        int n = nums.length; 
        // nums = [6, 6, 6, 7, 7]
                
        //  3,6 
        // 
        
        //

        HashMap<Integer, Integer> hs = new HashMap<>();
        
        for(int i = 0; i < n; i++) {
            hs.put(nums[i], hs.getOrDefault(nums[i], 0) +1);
        }
         
        n = n/2;
        
        for (Map.Entry<Integer, Integer> entry : hs.entrySet()) {
            if (entry.getValue() > n) {
                return entry.getKey();
            }
        }
        
        return 0;

    }
}
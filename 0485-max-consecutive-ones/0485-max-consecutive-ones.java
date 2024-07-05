class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int max = 0;
        int cur = 0;
        for(int i = 0; i < nums.length; i++) {
            
            if(nums[i] == 1) {
                cur++;
            } else {
                cur = 0;
            }
            
            max = Math.max(max, cur);
        }
        return max;
    }
}
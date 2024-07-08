class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        
        int sum = 0;
        int min = Integer.MAX_VALUE;
        int lp = 0;
        int rp = 0;
        
        for(rp = 0; rp < nums.length; rp++) {
            sum += nums[rp];
            
            while(sum >= target) {
                min = Math.min(min, rp-lp+1);
                sum -= nums[lp++];
            }
        }
        return min == Integer.MAX_VALUE ? 0 : min; 
    }
}
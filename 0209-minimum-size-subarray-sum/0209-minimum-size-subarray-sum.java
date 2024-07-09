class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        
        int size = Integer.MAX_VALUE;
        int sum = 0;
        int lp = 0;
        int rp = 0;
        
        for(rp = 0; rp < nums.length; rp++) {
            sum += nums[rp];
            
            while(sum >= target) {
                size = Math.min(size, rp-lp+1);
                sum -= nums[lp++];
            }
        }
        return size == Integer.MAX_VALUE ? 0 : size; 
    }
}
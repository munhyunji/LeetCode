class Solution {
    public int longestSubarray(int[] nums) {
        
        int maxLength = 0; 
        
        int lp = 0;
        int rp = 0;
        int deleted = 0;
        
        while(rp < nums.length) {
            if(nums[rp] == 0) {
                deleted++;       
            }
            rp++;
            
            if(deleted > 1) {
                if(nums[lp] == 0) {
                    deleted--;
                }
                lp++;
            }
        }
        return rp-lp-1;
    }
}
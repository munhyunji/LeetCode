class Solution {
    public int longestOnes(int[] nums, int k) {
        int lp = 0;
        int rp = 0;
        int zeroCount = 0;
        
        while(rp < nums.length) {
            if(nums[rp] == 0) {
                zeroCount++;
            }
            rp++;
            
            if(zeroCount > k) {
                if(nums[lp] == 0) {
                    zeroCount--;
                }
                lp++;
            }
        }
        return rp-lp;
    }
}
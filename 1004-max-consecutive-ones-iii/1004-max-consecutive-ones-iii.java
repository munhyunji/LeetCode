class Solution {
    public int longestOnes(int[] nums, int k) {
        int lp = 0;
        int rp = 0;
        int zeros = 0;
        
        while(rp < nums.length) {
            if(nums[rp]==0) {
                zeros++;
            }
            rp++;
            if(zeros > k) {
                if(nums[lp] == 0) {
                    zeros--;
                }
                lp++;
            }
        }
        return rp-lp;
    }
}
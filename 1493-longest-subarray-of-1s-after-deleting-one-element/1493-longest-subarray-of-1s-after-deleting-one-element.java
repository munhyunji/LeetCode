class Solution {
    public int longestSubarray(int[] nums) {
        
        int maxLength = 0; 
        int zeroCount = 0;
        int j = 0;
        
        for(int i = 0; i < nums.length; i++) {
          zeroCount += (nums[i] == 0 ? 1 : 0);
        
            while(zeroCount > 1) {
                if(nums[j] == 0) {
                    zeroCount--;
                }
                j++;
            }
            
            maxLength = Math.max(maxLength, i-j);
        }
        return maxLength;
    }
}
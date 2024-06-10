class Solution {
    public int[] leftRightDifference(int[] nums) {
        
        
        
        int[] leftSum = new int[nums.length];
        int[] rightSum = new int[nums.length];
        
        
        int totalSum = 0;
        for(int num : nums) {
            totalSum += num;
        }
        
        leftSum[0] = 0;
        rightSum[0] = totalSum-nums[0];
        
        for(int i = 1; i < nums.length; i++) {
            leftSum[i] = leftSum[i-1]  + nums[i-1]; //0, 0+10, 
           
        }
        
        for(int i = 1; i < nums.length; i++) {
             rightSum[i] = rightSum[i-1]-nums[i];
        }
        
        for(int i = 0; i < nums.length; i++) {
            nums[i] = Math.abs(leftSum[i] - rightSum[i]);
        }
        
        return nums;
    }
}
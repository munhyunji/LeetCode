class Solution {
    public int maxSubArray(int[] nums) {
        
       //Kadane's Algorithm
       if(nums.length == 1) return nums[0];
        
        int currentSum = nums[0]; //1
        int largestSum = nums[0]; //

        //[-1, -2]
        for(int i = 1; i < nums.length; i++) {
            currentSum += nums[i]; //-2

            currentSum = Math.max(currentSum, nums[i]); //   -1 , -2
            
            if(currentSum > largestSum) { //
                largestSum = currentSum;
            }
        }
        return largestSum;
    }
}
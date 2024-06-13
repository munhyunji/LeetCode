class Solution {
    public int searchInsert(int[] nums, int target) {
       int leftPointer = 0;
        int rightPointer = nums.length-1;
      
        //[1,3,5,6]
        //   L  
        // R 
        // M    
        while( leftPointer <= rightPointer ) {
            int middlePointer = leftPointer + rightPointer;
            
            if(nums[middlePointer] == target) {
                return middlePointer;
            } else if (nums[middlePointer] < target) {
                leftPointer = middlePointer +1;
            } else {
                rightPointer = middlePointer -1;
            }
        }
        return leftPointer;
    }
}
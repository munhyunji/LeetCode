class Solution {
    public int searchInsert(int[] nums, int target) {
       //1,3,5,6,
       //L   M R
        
       int leftPointer = 0;
        int rightPointer = nums.length-1;
        
        while (leftPointer <= rightPointer) {
            int middlePointer = leftPointer + rightPointer; 
            
            if(nums[middlePointer] == target) {
                return middlePointer;
            } else if (nums[middlePointer] < target ) {
                leftPointer = middlePointer+1;
            } else {
                rightPointer = middlePointer-1;
            }
        } 
        return leftPointer;
    }
}
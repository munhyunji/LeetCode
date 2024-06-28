class Solution {
    public int searchInsert(int[] nums, int target) {
        
        int leftPointer = 0;
        int rightPointer = nums.length-1;
        
        while(leftPointer <= rightPointer) {
            int middlePointer = leftPointer + (rightPointer - leftPointer) / 2;
            
            if(nums[middlePointer] == target) {
                return middlePointer;
            } else if (nums[middlePointer] > target) {
                rightPointer = middlePointer-1;
            } else { 
                leftPointer = middlePointer+1;
            }
        }
        return leftPointer;                    
    }
}
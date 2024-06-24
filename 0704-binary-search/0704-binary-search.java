class Solution {
    public int search(int[] nums, int target) {
                
       int leftPointer = 0;
        int rightPointer = nums.length-1;
        
        while(leftPointer <= rightPointer) {
            int middlePointer = leftPointer + (rightPointer - leftPointer) / 2;
            
            if(nums[middlePointer] == target) {
                return middlePointer;
            } else if ( nums[middlePointer] < target) {
                leftPointer = middlePointer+1;
            } else {
                rightPointer = middlePointer-1;
            }
        }
        return -1;
    }
    
}
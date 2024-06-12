class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        
        int count = 0;
        int leftPointer = 0;
        int rightPointer = nums.length-1;
        
        // 1,3,3,3,4 k=6
        
        while( leftPointer < rightPointer ) {
            int sum = nums[leftPointer] + nums[rightPointer];
            
            if(sum == k) {
                count++;
                leftPointer++;
                rightPointer--;
                
            } else if (sum > k) {
                rightPointer--;
            } else {
                leftPointer++;
            }
        }
        return count;
    }
}


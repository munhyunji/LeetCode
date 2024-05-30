class Solution {
    int[] nums = {0,1,0,3,12};

    public void moveZeroes(int[] nums) {        
        int zeroCount = 0;        
        for(int i = 0; i < nums.length; i++) {                      
            if(nums[i] == 0) {
                zeroCount++;              
            } else if( zeroCount > 0) {
                int t = nums[i];
                nums[i] = 0;
                nums[i-zeroCount]=t;
            }                    
        }
    }
}
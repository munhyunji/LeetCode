class Solution {
    public int rob(int[] nums) {
       //[4,1,2,7,5,3,1]
        int max = 0;
        int lastMax = 0;
        
        if(nums.length == 0 ) return 0;
        if(nums.length == 1 ) return nums[0];
        if(nums.length < 3) {
            max = Math.max(nums[0], nums[1]);
        } else {
          nums[0] = nums[0];
          nums[1] = Math.max(nums[0], nums[1]);
               
        for(int i = 2; i < nums.length; i++) {
            if(i==2) {
                max = Math.max(nums[i-1], nums[i]+nums[i-2]); //3
                nums[i] = max;
            } else {
                max = Math.max(max, nums[i]+nums[i-2]);
                nums[i] = max;
            }

        }  
            
        }
        
        
        return max;
    }
}
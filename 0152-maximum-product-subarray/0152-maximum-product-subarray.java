class Solution {
    public int maxProduct(int[] nums) {
        
        int curMin = nums[0];
        int curMax = nums[0];
        int totalMax = nums[0]; //6
        //[-2,0,-1] = 0
        //  i
        for(int i = 1; i < nums.length; i++) {
                
            if(nums[i] < 0) {
                int tmp = curMin;
                curMin = curMax;
                curMax = tmp;
            }
             curMin = Math.min(nums[i], nums[i] * curMin); //-6
             curMax = Math.max(nums[i], nums[i] * curMax); //6
            
  
              totalMax = Math.max(totalMax, curMax);
            
        }
       return totalMax; 
    }
}
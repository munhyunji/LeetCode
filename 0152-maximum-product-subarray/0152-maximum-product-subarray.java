class Solution {
    public int maxProduct(int[] nums) {
        
        int curMin = nums[0];
        int curMax = nums[0];
        int totalMax = nums[0]; //6
        //[2,3,-2,4]
        //        i
        for(int i = 1; i < nums.length; i++) {
                
            if(nums[i] < 0) { //음수곱인경우를 생각해서 max값과 min값을 바꿔준다
                int tmp = curMin;
                curMin = curMax;
                curMax = tmp;
            }
             curMin = Math.min(nums[i], nums[i] * curMin); //  -12
             curMax = Math.max(nums[i], nums[i] * curMax); // -2
              
             totalMax = Math.max(totalMax, curMax);
            
        }
       return totalMax; 
    }
}
class Solution {
    public int pivotIndex(int[] nums) {

      //get totalSum
         int totalSum = 0;
         for(int num : nums) {
             totalSum += num;
         }
         int leftSum = 0;
         int rightSum = 0;
         for(int i = 0; i < nums.length; i++) {
             rightSum = totalSum - leftSum - nums[i];
             //,7,3,6,5,6
             //,3,6,5,6
             //,6,5,6
             //,5,6
             if(leftSum == rightSum) {                
                return i;                
             }
             leftSum += nums[i];   
             //1,
             //1,7
             //1,7,3
                                                                           
         }
         return -1;
    }
}
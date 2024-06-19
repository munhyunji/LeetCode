class Solution {
    public int maximumProduct(int[] nums) {
        
        Arrays.sort(nums);
        int n = nums.length-1;
        
        //끝에서 3개
        int back = nums[n] * nums[n-1] * nums[n-2]; 
        //앞에서2개(음수*음수) + 끝에서 1개
        int front = nums[0] * nums[1] * nums[n];    
              
        return Math.max(back, front);
    }
}
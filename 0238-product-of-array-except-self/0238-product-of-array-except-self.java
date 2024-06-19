class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        
        int[] prefix = new int[n];
        int[] postfix = new int[n];
        
        int j = n-2;
        //[1,2,3,4]
        //[1,1,2,6]
        //[24,12,4,1]
        prefix[0] = 1;
        postfix[n-1] = 1;
        
        for(int i = 1; i < n; i++)  {
            prefix[i] = nums[i-1] * prefix[i-1];
            postfix[j] = nums[j+1] * postfix[j+1];
            j--;
        }

        for(int i = 0; i < n; i++) {            
            nums[i] = prefix[i] * postfix[i];
        }
                
        return nums;
    }
}
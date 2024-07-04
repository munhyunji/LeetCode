class Solution {
    public boolean increasingTriplet(int[] nums) {
        
        int n1 = Integer.MAX_VALUE;
        int n2 = Integer.MAX_VALUE;
        int n3 = 0;
        
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] <= n1) {
                n1 = nums[i];
            } else if (nums[i] >= n1 && nums[i] <= n2) {
                n2 = nums[i];
            } else {
                n3 = nums[i];
            }
        }
        return n1 < n2 && n2 < n3;
        
    }
}


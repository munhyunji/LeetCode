class Solution {
    public int removeDuplicates(int[] nums) {
        int j = 1;
        
        for(int i = 1; i<nums.length; i++) {
            if( j == 1 || nums[j-2] != nums[i]) {
                nums[j++] = nums[i];
            }
        }
        return j;
    }
}
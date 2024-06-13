class Solution {
    public int removeDuplicates(int[] nums) {
        int j = 1;
        //[0,0,1,1,2,1,2,3,3]
        //             i 
        //         j   
        for(int i = 1; i < nums.length; i++) {
            if(j == 1 || nums[i] != nums[j-2]) {
                nums[j++] = nums[i];   
            }                     
        }
        return j;
    }
}


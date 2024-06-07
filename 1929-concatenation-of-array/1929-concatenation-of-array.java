class Solution {
    public int[] getConcatenation(int[] nums) {
        
        int[] totalArray = new int[nums.length * 2];
        
        for(int i = 0; i < nums.length; i++) {
            totalArray[i] = nums[i];
            totalArray[totalArray.length - nums.length + i] = nums[i];
        }
        return totalArray;
    }
    
}
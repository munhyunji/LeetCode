class Solution {
    public int singleNumber(int[] nums) {
        
        int result = 0;
        for(int i = 0; i < nums.length; i++) {
             result ^= nums[i]; //XOR을 해주면 한번나온문자만 남게된다. 
        }
        
        return result;
    }
}
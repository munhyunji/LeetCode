class Solution {
    public int[] twoSum(int[] nums, int target) {
        //HashMap O(n)
        
        HashMap<Integer, Integer> hsm = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int needNum = target - num;
            
            if(hsm.containsKey(needNum)) {
                return new int[]{i, hsm.get(needNum)}; //[3,1];
            } else {
                hsm.put(num, i);
            }
            
        }
        return new int[]{};
    }
}
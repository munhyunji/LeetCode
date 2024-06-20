class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        
        List<List<Integer>> threeSum = new ArrayList<>();

        Arrays.sort(nums);
        //[-2,0,0,2,2]
        //  i L     R
        for(int i = 0; i < n; i++) {
            
          if(i > 0 && nums[i] == nums[i-1]) { //no duplicate 
            continue;
            }
            
            int leftPointer = i+1;
            int rightPointer = n-1;
            
            while(leftPointer < rightPointer) {
                int sum = nums[i] + nums[leftPointer] + nums[rightPointer];
                
                if(sum == 0) {
                    threeSum.add(Arrays.asList(nums[i], nums[leftPointer], nums[rightPointer]));
                    
                    //Skip duplicate elements 
                    while(leftPointer < rightPointer && nums[leftPointer] == nums[leftPointer+1]) leftPointer++;
                    while(leftPointer < rightPointer && nums[rightPointer] == nums[rightPointer-1]) rightPointer--;
                    
                    leftPointer++;
                    rightPointer--;
                } else if ( sum > 0) {
                    rightPointer--;                    
                } else {
                    leftPointer++;
                }
                
            }
            
        }
        return threeSum; //[-1,-1,2], 
    }
}
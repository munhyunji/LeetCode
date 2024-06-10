class Solution {
    public int rob(int[] nums) {
       //[4,1,2,7,5,3,1]
        int max = 0;
        int lastMax = 0;
        
        if(nums.length == 0 ) return 0;
        if(nums.length == 1 ) return nums[0];
        if(nums.length < 3) {
            max = Math.max(nums[0], nums[1]);
        } else {
            //집이 두개인경우 둘중에 큰값을 두번째집에 저장 = 두번째집만 터는게 최적일수 있기때문.
            // [4,4, //2,7,5,3,1] max =  4
            //3번째로 넘어가면 4, 4, 2 => 1,2인덱스를 턴게 가운데놈보다 크면 이익이지? max = 6
            //4번째로 넘어가면 [4, 4, 6, 7, ...] = max = 6 < 11
            //5번째로 넘어가면 [4,4,6,11,11, ...] = max = 11 == 11
            //6번째로 넘어가면 [4,4,6,11,11,3 ...] = max = 11 < 14
            //7번째로 넘어가면 [4,4,6,11,11,14,1] = max = 12 < 14
            
          nums[0] = nums[0];
          nums[1] = Math.max(nums[0], nums[1]);
               
            for(int i = 2; i < nums.length; i++) {
                if(i==2) {
                    max = Math.max(nums[i-1], nums[i]+nums[i-2]); //3
                    nums[i] = max;
                } else {
                    max = Math.max(max, nums[i]+nums[i-2]);
                    nums[i] = max;
                }
            }              
        }        
        return max;
    }
}
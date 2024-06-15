class Solution {
    public int climbStairs(int n) {
        
        int[] array = new int[n+1];
        
        int onePoint = array.length-2;
        int twoPoint = array.length-1;
        //[   1  1 ]
        // 0, 1, 2
        //    o  t
        array[onePoint] = 1;
        array[twoPoint] = 1;
        
        for(int i = array.length-3; i >=0; i-- ) {
            array[i] = array[onePoint--] + array[twoPoint--];
        }
        return array[0];
    }
    
}
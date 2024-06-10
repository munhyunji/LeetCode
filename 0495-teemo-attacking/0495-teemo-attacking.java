class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        
        if(timeSeries.length == 0 || duration == 0 || timeSeries == null ) return 0;
        int totalDuration = 0;
        
        for(int i = 0; i < timeSeries.length -1; i++) {
           totalDuration += Math.min(timeSeries[i+1] - timeSeries[i], duration); 
            //{1,3,5,7,9,11,13,15};
            //duration = 1;
            // 1. 첫번째 1+duration(1) = 2 > 1 = 독에 걸려있는중에 독방구 totalduration=1
            // 2. 두번째 3+duration(1) = 4 > 1 = 독걸려 있는중에 독방구 totalduration=2
            // 3. 세번째 5+duration(1) = 6 > 1 = 독걸려있는 중에 독방구 totalduration=3....
            //
            // 독방구에 마지막 독방구 추가 totalduration += duration;
        }
        
        return totalDuration += duration;
    }
}
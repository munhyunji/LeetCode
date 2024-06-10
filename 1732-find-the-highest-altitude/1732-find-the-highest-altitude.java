class Solution {
    public int largestAltitude(int[] gain) {
       
        int maxGain = 0;
        int altitude = 0;
        
        //gain = [-4,-3,-2,-1,4,3,2]
        
        for( int g : gain ) {
            
            altitude += g; // 1  
            
            if( maxGain < altitude ) { // 0 < 1
                maxGain = altitude; 
            }
        }
        return maxGain;
    }
}
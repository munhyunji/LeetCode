class Solution {
    public int longestConsecutive(int[] nums) {
       
       Set<Integer> numset = new HashSet<>();
        
        for(int num : nums) {
            numset.add(num);
        }
        
        int count = 0;
        //[0,1,2,3,4,5,6,7,8]
        
        for(int num : nums) {
            
            if(!numset.contains(num-1)) { //첫번재 번호 찾기 
                int curLen = 0;
                
                while(numset.contains(num++)) {
                    curLen++;
                    
                    count = Math.max(count, curLen);
                }
            }
        }
        return count;
    }
}
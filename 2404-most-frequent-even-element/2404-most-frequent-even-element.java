class Solution {
    public int mostFrequentEven(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int currentFreq = 0;
        int maxFreq = 0;
        int minVal = Integer.MAX_VALUE;
        
        for(int n : nums){
            if(n % 2 == 0) {
                map.put(n, map.getOrDefault(n, 0)+1);   
                currentFreq = map.get(n);
                
                // example 2 처럼 (4, 4) & (2, 1) 인경우 => 자주등장한경우 
                // example 1 처럼 (4, 2) & (2, 2) 인경우 => 빈도수같은경우,, ? 
                // minVal = 2가됨
                // 4인경우 4 < 2 성립하지않기때문에 4가 할당되지않음.... 
                if(currentFreq > maxFreq || currentFreq == maxFreq && n < minVal) {
                    minVal = n;
                    maxFreq = map.get(n);
                }
            }
        }
       return minVal == Integer.MAX_VALUE ? -1 : minVal;
    }
}
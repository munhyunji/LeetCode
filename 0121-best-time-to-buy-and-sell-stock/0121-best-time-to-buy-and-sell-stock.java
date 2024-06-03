class Solution {
    public int maxProfit(int[] prices) {
      //prices = [7, 1,5,3,6,4]
        
        int buy = prices[0];
        int maxProfit = 0;
        
       // buy 1
        // 5 < 1 - 4
      //  1 < 3
            
                   
        for(int i = 1; i < prices.length; i++ ) {
            if(prices[i] < buy) {
                buy = prices[i];
            } else {
               if(maxProfit < prices[i] - buy) maxProfit = prices[i]-buy;
            }
        }
        return maxProfit;
    }
}
class Solution {
    public int maxProfit(int[] prices) {
        
        int buy = prices[0];
        int maximumProfit = 0;
        
        for(int i = 1; i < prices.length; i++) {
            if(buy > prices[i]) { // 7>1
                buy = prices[i];
            } else {
                if(maximumProfit < prices[i] - buy ) maximumProfit = prices[i] - buy;
            }
        }       
        return maximumProfit;
    }
}
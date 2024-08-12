class Solution {
    public int climbStairs(int n) {
        
        int[] dp = new int[n+1];
        int one = dp.length-1;
        int two = dp.length-2;
        dp[one] = 1;
        dp[two] = 1;
        
        for(int i=dp.length-3; i>=0; i--) {
            dp[i] = dp[one--] + dp[two--]; 
        }
        return dp[0];
    }
}
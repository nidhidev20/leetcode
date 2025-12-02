class Solution {
    public int maxProfit(int[] prices) {
        int dp[] = new int[prices.length], max = 0, min = prices[0];
        dp[0] = prices[0];
        for(int i = 1; i < prices.length; i++) {
            dp[i] = prices[i] - min;
            
            max = dp[i] > max ? dp[i] : max;
            min = prices[i] < min ? prices[i] : min;

        }
        return max;
    }
}
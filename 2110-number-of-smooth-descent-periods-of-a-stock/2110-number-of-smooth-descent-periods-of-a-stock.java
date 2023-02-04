class Solution {
    public long getDescentPeriods(int[] prices) {
        long dp[] = new long[prices.length];
		dp[0] = 1;
		long ans = 1;
		for(int i = 1; i < prices.length; i ++) {
			if(prices[i] == prices[i - 1] - 1) {
				dp[i] = dp[i - 1] + 1;
			} else {
				dp[i] = 1;
			}
			ans += dp[i];
		}
		return ans;
    }
}
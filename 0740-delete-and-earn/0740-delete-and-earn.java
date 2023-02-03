class Solution {
    public int deleteAndEarn(int[] nums) {
        int n = nums.length;
        int[] dp = new int[10001];
        int[] sum = new int[10001];

        for (int num : nums) {
            sum[num] += num;
        }

        dp[1] = sum[1];

        for (int i = 2; i <= 10000; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + sum[i]);
        }

        return dp[10000];
    }
}
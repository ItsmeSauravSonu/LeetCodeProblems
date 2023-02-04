class Solution {
    public long zeroFilledSubarray(int[] nums) {
       int n = nums.length;
        int[] dp = new int[n];
        long ans = 0;
        dp[0] = nums[0] == 0 ? 1 : 0;
        ans = dp[0];
        for (int i = 1; i < n; i++) {
            if (nums[i] != 0) {
                dp[i] = 0;
            } else {
                dp[i] = dp[i - 1] + 1;
            }
            ans += dp[i];
        }
        return  ans;
    }
}
import java.util.*;

class Solution {
    public static final long INF = 1000000000000L;

    public long maxAlternatingSum(int[] nums) {
        int N = nums.length;
        long[][] dp = new long[N][2];

        // Initialize first element of dp as first number in the given array, 
        // and the second element as -INF (representing not taking the current number)
        dp[0][0] = nums[0];
        dp[0][1] = -INF;

        // Iterate through the given array
        for (int i = 1; i < N; i++) {
            // Update dp[i][0] as the maximum possible alternating sum 
            // considering taking the current number in the sum
            dp[i][0] = Math.max(nums[i], Math.max(dp[i - 1][1] + nums[i], dp[i - 1][0]));
            
            // Update dp[i][1] as the maximum possible alternating sum 
            // considering not taking the current number in the sum
            dp[i][1] = Math.max(dp[i - 1][1], dp[i - 1][0] - nums[i]);
        }

        // Return the maximum alternating sum
        return Math.max(dp[N - 1][0], dp[N - 1][1]);
    }
}

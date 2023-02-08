class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
       
        
        int[] dp = new int[n];
        Arrays.fill(dp, -1);
        dp[0] = 0;
        for (int i = 0; i < n; i++) {
            int jump = nums[i];
            int cap = Math.min(n-1, i+jump);
            for (int j=i+1; j<=cap; j++) {
                if (dp[j] == -1) dp[j] = 1+dp[i];
                else dp[j] = Math.min(dp[j], 1+dp[i]);
            }
        }
        
        return dp[n-1];
    }
}
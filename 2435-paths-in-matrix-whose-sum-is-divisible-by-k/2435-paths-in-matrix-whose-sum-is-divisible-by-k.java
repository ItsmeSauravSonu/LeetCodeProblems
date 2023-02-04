class Solution {
    public int numberOfPaths(int[][] grid, int K) {
        int m = grid.length;
        int n = grid[0].length;
        
        int[][][] dp = new int[m][n][K];
        int mod = 1000000007;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j == 0) {
                    dp[i][j][grid[i][j] % K] = 1;
                    continue;
                }
                for (int k = 0; k < K; k++) {
                    if (i > 0) {
                        dp[i][j][(k + grid[i][j]) % K] += dp[i - 1][j][k];
                        dp[i][j][(k + grid[i][j]) % K] %= mod;
                    }
                    if (j > 0) {
                        dp[i][j][(k + grid[i][j]) % K] += dp[i][j - 1][k];
                        dp[i][j][(k + grid[i][j]) % K] %= mod;
                    }
                }
            }
        }
        return dp[m-1][n - 1][0];
    }
}
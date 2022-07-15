class Solution {
    public int f(int i, int j, int [][] dp, int [][]grid)
    {
        if(i==0 && j==0) return 1;
        int up =0, left =0;
        if(dp[i][j]!=-1) return dp[i][j];
        if(i>0 && grid[i][j]!=1)
        {
            up = f(i-1,j,dp,grid);
        }
        if(j>0 && grid[i][j]!=1)
        {
            left = f(i,j-1,dp,grid);
        }
        return dp[i][j]=up+left;
    }
    public int uniquePathsWithObstacles(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        if(grid[0][0]==1) return 0;
        int [][] dp = new int[n][m];
        for(int i=0;i<n;i++)
        {
            Arrays.fill(dp[i],-1);
        }
        return f(n-1,m-1, dp,grid);
    }
}
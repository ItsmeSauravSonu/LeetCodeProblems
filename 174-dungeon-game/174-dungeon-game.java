class Solution {
    public int calculateMinimumHP(int[][] dungeon) {
      int m = dungeon.length;
    int n = dungeon[0].length;
    //dp[i][j] represents the minimum health points needed at position (i,j) and
    //the last row or column is just dummy (outside of the range).
    int[][] dp = new int[m+1][n+1];
    
    //Initialize the matrix to maximum possible.
    for (int i = 0; i <= m; i++)
    	Arrays.fill(dp[i], Integer.MAX_VALUE);
    
    //initializing the boundary.
    dp[m][n-1] = 1; dp[m-1][n] = 1; 
    
    for (int i = m-1; i >= 0; i--) {
    	for (int j = n-1; j >= 0; j--) {
    		int minHp = Math.min(dp[i+1][j], dp[i][j+1])  - dungeon[i][j];
    		dp[i][j] = (minHp <= 0) ? 1 : minHp;
    	}
    }
    return dp[0][0];
      
    }
}
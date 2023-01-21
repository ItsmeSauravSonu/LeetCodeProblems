class Solution {
    public int func(int idx, int [] dp){
        
        if(idx==0) return 1;
        if(idx==1) return 1;
        if(dp[idx]!=-1) return dp[idx];
        
        int firstmove = func(idx-1,dp);
        int secondmove = func(idx-2,dp);
        
        return dp[idx]=firstmove+secondmove;
    }
    public int climbStairs(int n) {
        int dp [] = new int [n+1];
        Arrays.fill(dp,-1);
        return func(n,dp);
    }
}
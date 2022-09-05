class Solution {
    public int count(int idx, int n, String vowels, int [][] dp){
        if(n==0) return 1;
        if(idx>=5) return 0;
        if(dp[idx][n]!=-1) return dp[idx][n];
        int pick = count(idx,n-1, vowels,dp);
        int notPick = count(idx+1, n,vowels,dp);
        
        return dp[idx][n]=pick + notPick;
    }
    public int countVowelStrings(int n) {
      String vowels = "aeiou";
      int [][] dp = new int[5][n+1];
      for(int [] x: dp){
          Arrays.fill(x,-1);
      }
      return count(0,n,vowels,dp);
    }
}
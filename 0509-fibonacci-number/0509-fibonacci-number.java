class Solution {
    public int fib(int n) {
      int [] dp = new int [n+1];
      if(n==0) return 0;
      if(n==1) return 1;
      if(dp[n]!=0) return dp[n];
      int f1 = fib(n-1);
      int f2 = fib(n-2);
        
      return dp[n]=f1+f2;
    }
}
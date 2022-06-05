class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
      if(triangle == null || triangle.size()==0) return 0;
      int m = triangle.size();
      int n = triangle.get(m-1).size();
      
      int [] dp = new int[n];
      for(int i=0;i<n;i++)
      {
          dp[i]=triangle.get(m-1).get(i);
      }
        
      for(int i=n-2;i>=0;i--)
      {
          List<Integer> list = triangle.get(i);
          for(int j=0;j<list.size();j++)
          {
              dp[j]= Math.min(dp[j],dp[j+1])+list.get(j);
          }
      }
        return dp[0];
    }
}


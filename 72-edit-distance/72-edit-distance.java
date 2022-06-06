class Solution {
    public int minDistance(String str1, String str2) {
   int [][] dp = new int[str2.length()+1][str1.length()+1];
   for(int i=0;i<str2.length()+1;i++)
     {
       for(int j=0;j<str1.length()+1;j++)
         {
           dp[i][j]=j;
           
         }
       dp[i][0]=i;
     }
  
  for(int i=1;i<str2.length()+1;i++)
    {
      for(int j=1;j<str1.length()+1;j++)
        {
          if(str2.charAt(i-1)==str1.charAt(j-1)){
            dp[i][j]=dp[i-1][j-1];
          }else{
            dp[i][j]= 1+ Math.min(dp[i-1][j-1],Math.min(dp[i-1][j],dp[i][j-1]));
          }
        }
    }
   return dp[str2.length()][str1.length()];
    }
}
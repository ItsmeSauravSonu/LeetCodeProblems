class Solution {
    public boolean canPartition(int[] nums) {
         int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        if(sum%2==1) return false;
        
        sum=sum/2;
        int n=nums.length;
        boolean[][] dp=new boolean[n+1][sum+1];
        for(int i=1;i<sum+1;i++)
            dp[0][i]=false;
        for(int j=0;j<n+1;j++)
            dp[j][0]=true;
       
        for(int i=1;i<n+1;i++)
        {
            for(int j=1;j<sum+1;j++)
            {
                if(j>=nums[i-1])
                    dp[i][j]=dp[i-1][j-nums[i-1]] || dp[i-1][j];
                else
                   dp[i][j]= dp[i-1][j];
            }
        }
        
    return dp[n][sum];
    }
}
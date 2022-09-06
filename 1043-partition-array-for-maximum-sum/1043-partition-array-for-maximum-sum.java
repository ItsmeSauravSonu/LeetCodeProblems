class Solution {
    public int f(int idx, int k, int [] arr, int [] dp){
        if(idx==arr.length) return 0;
        
        int currMax = 0;
        int sumMax = 0;
        if(dp[idx]!=-1) return dp[idx];
        for(int i=0;i<k;i++){
            int subL = idx+i;
            if(subL>=arr.length) break;
            
            currMax = Math.max(currMax, arr[subL]);
            int leftSum = currMax * (i+1);
            int rightSum = f(subL+1, k, arr,dp);
            sumMax = Math.max(sumMax, leftSum + rightSum);
        }
        return dp[idx]=sumMax;
    }
    public int maxSumAfterPartitioning(int[] arr, int k) {
        int n = arr.length;
        int [] dp = new int[n+1];
        Arrays.fill(dp, -1);
        return f(0, k, arr,dp);
    }
}
class Solution {
    public int findMaxForm(String[] strs, int m, int n) {
        int  len = strs.length;
        int [][][] dp = new int[len+1][m+1][n+1];
        for(int k = 1; k<=len;k++){
            for(int i=0;i<=m;i++){
                for(int j=0;j<=n;j++){
                    int countOne = 0;
                    for(char ch: strs[k-1].toCharArray()){
                        if(ch=='1') countOne++;
                    }
                    int countZero = strs[k-1].length()-countOne;
                    if(countOne<=j && strs[k-1].length()-countOne<=i){
                        dp[k][i][j]=Math.max(1+dp[k-1][i-countZero][j-countOne], dp[k-1][i][j]);
                    }else dp[k][i][j]=dp[k-1][i][j];
                }
            }
        }
        return dp[len][m][n];
    }
}
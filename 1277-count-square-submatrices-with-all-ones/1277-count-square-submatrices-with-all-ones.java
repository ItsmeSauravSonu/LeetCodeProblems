class Solution {
    public int solve(int [][] matrix, int i, int j, int n, int m, int [][] moves, int [][]dp){
        if(i<0 || i>=n || j<0 || j>=m || matrix[i][j]==0) return 0;
        
        int res = Integer.MAX_VALUE;
        if(dp[i][j]!=-1) return dp[i][j];
        for(int [] mat: moves){
            int ni = i+mat[0];
            int nj = j+mat[1];
            
            res = Math.min(res, solve(matrix, ni, nj, n, m, moves,dp)+1);
            dp[i][j]=res;
        }
        return res;
    }
    public int countSquares(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int [][] dp = new int[n+1][m+1];
        for(int [] d: dp){
            Arrays.fill(d,-1);
        }
        int count = 0;
        int [][] moves = {{1,0},{0,1},{1,1}};
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==0){
                    continue;
                }else{
                   count+=solve(matrix, i, j, n, m, moves,dp);  
                }       
            }
        }
        return count;
    }
}
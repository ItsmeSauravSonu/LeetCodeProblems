class Solution {
    public void dfs(char [][] grid, int [] dirRow, int [] dirCol, int row, int col){
        int n = grid.length, m = grid[0].length;
        grid[row][col]='#';
        for(int i=0;i<4;i++){
            int nRow = row + dirRow[i];
            int nCol = col + dirCol[i];
            
            if( nRow>=0 && nRow<n && nCol>=0 && nCol<m && grid[nRow][nCol]=='1' && grid[nRow][nCol]!='#'){
                dfs(grid, dirRow, dirCol, nRow, nCol);
            }
        }
    }
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        
        int count = 0;
        int [] dirRow = {-1,0,+1, 0};
        int [] dirCol = {0,+1, 0, -1};
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]=='1'){
                    count++;
                    dfs(grid, dirRow, dirCol,  i, j);
                }
            }
        }
        return count;
    }
}
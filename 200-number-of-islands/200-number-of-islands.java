class Solution {
    public int numIslands(char[][] grid) {
      if(grid == null || grid.length==0)
          return 0;
      boolean [][] visited = new boolean[grid.length][grid[0].length];
      int count = 0;
      for(int i=0;i<grid.length;i++)
      {
          for(int j=0;j<grid[0].length;j++)
          {
              if(grid[i][j]=='1'  && visited[i][j]==false)
              {
                  dfs(grid, visited, i, j);
                  count++;
              }
          }
      }
    return count;
    }
    
    public void dfs(char [][] grid, boolean [][] visited, int i, int j)
    {
        if(i<0 || i>=grid.length || j<0 || j>=grid[0].length || visited[i][j]==true || grid[i][j]=='0')
        {
            return;
        }
        visited[i][j]=true;
        dfs(grid, visited, i,j+1);
        dfs(grid, visited,i+1,j);
        dfs(grid,visited,i,j-1);
        dfs(grid,visited,i-1,j);
    }
}
// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String[] s = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            char[][] grid = new char[n][m];
            for (int i = 0; i < n; i++) {
                String[] S = br.readLine().trim().split(" ");
                for (int j = 0; j < m; j++) {
                    grid[i][j] = S[j].charAt(0);
                }
            }
            Solution obj = new Solution();
            int ans = obj.numIslands(grid);
            System.out.println(ans);
        }
    }
}// } Driver Code Ends


class Solution {
    // Function to find the number of islands.
    public int numIslands(char[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
       boolean [][] visited = new boolean[row][col];
       int count=0;
       for(int i=0;i<row;i++)
       {
           for(int j=0;j<col;j++)
           {
               if(grid[i][j]=='1' && visited[i][j]==false)
               {
                   dfs(grid,visited, i, j);
                   count++;
               }
           }
       }
       return count;
    }
    public void dfs(char[][] grid, boolean [][] visited, int i, int j)
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
         dfs(grid, visited, i + 1, j + 1); //upward-right side traversal
         dfs(grid, visited, i - 1, j - 1); //downward-left side traversal
         dfs(grid, visited, i + 1, j - 1); //downward-right side traversal
         dfs(grid, visited, i - 1, j + 1); //upward-left side traversal
            }
    }

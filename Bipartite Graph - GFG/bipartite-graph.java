// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String[] S = br.readLine().trim().split(" ");
            int V = Integer.parseInt(S[0]);
            int E = Integer.parseInt(S[1]);
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
            for(int i = 0; i < V; i++){
                adj.add(new ArrayList<Integer>());
            }
            for(int i = 0; i < E; i++){
                String[] s = br.readLine().trim().split(" ");
                int u = Integer.parseInt(s[0]);
                int v = Integer.parseInt(s[1]);
                adj.get(u).add(v);
                adj.get(v).add(u);
            }
            Solution obj = new Solution();
            boolean ans = obj.isBipartite(V, adj);
            if(ans)
                System.out.println("1");
            else System.out.println("0");
       }
    }
}// } Driver Code Ends


class Solution
{
    public boolean isBipartite(int V, ArrayList<ArrayList<Integer>>adj)
    {
      int len = adj.size();
      int [] colors = new int[len];
      
      for(int i=0;i<len;i++)
      {
          if(colors[i]==1 || colors[i]==-1) continue;
          Queue<Integer> queue = new LinkedList<>();
          queue.add(i);
          colors[i]=1;
          
          while(!queue.isEmpty())
          {
              int cur = queue.poll();
              for(int next: adj.get(cur))
              {
                  if(colors[next]==0)
                  {
                    colors[next]=-colors[cur];
                    queue.add(next);
                  }
                  if(colors[next]==colors[cur]) return false;
              }
          }
      }
      return true;
    }
}
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
            int V = Integer.parseInt(s[0]);
            int E = Integer.parseInt(s[1]);
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
            for (int i = 0; i < V; i++) adj.add(i, new ArrayList<Integer>());
            for (int i = 0; i < E; i++) {
                String[] S = br.readLine().trim().split(" ");
                int u = Integer.parseInt(S[0]);
                int v = Integer.parseInt(S[1]);
                adj.get(u).add(v);
                adj.get(v).add(u);
            }
            Solution obj = new Solution();
            boolean ans = obj.isCycle(V, adj);
            if (ans)
                System.out.println("1");
            else
                System.out.println("0");
        }
    }
}// } Driver Code Ends


class Solution {
    // Function to detect cycle in an undirected graph.
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
       boolean visited [] = new boolean[V];
       for(int i=0;i<V;i++)
       {
           if(visited[i]==false)
           {
               boolean ans = dfs(adj, i, visited,-1);
               if(ans == true) return true;
           }
       }
       return false;
    }
    public static boolean dfs(ArrayList<ArrayList<Integer>> adj, int i, boolean visited [], int parent)
    {
        visited[i]=true;
        ArrayList<Integer> neighbours = adj.get(i);
        for(int k=0;k<neighbours.size();k++)
        {
            int curr = neighbours.get(k);
            if(visited[curr]==false)
            {
                boolean ans = dfs(adj, curr, visited,i);
                if(ans == true) return true;
            }else if(curr !=parent){
                return true;
            }
        }
        return false;
    }
}
// { Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class DriverClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            ArrayList<ArrayList<Integer>> list = new ArrayList<>();
            int V = sc.nextInt();
            int E = sc.nextInt();
            for (int i = 0; i < V + 1; i++)
                list.add(i, new ArrayList<Integer>());
            for (int i = 0; i < E; i++) {
                int u = sc.nextInt();
                int v = sc.nextInt();
                list.get(u).add(v);
            }
            if (new Solution().isCyclic(V, list) == true)
                System.out.println("1");
            else
                System.out.println("0");
        }
    }
}// } Driver Code Ends


/*Complete the function below*/

class Solution {
    // Function to detect cycle in a directed graph.
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean visited []= new boolean[V];
        boolean helper [] = new boolean[V];
        
        for(int i=0;i<V;i++)
        {
            if(visited[i]==false)
            {
                boolean ans = dfs(adj, i, visited, helper);
                if(ans == true) return true;
            }
        }
        return false;
    }
    public static boolean dfs( ArrayList<ArrayList<Integer>> adj, int i,boolean visited [] ,boolean helper [])
    {
        visited[i]=true;
        helper[i]=true;
        ArrayList<Integer> neighbours = adj.get(i);
        for(int k=0;k<neighbours.size();k++)
        {
            int curr = neighbours.get(k);
            if(helper[curr]==true) return true;
            if(visited[curr]==false)
            {
                boolean ans = dfs(adj, curr, visited, helper);
                if(ans == true) return true;
            }
        }
        helper[i]=false;
        return false;
    }
}
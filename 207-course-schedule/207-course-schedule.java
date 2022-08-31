class Solution {
    public boolean dfs(int node, int [] visited, ArrayList<Integer>[] adj){
        
        if(visited[node]==1){
            return false;
        }
        if(visited[node]==2){
            return true;
        }
        
        visited[node]=1;
        
        for(int n: adj[node]){
            if(!dfs(n, visited, adj)){
                return false;
            }
        }
        
        visited[node]=2;
        return true;
        
    }
    public boolean canFinish(int n, int[][] grid) {
        
        ArrayList<Integer> [] adj= new ArrayList[n]; //adjacency list
        
        for(int i=0;i<n;i++){
            adj[i]=new ArrayList<>();
        }
        
        for(int [] pre: grid){
            adj[pre[0]].add(pre[1]);
        }
        
        int visited [] = new int[n];
        for(int i=0;i<n;++i){
            if(!dfs(i, visited, adj)){
                return false;
            }
        }
        return true;
    }
}
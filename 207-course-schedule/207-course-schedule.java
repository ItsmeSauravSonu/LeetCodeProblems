class Solution {
   

    public boolean canFinish(int v, int[][] edge) {
        //List of List of integer to store the given graph
					List<List<Integer>> adj = new ArrayList<>();
					for(int i =0;i<v;i++){
						adj.add(new ArrayList<>());
					}
					for(int i=0;i<edge.length;i++){
						adj.get(edge[i][0]).add(edge[i][1]);
					}
					boolean[] vis = new boolean[v+1];
					boolean[] stack = new boolean[v+1];
					for(int i=0;i<v;i++){
						if(!vis[i]){
						//if any traversal returns true i.e there is a cycle and no such ordering is possible 
							if(dfs(adj,vis,stack,i)){
								return false;
							}
						}
					}
					return true;
				}
				//DFS traversal to find wheter the cycle is present or not in the given graph
				public boolean dfs(List<List<Integer>> adj , boolean[] vis , boolean[]stack , int key){
				// mark current vertex as visited and recursively call for its adjacent nodes ....... also mark stack[key] as true to represent the node is    
				//present in recursive stack
				
					vis[key] = true;
					stack[key] = true;
					for(int x : adj.get(key)){
						if(!vis[x]){
							if(dfs(adj,vis,stack,x)){
								return true;
							}
						}
						if(stack[x]){
							return true;
						}
					}
	//	recursive call for current node/ vertex is over so mark stack[key] = false to represent that this node is no longer  in the recursive call stack
					stack[key] = false;
					return false;
				}
			}

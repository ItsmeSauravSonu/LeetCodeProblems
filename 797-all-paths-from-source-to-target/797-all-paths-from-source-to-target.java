class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
      dfs(graph, 0, graph.length-1, new ArrayList<>());
      return ans;
    }
    private void dfs(int [][] graph, int source, int destination, List<Integer> list){
        list.add(source);
        if(source==destination)
        {
            ans.add(list);
            return;
        }
        for(int neighbour: graph[source])
        {
            dfs(graph, neighbour, destination, new ArrayList<>(list));
        }
    }
}
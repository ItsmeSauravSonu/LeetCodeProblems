class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
            if(source == destination) return true;
        HashMap<Integer,List<Integer>> vertices = new HashMap<>();
        for(int i = 0; i < edges.length; i++) {
            if(!vertices.containsKey(edges[i][0])) {
            vertices.put(edges[i][0], new ArrayList<Integer>());
            }
            if(!vertices.containsKey(edges[i][1])) {
            vertices.put(edges[i][1], new ArrayList<Integer>());
            }
            vertices.get(edges[i][0]).add(edges[i][1]);
            vertices.get(edges[i][1]).add(edges[i][0]);
        }
        boolean [] visited = new boolean[n+1];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(source);
        visited[source]=true;
            
        while(!queue.isEmpty())
        {
                int v = queue.poll();
                List<Integer> temp = vertices.get(v);
                // System.out.println(temp);
                for(int i: temp)
                {
                        if(visited[i]==false)
                        {
                                visited[i]=true;
                                queue.add(i);
                        }
                }
        }
            
      return visited[destination];
    }
}
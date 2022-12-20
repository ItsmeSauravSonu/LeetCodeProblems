class Solution {
    boolean[] visited;
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        //visited array
        visited = new boolean[rooms.size()];
        visited[0] = true;
        //visiting from room 0
        dfs(rooms,0);
        for(boolean b:visited){
            if(!b){
                return false;
            }
        }
        return true;
    }
    public void dfs(List<List<Integer>> rooms,int i){
        for(int j:rooms.get(i)){
            //if true then no need to do anything..but if not visited then mark it visited and call recursion
            if(!visited[j]){
                visited[j]=true;
                //visiting other rooms if we have key
                dfs(rooms,j);
            }
        }
    }
}
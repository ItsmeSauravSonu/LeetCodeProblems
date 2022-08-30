class Solution {
    public void provincesInfo(int [][] isConnected, boolean [] visited, int currentCity){
        if(visited[currentCity]==false){
            visited[currentCity]=true;
            for(int i=0;i<isConnected.length;i++){
                if(isConnected[currentCity][i]==1)
                provincesInfo(isConnected , visited , i);
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        int numOfCities = isConnected.length;
        boolean [] visited = new boolean[numOfCities];
        int countOfProvinces = 0;
        for(int currentCity=0;currentCity<numOfCities;++currentCity){
            if(visited[currentCity]==false){
                countOfProvinces++;
                provincesInfo(isConnected, visited, currentCity);
            }
        }
        return countOfProvinces;
    }
}
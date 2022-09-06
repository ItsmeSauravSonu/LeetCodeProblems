class Solution {
    public int superEggDrop(int E, int F) {
        
        int[][] floors = new int[F+1][E+1];
        
        for (int d=1; d<=F; d++) {
            for (int e=1; e<=E; e++) {
                
                floors[d][e] = 1 
                    + floors[d-1][e-1] 
                    + floors[d-1][e];
                
                if (floors[d][e] >= F) {
                    return d;
                }
            }
        }
        
        return -1;
}
}
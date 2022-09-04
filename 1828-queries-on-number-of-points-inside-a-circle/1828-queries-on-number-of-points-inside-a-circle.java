class Solution {
    public int[] countPoints(int[][] P, int[][] Q) {
       int[] res = new int[Q.length];
        if(P.length==0 || Q.length==0) return res;
        int i=0;
        for(int[] q: Q){
            for (int[] p: P){
                if(Math.pow(p[0]-q[0], 2) + Math.pow(p[1]-q[1],2) <= Math.pow(q[2],2))
                    res[i]++;
            }
            i++;
        }
        return res; 
    }
}
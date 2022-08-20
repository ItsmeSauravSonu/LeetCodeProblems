class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxi = Integer.MIN_VALUE;
        for(String x: sentences){
            String [] y = x.split(" ");
            maxi = Math.max(y.length, maxi);
        }
        
        return maxi;
    }
}
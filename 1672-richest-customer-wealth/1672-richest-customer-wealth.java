class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxi = Integer.MIN_VALUE;
        for(int [] x: accounts)
        {
            int sum = 0;
            for(int i: x){
                sum+=i;
            }
            maxi = Math.max(maxi, sum);
        }
        return maxi;
    }
}
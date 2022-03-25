class Solution {
    public int twoCitySchedCost(int[][] costs) {
            
      int cost=0;
        Arrays.sort(costs,(a,b)->(a[1]-a[0])-(b[1]-b[0]));   
        int n = costs.length;
        for(int i=0;i<n;i++)
        {   
            cost+=i<n/2? costs[i][1] : costs[i][0];
        }
      
        return cost;
 

        
    }
}
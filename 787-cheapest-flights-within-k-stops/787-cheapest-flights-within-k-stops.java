class Tuple{
    int src;
    int cost;
    int stops;
    Tuple(int s, int c, int st){
        src = s;
        cost = c;
        stops = st;
    }
}
class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        if(flights.length == 0)
            return -1;
        Map<Integer,List<int[]>> adj = new HashMap<>();
        for(int[] arr : flights){
            int s = arr[0];
            int d = arr[1];
            int c = arr[2];
            if(!adj.containsKey(s))
                adj.put(s,new ArrayList<>());
            adj.get(s).add(new int[]{d,c});
        }
        PriorityQueue<Tuple> pq = new PriorityQueue<>((a,b)->a.cost-b.cost == 0 ? a.src - b.src : 
                                         a.cost - b.cost);
        pq.add(new Tuple(src,0,0));
        int[][] dp = new int[n+1][k+1];
        for(int[] arr : dp)
            Arrays.fill(arr,Integer.MAX_VALUE);
        dp[src][0] = 0;
        int minCost = Integer.MAX_VALUE;
        while(pq.size() != 0){
            Tuple curr = pq.poll();
            int cost = curr.cost; 
            int stops = curr.stops; 
            int city = curr.src;
            if(city == dst)
                minCost = Math.min(minCost,cost);
            if(stops > k)
                continue;       
            if(adj.containsKey(city)){
                for(int[] p : adj.get(city)){
                    if(dp[p[0]][stops] > cost + p[1]){
                        pq.add(new Tuple(p[0],cost + p[1],stops+1));
                        dp[p[0]][stops] = cost + p[1];
                    }
                }
            }
        }
        if(minCost == Integer.MAX_VALUE)
            return -1;
        else
            return minCost;
    }
}
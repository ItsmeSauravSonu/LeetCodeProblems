class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        int[] distance = new int[n];
        Arrays.fill(distance, Integer.MAX_VALUE);
        Map<Integer, List<Pair>> adj = new HashMap<>();
        for(int [] flight : flights){
            adj.computeIfAbsent(flight[0], value -> new ArrayList<>()).add(new Pair(flight[1], flight[2]));
        }
       
        // bfs       
        Queue<Pair> q = new ArrayDeque<>();
        q.add(new Pair(src, 0));
        distance[src] = 0;
        int steps = 0;
        
        while(!q.isEmpty() && steps <= k){
            int N = q.size();
            while(N-- > 0){
                int u = q.peek().node;
                int price = q.peek().price;
                q.poll();
                if (!adj.containsKey(u))
                    continue;
                for(Pair p : adj.get(u)){
                    int v = p.node;
                    int cost = p.price;
                    
                    if(distance[v] > price + cost){
                        distance[v] = price + cost;
                        q.add(new Pair(v, price+cost));
                    }
                }
            }
            steps++;
        }
        
        return distance[dst] == Integer.MAX_VALUE ? -1 : distance[dst];
    }
}

class Pair {
    int node;
    int price;
    
    Pair(int _node, int _price){
        this.node = _node;
        this.price = _price;
    }
}


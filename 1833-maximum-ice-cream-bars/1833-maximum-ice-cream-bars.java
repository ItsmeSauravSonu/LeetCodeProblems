class Solution {
    public int maxIceCream(int[] costs, int coins) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int x: costs){
            pq.add(x);
        }
        int count=0;
        while(coins>0 && !pq.isEmpty()){
            int z = pq.poll();
            if(coins>=z){
                coins = coins-z;
                count++;
            }
        }
        return count;
    }
}
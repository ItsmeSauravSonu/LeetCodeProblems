class Solution {
    public int findMinCost(int[] cost, int i, HashMap<Integer, Integer> memo) {
        if (i < 0) {
            return 0;
        }
        if (memo.containsKey(i)) {
            return memo.get(i);
        }
        int minCost = Math.min(findMinCost(cost, i-1, memo), findMinCost(cost, i-2, memo)) + cost[i];
        memo.put(i, minCost);
        return minCost;
    }
    
    public int minCostClimbingStairs(int[] cost) {
        HashMap<Integer, Integer> memo = new HashMap<>();
        return Math.min(findMinCost(cost, cost.length-1, memo), findMinCost(cost, cost.length-2, memo));
    }
}
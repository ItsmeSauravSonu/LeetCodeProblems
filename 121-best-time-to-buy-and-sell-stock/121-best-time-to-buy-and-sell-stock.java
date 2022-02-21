class Solution {
    public int maxProfit(int[] prices) {
     int least_so_far = Integer.MAX_VALUE;
     int max_profit = 0;
     int profit_if_sold_today = 0;      
     for(int i=0;i<prices.length;i++)
     {
        if(prices[i]<least_so_far)
                least_so_far = prices[i];
        profit_if_sold_today = prices[i]-least_so_far;
        max_profit = Math.max(max_profit,profit_if_sold_today);
     }
     return max_profit;
    }
}
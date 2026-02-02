class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int minimum = prices[0];
        for(int i = 1 ; i < prices.length ; i++){
            int cost = prices[i] - minimum;
            if(cost > profit){
                profit = cost;
            }
            if(prices[i] < minimum){
                minimum = prices[i];
            }
        }
        return profit;
    }
}
class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int minBuyPrice = Integer.MAX_VALUE;

        for(int i=0; i<prices.length; i++){
            if(minBuyPrice > prices[i]){
                minBuyPrice = prices[i];
            } else if (prices[i] - minBuyPrice > profit){
                profit = prices[i] - minBuyPrice;
            }
        }

        return profit;
    }
}

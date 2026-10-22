class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int maxProfit = 0;

        for(int right = 0; right < prices.length; right++) {
            if(prices[right] < minPrice) {
                minPrice = prices[right];
            }
            int profit = prices[right] - minPrice;
            maxProfit = Math.max(profit, maxProfit);
        }

        return maxProfit;  
    }
}

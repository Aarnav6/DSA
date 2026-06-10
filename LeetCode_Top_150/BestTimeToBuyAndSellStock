// 121. Best Time to Buy and Sell Stock

class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;
        for(int i=0 ; i<prices.length ; i++) {
            if (prices[i] < minPrice) { // checking for lowest prices ever gotten
                minPrice = prices[i];
            } else {
                if (prices[i] - minPrice > maxProfit) { // checking if profit is more than previous one 
                    maxProfit = prices[i] - minPrice;
                }
            }
        }
        return maxProfit;
    }
}

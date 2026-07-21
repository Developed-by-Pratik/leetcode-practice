class Solution {
    public int maxProfit(int[] prices) {

        // brute force approach - O(n^2)

        // int max = 0;
        // int profit = 0;

        // for (int i = 0; i < prices.length; i++) {
        //     for (int j = i + 1; j < prices.length; j++) {
        //         if (prices[i] < prices[j]) {
        //             profit = prices[j] - prices[i];
        //             if (max < profit) {
        //                 max = profit;
        //             }
        //         }
        //     }
        // }
        // return max;

        int minPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            int profit = prices[i] - minPrice;
            maxProfit = Math.max(maxProfit, profit);
            minPrice = Math.min(minPrice, prices[i]);
        }

        return maxProfit;
    }
}
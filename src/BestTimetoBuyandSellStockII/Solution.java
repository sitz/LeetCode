package BestTimetoBuyandSellStockII;

/**
 * Created by sitesh on 3/5/14.
 */
public class Solution {
    public int maxProfit(int[] prices) {
        int totalMax = 0;
        for (int i = 1; i < prices.length; i++) {
            totalMax += Math.max(0, prices[i] - prices[i - 1]);
        }

        return totalMax;
    }
}
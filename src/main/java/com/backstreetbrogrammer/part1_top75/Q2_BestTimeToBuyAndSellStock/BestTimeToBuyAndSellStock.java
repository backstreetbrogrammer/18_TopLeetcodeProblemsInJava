package com.backstreetbrogrammer.part1_top75.Q2_BestTimeToBuyAndSellStock;

public class BestTimeToBuyAndSellStock {

    public static void main(final String[] args) {
        System.out.println(maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
        System.out.println(maxProfit(new int[]{7, 6, 4, 3, 1}));
    }

    private static int maxProfit(final int[] prices) {
        int l = 0, r = 1;
        int maxP = 0;
        while (r < prices.length) {
            if (prices[l] < prices[r]) {
                maxP = Math.max(prices[r] - prices[l], maxP);
            } else {
                l = r;
            }
            r++;
        }

        return maxP;
    }

}

package algo.leetcode100;

//You are given an array prices where prices[i] is the price of a given stock on the ith day.
//        You want to maximize your profit by choosing a single day to buy one stock and choosing
//        a different day in the future to sell that stock.
//        Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
// prices = [7, 1, 3, 4, 5, 2, 6, 1]


public class StockSellBuyD1 {
    public static void main(String args[]) {
        int []prices = {7, 1, 3, 4, 5, 2, 6, 1};
        int n = prices.length;
        int ans = 0;
        int min = prices[0];
        for (int i=1; i<n; i++) {
            int currentProfit = prices[i] - min;
            if(currentProfit > ans) {
                ans = currentProfit;
            }
            min = Math.min(prices[i], min);
        }
        System.out.println("The maximum profit: "+ ans);
    }
}

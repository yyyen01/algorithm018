/*
 * @lc app=leetcode id=122 lang=java
 *
 * [122] Best Time to Buy and Sell Stock II
 */

// @lc code=start
class Solution {
    public int maxProfit(int[] prices) {
       int profit = 0;
       
       if (prices == null || prices.length == 0) return profit;
        
       for (int i = 1; i < prices.length; i++) {
         if (prices[i] > prices[i -1]) {
            profit += prices[i] - prices[i -1];
         }
       }
       return profit;
    }
}
// @lc code=end


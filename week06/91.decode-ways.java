/*
 * @lc app=leetcode id=91 lang=java
 *
 * [91] Decode Ways
 */

// @lc code=start
class Solution {
    public int numDecodings(String s) {        
        if (s == null || s.length() == 0) return 0;
        int length = s.length();
        int[] dp = new int[length + 1];
        dp[0] = 1;
        dp[1] = s.charAt(0) != '0'? 1 : 0;
        for (int i = 2; i <= length; i++) {
            
            int value1 = Integer.parseInt(s.substring(i - 1, i)); 
            int value2 = Integer.parseInt(s.substring(i - 2, i)); 
            if (value1 > 0 && value1 < 10) dp[i] += dp[i -1];
            if (value2 > 9 && value2 < 27) dp[i] += dp[i -2];

        }

        return dp[length];
    }
}
// @lc code=end


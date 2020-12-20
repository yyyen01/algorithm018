/*
 * @lc app=leetcode id=709 lang=java
 *
 * [709] To Lower Case
 */

// @lc code=start
class Solution {
    public String toLowerCase(String str) {
      StringBuilder builder = new StringBuilder();
      
      for (char c : str.toCharArray()) {
         // if (c >= 'A' && c <= 'Z') c += 32;
         c |= 32;
          builder.append(c);
      }

      return builder.toString();
    }
}
// @lc code=end


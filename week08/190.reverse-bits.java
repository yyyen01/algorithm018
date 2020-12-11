/*
 * @lc app=leetcode id=190 lang=java
 *
 * [190] Reverse Bits
 */

// @lc code=start
public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
      int result = 0;
      for (int i = 0; i < 32; i++) {
          result <<= 1;
          if ((n & 1) == 1) result++;
          n >>= 1;
      }  
      return result;
    }
}
// @lc code=end


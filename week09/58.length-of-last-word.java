/*
 * @lc app=leetcode id=58 lang=java
 *
 * [58] Length of Last Word
 */

// @lc code=start
class Solution {
    public int lengthOfLastWord(String s) {
        int i = 0;
        s = s.trim();
        if (s.length() == 0) return 0;
        for (i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') return s.length() - i - 1;
        }
        return s.length();
    }
}
// @lc code=end


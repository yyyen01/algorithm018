import java.util.Arrays;

/*
 * @lc app=leetcode id=455 lang=java
 *
 * [455] Assign Cookies
 */

// @lc code=start
class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int count = 0;
        int j = 0;
        for (int i = 0; i < g.length; i++) {
            while (j < s.length) {
                if (s[j++] >= g[i]) {
                    count++;
                    break;
                }
            }
        }
            
        return count;
    }
    
}
// @lc code=end


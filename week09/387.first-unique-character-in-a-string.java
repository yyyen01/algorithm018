import sun.print.resources.serviceui;

/*
 * @lc app=leetcode id=387 lang=java
 *
 * [387] First Unique Character in a String
 */

// @lc code=start
class Solution {
    public int firstUniqChar(String s) {
        int[] word = new int[26];

        for (int i : s.toCharArray())  word[i - 'a']++;
        
        for (int i = 0; i < s.length(); i++) {
            if ( word[s.charAt(i) - 'a'] == 1 ) return i;
        }

        return -1;
    }
}
// @lc code=end


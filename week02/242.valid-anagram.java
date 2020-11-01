import java.util.HashMap;
import java.util.HashSet;

/*
 * @lc app=leetcode id=242 lang=java
 *
 * [242] Valid Anagram
 */

// @lc code=start
class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map= new HashMap<>();

        if (s.length() != t.length()) return false;

        for (char c:s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0 ) + 1);
        }

        for (char c:t.toCharArray()) {
            int count = map.getOrDefault(c, 0);
            if ( count == 0)  return false;

            map.put(c, --count);

        }
        return true;

    }
}
// @lc code=end


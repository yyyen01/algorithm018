import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.HashMap;

/*
 * @lc app=leetcode id=49 lang=java
 *
 * [49] Group Anagrams
 */

// @lc code=start
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for (String s1 : strs) {
            char[] c = s1.toCharArray();
            Arrays.sort(c);
            String s2 = String.valueOf(c);

            if (!map.containsKey(s2)) {
                map.put(s2, new ArrayList<>() );
            }
            map.get(s2).add(s1);
        }
        return new ArrayList<>(map.values());

    }
}
// @lc code=end


/*
 * @lc app=leetcode id=557 lang=java
 *
 * [557] Reverse Words in a String III
 */

// @lc code=start
class Solution {
    public String reverseWords(String s) {
    StringBuilder res = new StringBuilder();
      String[] str = s.split(" ");
      for (int i = 0; i < str.length; i++) str[i] = new StringBuilder(str[i]).reverse().toString();
      for (String string : str) res.append(string).append(" ");      
      return res.toString().trim();             
    } 
}
// @lc code=end


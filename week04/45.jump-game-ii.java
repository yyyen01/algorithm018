/*
 * @lc app=leetcode id=45 lang=java
 *
 * [45] Jump Game II
 */

// @lc code=start
class Solution {
    public int jump(int[] nums) {
       int step = 0;
       int lastJump = 0;
       int maxJump = 0;
       
       for (int i = 0; i < nums.length - 1; i++) {
           maxJump = Math.max(maxJump, nums[i] + i);
           if (lastJump == i) {
               lastJump = maxJump;
               step++;
           }
       }
       return step;
    }

}
// @lc code=end


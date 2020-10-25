/*
 * @lc app=leetcode id=283 lang=java
 *
 * [283] Move Zeroes
 */

// @lc code=start
class Solution {
    public void moveZeroes(int[] nums) {        
        if (nums == null || nums.length == 1) 
            return;

        int nonZeroPos = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[nonZeroPos] = nums[i];
                if (i != nonZeroPos) {
                    nums[i] = 0;
                }
                nonZeroPos++;
            }                
            
        }

    }
}
// @lc code=end


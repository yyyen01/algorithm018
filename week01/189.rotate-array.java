/*
 * @lc app=leetcode id=189 lang=java
 *
 * [189] Rotate Array
 */

// @lc code=start
class Solution {
    public void rotate(int[] nums, int k) {
        if ( k > nums.length ) k= k - nums.length;
        if (nums.length > 1) {
            int[] temp = new int[k];
            System.arraycopy(nums, nums.length - k, temp, 0, k);
            System.arraycopy(nums, 0, nums, k, nums.length - k);
            System.arraycopy(temp, 0, nums,0, k);
        }
    }
}
// @lc code=endk


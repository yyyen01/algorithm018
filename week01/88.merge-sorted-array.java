/*
 * @lc app=leetcode id=88 lang=java
 *
 * [88] Merge Sorted Array
 */

// @lc code=start
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {  
        int k1 = m -1 , k2 = n - 1, endIndex = m + n - 1;

        while (k1 >= 0 && k2 >= 0) {
            nums1[endIndex--] = nums1[k1] > nums2[k2] ? nums1[k1--] : nums2[k2--];
        }

        while (k2 >= 0) {
            nums1[endIndex--] = nums2[k2--];
        }


    }
}
// @lc code=end


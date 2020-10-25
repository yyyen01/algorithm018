/*
 * @lc app=leetcode id=42 lang=java
 *
 * [42] Trapping Rain Water
 */

// @lc code=start
class Solution {
    public int trap(int[] height) {
        if (height.length < 3) return 0;
        int area = 0;
        int leftMax = height[0];
        int rightMax = height[height.length - 1];
        int left = 1;
        int right = height.length - 2;
        
        while (left < right){
            if (leftMax <= rightMax) {
                leftMax = Math.max(leftMax, height[left]);
                area += leftMax - height[left];
                left++;
            } else {
                rightMax = Math.max(rightMax, height[right]);
                area += rightMax - height[right];
                right--;
            }
        }
        return area;
    }
}
// @lc code=end


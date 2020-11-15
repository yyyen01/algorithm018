/*
 * @lc app=leetcode id=153 lang=java
 *
 * [153] Find Minimum in Rotated Sorted Array
 */

// @lc code=start
class Solution {
    public int findMin(int[] nums) {

    int start = 0, end = nums.length - 1;
    int mid = 0;    
    if (nums.length == 1 || nums[end] > nums[0]) return nums[0];
    while (start < end) {
        mid = (start + end) / 2;  
        
        if (nums[mid] < nums[end]) end = mid;
        else start = mid  + 1;                                   
    }   
    return nums[end];
    }


    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.findMin(new int[]{5,1,2,3,4}));
    }
}
// @lc code=end


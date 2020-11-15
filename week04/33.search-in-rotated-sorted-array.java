/*
 * @lc app=leetcode id=33 lang=java
 *
 * [33] Search in Rotated Sorted Array
 */

// @lc code=start
class Solution {
    public int search(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        int index = - 1;
        if (nums == null || nums.length == 0) return index;

        while (start <= end) {
            int mid = start + (end - start) / 2 ;

            if (nums[mid] == target) return mid;
            else if ( nums[start] <= nums[mid]) {                
                if (target >= nums[start] && target < nums[mid])   end = mid - 1;
                else start = mid + 1;                            
            } else {
                if (target <= nums[end] && target > nums[mid])   start = mid + 1;
                else end = mid - 1;       
            }
        }
        return index;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = new int[] {4,5,6,7,0,1,2};
        System.out.println(s.search(nums,3));
        
    }
}
// @lc code=end


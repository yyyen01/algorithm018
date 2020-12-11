import java.util.Arrays;

/*
 * @lc app=leetcode id=493 lang=java
 *
 * [493] Reverse Pairs
 */

// @lc code=start
class Solution {
    public int reversePairs(int[] nums) {
        if (nums == null) return 0;

        return mergedSort(nums,0, nums.length - 1);
    }

    private int  mergedSort(int[] nums, int start, int end) {
        if (start >= end) return 0;

        int mid = start + ((end - start)>>1);
        
        int count = mergedSort(nums, start, mid) + mergedSort(nums, mid + 1, end);
        int[] cache = new int[end - start + 1];
        int k = mid + 1, c = 0;
        for (int i = start, j = mid + 1; i <= mid; i++, c++) {
            while (j <= end && nums[i] > 2 * (long)nums[j]) j++;
            while (k <= end && nums[k] < nums[i]) cache[c++] = nums[k++];
            cache[c] = nums[i];
            count += j - (mid + 1);
        }

       while (k <= end)  cache[c++] = nums[k++];
        System.arraycopy(cache, 0, nums, start, end - start + 1);
      
        return count;
    }
}
// @lc code=end


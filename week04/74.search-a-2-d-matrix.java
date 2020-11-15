/*
 * @lc app=leetcode id=74 lang=java
 *
 * [74] Search a 2D Matrix
 */

// @lc code=start
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0) return false;
        int m = matrix.length, n = matrix[0].length;
        int start = 0;
        int end = m * n - 1;
        
        while (start <= end) {
            int mid = start + (end - start) / 2 ;

            if (matrix[mid / n][mid % n] == target) return true;
            
            if (matrix[mid / n][mid % n] > target) end = mid - 1;
            else  start = mid + 1;
        } 

        return false;
    }
}
// @lc code=end


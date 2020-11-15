/*
 * @lc app=leetcode id=200 lang=java
 *
 * [200] Number of Islands
 */

// @lc code=start
class Solution {
    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) return 0;

        int m = grid.length;
        int n = grid[0].length;
        int count = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1') {                    
                    markZero(grid,i,j);
                    count++;
                    
                }
                
            }
        }
        return count;
    }

    public void markZero(char[][] grid, int i, int j) {
        if (i < 0 || j < 0 || i >= grid.length  || j >= grid[0].length  || grid[i][j] == '0') return;

        grid[i][j] = '0';

        markZero(grid, i + 1, j);
        markZero(grid, i , j + 1);
        markZero(grid, i - 1, j);
        markZero(grid, i, j -1);
    }
}
// @lc code=end


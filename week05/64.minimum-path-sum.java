/*
 * @lc app=leetcode id=64 lang=java
 *
 * [64] Minimum Path Sum
 */

// @lc code=start
class Solution {
    public int minPathSum(int[][] grid) {
        if (grid == null || grid[0].length == 0 ) return 0;
        int m = grid.length;        
        int n = grid[0].length;

        int[][] ans = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) { 
                    if (i == 0 && j == 0) ans[i][j] = grid[i][j];            
                    else if (i == 0 && j > 0) ans[i][j] +=  ans[i][j -1] + grid[i][j]; 
                    else if (j == 0 && i > 0) ans[i][j] +=  ans[i -1][j] + grid[i][j]; 
                    else ans[i][j] = Math.min( ans[i][j - 1],  ans[i - 1][j]) + grid[i][j];
           
                //System.out.println("i="+i+",j="+j+",ans="+ ans[i][j]);
            }
        }

        return ans[m - 1][n - 1];
    }
}
// @lc code=end


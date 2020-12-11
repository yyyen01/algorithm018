import java.util.Arrays;

/*
 * @lc app=leetcode id=56 lang=java
 *
 * [56] Merge Intervals
 */

// @lc code=start
class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (v1, v2) -> v1[0] - v2[0]);

        int res[][] = new int[intervals.length][2];
        int index = -1;

        for (int[] num : intervals) {
            if (index == -1 || num[0] > res[index][1]) {
                res[++index] = num;
            }else {
                res[index][1] = Math.max(res[index][1], num[1]);
            }
        }
        return Arrays.copyOf(res, index + 1);
    }
}
// @lc code=end


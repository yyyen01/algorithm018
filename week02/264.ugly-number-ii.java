import java.util.PriorityQueue;

/*
 * @lc app=leetcode id=264 lang=java
 *
 * [264] Ugly Number II
 */

// @lc code=start
class Solution {
    private int[] ugly = {2,3,5};
    public int nthUglyNumber(int n) {
        PriorityQueue<Long> queue = new PriorityQueue<>();
        queue.add(1L);

        int count = 0;
        while (!queue.isEmpty()) {
            long cut = queue.poll();
            if (++count >= n) 
                return (int)cut;
            
            for (int u : ugly) {
                if (!queue.contains(u * cut)) {
                    queue.offer(u * cut);
                }
            }
        }
        return -1;
    }
}
// @lc code=end


import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/*
 * @lc app=leetcode id=347 lang=java
 *
 * [347] Top K Frequent Elements
 */

// @lc code=start
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        PriorityQueue<Map.Entry<Integer,Integer>> p = new PriorityQueue<>((o1,o2)->(o2.getValue() - o1.getValue()));
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] res = new int[k];

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],map.getOrDefault(nums[i],0) + 1);
        }

        for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
            p.add(entry);
        }
        int i = 0;
        while (i< k) {
            Map.Entry<Integer,Integer> m = p.poll();
            res[i++] = m.getKey();
        }
        
        return res;
    }
}
// @lc code=end


import java.util.HashMap;
import java.util.Map;

import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;

/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 */

// @lc code=start
class Solution {
    public int[] twoSum( int[] nums , int target ) {
    if (nums == null || nums.length == 0) return new int[0];
    
    Map<Integer,Integer> map = new HashMap<>();

    for (int i = 0; i < nums.length; i++) {
        int diff = target - nums[i];

        if (map.containsKey(diff)) {
            return new int[]{map.get(diff),i};
        }
        map.put(nums[i], i);
    
    }
    return new int[0];
    }
    
       
}
// @lc code=end


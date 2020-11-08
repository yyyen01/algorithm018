import java.util.List;
import java.util.ArrayList;

/*
 * @lc app=leetcode id=47 lang=java
 *
 * [47] Permutations II
 */

// @lc code=start
class Solution {
    List<List<Integer>> ans = new ArrayList<>(); 

    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        traverse(new ArrayList<Integer>(),nums, new boolean[nums.length]);
        return ans;
    }

    public void traverse(List<Integer> list, int[] nums, boolean[] used) {
        if (list.size() == nums.length) {
            ans.add(new ArrayList<Integer>(list));

        }

        for (int i = 0; i < nums.length; i++) {
            if (used[i]) continue;
            if (i > 0 && nums[i] == nums[i-1] && !used[i -1]) continue;
            used[i] = true;
            list.add(nums[i]);            
            traverse(list,nums,used);
            list.remove(list.size() - 1);
            //used[i] = false;
        }
    }
}
// @lc code=end


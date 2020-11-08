import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode id=46 lang=java
 *
 * [46] Permutations
 */

// @lc code=start
class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
      
        traverse(new ArrayList<Integer>(),nums);
       
        return ans;
    }

    public void  traverse(List<Integer> list,int[] nums) {
        if ( list.size() == nums.length ) {
            ans.add( new ArrayList<Integer>(list));
            return;
        }

            for (int i = 0; i < nums.length; i++) {
                if (list.contains(nums[i])) continue;
                    list.add(nums[i]);
                traverse(list,nums);
                list.remove(list.size() - 1);
            }

    }

    
}
// @lc code=end


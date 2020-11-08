import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode id=77 lang=java
 *
 * [77] Combinations
 */

// @lc code=start
class Solution {
   List<List<Integer>> ans = new ArrayList<>();
    public  List<List<Integer>> combine(int n, int k) {     
        traverse(1, new ArrayList<Integer>(), k, n ); 
        return ans;
    }

    public void traverse(int start,List<Integer> list, int k, int n) {
        if (k == 0) {
            ans.add(new ArrayList<Integer>(list));
            return;
        }

        //process
        for (int i = start ; i <= n-k + 1 ; i++) {
            list.add(i);
            traverse(i + 1, list, k - 1, n ); 
            list.remove(list.size() - 1);
        }
            
        
    }
}
// @lc code=end


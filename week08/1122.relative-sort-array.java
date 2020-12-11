/*
 * @lc app=leetcode id=1122 lang=java
 *
 * [1122] Relative Sort Array
 */

// @lc code=start
class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] bucket = new int[1001];
        int[] result = new int[arr1.length];
        int count = 0;

        for (int data1 : arr1) bucket[data1]++;
        
        for (int data2 : arr2) while (bucket[data2]-- > 0) result[count++] = data2;
        
        for (int i = 0; i < bucket.length; i++) while (bucket[i]-- > 0) result[count++] = i;
        
        return result;
    }
}
// @lc code=end


import java.util.Arrays;

/*
 * @lc app=leetcode id=242 lang=java
 *
 * [242] Valid Anagram
 */

// @lc code=start
class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();

        quickSort(sChar,0,s.length() - 1);
        quickSort(tChar,0,t.length() - 1);
        // System.out.println(tChar);
        // System.out.println(sChar);
        return Arrays.equals(tChar,sChar);
    }

    private void quickSort(char[] cs, int start, int end) {
        if (start >= end) return ;

        int pivot = partition(cs, start ,end);
        quickSort(cs, start, pivot - 1);
        quickSort(cs, pivot + 1, end);
    }

    private int partition(char[] cs, int start, int end) {
        int pivot = end, counter = start;
        for (int i = start; i < end; i++) {
            if (cs[i] < cs[pivot]) {
                char temp = cs[counter]; cs[counter] = cs[i]; cs[i] = temp;
                counter++;
            }
        }

        char temp = cs[pivot]; cs[pivot] = cs[counter]; cs[counter] = temp;
        return counter;
    }
}
// @lc code=end


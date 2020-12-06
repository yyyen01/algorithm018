/*
 * @lc app=leetcode id=127 lang=java
 *
 * [127] Word Ladder
 */

// @lc code=start
import java.util.*;
class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        HashSet<String> wordSet = new HashSet<>(wordList);
        HashSet<String> beginSet = new HashSet<>();
        HashSet<String> endSet = new HashSet<>();
        HashSet<String> visitedSet = new HashSet<>();

        if (!wordSet.contains(endWord)) return 0;

        beginSet.add(beginWord);
        endSet.add(endWord);

        int step = 1;
        //bfs
        while (!beginSet.isEmpty() && !endSet.isEmpty()) {
            //pick the smaller set to process 
            if (beginSet.size() > endSet.size()) {
                HashSet<String> tempSet = beginSet;
                beginSet = endSet;
                endSet = tempSet;
            }
            //hold the BFS results
            HashSet<String> temp = new HashSet<>();
            for (String string : beginSet) {
                char[] tempChars = string.toCharArray();
                for (int i = 0; i < tempChars.length; i++) {
                    char org = tempChars[i];
                    for (char j = 'a'; j <= 'z'; j++) {
                        if (j == org) continue;
                        tempChars[i] = j;                        
                        String newWord = String.valueOf(tempChars);
                        if (endSet.contains(newWord)) return step + 1;
                        if (wordSet.contains(newWord) && visitedSet.add(newWord)) temp.add(newWord);                                                                                                                                                      
                    }
                    tempChars[i] = org;                                      
                }
            }
            beginSet = temp;
            step++;
        }

        return 0;
    }
}
// @lc code=end


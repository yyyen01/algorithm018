import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 * @lc app=leetcode id=127 lang=java
 *
 * [127] Word Ladder
 */

// @lc code=start
class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList1) {
        if (!wordList1.contains(endWord)) return 0;
        
        Set<String> wordList = new HashSet<>(wordList1), start = new HashSet<>(), end = new HashSet<>(), visited = new HashSet<>();        
        start.add(beginWord);
        end.add(endWord);

        for (int i = 2; !start.isEmpty(); i++) {
            Set<String> tmp = new HashSet<>();

            for (String word : start) {
                for (int j = 0; j < word.length(); j++) {
                    char[] ch = word.toCharArray();
                    for (char c = 'a'; c <= 'z'; c++) {
                        ch[j] = c;
                        String newWord = new String(ch);
                        if (end.contains(newWord)) return i;
                        if (wordList.contains(newWord) && visited.add(newWord)) tmp.add(newWord);
                    }
                }
            }

            start = (tmp.size() < end.size()) ? tmp : end;
            end = (start == tmp) ? end : tmp;
        }

        return 0;
      
    }
}
// @lc code=end


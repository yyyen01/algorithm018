import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.HashSet;
import java.util.Set;
import java.util.Map;
import java.util.HashMap;

/*
 * @lc app=leetcode id=126 lang=java
 *
 * [126] Word Ladder II
 */

// @lc code=start
class Solution {
    List<List<String>> ans = new ArrayList<>();
    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
        Set<String> wordSet = new HashSet(wordList), begin = new HashSet<>(), end = new HashSet<>();
        
        if (!wordSet.contains(endWord)) return ans;
        //store the possible nodes in next level
        Map<String,List<String>> map = new HashMap<>();

        begin.add(beginWord);
        end.add(endWord);

        if (bfs(wordSet, begin, end, map, true)){
                dfs(beginWord, endWord, map, new ArrayList<>());
        }

        return ans;
    }

    public boolean bfs(Set<String> wordSet, Set<String> begin, Set<String> end,  Map<String,List<String>> map, boolean topdown) {
        if (begin.isEmpty()) return false;

        //always search with set with least elements
        if (begin.size() > end.size())  return bfs(wordSet, end, begin, map, !topdown);

        //remove all visited nodes
        wordSet.removeAll(begin);

        boolean isMeet = false;

        Set<String> nextLevel = new HashSet<>();

        for (String word : begin) {
            char[] cword = word.toCharArray();

            for (int i = 0; i < cword.length; i++) {
                char temp = cword[i];
                for (char j = 'a'; j <= 'z'; j++) {
                    cword[i] = j;

                    String newString = new String(cword);

                    if (wordSet.contains(newString)) {
                        nextLevel.add(newString);
                        //topdown:true, word->newString
                        //topdown:false, newString->word
                        String key = topdown ? word : newString;
                        String value = topdown ? newString : word;  

                        if (end.contains(newString))  isMeet = true;                                                   
                        if (!map.containsKey(key)) map.put(key, new ArrayList<>());

                        map.get(key).add(value);

                        
                    }
                }
                cword[i] = temp;
            }
        }
        return isMeet || bfs(wordSet, nextLevel, end, map, topdown);
    }

    public void dfs(String beginWord, String endWord, Map<String,List<String>> map, List<String> list) {
        list.add(beginWord);

        if (beginWord.equals(endWord)) {
            ans.add(new ArrayList<>(list));
            list.remove(list.size() - 1);
            return;

        }
        if (map.containsKey(beginWord)) {
            for (String childNode : map.get(beginWord)) {
              dfs(childNode, endWord, map, list);
            }
        }
      list.remove(list.size() - 1);  
    }
}   
// @lc code=end


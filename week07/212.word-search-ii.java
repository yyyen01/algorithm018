/*
 * @lc app=leetcode id=212 lang=java
 *
 * [212] Word Search II
 */
import java.util.*;
// @lc code=start
class Solution {
    List<String> ans = new ArrayList<>();
    int[] xs = {-1,1,0,0};
    int[] ys = {0,0,-1,1};
    Trie trie = new Trie();
    public List<String> findWords(char[][] board, String[] words) {
        if (board == null || words == null) return ans;
        

        for (String string : words) {
            trie.insert(string); 
        }
      
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (trie.isContain(board[i][j], trie.root)){
                    dfs(board, i, j, trie.root);
                }
            }
        }
        return ans;
    }

    private void dfs(char[][] board, int x, int y, TrieNode root){
        char org = board[x][y];
        TrieNode node = root.next[org - 'a'];
       
        if (!node.isWord.equals("")){
            ans.add(node.isWord);
            node.isWord = "";
        }

       
        board[x][y] = '.';
        for (int i = 0; i < 4; i++) {
            int newX = x + xs[i];
            int newY = y + ys[i];
            if (newX < 0 || newY < 0 || newX >= board.length || newY >= board[0].length || board[newX][newY] == '.')  continue;
            
            if (trie.isContain(board[newX][newY], node)){
                dfs(board, newX, newY, node);
            }
            
        }
        board[x][y] = org;
    }
}

class TrieNode {
    TrieNode[] next;
    String isWord;
    TrieNode() {
        this.isWord = "";
        this.next = new TrieNode[26];
    }
}

class Trie {
    public TrieNode root;
    Trie() {
        root = new TrieNode();
    }
    public void insert(String s) {
        TrieNode curr = root;

        for (int i = 0; i < s.length(); i++) {
            TrieNode node = curr.next[s.charAt(i) - 'a'];
            if (node == null) {
                node  = new TrieNode();
                curr.next[s.charAt(i) - 'a'] = node;
            }
            curr = node;
            if (i == s.length() - 1) curr.isWord = s;
        }
    }

    public boolean isContain(char c, TrieNode node) {
        return node.next[c - 'a'] != null;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        char[][] board = {{'o','a','a','n'},{'e','t','a','e'},{'i','h','k','r'},{'i','f','l','v'}};
        String[] words = {"oath","pea","eat","rain"};
       System.out.println(s.findWords(board, words));
    }

    
}
// @lc code=end


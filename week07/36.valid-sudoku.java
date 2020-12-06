import java.util.HashSet;

/*
 * @lc app=leetcode id=36 lang=java
 *
 * [36] Valid Sudoku
 */

// @lc code=start
class Solution {
    public boolean isValidSudoku(char[][] board) {        

        for (int i = 0; i < 9; i++) {
            HashSet<Character> rowSet = new HashSet<>();
            HashSet<Character> colSet = new HashSet<>();
            HashSet<Character> cubeSet = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.' && !rowSet.add(board[i][j])) return false;
                if (board[j][i] != '.' && !colSet.add(board[j][i])) return false;
                int rowindex = 3 * (i / 3);
                int colindex = 3 * (i % 3);

                if(board[rowindex + j/3][colindex + j%3]!='.' && !cubeSet.add(board[rowindex + j/3][colindex + j%3])) return false;                        
            }
        }
        return true;
    }
}
// @lc code=end


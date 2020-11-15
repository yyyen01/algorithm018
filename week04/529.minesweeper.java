/*
 * @lc app=leetcode id=529 lang=java
 *
 * [529] Minesweeper
 */

// @lc code=start
class Solution {
    public char[][] updateBoard(char[][] board, int[] click) {
        
        if (board[click[0]][click[1]] == 'M') {
            board[click[0]][click[1]] = 'X';
            return board;
        }

        if (board[click[0]][click[1]] == 'E') {
            change(click[0], click[1], board);
        }

        return board;    
    }

    public void change(int row, int col, char[][] board) {
        
        int count = 0;
        for (int i = row - 1; i < row + 2; i++) {
            if (i < 0 || i >= board.length) continue;
            for (int j = col - 1; j < col + 2; j++) {
                if (j < 0 || j >= board[0].length) continue;
                if (i == row && j == col) continue;                                
                if (board[i][j] == 'M') count++;
            }
        }

        if (count > 0) {
            board[row][col] =  (char) ('0' + count);
            return;
        }

        //else count == 0
        board[row][col] = 'B';
       
        for (int i = row-1; i < row + 2; i++) {
            if (i < 0 || i >= board.length) continue;
            for (int j = col-1; j < col + 2; j++) {
                if (j < 0 || j >= board[0].length) continue;
                if (i == row && j == col) continue;
                if (board[i][j] == 'E' ) change(i, j, board);
            }
        }
 
        
        
    }

public static void main(String[] args) {
    char[][] board = new char[][]{{'E','E','E','E','E'},{'E','E','M','E','E'},{'E','E','E','E','E'},{'E','E','E','E','E'}};
    int[] click = new int[] {3,0};
    Solution s = new Solution();
    //char[][] result = 
    //System.out.println(s.updateBoard(board, click));
    board = s.updateBoard(board, click);

    for (int i = 0; i < board.length; i++) {
        System.out.println();
        for (int j = 0; j < board[0].length; j++) {
            System.out.print(board[i][j]+",");
        }
    }
    


}


}
// @lc code=end


package my.leetcode;

import java.util.ArrayList;
import java.util.List;

public class SolveNQueens implements Hard{
    static class Solution {
        String [][] board;
        List<List<String>> result = new ArrayList<>();

        public List<List<String>> solveNQueens(int n) {
            board = new String[n][n];
            for (int i = 0; i < board.length; i++) {
                for (int i1 = 0; i1 < board[i].length; i1++) {
                    board[i][i1] = ".";
                }
            }


            backtrack(0);

            return null;


        }

        public void backtrack(int row) {
            if (row== board.length) {
                ArrayList<String> strings = new ArrayList<>();
                for (int i = 0; i < board.length; i++) {
                    String str="";
                    for (int i1 = 0; i1 < board[i].length; i1++) {
                        str+=board[i][i1];
                    }
                    strings.add(str);
                }
                result.add(strings);
                return;
            }

            for (int i = 0; i < board.length; i++) {
                if (!isValid(row, i)){
                    continue;
                }

                board[row][i]="Q";
                backtrack(row+1);
                board[row][i]=".";
            }

        }

        /* 是否可以在 board[row][col] 放置皇后？ */
        boolean isValid( int row, int col) {
            int n = board.length;
            // 检查列是否有皇后互相冲突
            for (int i = 0; i <= row; i++) {
                if ("Q".equals(board[i][col]))
                    return false;
            }
            // 检查右上方是否有皇后互相冲突
            for (int i = row - 1, j = col + 1;
                 i >= 0 && j < n; i--, j++) {
                if ("Q".equals(board[i][j]))
                    return false;
            }
            // 检查左上方是否有皇后互相冲突
            for (int i = row - 1, j = col - 1;
                 i >= 0 && j >= 0; i--, j--) {
                if ("Q".equals(board[i][j]))
                    return false;
            }
            return true;
        }

    }
}

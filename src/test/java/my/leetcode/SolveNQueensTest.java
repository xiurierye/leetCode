package my.leetcode;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class SolveNQueensTest {

    @Test
    public void test(){
        SolveNQueens.Solution solution = new SolveNQueens.Solution();
        List<List<String>> lists = solution.solveNQueens(4);
    }



}
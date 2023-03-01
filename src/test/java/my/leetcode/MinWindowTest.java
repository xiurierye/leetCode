package my.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class MinWindowTest {

    @Test
    public void test(){

        MinWindow.Solution solution = new MinWindow.Solution();

        String s = solution.minWindow("a", "aa");
        System.out.println(s);
    }

}
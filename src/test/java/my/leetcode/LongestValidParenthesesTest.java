package my.leetcode;

import my.leetcode.LongestValidParentheses.Solution.XX;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class LongestValidParenthesesTest {

    LongestValidParentheses.Solution solution
            =new LongestValidParentheses.Solution();


    @Test
    public void test1(){
        int i = solution.longestValidParentheses("(()");

        System.out.println(i);

        assertEquals(2,i);
    }

    @Test
    public void test2(){
        int i = solution.longestValidParentheses(")()())");

        System.out.println(i);

        assertEquals(4,i);
    }
    @Test
    public void test3(){
        int i = solution.longestValidParentheses(")((((((((((((((())())");

        System.out.println(i);

        assertEquals(8,i);
    }

    @Test
    public void test4(){
        int i = solution.longestValidParentheses("((())())((((((((((((");

        System.out.println(i);

        assertEquals(8,i);
    }@Test
    public void test5(){
        int i = solution.longestValidParentheses("(()((()()()())))");

        System.out.println(i);

        assertEquals(16,i);
    }@Test
    public void test6(){
        int i = solution.longestValidParentheses(")(()(()(((())(((((()()))((((()()(()()())())())()))()()()())(())()()(((()))))()((()))(((())()((()()())((())))(())))())((()())()()((()((())))))((()(((((()((()))(()()(())))((()))()))())"
        );

        System.out.println(i);

        assertEquals(132,i);
    }


}
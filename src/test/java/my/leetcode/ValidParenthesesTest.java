package my.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class ValidParenthesesTest {
    @Test
    public void test(){
        ValidParentheses.Solution solution = new ValidParentheses.Solution();

        boolean valid = solution.isValid("()");

        System.out.println(valid);

        assertTrue(valid);
    }
    @Test
    public void test1(){
        ValidParentheses.Solution solution = new ValidParentheses.Solution();

        boolean valid = solution.isValid("()[]{}");

        System.out.println(valid);

        assertTrue(valid);
    }

    @Test
    public void test2(){
        ValidParentheses.Solution solution = new ValidParentheses.Solution();

        boolean valid = solution.isValid("(]");

        System.out.println(valid);

        assertFalse(valid);
    }
    @Test
    public void test3(){
        ValidParentheses.Solution solution = new ValidParentheses.Solution();

        boolean valid = solution.isValid("{[]}");

        System.out.println(valid);

        assertTrue(valid);
    }

    @Test
    public void test4(){
        ValidParentheses.Solution solution = new ValidParentheses.Solution();

        boolean valid = solution.isValid("}");

        System.out.println(valid);

        assertFalse(valid);
    }
}
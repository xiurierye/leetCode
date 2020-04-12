package my.leetcode;

import my.leetcode.StringToIntegerAtoi.Solution;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringToIntegerAtoiTest {
    Solution solution = new Solution();

    @Test
    public void test0() {
        int i = solution.myAtoi("-91283472332");
        System.out.println(i);
        assertEquals(i, Integer.MIN_VALUE);

    }

    @Test
    public void test1() {
        int i = solution.myAtoi("words and 987");
        System.out.println(i);
        assertEquals(i, 0);

    }

    @Test
    public void test2() {
        int i = solution.myAtoi("4193 with words");
        System.out.println(i);
        assertEquals(i, 4193);

    }

    @Test
    public void test3() {
        int i = solution.myAtoi("   -42");
        System.out.println(i);
        assertEquals(i, -42);

    }

    @Test
    public void test4() {
        int i = solution.myAtoi("42");
        System.out.println(i);
        assertEquals(i, 42);

    }

    @Test
    public void test5() {
        int i = solution.myAtoi("+1");
        System.out.println(i);
        assertEquals(i, 1);
    }

    @Test
    public void test6() {
        int i = solution.myAtoi("  0000000000012345678");
        System.out.println(i);
        assertEquals(i, 12345678);
    }

    @Test
    public void test7() {
        int i = solution.myAtoi("   +0 123");
        System.out.println(i);
        assertEquals(i, 0);
    }

}
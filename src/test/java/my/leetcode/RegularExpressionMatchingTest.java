package my.leetcode;

import my.leetcode.RegularExpressionMatching.Solution;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author zhaoji004
 * @Time 4/13/20
 */
public class RegularExpressionMatchingTest {

    Solution solution = new Solution();

    enum action {hold, action}


    @Test
    public void testEnum() {
        System.out.println(action.hold.ordinal());
    }

    @Test
    public void test0() {
        boolean match = solution.isMatch("aa", "a");
        System.out.println(match);
        assertFalse(match);
    }

    @Test
    public void test1() {
        boolean match = solution.isMatch("aa", "a*");
        System.out.println(match);
        assertTrue(match);
    }

    @Test
    public void test2() {
        boolean match = solution.isMatch("ab", ".*");
        System.out.println(match);
        assertTrue(match);
    }

    @Test
    public void test3() {
        boolean match = solution.isMatch("aab", "c*a*b");
        System.out.println(match);
        assertTrue(match);
    }

    @Test
    public void test4() {
        boolean match = solution.isMatch("mississippi", "mis*is*p*.");
        System.out.println(match);
        assertFalse(match);
    }

    @Test
    public void test5() {
        boolean match = solution.isMatch("ab", ".*c");
        System.out.println(match);
        assertFalse(match);
    }




}
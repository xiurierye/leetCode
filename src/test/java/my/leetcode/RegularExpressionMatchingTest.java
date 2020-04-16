package my.leetcode;

import my.leetcode.RegularExpressionMatching.Solution;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author zhaoji004
 * @Time 4/13/20
 */
public class RegularExpressionMatchingTest {

    RegularExpressionMatching.Solution solution = new RegularExpressionMatching.Solution();



    @Test
    public void testEnum() {
        System.out.println("a".substring(1));
    }

    @Test
    public void test0() {
        boolean match = solution.isMatch("aa", "**");
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
        boolean match = solution.isMatch("mississippi", "mis*is*ip*.");
        System.out.println(match);
        assertTrue(match);
    }
    @Test
    public void test4_1() {
        RegularExpressionMatching.Solution2 solution2=new RegularExpressionMatching.Solution2();;
        boolean match = solution2.isMatch("mississippi", "mis*is*ip*.");
        System.out.println(match);
        assertTrue(match);
    }

    @Test
    public void test5() {
        boolean match = solution.isMatch("aa", "aa");
        System.out.println(match);
        assertTrue(match);
    }





}
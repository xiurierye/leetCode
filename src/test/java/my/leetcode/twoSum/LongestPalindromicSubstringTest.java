package my.leetcode.twoSum;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author zhaoji004
 * @Time 4/10/20
 */
public class LongestPalindromicSubstringTest {

    LongestPalindromicSubstring.Solution solution = new LongestPalindromicSubstring.Solution();

    @Test
    public void test1(){
        String bab = solution.longestPalindrome("baba");
        System.out.println(bab);
        assertEquals("bab", bab);
    }

    @Test
    public void test2(){
        String babab = solution.longestPalindrome("babab");
        System.out.println(babab);
        assertEquals("babab", babab);
    }

    @Test
    public void test3(){
        String bb = solution.longestPalindrome("cbbd");
        System.out.println(bb);
        assertEquals("bb", bb);
    }

    @Test
    public void test4(){
        String bbbb = solution.longestPalindrome("bbbb");
        System.out.println(bbbb);
        assertEquals("bbbb", bbbb);
    }

}
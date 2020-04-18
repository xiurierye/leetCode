package my.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class LongestCommonPrefixTest {
    LongestCommonPrefix.Solution solution = new LongestCommonPrefix.Solution();


    @Test
    public void test(){
        String s = solution.longestCommonPrefix(new String[]{"fl","flower","f","flow","flight"});
        System.out.println(s);
        assertEquals("f",s);
    }

    @Test
    public void test1(){
        String s = solution.longestCommonPrefix(new String[]{"fl","flower","","flow","flight"});
        System.out.println(s);
        assertEquals("",s);
    }

    @Test
    public void test2(){
        String s = solution.longestCommonPrefix(new String[]{"","flower","","flow","flight"});
        System.out.println(s);
        assertEquals("",s);
    }

    @Test
    public void test3(){
        String s = solution.longestCommonPrefix(new String[]{"fl","flower","fl....","flow","flight"});
        System.out.println(s);
        assertEquals("fl",s);
    }

}
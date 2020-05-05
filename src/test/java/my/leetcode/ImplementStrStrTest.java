package my.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class ImplementStrStrTest {

    ImplementStrStr.Solution solution = new ImplementStrStr.Solution();

    @Test
    public void test1() {
        int i = -1;

        i = solution.strStr("mississippi","issip");
        System.out.println(i);


        i = solution.strStr("a", "aa");
        System.out.println(i);

        i = solution.strStr("hello", "ll");
        System.out.println(i);
//
        i = solution.strStr("aaa", "aaaaa");
        System.out.println(i);

        i = solution.strStr("a", "a");
        System.out.println(i);

    }

}
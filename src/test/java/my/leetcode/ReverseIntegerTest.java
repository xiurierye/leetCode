package my.leetcode;

import my.leetcode.ReverseInteger.Solution;
import my.leetcode.ReverseInteger.Solution1;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author zhaoji004
 * @Time 4/12/20
 */
public class ReverseIntegerTest {
    Solution1 solution = new Solution1();

    @Test
    public void pow (){
        int pow = (int) Math.pow(2, 31);
        System.out.println(pow);
        System.out.println(pow - 1);

        System.out.println(((int) Math.pow(-2, 31)));
    }

    @Test
    public void negativeMod(){
        int i = -1;
        System.out.println(i % 10);
    }

    @Test
    public void test0(){
        int reverse = solution.reverse(123);
        System.out.println(reverse);
        assertEquals(reverse,321);
    }

    @Test
    public void test1(){
        int reverse = solution.reverse(-123);
        System.out.println(reverse);
        assertEquals(reverse,-321);
    }

    @Test
    public void test2(){
        int reverse = solution.reverse(120);
        System.out.println(reverse);
        assertEquals(reverse,21);
    }

    @Test
    public void test3(){
        int reverse = solution.reverse(1534236469);
        System.out.println(reverse);
        assertEquals(reverse,0);
    }

}
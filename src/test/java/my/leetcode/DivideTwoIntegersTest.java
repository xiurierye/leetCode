package my.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class DivideTwoIntegersTest {

    DivideTwoIntegers.Solution solution =new DivideTwoIntegers.Solution();
    @Test
    public void test(){
        System.out.println(Integer.MIN_VALUE);

        System.out.println( 1 & Integer.MIN_VALUE);

        int a = Integer.MAX_VALUE;

        System.out.println(  (~Integer.MAX_VALUE)+1 );
    }

    @Test
    public void test1(){
        int divide = solution.divide(Integer.MIN_VALUE, 1);
        System.out.println(divide);

        assertEquals(divide, Integer.MAX_VALUE);
    }

    @Test
    public void test2(){
        int divide = solution.divide(10, 3);
        System.out.println(divide);
        assertEquals(3,divide);
    }

    @Test
    public void test3(){
        int divide = solution.divide(-10, 2);
        System.out.println(divide);
        assertEquals(divide,-5);
    }

    @Test
    public void test5(){
        int divide = solution.divide(7, -3);
        System.out.println(divide);
        assertEquals(divide,-2);
    }
    @Test
    public void test4(){
        int divide = solution.divide(-2147483648,2);
        System.out.println(divide);
        assertEquals(divide,-1073741824);
    }

}
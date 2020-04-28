package my.leetcode;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @author zhaoji004
 * @Time 4/28/20
 */
public class FourSumTest {

    FourSum.Solution solution = new FourSum.Solution();

    @Test
    public void test1(){
        List<List<Integer>> lists = solution.fourSum(new int[]{-9, -9, -8, -7, -7, -3, -3, 0, 0, 1, 1, 3, 4, 6, 7}, -9);
        System.out.println(lists);


    }
    @Test
    public void test0(){
        List<List<Integer>> lists = solution.fourSum(new int[]{-2,-1,0,0,1,2}, 0);
        System.out.println(lists);


    }

}
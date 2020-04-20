package my.leetcode;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class ThreeSumTest {

    ThreeSum.Solution solution = new ThreeSum.Solution();

    @Test
    public void test(){
        List<List<Integer>> lists = solution.threeSum(new int[]{-1, 0, 1, 2, -1, -4});

        System.out.println(lists);
    }

    @Test
    public void test1(){
        List<List<Integer>> lists = solution.threeSum(new int[]{0,0,0,0});

        System.out.println(lists);
    }

    @Test
    public void test2(){
        List<List<Integer>> lists = solution.threeSum(new int[]{-1, 0, 1, 2, -1, -4,-2,-3});

        System.out.println(lists);
    }

    @Test
    public void test3(){
        List<List<Integer>> lists = solution.threeSum(new int[]{-1, -1,0, 1,0,0,1,1,2,2,-2, 2, -1, -4,-2,-3});

        System.out.println(lists);
    }
    @Test
    public void test4(){
        List<List<Integer>> lists = solution.threeSum(new int[]{-4,-2,-2,-2,0,1,2,2,2,3,3,4,4,6,6});

        System.out.println(lists);
    }

}